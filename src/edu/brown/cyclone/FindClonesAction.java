/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.brown.cyclone;

import cyclone.core.cloneDetector.CloneDetectorServiceProvider;
import cyclone.core.spi.CloneListener;
import cyclone.core.spi.CloneSearch;
import org.netbeans.api.editor.EditorRegistry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.apache.commons.io.FileUtils;
import org.netbeans.api.project.*;
import static org.netbeans.api.project.Sources.TYPE_GENERIC;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

import org.netbeans.api.project.ui.OpenProjects;
import org.openide.filesystems.FileObject;
import org.openide.util.Exceptions;
import org.openide.windows.TopComponent;
//import org.netbeans.api.project.Project
import org.openide.util.Lookup;
import org.openide.windows.Mode;
import org.openide.windows.WindowManager;
//import org.openide.util.ui;
//import org.openide.util.HelpCtx.Provider;
//import org.netbeans.api.project;

@ActionID(
        category = "Refactoring",
        id = "edu.brown.cyclone.FindClonesAction"
)
@ActionRegistration(
        displayName = "#CTL_FindClonesAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Source", position = 200),
    @ActionReference(path = "Editors/Popup", position = 4000, separatorBefore = 3950, separatorAfter = 4050)
})
@Messages("CTL_FindClonesAction=Find Clones")
public final class FindClonesAction implements ActionListener {

    
    @Override
    public void actionPerformed(ActionEvent e) {
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
        
        int lineStart = -1;
        int lineEnd = -1;
        
        /* Convert character positions to line numbers */
//        try {
//            lineStart = javax.swing.text.Utilities.getRowStart(lastFocused, selectionStart);
//            lineEnd = javax.swing.text.Utilities.getRowStart(lastFocused, selectionEnd);
//        } catch (BadLocationException ex) {
//            Exceptions.printStackTrace(ex);
//            return;  /* game over! */
//        }
        lineStart = charPosToLineNumber(lastFocused, selectionStart);
        lineEnd = charPosToLineNumber(lastFocused, selectionEnd);
        
        
        System.out.println(">>> " + fileName + " :: "+ selectionStart +
                " " + selectionEnd + " :: " + lineStart + " " + lineEnd);
        
        
        /* Get files in set */
        String[] extensions = cloneDetector.getSupportedExtensions();
        Collection<String> source_files = getSourceFiles(extensions);

        /* Debug */
        System.out.println("Searching these files");
        for (String s : source_files) {
            System.out.print(" " + s);
        }
        System.out.println("");
        
        
        // TODO - clear any previous results
        
        
        CloneListener listener = new CloneListener() {
            @Override
            public void notifyCloneDetected(CloneSearch search, String clone_file, long start_line, long end_line, double confidence, String strategy, long time) {
                System.out.println("-- FOUND CLONE " + clone_file + " " + start_line + " " + end_line);
            }
            
        };
        
        cloneDetector.getClones(fileName, lineStart, lineEnd,
                source_files, listener);
    }
    
    /*
    probably handle showing the selected line with this:
    http://wiki.netbeans.org/DevFaqOpenFileAtLine
    http://bits.netbeans.org/8.2/javadoc/org-openide-text/org/openide/text/class-use/Line.ShowVisibilityType.html
    https://stackoverflow.com/questions/22408229/netbeans-plugin-open-file-at-specific-line-and-column/22421536#22421536
    */
    
    private Collection<String> getSourceFiles(String[] extensions) {
        final Collection<String> source_files = new ArrayList<String>();
        
        OpenProjects op = OpenProjects.getDefault();
        try {
            // TODO - slect project, main, all, etc
//            Project p = op.getMainProject();
            Project[] projects = op.getOpenProjects();
            
            for (int i = 0; i < projects.length; i++) {
                Sources srcs = ProjectUtils.getSources(projects[i]);
                
                // TODO - better type?
                SourceGroup[] srcGroups = srcs.getSourceGroups(TYPE_GENERIC);
                for (int j = 0; j < srcGroups.length; j++) {
                    Collection<File> srcFiles = FileUtils.listFiles(new File(srcGroups[j].getRootFolder().getPath()), extensions, true);
                    Iterator<File> iter = srcFiles.iterator();
                    iter.forEachRemaining(new Consumer<File>() {
                        @Override
                        public void accept(File t) {
                            source_files.add(t.getAbsolutePath());
                        }
                    });
//                    source_files.addAll(srcFiles);
                    
//                    System.out.println("$$$$$ " + srcGroups[j].getName() + " " + srcGroups[j].getRootFolder().getPath());
                    
                }
                
                
//                FileObject fo = projects[i].getProjectDirectory();
//                
//                fo.getChildren(true);
//                // TODO - convert into data set
////                p.
            }
        } catch (Exception ex) {
            
        }
        return source_files;
    }
    
    /* https://stackoverflow.com/questions/5139995/java-column-number-and-line-number-of-cursors-current-position */
    private int charPosToLineNumber(JTextComponent component, int pos) {
        try {
            int rowNum = (pos == 0) ? 1 : 0;
            for (int offset = pos; offset > 0;) {
                offset = javax.swing.text.Utilities.getRowStart(component,
                        offset) - 1;
                rowNum++;
            }
            return rowNum;
        } catch (BadLocationException e) {
//            e.printStackTrace();
            return -1;
        }
    }
    
    /* source https://github.com/markiewb/show-path-in-title-netbeans-module/blob/master/src/de/markiewb/netbeans/plugin/showpathintitle/PathUtil.java */
    private Lookup.Provider getEditor(TopComponent editor) {
        Lookup.Provider activeTC;
        WindowManager wm = WindowManager.getDefault();
        boolean isEditor = editor != null && wm.isEditorTopComponent(editor);
        activeTC = isEditor ? editor : getCurrentEditor();
        return activeTC;
    }
    
    private TopComponent getCurrentEditor() {
        WindowManager wm = WindowManager.getDefault();
        Mode editor = wm.findMode("editor");
        return editor.getSelectedTopComponent();
    }
}
