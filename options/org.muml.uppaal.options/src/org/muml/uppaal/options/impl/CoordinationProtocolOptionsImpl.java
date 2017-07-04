/**
 */
package org.muml.uppaal.options.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.uppaal.options.CoordinationProtocolOptions;
import org.muml.uppaal.options.OptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Protocol Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.options.impl.CoordinationProtocolOptionsImpl#getRoleMultiplicity <em>Role Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinationProtocolOptionsImpl extends OptionsImpl implements CoordinationProtocolOptions {
	/**
	 * The default value of the '{@link #getRoleMultiplicity() <em>Role Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int ROLE_MULTIPLICITY_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getRoleMultiplicity() <em>Role Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected int roleMultiplicity = ROLE_MULTIPLICITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationProtocolOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionsPackage.Literals.COORDINATION_PROTOCOL_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoleMultiplicity() {
		return roleMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleMultiplicity(int newRoleMultiplicity) {
		int oldRoleMultiplicity = roleMultiplicity;
		roleMultiplicity = newRoleMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptionsPackage.COORDINATION_PROTOCOL_OPTIONS__ROLE_MULTIPLICITY, oldRoleMultiplicity, roleMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptionsPackage.COORDINATION_PROTOCOL_OPTIONS__ROLE_MULTIPLICITY:
				return getRoleMultiplicity();
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
			case OptionsPackage.COORDINATION_PROTOCOL_OPTIONS__ROLE_MULTIPLICITY:
				setRoleMultiplicity((Integer)newValue);
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
			case OptionsPackage.COORDINATION_PROTOCOL_OPTIONS__ROLE_MULTIPLICITY:
				setRoleMultiplicity(ROLE_MULTIPLICITY_EDEFAULT);
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
			case OptionsPackage.COORDINATION_PROTOCOL_OPTIONS__ROLE_MULTIPLICITY:
				return roleMultiplicity != ROLE_MULTIPLICITY_EDEFAULT;
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
		result.append(" (roleMultiplicity: ");
		result.append(roleMultiplicity);
		result.append(')');
		return result.toString();
	}

} //CoordinationProtocolOptionsImpl
