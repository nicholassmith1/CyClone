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
import javax.swing.AbstractAction;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
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
import org.openide.util.actions.Presenter;
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
        displayName = "#CTL_FindClonesAction",
        lazy = false
)
@ActionReferences({
    @ActionReference(path = "Menu/Source", position = 200),
    @ActionReference(path = "Editors/Popup", position = 4000, separatorBefore = 3950, separatorAfter = 4050)
})
@Messages("CTL_FindClonesAction=Find Clones")
public final class FindClonesAction extends AbstractAction implements ActionListener, Presenter.Popup {
   
    @Override
    public void actionPerformed(ActionEvent e) {
        /* NOP */
    }

    @Override
    public JMenuItem getPopupPresenter() {
        /* FIXME - this looks distinctly not 'Netbean-ish' */
        JMenu menu = new JMenu("Find Clones");
        menu.add(new JMenuItem(new AbstractAction("Project") {
            @Override
            public void actionPerformed(ActionEvent e) {
                Project[] projects = FindClonesUtil.getCurrentProject();
                FindClonesUtil.startSearch(projects);
            }
        }));
        menu.add(new JMenuItem(new AbstractAction("WorkSpace") {
            @Override
            public void actionPerformed(ActionEvent e) {
                Project[] projects = FindClonesUtil.getOpenProjects();
                FindClonesUtil.startSearch(projects);
            }
        }));
        return menu;
    }
}
