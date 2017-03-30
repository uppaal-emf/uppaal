/**
 */
package org.muml.uppaal.types;

import org.muml.uppaal.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scalar Type Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specification of a 'scalar' type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.types.ScalarTypeSpecification#getSizeExpression <em>Size Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.types.TypesPackage#getScalarTypeSpecification()
 * @model
 * @generated
 */
public interface ScalarTypeSpecification extends TypeExpression {
	/**
	 * Returns the value of the '<em><b>Size Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer-based expression that represents the size of the scalar type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size Expression</em>' containment reference.
	 * @see #setSizeExpression(Expression)
	 * @see org.muml.uppaal.types.TypesPackage#getScalarTypeSpecification_SizeExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getSizeExpression();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.types.ScalarTypeSpecification#getSizeExpression <em>Size Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Expression</em>' containment reference.
	 * @see #getSizeExpression()
	 * @generated
	 */
	void setSizeExpression(Expression value);

} // ScalarTypeSpecification
