/**
 */
package org.muml.uppaal.requirements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.uppaal.expressions.Expression;
import org.muml.uppaal.requirements.BinaryProperty;
import org.muml.uppaal.requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.requirements.impl.BinaryPropertyImpl#getLeftExpression <em>Left Expression</em>}</li>
 *   <li>{@link org.muml.uppaal.requirements.impl.BinaryPropertyImpl#getRightExpression <em>Right Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BinaryPropertyImpl extends PropertyImpl implements BinaryProperty {
	/**
	 * The cached value of the '{@link #getLeftExpression() <em>Left Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression leftExpression;

	/**
	 * The cached value of the '{@link #getRightExpression() <em>Right Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression rightExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.BINARY_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeftExpression() {
		return leftExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftExpression(Expression newLeftExpression, NotificationChain msgs) {
		Expression oldLeftExpression = leftExpression;
		leftExpression = newLeftExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.BINARY_PROPERTY__LEFT_EXPRESSION, oldLeftExpression, newLeftExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftExpression(Expression newLeftExpression) {
		if (newLeftExpression != leftExpression) {
			NotificationChain msgs = null;
			if (leftExpression != null)
				msgs = ((InternalEObject)leftExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.BINARY_PROPERTY__LEFT_EXPRESSION, null, msgs);
			if (newLeftExpression != null)
				msgs = ((InternalEObject)newLeftExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.BINARY_PROPERTY__LEFT_EXPRESSION, null, msgs);
			msgs = basicSetLeftExpression(newLeftExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.BINARY_PROPERTY__LEFT_EXPRESSION, newLeftExpression, newLeftExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRightExpression() {
		return rightExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightExpression(Expression newRightExpression, NotificationChain msgs) {
		Expression oldRightExpression = rightExpression;
		rightExpression = newRightExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.BINARY_PROPERTY__RIGHT_EXPRESSION, oldRightExpression, newRightExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightExpression(Expression newRightExpression) {
		if (newRightExpression != rightExpression) {
			NotificationChain msgs = null;
			if (rightExpression != null)
				msgs = ((InternalEObject)rightExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.BINARY_PROPERTY__RIGHT_EXPRESSION, null, msgs);
			if (newRightExpression != null)
				msgs = ((InternalEObject)newRightExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.BINARY_PROPERTY__RIGHT_EXPRESSION, null, msgs);
			msgs = basicSetRightExpression(newRightExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.BINARY_PROPERTY__RIGHT_EXPRESSION, newRightExpression, newRightExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.BINARY_PROPERTY__LEFT_EXPRESSION:
				return basicSetLeftExpression(null, msgs);
			case RequirementsPackage.BINARY_PROPERTY__RIGHT_EXPRESSION:
				return basicSetRightExpression(null, msgs);
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
			case RequirementsPackage.BINARY_PROPERTY__LEFT_EXPRESSION:
				return getLeftExpression();
			case RequirementsPackage.BINARY_PROPERTY__RIGHT_EXPRESSION:
				return getRightExpression();
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
			case RequirementsPackage.BINARY_PROPERTY__LEFT_EXPRESSION:
				setLeftExpression((Expression)newValue);
				return;
			case RequirementsPackage.BINARY_PROPERTY__RIGHT_EXPRESSION:
				setRightExpression((Expression)newValue);
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
			case RequirementsPackage.BINARY_PROPERTY__LEFT_EXPRESSION:
				setLeftExpression((Expression)null);
				return;
			case RequirementsPackage.BINARY_PROPERTY__RIGHT_EXPRESSION:
				setRightExpression((Expression)null);
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
			case RequirementsPackage.BINARY_PROPERTY__LEFT_EXPRESSION:
				return leftExpression != null;
			case RequirementsPackage.BINARY_PROPERTY__RIGHT_EXPRESSION:
				return rightExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryPropertyImpl
