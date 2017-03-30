/**
 */
package org.muml.uppaal.requirements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.uppaal.requirements.RequirementsPackage
 * @generated
 */
public interface RequirementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementsFactory eINSTANCE = org.muml.uppaal.requirements.impl.RequirementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Unary Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Property</em>'.
	 * @generated
	 */
	UnaryProperty createUnaryProperty();

	/**
	 * Returns a new object of class '<em>Leads To Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leads To Property</em>'.
	 * @generated
	 */
	LeadsToProperty createLeadsToProperty();

	/**
	 * Returns a new object of class '<em>Deadlock Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deadlock Expression</em>'.
	 * @generated
	 */
	DeadlockExpression createDeadlockExpression();

	/**
	 * Returns a new object of class '<em>Property Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Repository</em>'.
	 * @generated
	 */
	PropertyRepository createPropertyRepository();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RequirementsPackage getRequirementsPackage();

} //RequirementsFactory
