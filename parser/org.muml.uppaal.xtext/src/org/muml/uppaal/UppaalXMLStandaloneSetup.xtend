/*
 * generated by Xtext 2.15.0
 */
package org.muml.uppaal


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class UppaalXMLStandaloneSetup extends UppaalXMLStandaloneSetupGenerated {

	def static void doSetup() {
		new UppaalXMLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
