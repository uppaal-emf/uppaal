package org.muml.uppaal.ui.wizard;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.muml.core.export.operation.AbstractFujabaExportOperation;
import org.muml.core.export.operation.IFujabaExportOperation;
import org.muml.core.export.pages.AbstractFujabaExportSourcePage;
import org.muml.core.export.pages.ElementSelectionMode;
import org.muml.core.export.wizard.AbstractFujabaExportWizard;
import org.muml.uppaal.NTA;
import org.muml.uppaal.job.UppaalXMLSynthesisOperation;
import org.muml.uppaal.requirements.PropertyRepository;

public class UppaalExportWizard extends AbstractFujabaExportWizard {

	private AbstractFujabaExportSourcePage sourcePage;
	private AbstractFujabaExportSourcePage sourcePage2;
	private UppaalExportTargetPage targetPage;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		setWindowTitle("Uppaal EMF To Uppaal XML Export");
		setDefaultPageImageDescriptor(IDEWorkbenchPlugin
				.getIDEImageDescriptor("wizban/exportzip_wiz.png"));//$NON-NLS-1$
		
		setNeedsProgressMonitor(true);
	}

	@Override
	public String wizardGetId() {
		return "org.muml.core.export.ExampleWizard";
	}
	
	@Override
	public void addPages() {
				
		// Source page
		sourcePage = new AbstractFujabaExportSourcePage("source", toolkit, getResourceSet(), initialSelection) {

			@Override
			public void setVisible(boolean visible) {
				super.setVisible(visible);
			}
			
			@Override
			public String wizardPageGetSourceFileExtension() {
				return "uppaal";
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				// return element instanceof CoordinationProtocol;
				return element instanceof NTA;
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}
			
		};
		addPage(sourcePage);
		
		// Source page
//		sourcePage2 = new AbstractFujabaExportSourcePage("source", toolkit, getResourceSet(), initialSelection) {
//
//			@Override
//			public void setVisible(boolean visible) {
//				super.setVisible(visible);
//			}
//			
//			@Override
//			public String wizardPageGetSourceFileExtension() {
//				return "requirements";
//			}
//
//			@Override
//			public boolean wizardPageSupportsSourceModelElement(EObject element) {
//				return element instanceof PropertyRepository;
//			}
//
//			@Override
//			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
//				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
//			}
//			
//		};
//		addPage(sourcePage2);

		// Target page
		targetPage = new UppaalExportTargetPage("target", toolkit);
		addPage(targetPage);
	}

	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {
		//final URI destination = targetPage.getDestinationURI();
		
		final IResource destination = targetPage.getDestinationResource();
		
		final NTA nta = getNTA();
		final PropertyRepository propertyRepository = getPropertyRepository();
		return new AbstractFujabaExportOperation() {
			@Override
			protected IStatus doExecute(IProgressMonitor progressMonitor) {
				//String fullPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + destination.devicePath().substring(9);
				//final IPath path = new Path(fullPath);
				
//				URI targetURI = destination.appendSegment(((NTA) nta).getName()).appendFileExtension("uppaal");
//
//				URI targetURIRequirements = destination.appendSegment(((NTA) nta).getName()).appendFileExtension("requirements");
//				
				//Start the job
				//Job job = new UppaalXMLSynthesisJob(nta, propertyRepository, path, true);
				
				try {
					//getContainer().run(fork, cancelable, runnable);
					ResourcesPlugin.getWorkspace().run(new UppaalXMLSynthesisOperation(nta, propertyRepository, destination, true), progressMonitor);
				}
				catch(CoreException e) {
					return e.getStatus();
				}
					
				//job.addJobChangeListener(new ExportJobChangeAdapter());
				//job.schedule();
				System.out.println("done");
				return Status.OK_STATUS;
			}
		};
	}
	
	public NTA getNTA() {
		for (EObject element : sourcePage.getSourceElements()) {
			if (element instanceof NTA) {
				return (NTA) element;
			}
		}
		return null;
	}
	
	public PropertyRepository getPropertyRepository() {
		if (sourcePage2 != null) {
			for (EObject element : sourcePage2.getSourceElements()) {
				if (element instanceof PropertyRepository) {
					return (PropertyRepository) element;
				}
			}
		}
		return null;
	}
}
