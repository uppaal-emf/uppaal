/**
 */
package org.muml.uppaal.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A comparison between two expression values using a specific comparison operator.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.expressions.CompareExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.expressions.ExpressionsPackage#getCompareExpression()
 * @model
 * @generated
 */
public interface CompareExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.uppaal.expressions.CompareOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The comparison operator to be applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.muml.uppaal.expressions.CompareOperator
	 * @see #setOperator(CompareOperator)
	 * @see org.muml.uppaal.expressions.ExpressionsPackage#getCompareExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	CompareOperator getOperator();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.expressions.CompareExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.muml.uppaal.expressions.CompareOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(CompareOperator value);

} // CompareExpression
