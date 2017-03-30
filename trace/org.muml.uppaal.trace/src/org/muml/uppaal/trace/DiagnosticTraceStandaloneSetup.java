package org.muml.uppaal.trace;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class DiagnosticTraceStandaloneSetup extends
		DiagnosticTraceStandaloneSetupGenerated {

	public static void doSetup() {
		new DiagnosticTraceStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
	}
}
