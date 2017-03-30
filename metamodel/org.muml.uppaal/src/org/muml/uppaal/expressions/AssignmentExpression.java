/**
 */
package org.muml.uppaal.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A binary assignment expression using a specific assignment operator.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.expressions.AssignmentExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.expressions.ExpressionsPackage#getAssignmentExpression()
 * @model
 * @generated
 */
public interface AssignmentExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.uppaal.expressions.AssignmentOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operator for the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.muml.uppaal.expressions.AssignmentOperator
	 * @see #setOperator(AssignmentOperator)
	 * @see org.muml.uppaal.expressions.ExpressionsPackage#getAssignmentExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	AssignmentOperator getOperator();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.expressions.AssignmentExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.muml.uppaal.expressions.AssignmentOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(AssignmentOperator value);

} // AssignmentExpression
