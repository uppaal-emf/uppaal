/*
 * generated by Xtext
 */
package org.muml.uppaal;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class UppaalXMLRuntimeModule extends org.muml.uppaal.AbstractUppaalXMLRuntimeModule {

	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return org.muml.uppaal.scoping.UppaalQualifiedNameProvider.class;
	}

	@Override
	public Class<? extends ILinker> bindILinker() {
		return org.muml.uppaal.scoping.UppaalLazyLinker.class;
	}
	
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return org.muml.uppaal.valueconversion.UppaalValueConverter.class;
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return org.muml.uppaal.scoping.UppaalXMLScopeProvider.class;
	}
	
}
