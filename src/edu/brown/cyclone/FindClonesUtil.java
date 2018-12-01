/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.brown.cyclone;

import cyclone.core.cloneDetector.CloneDetectorServiceProvider;
import cyclone.core.spi.CloneListener;
import cyclone.core.spi.CloneSearch;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.apache.commons.io.FileUtils;
import org.netbeans.api.editor.EditorRegistry;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.api.project.SourceGroup;
import org.netbeans.api.project.Sources;
import static org.netbeans.api.project.Sources.TYPE_GENERIC;
import org.netbeans.api.project.ui.OpenProjects;
import org.openide.filesystems.FileObject;
import org.openide.util.Lookup;
import org.openide.windows.Mode;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

/**
 *
 * @author nism
 */
public class FindClonesUtil {
    
    private static final ArrayList<CloneSearch> PENDING_SEARCHES
            = new ArrayList<>();
    
    public static Project[] getCurrentProject() {
        Project[] projects = new Project[1];
        
        OpenProjects op = OpenProjects.getDefault();
        projects[0] = op.getMainProject();
        
        return projects;
    }
    
    public static Project[] getOpenProjects() {
        OpenProjects op = OpenProjects.getDefault();
        Project[] projects = op.getOpenProjects();
        
        return projects;
    }
    
    /**
     * Search for code clones in the specified projects
     * @param projects 
     */
    public static void startSearch(Project[] projects) {
        CloneDetectorServiceProvider cloneDetector
                = CloneDetectorServiceProvider.getInstance();
        
        // TODO - see http://wiki.netbeans.org/DevFaqActionNodePopupSubmenu 
        
        // https://platform.netbeans.org/tutorials/nbm-selection-1.html
        
        // From http://plugins.netbeans.org/plugin/31189/compare-with-clipboard
        // Editor Library 2 does seem like the right way to do this.
        System.out.println("Action performed");
        
        JTextComponent lastFocused = EditorRegistry.lastFocusedComponent();
        
        /* Get file path for selected text */
        Lookup.Provider provider;
        provider = getEditor(null);
        FileObject fileObject = provider.getLookup().lookup(FileObject.class);
        String fileName = fileObject.getPath();
        
//        /* debug */
//        String s = lastFocused.getSelectedText();
//        System.out.println(s);
        
        // getting current or open projects
        // https://stackoverflow.com/questions/16090681/retrieving-location-of-currently-opened-file-or-project-in-netbeans
        // http://bits.netbeans.org/7.3/javadoc/org-netbeans-modules-projectuiapi/org/netbeans/api/project/ui/package-summary.html
        
        
        // more general
        // http://bits.netbeans.org/8.2/javadoc/
        
        // from the document, we might be able to get the caret, and from the
        // caret, we could get the linenumber? getLineOfOffset or maybe
        // Utilities.getRowStart
        // https://stackoverflow.com/questions/5139995/java-column-number-and-line-number-of-cursors-current-position
        
        int selectionStart = lastFocused.getSelectionStart();
        int selectionEnd = lastFocused.getSelectionEnd();
        
        /* Convert character positions to line numbers */
        int lineStart = charPosToLineNumber(lastFocused, selectionStart);
        int lineEnd = charPosToLineNumber(lastFocused, selectionEnd);
        
//        System.out.println(">>> " + fileName + " :: "+ selectionStart +
//                " " + selectionEnd + " :: " + lineStart + " " + lineEnd);
        
        /* Get files in set */
        String[] extensions = cloneDetector.getSupportedExtensions();
        Collection<String> source_files = getSourceFiles(projects, extensions);

        /* Debug */
        System.out.println("Searching these files");
        for (String s : source_files) {
            System.out.print(" " + s);
        }
        System.out.println("");
        
        /* Locate the Output Window instance */
        TopComponent cloneWindow1 = WindowManager.getDefault()
                .findTopComponent("ClonesTopComponent");        
        final ClonesTopComponent clone;
        if (cloneWindow1 != null && cloneWindow1.isOpened()) {
            clone = (ClonesTopComponent)cloneWindow1;
            
            /* FIXME - I could be race-y */
            /* Stop any ongoing searches, then clear any previous results */
            Iterator<CloneSearch> iter = PENDING_SEARCHES.iterator();
            while (iter.hasNext()) {
                CloneSearch cs = iter.next();
                cloneDetector.cancelSearch(cs);
                iter.remove();
            }
            clone.clearClones();
        } else {
            clone = null;
            return;  /* game over! */
        }
        
        CloneListener listener = new CloneListener() {
            @Override
            public void notifyCloneDetected(CloneSearch search, String clone_file, long start_line, long end_line, double confidence, String strategy, long time) {
                System.out.println("-- FOUND CLONE " + clone_file + " " + start_line + " " + end_line);
                clone.addClone(strategy, clone_file, (int)start_line,
                        (int)end_line, confidence);
            }
            
        };
        
        CloneSearch cs = cloneDetector.getClones(fileName, lineStart, lineEnd,
                source_files, listener);
        PENDING_SEARCHES.add(cs);
    }
    
    /**
     * Gets all the source files (of the specified file type) in the supplied
     * projects.
     * @param projects
     * @param extensions
     * @return 
     */
    private static Collection<String> getSourceFiles(Project[] projects,
            String[] extensions) {
        final Collection<String> source_files = new ArrayList<>();

        for (Project project : projects) {
            Sources srcs = ProjectUtils.getSources(project);
            // TODO - better type?
            SourceGroup[] srcGroups = srcs.getSourceGroups(TYPE_GENERIC);
            for (SourceGroup srcGroup : srcGroups) {
                Collection<File> srcFiles = FileUtils.listFiles(
                        new File(srcGroup.getRootFolder().getPath()),
                        extensions, true);
                Iterator<File> iter = srcFiles.iterator();
                iter.forEachRemaining(new Consumer<File>() {
                    @Override
                    public void accept(File t) {
                        source_files.add(t.getAbsolutePath());
                    }
                });
            }
        }
  
        return source_files;
    }
    
    /**
     * Returns the line number for the specified character position in the
     * specified JTextComponent, or -1 in the case of an error.
     * credit: https://stackoverflow.com/questions/5139995/java-column-number-and-line-number-of-cursors-current-position
     * @param component
     * @param pos
     * @return 
     */
    private static int charPosToLineNumber(JTextComponent component, int pos) {
        try {
            int rowNum = (pos == 0) ? 1 : 0;
            for (int offset = pos; offset > 0;) {
                offset = javax.swing.text.Utilities.getRowStart(component,
                        offset) - 1;
                rowNum++;
            }
            return rowNum;
        } catch (BadLocationException e) {
            return -1;
        }
    }
    
    /* https://github.com/markiewb/show-path-in-title-netbeans-module/blob/master/src/de/markiewb/netbeans/plugin/showpathintitle/PathUtil.java */
    private static Lookup.Provider getEditor(TopComponent editor) {
        Lookup.Provider activeTC;
        WindowManager wm = WindowManager.getDefault();
        boolean isEditor = editor != null && wm.isEditorTopComponent(editor);
        activeTC = isEditor ? editor : getCurrentEditor();
        return activeTC;
    }
    
    private static TopComponent getCurrentEditor() {
        WindowManager wm = WindowManager.getDefault();
        Mode editor = wm.findMode("editor");
        return editor.getSelectedTopComponent();
    }
}
