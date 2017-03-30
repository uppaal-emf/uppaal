/**
 */
package org.muml.uppaal.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predefined Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One of the predefined types 'int', 'bool', 'chan', 'clock' or 'void'.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.types.PredefinedType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.types.TypesPackage#getPredefinedType()
 * @model
 * @generated
 */
public interface PredefinedType extends Type {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.uppaal.types.BuiltInType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stores the concrete literal that represents the predefined type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.muml.uppaal.types.BuiltInType
	 * @see #setType(BuiltInType)
	 * @see org.muml.uppaal.types.TypesPackage#getPredefinedType_Type()
	 * @model required="true"
	 * @generated
	 */
	BuiltInType getType();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.types.PredefinedType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.muml.uppaal.types.BuiltInType
	 * @see #getType()
	 * @generated
	 */
	void setType(BuiltInType value);

} // PredefinedType
