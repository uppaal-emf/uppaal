/**
 */
package org.muml.uppaal.declarations.global.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.uppaal.declarations.global.ChannelItem;
import org.muml.uppaal.declarations.global.GlobalPackage;
import org.muml.uppaal.expressions.IdentifierExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.declarations.global.impl.ChannelItemImpl#getChannelExpression <em>Channel Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelItemImpl extends PriorityItemImpl implements ChannelItem {
	/**
	 * The cached value of the '{@link #getChannelExpression() <em>Channel Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelExpression()
	 * @generated
	 * @ordered
	 */
	protected IdentifierExpression channelExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlobalPackage.Literals.CHANNEL_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierExpression getChannelExpression() {
		return channelExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannelExpression(IdentifierExpression newChannelExpression, NotificationChain msgs) {
		IdentifierExpression oldChannelExpression = channelExpression;
		channelExpression = newChannelExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlobalPackage.CHANNEL_ITEM__CHANNEL_EXPRESSION, oldChannelExpression, newChannelExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelExpression(IdentifierExpression newChannelExpression) {
		if (newChannelExpression != channelExpression) {
			NotificationChain msgs = null;
			if (channelExpression != null)
				msgs = ((InternalEObject)channelExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlobalPackage.CHANNEL_ITEM__CHANNEL_EXPRESSION, null, msgs);
			if (newChannelExpression != null)
				msgs = ((InternalEObject)newChannelExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlobalPackage.CHANNEL_ITEM__CHANNEL_EXPRESSION, null, msgs);
			msgs = basicSetChannelExpression(newChannelExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalPackage.CHANNEL_ITEM__CHANNEL_EXPRESSION, newChannelExpression, newChannelExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlobalPackage.CHANNEL_ITEM__CHANNEL_EXPRESSION:
				return basicSetChannelExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GlobalPackage.CHANNEL_ITEM__CHANNEL_EXPRESSION:
				return getChannelExpression();
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
			case GlobalPackage.CHANNEL_ITEM__CHANNEL_EXPRESSION:
				setChannelExpression((IdentifierExpression)newValue);
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
			case GlobalPackage.CHANNEL_ITEM__CHANNEL_EXPRESSION:
				setChannelExpression((IdentifierExpression)null);
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
			case GlobalPackage.CHANNEL_ITEM__CHANNEL_EXPRESSION:
				return channelExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ChannelItemImpl
