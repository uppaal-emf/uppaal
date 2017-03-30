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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoTemplateDeclarations='not self.declaration->exists(oclIsKindOf(system::TemplateDeclaration))' NoChannelDeclarations='not self.declaration->exists(\r\n\toclIsKindOf(uppaal::declarations::TypedDeclaration)\r\n\tand\r\n\tlet typeDefinition : uppaal::expressions::Expression = oclAsType(uppaal::declarations::TypedDeclaration).typeDefinition in\r\n\t(\r\n\t\t\r\n\t\ttypeDefinition.oclIsKindOf(uppaal::expressions::ChannelPrefixExpression)\r\n\t\tor\r\n\t\t(\r\n\t\t\ttypeDefinition.oclIsKindOf(uppaal::expressions::IdentifierExpression)\r\n\t\t\tand\r\n\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclIsKindOf(uppaal::types::Type)\r\n\t\t\tand\r\n\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType=uppaal::types::BuiltInType::CHAN\r\n\t\t)\r\n\t)\r\n)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoTemplateDeclarations NoChannelDeclarations'"
 * @generated
 */
public interface LocalDeclarations extends Declarations {
} // LocalDeclarations
