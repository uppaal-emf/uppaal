/**
 */
package org.muml.uppaal.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Type Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type specification restricting the 'int' type to a range of values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.types.RangeTypeSpecification#getBounds <em>Bounds</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.types.TypesPackage#getRangeTypeSpecification()
 * @model
 * @generated
 */
public interface RangeTypeSpecification extends TypeExpression {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bounds that restrict the type specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bounds</em>' containment reference.
	 * @see #setBounds(IntegerBounds)
	 * @see org.muml.uppaal.types.TypesPackage#getRangeTypeSpecification_Bounds()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntegerBounds getBounds();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.types.RangeTypeSpecification#getBounds <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(IntegerBounds value);

} // RangeTypeSpecification
