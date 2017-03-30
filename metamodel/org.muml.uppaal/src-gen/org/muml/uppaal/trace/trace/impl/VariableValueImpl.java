/**
 */
package org.muml.uppaal.trace.trace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.muml.uppaal.trace.trace.CompareOperator;
import org.muml.uppaal.trace.trace.NamedElementReference;
import org.muml.uppaal.trace.trace.TracePackage;
import org.muml.uppaal.trace.trace.VariableValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.trace.impl.VariableValueImpl#getFirstNamedElementReference <em>First Named Element Reference</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.trace.impl.VariableValueImpl#getSecondNamedElementReference <em>Second Named Element Reference</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.trace.impl.VariableValueImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.trace.impl.VariableValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableValueImpl extends MinimalEObjectImpl.Container implements VariableValue
{
  /**
   * The cached value of the '{@link #getFirstNamedElementReference() <em>First Named Element Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstNamedElementReference()
   * @generated
   * @ordered
   */
  protected NamedElementReference firstNamedElementReference;

  /**
   * The cached value of the '{@link #getSecondNamedElementReference() <em>Second Named Element Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondNamedElementReference()
   * @generated
   * @ordered
   */
  protected NamedElementReference secondNamedElementReference;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final CompareOperator OPERATOR_EDEFAULT = CompareOperator.EQ;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected CompareOperator operator = OPERATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableValueImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TracePackage.Literals.VARIABLE_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElementReference getFirstNamedElementReference()
  {
    return firstNamedElementReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstNamedElementReference(NamedElementReference newFirstNamedElementReference, NotificationChain msgs)
  {
    NamedElementReference oldFirstNamedElementReference = firstNamedElementReference;
    firstNamedElementReference = newFirstNamedElementReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TracePackage.VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE, oldFirstNamedElementReference, newFirstNamedElementReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstNamedElementReference(NamedElementReference newFirstNamedElementReference)
  {
    if (newFirstNamedElementReference != firstNamedElementReference)
    {
      NotificationChain msgs = null;
      if (firstNamedElementReference != null)
        msgs = ((InternalEObject)firstNamedElementReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TracePackage.VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE, null, msgs);
      if (newFirstNamedElementReference != null)
        msgs = ((InternalEObject)newFirstNamedElementReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TracePackage.VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE, null, msgs);
      msgs = basicSetFirstNamedElementReference(newFirstNamedElementReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE, newFirstNamedElementReference, newFirstNamedElementReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElementReference getSecondNamedElementReference()
  {
    return secondNamedElementReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecondNamedElementReference(NamedElementReference newSecondNamedElementReference, NotificationChain msgs)
  {
    NamedElementReference oldSecondNamedElementReference = secondNamedElementReference;
    secondNamedElementReference = newSecondNamedElementReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TracePackage.VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE, oldSecondNamedElementReference, newSecondNamedElementReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondNamedElementReference(NamedElementReference newSecondNamedElementReference)
  {
    if (newSecondNamedElementReference != secondNamedElementReference)
    {
      NotificationChain msgs = null;
      if (secondNamedElementReference != null)
        msgs = ((InternalEObject)secondNamedElementReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TracePackage.VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE, null, msgs);
      if (newSecondNamedElementReference != null)
        msgs = ((InternalEObject)newSecondNamedElementReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TracePackage.VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE, null, msgs);
      msgs = basicSetSecondNamedElementReference(newSecondNamedElementReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE, newSecondNamedElementReference, newSecondNamedElementReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompareOperator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(CompareOperator newOperator)
  {
    CompareOperator oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.VARIABLE_VALUE__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.VARIABLE_VALUE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TracePackage.VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE:
        return basicSetFirstNamedElementReference(null, msgs);
      case TracePackage.VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE:
        return basicSetSecondNamedElementReference(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TracePackage.VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE:
        return getFirstNamedElementReference();
      case TracePackage.VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE:
        return getSecondNamedElementReference();
      case TracePackage.VARIABLE_VALUE__OPERATOR:
        return getOperator();
      case TracePackage.VARIABLE_VALUE__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TracePackage.VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE:
        setFirstNamedElementReference((NamedElementReference)newValue);
        return;
      case TracePackage.VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE:
        setSecondNamedElementReference((NamedElementReference)newValue);
        return;
      case TracePackage.VARIABLE_VALUE__OPERATOR:
        setOperator((CompareOperator)newValue);
        return;
      case TracePackage.VARIABLE_VALUE__VALUE:
        setValue((Integer)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TracePackage.VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE:
        setFirstNamedElementReference((NamedElementReference)null);
        return;
      case TracePackage.VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE:
        setSecondNamedElementReference((NamedElementReference)null);
        return;
      case TracePackage.VARIABLE_VALUE__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case TracePackage.VARIABLE_VALUE__VALUE:
        setValue(VALUE_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TracePackage.VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE:
        return firstNamedElementReference != null;
      case TracePackage.VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE:
        return secondNamedElementReference != null;
      case TracePackage.VARIABLE_VALUE__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case TracePackage.VARIABLE_VALUE__VALUE:
        return value != VALUE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (operator: ");
    result.append(operator);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //VariableValueImpl
