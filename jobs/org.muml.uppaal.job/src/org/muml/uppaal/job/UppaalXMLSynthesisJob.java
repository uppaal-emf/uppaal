package org.muml.uppaal.job;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.muml.uppaal.NTA;
import org.muml.uppaal.requirements.PropertyRepository;

public class UppaalXMLSynthesisJob extends WorkspaceJob {
	
	private IWorkspaceRunnable runnable;
	
	private UppaalXMLSynthesisJob() {
		super("UPPAAL XML Synthesis");
	}
	
	public UppaalXMLSynthesisJob(NTA nta, PropertyRepository properties, IPath targetPath, boolean layout) {
		this();
		runnable = new UppaalXMLSynthesisOperation(nta, properties, targetPath, layout);
	}

	public UppaalXMLSynthesisJob(NTA nta, PropertyRepository properties, IResource resource, boolean layout) {
		this();
		runnable = new UppaalXMLSynthesisOperation(nta, properties, resource, layout);
	}
	
	@Override
	public IStatus runInWorkspace(IProgressMonitor monitor) {

		try {
			runnable.run(monitor);
			
			return Status.OK_STATUS;
		}
		catch(CoreException e) {
			return e.getStatus();
		}
		finally {
			monitor.done();
		}

	};

}
