/**
 */
package org.muml.uppaal.requirements;

import org.muml.uppaal.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.requirements.UnaryProperty#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.muml.uppaal.requirements.UnaryProperty#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link org.muml.uppaal.requirements.UnaryProperty#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.requirements.RequirementsPackage#getUnaryProperty()
 * @model
 * @generated
 */
public interface UnaryProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.muml.uppaal.requirements.RequirementsPackage#getUnaryProperty_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.requirements.UnaryProperty#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.uppaal.requirements.PathQuantifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see org.muml.uppaal.requirements.PathQuantifier
	 * @see #setQuantifier(PathQuantifier)
	 * @see org.muml.uppaal.requirements.RequirementsPackage#getUnaryProperty_Quantifier()
	 * @model required="true"
	 * @generated
	 */
	PathQuantifier getQuantifier();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.requirements.UnaryProperty#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see org.muml.uppaal.requirements.PathQuantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(PathQuantifier value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.uppaal.requirements.TemporalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.muml.uppaal.requirements.TemporalOperator
	 * @see #setOperator(TemporalOperator)
	 * @see org.muml.uppaal.requirements.RequirementsPackage#getUnaryProperty_Operator()
	 * @model required="true"
	 * @generated
	 */
	TemporalOperator getOperator();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.requirements.UnaryProperty#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.muml.uppaal.requirements.TemporalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(TemporalOperator value);

} // UnaryProperty
