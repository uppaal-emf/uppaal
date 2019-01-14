/**
 */
package nl.utwente.ewi.fmt.uppaalSMC;

import org.muml.uppaal.NTA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NSTA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.uppaalSMC.NSTA#getDouble <em>Double</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCPackage#getNSTA()
 * @model
 * @generated
 */
public interface NSTA extends NTA {
	/**
	 * Returns the value of the '<em><b>Double</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Double</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double</em>' containment reference.
	 * @see #setDouble(DoubleType)
	 * @see nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCPackage#getNSTA_Double()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DoubleType getDouble();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.uppaalSMC.NSTA#getDouble <em>Double</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double</em>' containment reference.
	 * @see #getDouble()
	 * @generated
	 */
	void setDouble(DoubleType value);

} // NSTA
