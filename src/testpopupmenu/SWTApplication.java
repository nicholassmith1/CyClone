package testpopupmenu;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

public class SWTApplication {
	Display display;
	static Shell shell;
	Tree tree;
	private static SWTApplication singleton;
	public static synchronized SWTApplication getInstance( ) {
	      if (singleton == null || shell.isDisposed())
	          singleton=new SWTApplication();
	      return singleton;
   }
	public SWTApplication() {
		display = Display.getDefault();
		 shell = new Shell(display);
		 shell.setLayout(new FillLayout());
		 tree = new Tree(shell, SWT.V_SCROLL);
	        for (int i = 0; i < 5; i++) {
	            TreeItem item = new TreeItem(tree, SWT.NONE);
	            item.setText(String.valueOf(i));
	            for (int j = 0; j < 3; j++) {
	                TreeItem subItem = new TreeItem(item, SWT.NONE);
	                subItem.setText(String.valueOf(i) + " " + String.valueOf(j));
	            }
	        }
	        tree.pack();
	        Menu menu = new Menu(tree);
	        MenuItem menuItem = new MenuItem(menu, SWT.NONE);
	        menuItem.setText("Print Element");
	        menuItem.addSelectionListener(new SelectionAdapter() {
	            @Override
	            public void widgetSelected(SelectionEvent event) {
	                System.out.println(tree.getSelection()[0].getText());
	            }
	        });
	        tree.setMenu(menu);
	        shell.pack();
	        shell.open();
	        /**
	        while (!shell.isDisposed()) {
	            if (!display.readAndDispatch()) {
	                display.sleep();
	            }
	        }
	        **/
	}
	public Shell getShell() {
		return shell;
	}
	public void addToTree(String text) {
		TreeItem item = new TreeItem(tree, SWT.NONE);
        item.setText(text);
        for (String word: text.split(" ")) {
            TreeItem subItem = new TreeItem(item, SWT.NONE);
            subItem.setText(word);
        }
	}
	/**
	 * public void bringToFront() {
	    shell.getDisplay().asyncExec(new Runnable() {
	        public void run() {
	            shell.forceActive();
	        }
	    });
	}
	 */
	/**
	public static void main(String[] args) {
        Display display = Display.getDefault();
        Shell shell = new Shell(display);
        shell.setLayout(new FillLayout());
        final Tree tree = new Tree(shell, SWT.V_SCROLL);
        for (int i = 0; i < 5; i++) {
            TreeItem item = new TreeItem(tree, SWT.NONE);
            item.setText(String.valueOf(i));
            for (int j = 0; j < 3; j++) {
                TreeItem subItem = new TreeItem(item, SWT.NONE);
                subItem.setText(String.valueOf(i) + " " + String.valueOf(j));
            }
        }
        tree.pack();
        Menu menu = new Menu(tree);
        MenuItem menuItem = new MenuItem(menu, SWT.NONE);
        menuItem.setText("Print Element");
        menuItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                System.out.println(tree.getSelection()[0].getText());
            }
        });
        tree.setMenu(menu);
        shell.pack();
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
    }
    **/
}
