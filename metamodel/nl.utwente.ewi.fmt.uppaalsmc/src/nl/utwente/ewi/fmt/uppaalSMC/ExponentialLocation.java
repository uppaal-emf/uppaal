/**
 */
package nl.utwente.ewi.fmt.uppaalSMC;

import org.muml.uppaal.expressions.Expression;

import org.muml.uppaal.templates.Location;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exponential Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.uppaalSMC.ExponentialLocation#getExitRate <em>Exit Rate</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCPackage#getExponentialLocation()
 * @model
 * @generated
 */
public interface ExponentialLocation extends Location {
	/**
	 * Returns the value of the '<em><b>Exit Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Rate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Rate</em>' containment reference.
	 * @see #setExitRate(Expression)
	 * @see nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCPackage#getExponentialLocation_ExitRate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExitRate();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.uppaalSMC.ExponentialLocation#getExitRate <em>Exit Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Rate</em>' containment reference.
	 * @see #getExitRate()
	 * @generated
	 */
	void setExitRate(Expression value);

} // ExponentialLocation
