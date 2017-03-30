/**
 */
package org.muml.uppaal.types;

import org.muml.uppaal.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for all types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.types.Type#getBaseType <em>Base Type</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.types.TypesPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.uppaal.types.BuiltInType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' attribute.
	 * @see org.muml.uppaal.types.BuiltInType
	 * @see org.muml.uppaal.types.TypesPackage#getType_BaseType()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.oclIsKindOf(DeclaredType) then \r\n\tif self.oclAsType(DeclaredType).typeDefinition.oclIsUndefined() then\r\n\t\tnull\r\n\telse\r\n\t\tif self.oclAsType(DeclaredType).typeDefinition.oclIsKindOf(uppaal::expressions::IdentifierExpression) then\r\n\t\t\t-- Identifier reference to either a predefined or a declared type.\r\n\t\t\tif self.oclAsType(DeclaredType).typeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclIsKindOf(Type) then\r\n\t\t\t\tself.oclAsType(DeclaredType).typeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(Type).baseType\r\n\t\t\telse\r\n\t\t\t\tnull\r\n\t\t\tendif\r\n\t\telse\r\n\t\t\t-- A channel prefix leading to a channel type.\r\n\t\t\tif self.oclAsType(DeclaredType).typeDefinition.oclIsKindOf(uppaal::expressions::ChannelPrefixExpression) then\r\n\t\t\t\tself.oclAsType(DeclaredType).typeDefinition.oclAsType(uppaal::expressions::ChannelPrefixExpression).channelType.baseType\r\n\t\t\t-- A data prefix leading to another type.\r\n\t\t\telse\r\n\t\t\t\tif self.oclAsType(DeclaredType).typeDefinition.oclIsKindOf(uppaal::expressions::DataPrefixExpression) then\r\n\t\t\t\t\tif self.oclAsType(DeclaredType).typeDefinition.oclAsType(uppaal::expressions::DataPrefixExpression).dataTypeExpression.oclIsKindOf(uppaal::expressions::IdentifierExpression) then\r\n\t\t\t\t\t\tif self.oclAsType(DeclaredType).typeDefinition.oclAsType(uppaal::expressions::DataPrefixExpression).dataTypeExpression.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclIsKindOf(Type) then\r\n\t\t\t\t\t\t\tself.oclAsType(DeclaredType).typeDefinition.oclAsType(uppaal::expressions::DataPrefixExpression).dataTypeExpression.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(Type).baseType\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\tnull\r\n\t\t\t\t\t\tendif\r\n\t\t\t\t\telse\r\n\t\t\t\t\t\tnull\r\n\t\t\t\t\tendif\t\t\t\r\n\t\t\t\telse\r\n\t\t\t\t\t-- Or, finally, a range type.\r\n\t\t\t\t\tif self.oclAsType(DeclaredType).typeDefinition.oclIsKindOf(uppaal::types::RangeTypeSpecification) then\r\n\t\t\t\t\t\tuppaal::types::BuiltInType::INT\r\n\t\t\t\t\telse\r\n\t\t\t\t\t\tnull\r\n\t\t\t\t\tendif\r\n\t\t\t\tendif\r\n\t\t\tendif\r\n\t\tendif\r\n\tendif\r\nelse \r\n\t-- Only a boring predefined type.\r\n\tif self.oclIsKindOf(PredefinedType) then\r\n\t\tself.oclAsType(PredefinedType).type\r\n\telse\r\n\t\tnull\r\n\tendif\r\nendif'"
	 * @generated
	 */
	BuiltInType getBaseType();

} // Type
