/*
* generated by Xtext
*/
package org.muml.uppaal;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class UppaalXMLStandaloneSetup extends UppaalXMLStandaloneSetupGenerated{

	public static void doSetup() {
		new UppaalXMLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

