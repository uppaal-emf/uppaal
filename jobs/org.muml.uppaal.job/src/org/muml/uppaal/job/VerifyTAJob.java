package org.muml.uppaal.job;

import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.muml.uppaal.NTA;
import org.muml.uppaal.options.Options;
import org.muml.uppaal.requirements.PropertyRepository;

public class VerifyTAJob extends Job {
		
	private IWorkspaceRunnable runnable;
						
	public VerifyTAJob(NTA nta, PropertyRepository properties, Options options) {
		super("UPPAAL Model Checking");
				
		runnable = new VerifyTAOperation(nta, properties, options);
	}
	
	@Override
	protected IStatus run(final IProgressMonitor monitor) {
				
		try {	
			ResourcesPlugin.getWorkspace().run(
					runnable,
					monitor
			);
			
			return Status.OK_STATUS;		
		}
		catch(CoreException e) {
			return e.getStatus();
		}
		finally {
			monitor.done();
		}
			
	}	
}
