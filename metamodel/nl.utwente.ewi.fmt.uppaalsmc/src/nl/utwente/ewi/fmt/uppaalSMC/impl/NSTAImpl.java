/**
 */
package nl.utwente.ewi.fmt.uppaalSMC.impl;

import nl.utwente.ewi.fmt.uppaalSMC.DoubleType;
import nl.utwente.ewi.fmt.uppaalSMC.NSTA;
import nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.muml.uppaal.impl.NTAImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NSTA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.uppaalSMC.impl.NSTAImpl#getDouble <em>Double</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NSTAImpl extends NTAImpl implements NSTA {
	/**
	 * The cached value of the '{@link #getDouble() <em>Double</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble()
	 * @generated
	 * @ordered
	 */
	protected DoubleType double_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NSTAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UppaalSMCPackage.Literals.NSTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleType getDouble() {
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDouble(DoubleType newDouble, NotificationChain msgs) {
		DoubleType oldDouble = double_;
		double_ = newDouble;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UppaalSMCPackage.NSTA__DOUBLE, oldDouble, newDouble);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDouble(DoubleType newDouble) {
		if (newDouble != double_) {
			NotificationChain msgs = null;
			if (double_ != null)
				msgs = ((InternalEObject)double_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UppaalSMCPackage.NSTA__DOUBLE, null, msgs);
			if (newDouble != null)
				msgs = ((InternalEObject)newDouble).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UppaalSMCPackage.NSTA__DOUBLE, null, msgs);
			msgs = basicSetDouble(newDouble, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalSMCPackage.NSTA__DOUBLE, newDouble, newDouble));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UppaalSMCPackage.NSTA__DOUBLE:
				return basicSetDouble(null, msgs);
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
			case UppaalSMCPackage.NSTA__DOUBLE:
				return getDouble();
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
			case UppaalSMCPackage.NSTA__DOUBLE:
				setDouble((DoubleType)newValue);
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
			case UppaalSMCPackage.NSTA__DOUBLE:
				setDouble((DoubleType)null);
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
			case UppaalSMCPackage.NSTA__DOUBLE:
				return double_ != null;
		}
		return super.eIsSet(featureID);
	}

} //NSTAImpl
