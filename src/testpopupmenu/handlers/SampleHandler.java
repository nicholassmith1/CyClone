package testpopupmenu.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import testpopupmenu.Activator;
import testpopupmenu.SWTApplication;
/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SampleHandler extends AbstractHandler {
	private static SWTApplication app = SWTApplication.getInstance();
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		/**
		MessageDialog.openInformation(
				window.getShell(),
				"TestPopupMenu",
				"Hello, Eclipse world");
		**/
		//System.out.println("BRING TO FRONT?");
		app = SWTApplication.getInstance(); 
		//System.out.println(app.toString());
		System.out.println("TESTING THING");
		try {
			IEditorPart editorPart = Activator.getDefault().getWorkbench()
					.getActiveWorkbenchWindow().getActivePage()
					.getActiveEditor();
			int offset = 0;
			int length = 0;
			String selectedText = null;
			IEditorSite iEditorSite = editorPart.getEditorSite();
			if (iEditorSite != null) {
				//get selection provider
				ISelectionProvider selectionProvider = iEditorSite
						.getSelectionProvider();
				if (selectionProvider != null) {
					ISelection iSelection = selectionProvider
							.getSelection();
					//offset
					offset = ((ITextSelection) iSelection).getOffset();
					if (!iSelection.isEmpty()) {
						selectedText = ((ITextSelection) iSelection)
								.getText();
						//length
						length = ((ITextSelection) iSelection).getLength();
						System.out.println("selected text: "+selectedText+" length: " + length);
						app.addToTree(selectedText);
						MessageDialog.openInformation(
						         app.getShell(),
						         "Do Something Menu",
						         "Length: " + length + "    Offset: " + offset);
					
					}
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
