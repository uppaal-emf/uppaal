/**
 */
package org.muml.uppaal.declarations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Declarations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Local declarations inside a template or block of statements.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.uppaal.declarations.DeclarationsPackage#getLocalDeclarations()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoTemplateDeclarations='not self.declaration-&gt;exists(oclIsKindOf(system::TemplateDeclaration))' NoChannelDeclarations='not self.declaration-&gt;exists(d |\n\td.oclIsKindOf(uppaal::declarations::TypedDeclaration)\n\tand\n\tlet typeDefinition : uppaal::expressions::Expression = d.oclAsType(uppaal::declarations::TypedDeclaration).typeDefinition in\n\t(\n\t\t\n\t\ttypeDefinition.oclIsKindOf(uppaal::expressions::ChannelPrefixExpression)\n\t\tor\n\t\t(\n\t\t\ttypeDefinition.oclIsKindOf(uppaal::expressions::IdentifierExpression)\n\t\t\tand\n\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclIsKindOf(uppaal::types::Type)\n\t\t\tand\n\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType=uppaal::types::BuiltInType::CHAN\n\t\t)\n\t)\n)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoTemplateDeclarations NoChannelDeclarations'"
 * @generated
 */
public interface LocalDeclarations extends Declarations {
} // LocalDeclarations
