/**
 */
package org.muml.uppaal.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A logical expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.expressions.LogicalExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.expressions.ExpressionsPackage#getLogicalExpression()
 * @model
 * @generated
 */
public interface LogicalExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.uppaal.expressions.LogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.muml.uppaal.expressions.LogicalOperator
	 * @see #setOperator(LogicalOperator)
	 * @see org.muml.uppaal.expressions.ExpressionsPackage#getLogicalExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	LogicalOperator getOperator();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.expressions.LogicalExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.muml.uppaal.expressions.LogicalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicalOperator value);

} // LogicalExpression
