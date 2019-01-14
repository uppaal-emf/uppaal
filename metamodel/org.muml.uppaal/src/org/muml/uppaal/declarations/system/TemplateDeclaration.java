/**
 */
package org.muml.uppaal.declarations.system;

import org.eclipse.emf.common.util.EList;
import org.muml.uppaal.declarations.Declaration;
import org.muml.uppaal.expressions.Expression;
import org.muml.uppaal.templates.RedefinedTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A declaration of a template redefinition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.declarations.system.TemplateDeclaration#getDeclaredTemplate <em>Declared Template</em>}</li>
 *   <li>{@link org.muml.uppaal.declarations.system.TemplateDeclaration#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.declarations.system.SystemPackage#getTemplateDeclaration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NumberOfArgumentsMatchesDeclaration='(not self.declaredTemplate.oclIsUndefined() and not self.declaredTemplate.referredTemplate.oclIsUndefined())\r\nimplies\r\nself.argument-&gt;size() = self.declaredTemplate.referredTemplate.parameter-&gt;size()'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NumberOfArgumentsMatchesDeclaration'"
 * @generated
 */
public interface TemplateDeclaration extends Declaration {
	/**
	 * Returns the value of the '<em><b>Declared Template</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.muml.uppaal.templates.RedefinedTemplate#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The template being declared.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared Template</em>' containment reference.
	 * @see #setDeclaredTemplate(RedefinedTemplate)
	 * @see org.muml.uppaal.declarations.system.SystemPackage#getTemplateDeclaration_DeclaredTemplate()
	 * @see org.muml.uppaal.templates.RedefinedTemplate#getDeclaration
	 * @model opposite="declaration" containment="true" required="true"
	 * @generated
	 */
	RedefinedTemplate getDeclaredTemplate();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.declarations.system.TemplateDeclaration#getDeclaredTemplate <em>Declared Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Template</em>' containment reference.
	 * @see #getDeclaredTemplate()
	 * @generated
	 */
	void setDeclaredTemplate(RedefinedTemplate value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.uppaal.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number of arguments that describe how the referred template's parameters should be mapped towards the declared template's parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.muml.uppaal.declarations.system.SystemPackage#getTemplateDeclaration_Argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArgument();

} // TemplateDeclaration
