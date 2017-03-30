/**
 */
package org.muml.uppaal.declarations.global;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.uppaal.declarations.global.GlobalPackage
 * @generated
 */
public interface GlobalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GlobalFactory eINSTANCE = org.muml.uppaal.declarations.global.impl.GlobalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Channel Priority Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel Priority Declaration</em>'.
	 * @generated
	 */
	ChannelPriorityDeclaration createChannelPriorityDeclaration();

	/**
	 * Returns a new object of class '<em>Channel Priority Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel Priority Group</em>'.
	 * @generated
	 */
	ChannelPriorityGroup createChannelPriorityGroup();

	/**
	 * Returns a new object of class '<em>Channel Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel Item</em>'.
	 * @generated
	 */
	ChannelItem createChannelItem();

	/**
	 * Returns a new object of class '<em>Default Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Item</em>'.
	 * @generated
	 */
	DefaultItem createDefaultItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GlobalPackage getGlobalPackage();

} //GlobalFactory
