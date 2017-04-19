/**
 */
package nl.utwente.ewi.fmt.uppaalSMC;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCPackage
 * @generated
 */
public interface UppaalSMCFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UppaalSMCFactory eINSTANCE = nl.utwente.ewi.fmt.uppaalSMC.impl.UppaalSMCFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>NSTA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NSTA</em>'.
	 * @generated
	 */
	NSTA createNSTA();

	/**
	 * Returns a new object of class '<em>Double Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Type</em>'.
	 * @generated
	 */
	DoubleType createDoubleType();

	/**
	 * Returns a new object of class '<em>Chance Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chance Node</em>'.
	 * @generated
	 */
	ChanceNode createChanceNode();

	/**
	 * Returns a new object of class '<em>Chance Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chance Edge</em>'.
	 * @generated
	 */
	ChanceEdge createChanceEdge();

	/**
	 * Returns a new object of class '<em>Exponential Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exponential Location</em>'.
	 * @generated
	 */
	ExponentialLocation createExponentialLocation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UppaalSMCPackage getUppaalSMCPackage();

} //UppaalSMCFactory
