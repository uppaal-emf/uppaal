/**
 */
package org.muml.uppaal.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.uppaal.expressions.ChannelPrefixExpression;
import org.muml.uppaal.expressions.ExpressionsPackage;
import org.muml.uppaal.types.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel Prefix Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.expressions.impl.ChannelPrefixExpressionImpl#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link org.muml.uppaal.expressions.impl.ChannelPrefixExpressionImpl#isBroadcast <em>Broadcast</em>}</li>
 *   <li>{@link org.muml.uppaal.expressions.impl.ChannelPrefixExpressionImpl#getChannelType <em>Channel Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelPrefixExpressionImpl extends ExpressionImpl implements ChannelPrefixExpression {
	/**
	 * The default value of the '{@link #isUrgent() <em>Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUrgent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean URGENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUrgent() <em>Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUrgent()
	 * @generated
	 * @ordered
	 */
	protected boolean urgent = URGENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isBroadcast() <em>Broadcast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBroadcast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BROADCAST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBroadcast() <em>Broadcast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBroadcast()
	 * @generated
	 * @ordered
	 */
	protected boolean broadcast = BROADCAST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChannelType() <em>Channel Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelType()
	 * @generated
	 * @ordered
	 */
	protected Type channelType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelPrefixExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.CHANNEL_PREFIX_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUrgent() {
		return urgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrgent(boolean newUrgent) {
		boolean oldUrgent = urgent;
		urgent = newUrgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CHANNEL_PREFIX_EXPRESSION__URGENT, oldUrgent, urgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBroadcast() {
		return broadcast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBroadcast(boolean newBroadcast) {
		boolean oldBroadcast = broadcast;
		broadcast = newBroadcast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CHANNEL_PREFIX_EXPRESSION__BROADCAST, oldBroadcast, broadcast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getChannelType() {
		if (channelType != null && channelType.eIsProxy()) {
			InternalEObject oldChannelType = (InternalEObject)channelType;
			channelType = (Type)eResolveProxy(oldChannelType);
			if (channelType != oldChannelType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.CHANNEL_PREFIX_EXPRESSION__CHANNEL_TYPE, oldChannelType, channelType));
			}
		}
		return channelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetChannelType() {
		return channelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelType(Type newChannelType) {
		Type oldChannelType = channelType;
		channelType = newChannelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CHANNEL_PREFIX_EXPRESSION__CHANNEL_TYPE, oldChannelType, channelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.CHANNEL_PREFIX_EXPRESSION__URGENT:
				return isUrgent();
			case ExpressionsPackage.CHANNEL_PREFIX_EXPRESSION__BROADCAST:
				return isBroadcast();
			case ExpressionsPackage.CHANNEL_PREFIX_EXPRESSION__CHANNEL_TYPE:
				if (resolve) return getChannelType();
				return basicGetChannelType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionsPackage.CHANNEL_PREFIX_EXPRESSION__URGENT:
				setUrgent((Boolean)newValue);
				return;
			case ExpressionsPackage.CHANNEL_PREFIX_EXPRESSION__BROADCAST:
				setBroadcast((Boolean)newValue);
				return;
			case ExpressionsPackage.CHANNEL_PREFIX_EXPRESSION__CHANNEL_TYPE:
				setChannelType((Type)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.CHANNEL_PREFIX_EXPRESSION__URGENT:
				setUrgent(URGENT_EDEFAULT);
				return;
			case ExpressionsPackage.CHANNEL_PREFIX_EXPRESSION__BROADCAST:
				setBroadcast(BROADCAST_EDEFAULT);
				return;
			case ExpressionsPackage.CHANNEL_PREFIX_EXPRESSION__CHANNEL_TYPE:
				setChannelType((Type)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.CHANNEL_PREFIX_EXPRESSION__URGENT:
				return urgent != URGENT_EDEFAULT;
			case ExpressionsPackage.CHANNEL_PREFIX_EXPRESSION__BROADCAST:
				return broadcast != BROADCAST_EDEFAULT;
			case ExpressionsPackage.CHANNEL_PREFIX_EXPRESSION__CHANNEL_TYPE:
				return channelType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (urgent: ");
		result.append(urgent);
		result.append(", broadcast: ");
		result.append(broadcast);
		result.append(')');
		return result.toString();
	}

} //ChannelPrefixExpressionImpl
