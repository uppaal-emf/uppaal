package org.muml.uppaal.job;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.muml.uppaal.NTA;
import org.muml.uppaal.job.layout.Layouter;
import org.muml.uppaal.requirements.PropertyRepository;
import org.muml.uppaal.serialization.UppaalPropertySerialization;
import org.muml.uppaal.serialization.UppaalSerialization;
import org.muml.uppaal.templates.Template;

public class UppaalXMLSynthesisOperation implements IWorkspaceRunnable {

	private NTA nta;
	private PropertyRepository properties;

	private IPath targetPath;
	private IResource resource;
	
	private boolean layout = false;

	public UppaalXMLSynthesisOperation(NTA nta, PropertyRepository properties, IPath targetPath, boolean layout) {
		//super("UPPAAL XML Synthesis");

		this.nta = nta;
		this.properties = properties;
		this.targetPath = targetPath;
		this.layout = layout;
	}

	public UppaalXMLSynthesisOperation(NTA nta, PropertyRepository properties, IResource resource, boolean layout) {
		this(nta, properties, resource.getLocation(), layout);
		this.resource = resource;
	}
	
	private String getName() {
		return "UPPAAL XML Synthesis";
	}
	
	@Override
	public void run(IProgressMonitor monitor) throws CoreException {

		try {

			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(), resource == null ? 90 : 100);
												
			if (layout) {
				Layouter layouter = new Layouter();
				subMonitor.subTask("Layouting Uppaal NTAs");
				for (Template template : nta.getTemplate()) {
					layouter.layoutTemplate(template);
				}
			
				subMonitor.worked(10);
			}
					
			subMonitor.setWorkRemaining(resource == null ? 80 : 90);
			
			subMonitor.subTask("Uppaal XML Synthesis");
			
			//generate Uppaal .q (queries) file
			if (properties != null)
			{
				UppaalPropertySerialization serializer = new UppaalPropertySerialization();
				BufferedWriter writer = null;
				File file = null;
				try {
					file = targetPath.toFile();
					if (file.isDirectory())
						file = targetPath.append(nta.getName()+".q").toFile();
					writer = new BufferedWriter(new FileWriter(file));
					writer.write(serializer.serializePropertyRepository(properties).toString()); //write m2t result to file
				} catch (IOException e) {
					throw new CoreException(BasicDiagnostic.toIStatus(BasicDiagnostic.toDiagnostic(e)));
				} finally {
					if (writer != null)
						try {
							writer.close();
						} catch (IOException e) {
							throw new CoreException(BasicDiagnostic.toIStatus(BasicDiagnostic.toDiagnostic(e)));
						}
				}
				
				subMonitor.worked(40);
			}
			
			subMonitor.setWorkRemaining(resource == null ? 40 : 50);
			
			
			
			// generate Uppaal xml
			{
				UppaalSerialization serializer = new UppaalSerialization();
				/*if (layout)
					serializer.setMoveEdgeLabelsAway(true);*/
				BufferedWriter writer = null;
				File file = null;
				try {
					file = targetPath.toFile();
					if (file.isDirectory())
						file = targetPath.append(nta.getName()+".xml").toFile();
					writer = new BufferedWriter(new FileWriter(file));
					writer.write(serializer.main(nta).toString()); //write m2t result to file
				} catch (IOException e) {
					throw new CoreException(BasicDiagnostic.toIStatus(BasicDiagnostic.toDiagnostic(e)));
				} finally {
					if (writer != null)
						try {
							writer.close();
						} catch (IOException e) {
							throw new CoreException(BasicDiagnostic.toIStatus(BasicDiagnostic.toDiagnostic(e)));
						}
				}
			}
			
			subMonitor.worked(40);
						
			
			if (resource != null) { //refresh resource
				resource.refreshLocal(IResource.DEPTH_INFINITE,
							subMonitor.newChild(10));
			}
		} finally {
			monitor.done();
		}

	};

}
