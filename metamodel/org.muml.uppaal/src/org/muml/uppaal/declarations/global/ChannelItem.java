/**
 */
package org.muml.uppaal.declarations.global;

import org.muml.uppaal.expressions.IdentifierExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to a single channel used inside a channel priority declaration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.declarations.global.ChannelItem#getChannelExpression <em>Channel Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.declarations.global.GlobalPackage#getChannelItem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ChannelVariablesOnly='\t(not self.channelExpression.oclIsUndefined())\r\nimplies\r\n\tself.channelExpression.identifier.oclIsKindOf(uppaal::declarations::Variable)\r\n\tand\r\n\t(\r\n\tlet typeDefinition : uppaal::expressions::Expression = self.channelExpression.identifier.oclAsType(uppaal::declarations::Variable).typeDefinition in\r\n\t\tif (\r\n\t\t\ttypeDefinition.oclIsKindOf(uppaal::expressions::IdentifierExpression) and\r\n\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclIsKindOf(uppaal::types::Type)\r\n\t\t) then\r\n\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType=uppaal::types::BuiltInType::CHAN\r\n\t\telse\r\n\t\t\ttypeDefinition.oclIsKindOf(uppaal::expressions::ChannelPrefixExpression)\r\n\t\tendif\r\n\t)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ChannelVariablesOnly'"
 * @generated
 */
public interface ChannelItem extends PriorityItem {
	/**
	 * Returns the value of the '<em><b>Channel Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The variable expressions representing the synchronization channels inside the channel list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel Expression</em>' containment reference.
	 * @see #setChannelExpression(IdentifierExpression)
	 * @see org.muml.uppaal.declarations.global.GlobalPackage#getChannelItem_ChannelExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IdentifierExpression getChannelExpression();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.declarations.global.ChannelItem#getChannelExpression <em>Channel Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Expression</em>' containment reference.
	 * @see #getChannelExpression()
	 * @generated
	 */
	void setChannelExpression(IdentifierExpression value);

} // ChannelItem
