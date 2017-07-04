/**
 */
package org.muml.uppaal.options;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.uppaal.options.OptionsPackage
 * @generated
 */
public interface OptionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OptionsFactory eINSTANCE = org.muml.uppaal.options.impl.OptionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Options</em>'.
	 * @generated
	 */
	Options createOptions();

	/**
	 * Returns a new object of class '<em>Coordination Protocol Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordination Protocol Options</em>'.
	 * @generated
	 */
	CoordinationProtocolOptions createCoordinationProtocolOptions();

	/**
	 * Returns a new object of class '<em>Hide Option Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hide Option Extension</em>'.
	 * @generated
	 */
	HideOptionExtension createHideOptionExtension();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OptionsPackage getOptionsPackage();

} //OptionsFactory
