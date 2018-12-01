/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.brown.cyclone;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Enumeration;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.cookies.LineCookie;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import org.openide.nodes.Node;
import org.openide.text.Line;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//edu.brown.cyclone//Clones//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "ClonesTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "output", openAtStartup = false)
@ActionID(category = "Window", id = "edu.brown.cyclone.ClonesTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_ClonesAction",
        preferredID = "ClonesTopComponent"
)
@Messages({
    "CTL_ClonesAction=Clones",
    "CTL_ClonesTopComponent=Clones Window",
    "HINT_ClonesTopComponent=This is a Clones window"
})
public final class ClonesTopComponent extends TopComponent
//        implements LookupListener
{

    private DefaultTreeModel model;
    private DefaultMutableTreeNode top;
    
    protected class CloneInfo {
        public final String strategy;
        public final String file;
        public final int startLine;
        public final int endLine;
        public final double confidence;
        
        public CloneInfo(String strategy, String file,
                int startLine, int endLine, double confidence) {
            this.strategy = strategy;
            this.file = file;
            this.startLine = startLine;
            this.endLine = endLine;
            this.confidence = confidence;
        }
        
        @Override
        public String toString() {
            return file + ":" + startLine + "," + endLine + " -- " + confidence;
        }
    }
        
    protected class CloneMouseListener extends MouseAdapter {
        
        /* Based on http://wiki.netbeans.org/DevFaqOpenFileAtLine */
        private void openFileAtLine(String file, int startLine) {
            File f = new File(file);
            FileObject fobj = FileUtil.toFileObject(f);
            DataObject dobj = null;
            try {
                dobj = DataObject.find(fobj);
            } catch (DataObjectNotFoundException ex) {
                ex.printStackTrace();
            }
            
            if (dobj != null) {
                LineCookie lc = (LineCookie)(dobj.getCookie(LineCookie.class));
                if (lc == null) {/* cannot do it */ return;}
                Line l = lc.getLineSet().getOriginal(startLine);
                l.show(Line.ShowOpenType.OPEN, Line.ShowVisibilityType.FOCUS);
            }
        }
        
        @Override
        public void mouseClicked(MouseEvent me) {
            /* Handle double click */
            if (me.getClickCount() < 2) {
                return;
            }
            
            TreePath tp = jTree1.getPathForLocation(me.getX(), me.getY());
            if (tp != null) {
                Object o1 = tp.getLastPathComponent();
                if (!(o1 instanceof DefaultMutableTreeNode)) {
                    return;
                }
                
                DefaultMutableTreeNode node = (DefaultMutableTreeNode)o1;
                
                Object o2 = node.getUserObject();
                if (!(o2 instanceof CloneInfo)) {
                    return;
                }
                
                CloneInfo info = (CloneInfo)o2;
                
                System.out.println("**** Navigate to " + info.file + " " + info.startLine);
                openFileAtLine(info.file, info.startLine);
            }
        }
    }
    
    public ClonesTopComponent() {
        initComponents();
        setName(Bundle.CTL_ClonesTopComponent());
        setToolTipText(Bundle.HINT_ClonesTopComponent());
        
        top = new DefaultMutableTreeNode("Code Clones");
        model = new DefaultTreeModel(top);
        
        jTree1.setModel(model);
        jTree1.addMouseListener(new CloneMouseListener());
    }
    
    private void expandAll(JTree tree, TreePath parent) {
        TreeNode node = (TreeNode)parent.getLastPathComponent();
        if (node.getChildCount() >= 0) {
          for (Enumeration e = node.children(); e.hasMoreElements();) {
            TreeNode n = (TreeNode) e.nextElement();
            TreePath path = parent.pathByAddingChild(n);
            expandAll(tree, path);
          }
        }
        tree.expandPath(parent);
        // tree.collapsePath(parent);
    }
    
    public void clearClones() {
        System.out.println("Clear clones");
        top.removeAllChildren();
    }
    
    public void addClone(String strategy, String file, int startLine,
            int endLine, double confidence) {
        DefaultMutableTreeNode strategyNode = null;
        int count = top.getChildCount();
        int i;
        
        for (i = 0; i < count; i++) {
            TreeNode node = top.getChildAt(i);
            if (node instanceof DefaultMutableTreeNode) {
                DefaultMutableTreeNode mNode = (DefaultMutableTreeNode)node;
                if (mNode.getUserObject() == strategy) {
                    strategyNode = mNode;
                }
            }
        }
        
        if (strategyNode == null) {
            strategyNode = new DefaultMutableTreeNode(strategy);
            model.insertNodeInto(strategyNode, top, 0);
        }
        
        /* insert the new clone in the correct position (confidence, DESC) */
        CloneInfo newClone = new CloneInfo(strategy, file,
                startLine, endLine, confidence);
        for (i = 0; i < strategyNode.getChildCount(); i++) {
            TreeNode node = strategyNode.getChildAt(i);
            if (!(node instanceof DefaultMutableTreeNode)) {
                break;
            }
            
            Object o = ((DefaultMutableTreeNode)node).getUserObject();
            if (!(o instanceof CloneInfo)) {
                break;
            }
            
            CloneInfo info = (CloneInfo)o;
            if (newClone.confidence >= info.confidence) {
                break;
            }
        }
        model.insertNodeInto(new DefaultMutableTreeNode(newClone),
                strategyNode, i);
        
        /* FIXME - this is very heavy handed */
        /* ensure nodes are expanded */
        expandAll(jTree1, new TreePath(top));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();

        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
    
//    private Lookup.Result<Event> result = null;
    
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

//    @Override
//    public void resultChanged(LookupEvent le) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
