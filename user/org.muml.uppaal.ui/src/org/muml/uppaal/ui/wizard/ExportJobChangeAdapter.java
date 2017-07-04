package org.muml.uppaal.ui.wizard;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

public class ExportJobChangeAdapter extends JobChangeAdapter implements Runnable {
	
	private IStatus status;
			
	public void done(IJobChangeEvent event) {
		
		status = event.getResult();
        
        Display.getDefault().asyncExec(this);
	
	}
	
	@Override
	public void run() {
								
		if (status.equals(Status.CANCEL_STATUS)) {
			return;
		}
		else {
			if (status.isOK()) {
						
				MessageDialog messageDialog = new MessageDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Export Result", null,
						"Export successful.", MessageDialog.INFORMATION,
				        new String[] { "Close" }, 1);
				
				messageDialog.open();
			
			}
		}

	}

}
