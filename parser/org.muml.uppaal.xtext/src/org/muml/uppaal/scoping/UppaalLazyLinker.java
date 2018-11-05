package org.muml.uppaal.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.lazy.LazyLinker;
import org.muml.uppaal.NTA;

/**
 * Override the linker to do some initialisation on the elements. See
 * <a>http://malubu
 * .wordpress.com/2012/05/07/post-processing-vs-post-initialization/</a>
 * 
 * @author jladleif
 *
 */
public class UppaalLazyLinker extends LazyLinker {

	@Override
	protected void beforeModelLinked(EObject model, IDiagnosticConsumer diagnosticsConsumer) {
		super.beforeModelLinked(model, diagnosticsConsumer);
				
		// Give a name to the NTA.
		if (model instanceof NTA) {
			NTA nta = (NTA) model;
			
			//TODO The NTA should have a name according to the metamodel, but does not have one in UPPAAL.
			nta.setName("Parsed_NTA");
		}
		
	}
		
//	@Override
//	protected void installProxies(EObject obj, IDiagnosticProducer producer,
//			Multimap<EStructuralFeature.Setting, INode> settingsToLink) {
//				
//		super.installProxies(obj, producer, settingsToLink);
//				
//		// Link variable containers and their variables.
//		if (model instanceof VariableContainer) {
//			VariableContainer container = (VariableContainer) model;
//			for (Variable variable: container.getVariable())
//			{
//				variable.setContainer(container);
//			}
//		}
//		
//		// Link TypeDeclaration and their DeclaredTypes.
//		if (model instanceof TypeDeclaration) {
//			TypeDeclaration decl = (TypeDeclaration) model;
//			for (DeclaredType type : decl.getType())
//			{
//				type.setTypeDeclaration(decl);
//			}
//		}
//	
//	}
}
