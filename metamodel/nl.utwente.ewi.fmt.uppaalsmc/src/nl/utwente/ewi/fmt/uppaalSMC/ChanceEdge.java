/**
 */
package nl.utwente.ewi.fmt.uppaalSMC;

import org.muml.uppaal.templates.Edge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chance Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.uppaalSMC.ChanceEdge#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCPackage#getChanceEdge()
 * @model
 * @generated
 */
public interface ChanceEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCPackage#getChanceEdge_Weight()
	 * @model required="true"
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.uppaalSMC.ChanceEdge#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

} // ChanceEdge
