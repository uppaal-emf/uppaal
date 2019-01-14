/**
 */
package nl.utwente.ewi.fmt.uppaalSMC.util;

import java.util.Map;

import nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UppaalSMCXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UppaalSMCXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		UppaalSMCPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the UppaalSMCResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new UppaalSMCResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new UppaalSMCResourceFactoryImpl());
		}
		return registrations;
	}

} //UppaalSMCXMLProcessor
