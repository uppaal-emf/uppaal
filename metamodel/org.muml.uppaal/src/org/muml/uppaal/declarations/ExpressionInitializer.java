/**
 */
package org.muml.uppaal.declarations;

import org.muml.uppaal.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An initializer that represents a single initial value by means of an expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.declarations.ExpressionInitializer#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.declarations.DeclarationsPackage#getExpressionInitializer()
 * @model
 * @generated
 */
public interface ExpressionInitializer extends Initializer {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expression representing the initial value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.muml.uppaal.declarations.DeclarationsPackage#getExpressionInitializer_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.declarations.ExpressionInitializer#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // ExpressionInitializer
