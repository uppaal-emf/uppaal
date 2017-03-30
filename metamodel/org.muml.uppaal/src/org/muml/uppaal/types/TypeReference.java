/**
 */
package org.muml.uppaal.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to a type defined elsewhere.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.types.TypeReference#getReferredType <em>Referred Type</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.types.TypesPackage#getTypeReference()
 * @model
 * @generated
 */
public interface TypeReference extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Referred Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referred type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referred Type</em>' reference.
	 * @see #setReferredType(Type)
	 * @see org.muml.uppaal.types.TypesPackage#getTypeReference_ReferredType()
	 * @model required="true"
	 * @generated
	 */
	Type getReferredType();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.types.TypeReference#getReferredType <em>Referred Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Type</em>' reference.
	 * @see #getReferredType()
	 * @generated
	 */
	void setReferredType(Type value);

} // TypeReference
