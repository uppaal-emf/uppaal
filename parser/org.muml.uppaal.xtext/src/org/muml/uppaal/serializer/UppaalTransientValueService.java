package org.muml.uppaal.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;
import org.muml.uppaal.NTA;
import org.muml.uppaal.core.CorePackage;
import org.muml.uppaal.templates.Location;
import org.muml.uppaal.templates.TemplatesPackage;

public class UppaalTransientValueService extends DefaultTransientValueService {

	public UppaalTransientValueService() {}
	
	@Override
	public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		
		if (owner instanceof NTA) {
			if (feature == CorePackage.Literals.NAMED_ELEMENT__NAME) {
				return true;
			}
		}
		
		if (owner instanceof Location) {
			if (feature == TemplatesPackage.Literals.LOCATION__INCOMING_EDGES) {
				return true;
			}
			if (feature == TemplatesPackage.Literals.LOCATION__OUTGOING_EDGES) {
				return true;
			}
		}
		
		return super.isTransient(owner, feature, index);
	}

}
