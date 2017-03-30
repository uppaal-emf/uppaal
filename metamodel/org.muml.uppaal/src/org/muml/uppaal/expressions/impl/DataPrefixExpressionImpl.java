/**
 */
package org.muml.uppaal.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.uppaal.declarations.DataVariablePrefix;
import org.muml.uppaal.expressions.DataPrefixExpression;
import org.muml.uppaal.expressions.Expression;
import org.muml.uppaal.expressions.ExpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Prefix Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.expressions.impl.DataPrefixExpressionImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.muml.uppaal.expressions.impl.DataPrefixExpressionImpl#getDataTypeExpression <em>Data Type Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataPrefixExpressionImpl extends ExpressionImpl implements DataPrefixExpression {
	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final DataVariablePrefix PREFIX_EDEFAULT = DataVariablePrefix.CONST;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected DataVariablePrefix prefix = PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataTypeExpression() <em>Data Type Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression dataTypeExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPrefixExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataVariablePrefix getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(DataVariablePrefix newPrefix) {
		DataVariablePrefix oldPrefix = prefix;
		prefix = newPrefix == null ? PREFIX_EDEFAULT : newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.DATA_PREFIX_EXPRESSION__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getDataTypeExpression() {
		return dataTypeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTypeExpression(Expression newDataTypeExpression, NotificationChain msgs) {
		Expression oldDataTypeExpression = dataTypeExpression;
		dataTypeExpression = newDataTypeExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION, oldDataTypeExpression, newDataTypeExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypeExpression(Expression newDataTypeExpression) {
		if (newDataTypeExpression != dataTypeExpression) {
			NotificationChain msgs = null;
			if (dataTypeExpression != null)
				msgs = ((InternalEObject)dataTypeExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION, null, msgs);
			if (newDataTypeExpression != null)
				msgs = ((InternalEObject)newDataTypeExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION, null, msgs);
			msgs = basicSetDataTypeExpression(newDataTypeExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION, newDataTypeExpression, newDataTypeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION:
				return basicSetDataTypeExpression(null, msgs);
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
			case ExpressionsPackage.DATA_PREFIX_EXPRESSION__PREFIX:
				return getPrefix();
			case ExpressionsPackage.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION:
				return getDataTypeExpression();
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
			case ExpressionsPackage.DATA_PREFIX_EXPRESSION__PREFIX:
				setPrefix((DataVariablePrefix)newValue);
				return;
			case ExpressionsPackage.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION:
				setDataTypeExpression((Expression)newValue);
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
			case ExpressionsPackage.DATA_PREFIX_EXPRESSION__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case ExpressionsPackage.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION:
				setDataTypeExpression((Expression)null);
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
			case ExpressionsPackage.DATA_PREFIX_EXPRESSION__PREFIX:
				return prefix != PREFIX_EDEFAULT;
			case ExpressionsPackage.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION:
				return dataTypeExpression != null;
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
		result.append(" (prefix: ");
		result.append(prefix);
		result.append(')');
		return result.toString();
	}

} //DataPrefixExpressionImpl
