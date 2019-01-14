/**
 */
package nl.utwente.ewi.fmt.uppaalSMC.impl;

import nl.utwente.ewi.fmt.uppaalSMC.ExponentialLocation;
import nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.muml.uppaal.expressions.Expression;

import org.muml.uppaal.templates.impl.LocationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exponential Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.uppaalSMC.impl.ExponentialLocationImpl#getExitRate <em>Exit Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExponentialLocationImpl extends LocationImpl implements ExponentialLocation {
	/**
	 * The cached value of the '{@link #getExitRate() <em>Exit Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitRate()
	 * @generated
	 * @ordered
	 */
	protected Expression exitRate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExponentialLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UppaalSMCPackage.Literals.EXPONENTIAL_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExitRate() {
		return exitRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExitRate(Expression newExitRate, NotificationChain msgs) {
		Expression oldExitRate = exitRate;
		exitRate = newExitRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UppaalSMCPackage.EXPONENTIAL_LOCATION__EXIT_RATE, oldExitRate, newExitRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitRate(Expression newExitRate) {
		if (newExitRate != exitRate) {
			NotificationChain msgs = null;
			if (exitRate != null)
				msgs = ((InternalEObject)exitRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UppaalSMCPackage.EXPONENTIAL_LOCATION__EXIT_RATE, null, msgs);
			if (newExitRate != null)
				msgs = ((InternalEObject)newExitRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UppaalSMCPackage.EXPONENTIAL_LOCATION__EXIT_RATE, null, msgs);
			msgs = basicSetExitRate(newExitRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalSMCPackage.EXPONENTIAL_LOCATION__EXIT_RATE, newExitRate, newExitRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UppaalSMCPackage.EXPONENTIAL_LOCATION__EXIT_RATE:
				return basicSetExitRate(null, msgs);
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
			case UppaalSMCPackage.EXPONENTIAL_LOCATION__EXIT_RATE:
				return getExitRate();
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
			case UppaalSMCPackage.EXPONENTIAL_LOCATION__EXIT_RATE:
				setExitRate((Expression)newValue);
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
			case UppaalSMCPackage.EXPONENTIAL_LOCATION__EXIT_RATE:
				setExitRate((Expression)null);
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
			case UppaalSMCPackage.EXPONENTIAL_LOCATION__EXIT_RATE:
				return exitRate != null;
		}
		return super.eIsSet(featureID);
	}

} //ExponentialLocationImpl
