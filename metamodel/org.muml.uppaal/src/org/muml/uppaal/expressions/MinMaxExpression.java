/**
 */
package org.muml.uppaal.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Max Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A binary expression representing an arithemtic operation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.expressions.MinMaxExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.expressions.ExpressionsPackage#getMinMaxExpression()
 * @model
 * @generated
 */
public interface MinMaxExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.uppaal.expressions.MinMaxOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The arithmetic operator to be applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.muml.uppaal.expressions.MinMaxOperator
	 * @see #setOperator(MinMaxOperator)
	 * @see org.muml.uppaal.expressions.ExpressionsPackage#getMinMaxExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	MinMaxOperator getOperator();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.expressions.MinMaxExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.muml.uppaal.expressions.MinMaxOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(MinMaxOperator value);

} // MinMaxExpression
