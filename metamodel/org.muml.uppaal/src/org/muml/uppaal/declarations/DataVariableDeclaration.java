/**
 */
package org.muml.uppaal.declarations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A declaration of data variables.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.declarations.DataVariableDeclaration#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.declarations.DeclarationsPackage#getDataVariableDeclaration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL MatchingType='(not self.typeDefinition.oclIsUndefined())\r\nimplies\r\n(self.typeDefinition.baseType &lt;&gt; types::BuiltInType::CHAN\r\nand\r\nself.typeDefinition.baseType &lt;&gt; types::BuiltInType::CLOCK)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MatchingType'"
 * @generated
 */
public interface DataVariableDeclaration extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.uppaal.declarations.DataVariablePrefix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The prefix of the data variable declaration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see org.muml.uppaal.declarations.DataVariablePrefix
	 * @see #setPrefix(DataVariablePrefix)
	 * @see org.muml.uppaal.declarations.DeclarationsPackage#getDataVariableDeclaration_Prefix()
	 * @model required="true"
	 * @generated
	 */
	DataVariablePrefix getPrefix();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.declarations.DataVariableDeclaration#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see org.muml.uppaal.declarations.DataVariablePrefix
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(DataVariablePrefix value);

} // DataVariableDeclaration
