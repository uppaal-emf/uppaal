/**
 */
package org.muml.uppaal.expressions;

import org.muml.uppaal.declarations.VariableContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantification Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A quantification expression introducing a quantified variable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.expressions.QuantificationExpression#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link org.muml.uppaal.expressions.QuantificationExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.expressions.ExpressionsPackage#getQuantificationExpression()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SingleVariable='self.variable-&gt;size() &lt;= 1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SingleVariable'"
 * @generated
 */
public interface QuantificationExpression extends Expression, VariableContainer {
	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.uppaal.expressions.Quantifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantifier to be applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see org.muml.uppaal.expressions.Quantifier
	 * @see #setQuantifier(Quantifier)
	 * @see org.muml.uppaal.expressions.ExpressionsPackage#getQuantificationExpression_Quantifier()
	 * @model required="true"
	 * @generated
	 */
	Quantifier getQuantifier();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.expressions.QuantificationExpression#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see org.muml.uppaal.expressions.Quantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(Quantifier value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantified expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.muml.uppaal.expressions.ExpressionsPackage#getQuantificationExpression_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.expressions.QuantificationExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // QuantificationExpression
