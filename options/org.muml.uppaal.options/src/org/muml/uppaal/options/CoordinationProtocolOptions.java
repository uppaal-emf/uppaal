/**
 */
package org.muml.uppaal.options;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Protocol Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.options.CoordinationProtocolOptions#getRoleMultiplicity <em>Role Multiplicity</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.options.OptionsPackage#getCoordinationProtocolOptions()
 * @model
 * @generated
 */
public interface CoordinationProtocolOptions extends Options {
	/**
	 * Returns the value of the '<em><b>Role Multiplicity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Multiplicity</em>' attribute.
	 * @see #setRoleMultiplicity(int)
	 * @see org.muml.uppaal.options.OptionsPackage#getCoordinationProtocolOptions_RoleMultiplicity()
	 * @model default="1"
	 * @generated
	 */
	int getRoleMultiplicity();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.options.CoordinationProtocolOptions#getRoleMultiplicity <em>Role Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Multiplicity</em>' attribute.
	 * @see #getRoleMultiplicity()
	 * @generated
	 */
	void setRoleMultiplicity(int value);

} // CoordinationProtocolOptions
