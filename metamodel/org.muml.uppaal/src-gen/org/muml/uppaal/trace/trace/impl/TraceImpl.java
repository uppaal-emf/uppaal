/**
 */
package org.muml.uppaal.trace.trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.uppaal.trace.trace.Result;
import org.muml.uppaal.trace.trace.Trace;
import org.muml.uppaal.trace.trace.TraceItem;
import org.muml.uppaal.trace.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.trace.impl.TraceImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.trace.impl.TraceImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.trace.impl.TraceImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.trace.impl.TraceImpl#getTraceItems <em>Trace Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceImpl extends MinimalEObjectImpl.Container implements Trace
{
  /**
   * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected static final int PROPERTY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected int property = PROPERTY_EDEFAULT;

  /**
   * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLine()
   * @generated
   * @ordered
   */
  protected static final int LINE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLine()
   * @generated
   * @ordered
   */
  protected int line = LINE_EDEFAULT;

  /**
   * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected static final Result RESULT_EDEFAULT = Result.SUCCESS;

  /**
   * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected Result result = RESULT_EDEFAULT;

  /**
   * The cached value of the '{@link #getTraceItems() <em>Trace Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraceItems()
   * @generated
   * @ordered
   */
  protected EList<TraceItem> traceItems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TraceImpl()
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
    return TracePackage.Literals.TRACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(int newProperty)
  {
    int oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACE__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLine()
  {
    return line;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLine(int newLine)
  {
    int oldLine = line;
    line = newLine;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACE__LINE, oldLine, line));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Result getResult()
  {
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResult(Result newResult)
  {
    Result oldResult = result;
    result = newResult == null ? RESULT_EDEFAULT : newResult;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACE__RESULT, oldResult, result));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TraceItem> getTraceItems()
  {
    if (traceItems == null)
    {
      traceItems = new EObjectContainmentEList<TraceItem>(TraceItem.class, this, TracePackage.TRACE__TRACE_ITEMS);
    }
    return traceItems;
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
      case TracePackage.TRACE__TRACE_ITEMS:
        return ((InternalEList<?>)getTraceItems()).basicRemove(otherEnd, msgs);
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
      case TracePackage.TRACE__PROPERTY:
        return getProperty();
      case TracePackage.TRACE__LINE:
        return getLine();
      case TracePackage.TRACE__RESULT:
        return getResult();
      case TracePackage.TRACE__TRACE_ITEMS:
        return getTraceItems();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TracePackage.TRACE__PROPERTY:
        setProperty((Integer)newValue);
        return;
      case TracePackage.TRACE__LINE:
        setLine((Integer)newValue);
        return;
      case TracePackage.TRACE__RESULT:
        setResult((Result)newValue);
        return;
      case TracePackage.TRACE__TRACE_ITEMS:
        getTraceItems().clear();
        getTraceItems().addAll((Collection<? extends TraceItem>)newValue);
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
      case TracePackage.TRACE__PROPERTY:
        setProperty(PROPERTY_EDEFAULT);
        return;
      case TracePackage.TRACE__LINE:
        setLine(LINE_EDEFAULT);
        return;
      case TracePackage.TRACE__RESULT:
        setResult(RESULT_EDEFAULT);
        return;
      case TracePackage.TRACE__TRACE_ITEMS:
        getTraceItems().clear();
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
      case TracePackage.TRACE__PROPERTY:
        return property != PROPERTY_EDEFAULT;
      case TracePackage.TRACE__LINE:
        return line != LINE_EDEFAULT;
      case TracePackage.TRACE__RESULT:
        return result != RESULT_EDEFAULT;
      case TracePackage.TRACE__TRACE_ITEMS:
        return traceItems != null && !traceItems.isEmpty();
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
    result.append(" (property: ");
    result.append(property);
    result.append(", line: ");
    result.append(line);
    result.append(", result: ");
    result.append(result);
    result.append(')');
    return result.toString();
  }

} //TraceImpl
