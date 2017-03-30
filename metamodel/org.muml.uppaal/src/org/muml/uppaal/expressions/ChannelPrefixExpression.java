/**
 */
package org.muml.uppaal.expressions;

import org.muml.uppaal.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Prefix Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Modifiers for channel type definitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.expressions.ChannelPrefixExpression#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link org.muml.uppaal.expressions.ChannelPrefixExpression#isBroadcast <em>Broadcast</em>}</li>
 *   <li>{@link org.muml.uppaal.expressions.ChannelPrefixExpression#getChannelType <em>Channel Type</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.expressions.ExpressionsPackage#getChannelPrefixExpression()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UrgentOrBroadcast ChannelTypeOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UrgentOrBroadcast='self.urgent or self.broadcast' ChannelTypeOnly='not self.channelType.oclIsUndefined()\r\nimplies\r\nself.channelType.baseType=uppaal::types::BuiltInType::CHAN'"
 * @generated
 */
public interface ChannelPrefixExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Urgent</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the urgency of the declared synchronization channels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Urgent</em>' attribute.
	 * @see #setUrgent(boolean)
	 * @see org.muml.uppaal.expressions.ExpressionsPackage#getChannelPrefixExpression_Urgent()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUrgent();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.expressions.ChannelPrefixExpression#isUrgent <em>Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urgent</em>' attribute.
	 * @see #isUrgent()
	 * @generated
	 */
	void setUrgent(boolean value);

	/**
	 * Returns the value of the '<em><b>Broadcast</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the declared synchronization channels use broadcast.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Broadcast</em>' attribute.
	 * @see #setBroadcast(boolean)
	 * @see org.muml.uppaal.expressions.ExpressionsPackage#getChannelPrefixExpression_Broadcast()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isBroadcast();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.expressions.ChannelPrefixExpression#isBroadcast <em>Broadcast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Broadcast</em>' attribute.
	 * @see #isBroadcast()
	 * @generated
	 */
	void setBroadcast(boolean value);

	/**
	 * Returns the value of the '<em><b>Channel Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Type</em>' reference.
	 * @see #setChannelType(Type)
	 * @see org.muml.uppaal.expressions.ExpressionsPackage#getChannelPrefixExpression_ChannelType()
	 * @model required="true"
	 * @generated
	 */
	Type getChannelType();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.expressions.ChannelPrefixExpression#getChannelType <em>Channel Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Type</em>' reference.
	 * @see #getChannelType()
	 * @generated
	 */
	void setChannelType(Type value);

} // ChannelPrefixExpression
