/**
 */
package org.muml.uppaal.options.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.core.impl.ExtendableElementImpl;
import org.muml.uppaal.options.Options;
import org.muml.uppaal.options.OptionsPackage;
import org.muml.uppaal.options.StateSpaceReduction;
import org.muml.uppaal.options.TraceOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.options.impl.OptionsImpl#getConnectorOutBufferSize <em>Connector Out Buffer Size</em>}</li>
 *   <li>{@link org.muml.uppaal.options.impl.OptionsImpl#getHashTableSize <em>Hash Table Size</em>}</li>
 *   <li>{@link org.muml.uppaal.options.impl.OptionsImpl#getStateSpaceReduction <em>State Space Reduction</em>}</li>
 *   <li>{@link org.muml.uppaal.options.impl.OptionsImpl#getTraceOptions <em>Trace Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionsImpl extends ExtendableElementImpl implements Options {
	/**
	 * The default value of the '{@link #getConnectorOutBufferSize() <em>Connector Out Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorOutBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final int CONNECTOR_OUT_BUFFER_SIZE_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getConnectorOutBufferSize() <em>Connector Out Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorOutBufferSize()
	 * @generated
	 * @ordered
	 */
	protected int connectorOutBufferSize = CONNECTOR_OUT_BUFFER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHashTableSize() <em>Hash Table Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashTableSize()
	 * @generated
	 * @ordered
	 */
	protected static final int HASH_TABLE_SIZE_EDEFAULT = 27;

	/**
	 * The cached value of the '{@link #getHashTableSize() <em>Hash Table Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashTableSize()
	 * @generated
	 * @ordered
	 */
	protected int hashTableSize = HASH_TABLE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateSpaceReduction() <em>State Space Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateSpaceReduction()
	 * @generated
	 * @ordered
	 */
	protected static final StateSpaceReduction STATE_SPACE_REDUCTION_EDEFAULT = StateSpaceReduction.CONSERVATIVE;

	/**
	 * The cached value of the '{@link #getStateSpaceReduction() <em>State Space Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateSpaceReduction()
	 * @generated
	 * @ordered
	 */
	protected StateSpaceReduction stateSpaceReduction = STATE_SPACE_REDUCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraceOptions() <em>Trace Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceOptions()
	 * @generated
	 * @ordered
	 */
	protected static final TraceOptions TRACE_OPTIONS_EDEFAULT = TraceOptions.SOME;

	/**
	 * The cached value of the '{@link #getTraceOptions() <em>Trace Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceOptions()
	 * @generated
	 * @ordered
	 */
	protected TraceOptions traceOptions = TRACE_OPTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionsPackage.Literals.OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConnectorOutBufferSize() {
		return connectorOutBufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorOutBufferSize(int newConnectorOutBufferSize) {
		int oldConnectorOutBufferSize = connectorOutBufferSize;
		connectorOutBufferSize = newConnectorOutBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptionsPackage.OPTIONS__CONNECTOR_OUT_BUFFER_SIZE, oldConnectorOutBufferSize, connectorOutBufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHashTableSize() {
		return hashTableSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHashTableSize(int newHashTableSize) {
		int oldHashTableSize = hashTableSize;
		hashTableSize = newHashTableSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptionsPackage.OPTIONS__HASH_TABLE_SIZE, oldHashTableSize, hashTableSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSpaceReduction getStateSpaceReduction() {
		return stateSpaceReduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateSpaceReduction(StateSpaceReduction newStateSpaceReduction) {
		StateSpaceReduction oldStateSpaceReduction = stateSpaceReduction;
		stateSpaceReduction = newStateSpaceReduction == null ? STATE_SPACE_REDUCTION_EDEFAULT : newStateSpaceReduction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptionsPackage.OPTIONS__STATE_SPACE_REDUCTION, oldStateSpaceReduction, stateSpaceReduction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceOptions getTraceOptions() {
		return traceOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceOptions(TraceOptions newTraceOptions) {
		TraceOptions oldTraceOptions = traceOptions;
		traceOptions = newTraceOptions == null ? TRACE_OPTIONS_EDEFAULT : newTraceOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptionsPackage.OPTIONS__TRACE_OPTIONS, oldTraceOptions, traceOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptionsPackage.OPTIONS__CONNECTOR_OUT_BUFFER_SIZE:
				return getConnectorOutBufferSize();
			case OptionsPackage.OPTIONS__HASH_TABLE_SIZE:
				return getHashTableSize();
			case OptionsPackage.OPTIONS__STATE_SPACE_REDUCTION:
				return getStateSpaceReduction();
			case OptionsPackage.OPTIONS__TRACE_OPTIONS:
				return getTraceOptions();
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
			case OptionsPackage.OPTIONS__CONNECTOR_OUT_BUFFER_SIZE:
				setConnectorOutBufferSize((Integer)newValue);
				return;
			case OptionsPackage.OPTIONS__HASH_TABLE_SIZE:
				setHashTableSize((Integer)newValue);
				return;
			case OptionsPackage.OPTIONS__STATE_SPACE_REDUCTION:
				setStateSpaceReduction((StateSpaceReduction)newValue);
				return;
			case OptionsPackage.OPTIONS__TRACE_OPTIONS:
				setTraceOptions((TraceOptions)newValue);
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
			case OptionsPackage.OPTIONS__CONNECTOR_OUT_BUFFER_SIZE:
				setConnectorOutBufferSize(CONNECTOR_OUT_BUFFER_SIZE_EDEFAULT);
				return;
			case OptionsPackage.OPTIONS__HASH_TABLE_SIZE:
				setHashTableSize(HASH_TABLE_SIZE_EDEFAULT);
				return;
			case OptionsPackage.OPTIONS__STATE_SPACE_REDUCTION:
				setStateSpaceReduction(STATE_SPACE_REDUCTION_EDEFAULT);
				return;
			case OptionsPackage.OPTIONS__TRACE_OPTIONS:
				setTraceOptions(TRACE_OPTIONS_EDEFAULT);
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
			case OptionsPackage.OPTIONS__CONNECTOR_OUT_BUFFER_SIZE:
				return connectorOutBufferSize != CONNECTOR_OUT_BUFFER_SIZE_EDEFAULT;
			case OptionsPackage.OPTIONS__HASH_TABLE_SIZE:
				return hashTableSize != HASH_TABLE_SIZE_EDEFAULT;
			case OptionsPackage.OPTIONS__STATE_SPACE_REDUCTION:
				return stateSpaceReduction != STATE_SPACE_REDUCTION_EDEFAULT;
			case OptionsPackage.OPTIONS__TRACE_OPTIONS:
				return traceOptions != TRACE_OPTIONS_EDEFAULT;
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
		result.append(" (connectorOutBufferSize: ");
		result.append(connectorOutBufferSize);
		result.append(", hashTableSize: ");
		result.append(hashTableSize);
		result.append(", stateSpaceReduction: ");
		result.append(stateSpaceReduction);
		result.append(", traceOptions: ");
		result.append(traceOptions);
		result.append(')');
		return result.toString();
	}

} //OptionsImpl
