package org.muml.uppaal.trace.scoping;

import org.eclipse.xtext.scoping.IScopeProvider;

import com.google.inject.Provider;

public class DiagnosticTraceScopeProviderSingleton implements
		Provider<IScopeProvider> {
	
	
	private static DiagnosticTraceScopeProvider scopeProvider;
	
	public static DiagnosticTraceScopeProvider getScopeProvider() {
		if (scopeProvider == null) {
			scopeProvider = new DiagnosticTraceScopeProvider();
		}
		return scopeProvider;
	}
	
	@Override
	public IScopeProvider get() {
		return getScopeProvider();
	}
	

}
