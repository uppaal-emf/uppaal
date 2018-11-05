package org.muml.uppaal.types;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * @generated NOT
 */
public class StdLib {
	
	private static final Library INSTANCE = getLibrary();
	
	public static final PredefinedType INT = getType(BuiltInType.INT.getLiteral());
	public static final PredefinedType BOOL = getType(BuiltInType.BOOL.getLiteral());
	public static final PredefinedType VOID = getType(BuiltInType.VOID.getLiteral());
	public static final PredefinedType CHAN = getType(BuiltInType.CHAN.getLiteral());
	public static final PredefinedType CLOCK = getType(BuiltInType.CLOCK.getLiteral());
		
	private static PredefinedType getType(String typeName) {
		for (PredefinedType type : INSTANCE.getTypes()) {
			if (typeName.equals(type.getName())) {
				return type;
			}
		};
		
		throw new RuntimeException("Could not find PredefinedType '" + typeName + "'");
	}
	
	private static Library getLibrary() {
		
		TypesPackage.eINSTANCE.eClass();
		
		ResourceSet set = new ResourceSetImpl();
		Resource res = set.getResource(URI.createPlatformPluginURI("/org.muml.uppaal/model/stdlib.xmi", false), true);
		return (Library) res.getContents().get(0);
	}

}
