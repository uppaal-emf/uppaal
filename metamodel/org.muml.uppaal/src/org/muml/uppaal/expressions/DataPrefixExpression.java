/**
 */
package org.muml.uppaal.expressions;

import org.muml.uppaal.declarations.DataVariablePrefix;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Prefix Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Modifiers for data type definitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.expressions.DataPrefixExpression#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.muml.uppaal.expressions.DataPrefixExpression#getDataTypeExpression <em>Data Type Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.expressions.ExpressionsPackage#getDataPrefixExpression()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL TypeExpressionMustBeType='self.dataTypeExpression.oclIsKindOf(types::TypeExpression)\r\nor\r\n(\r\n\tself.dataTypeExpression.oclIsKindOf(expressions::IdentifierExpression) and\r\n\tself.dataTypeExpression.oclAsType(expressions::IdentifierExpression).identifier.oclIsKindOf(types::Type)\r\n)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TypeExpressionMustBeType'"
 * @generated
 */
public interface DataPrefixExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * The default value is <code>"const"</code>.
	 * The literals are from the enumeration {@link org.muml.uppaal.declarations.DataVariablePrefix}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see org.muml.uppaal.declarations.DataVariablePrefix
	 * @see #setPrefix(DataVariablePrefix)
	 * @see org.muml.uppaal.expressions.ExpressionsPackage#getDataPrefixExpression_Prefix()
	 * @model default="const" required="true"
	 * @generated
	 */
	DataVariablePrefix getPrefix();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.expressions.DataPrefixExpression#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see org.muml.uppaal.declarations.DataVariablePrefix
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(DataVariablePrefix value);

	/**
	 * Returns the value of the '<em><b>Data Type Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Expression</em>' containment reference.
	 * @see #setDataTypeExpression(Expression)
	 * @see org.muml.uppaal.expressions.ExpressionsPackage#getDataPrefixExpression_DataTypeExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getDataTypeExpression();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.expressions.DataPrefixExpression#getDataTypeExpression <em>Data Type Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Expression</em>' containment reference.
	 * @see #getDataTypeExpression()
	 * @generated
	 */
	void setDataTypeExpression(Expression value);

} // DataPrefixExpression
