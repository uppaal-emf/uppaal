/**
 */
package org.muml.uppaal.trace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.muml.uppaal.trace.EdgeActivity;
import org.muml.uppaal.trace.LocationActivity;
import org.muml.uppaal.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.impl.EdgeActivityImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.impl.EdgeActivityImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.impl.EdgeActivityImpl#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeActivityImpl extends MinimalEObjectImpl.Container implements EdgeActivity
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected LocationActivity source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected LocationActivity target;

  /**
   * The default value of the '{@link #getDetails() <em>Details</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetails()
   * @generated
   * @ordered
   */
  protected static final String DETAILS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDetails() <em>Details</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetails()
   * @generated
   * @ordered
   */
  protected String details = DETAILS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EdgeActivityImpl()
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
    return TracePackage.Literals.EDGE_ACTIVITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationActivity getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(LocationActivity newSource, NotificationChain msgs)
  {
    LocationActivity oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TracePackage.EDGE_ACTIVITY__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(LocationActivity newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TracePackage.EDGE_ACTIVITY__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TracePackage.EDGE_ACTIVITY__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.EDGE_ACTIVITY__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationActivity getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(LocationActivity newTarget, NotificationChain msgs)
  {
    LocationActivity oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TracePackage.EDGE_ACTIVITY__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(LocationActivity newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TracePackage.EDGE_ACTIVITY__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TracePackage.EDGE_ACTIVITY__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.EDGE_ACTIVITY__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDetails()
  {
    return details;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDetails(String newDetails)
  {
    String oldDetails = details;
    details = newDetails;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.EDGE_ACTIVITY__DETAILS, oldDetails, details));
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
      case TracePackage.EDGE_ACTIVITY__SOURCE:
        return basicSetSource(null, msgs);
      case TracePackage.EDGE_ACTIVITY__TARGET:
        return basicSetTarget(null, msgs);
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
      case TracePackage.EDGE_ACTIVITY__SOURCE:
        return getSource();
      case TracePackage.EDGE_ACTIVITY__TARGET:
        return getTarget();
      case TracePackage.EDGE_ACTIVITY__DETAILS:
        return getDetails();
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
      case TracePackage.EDGE_ACTIVITY__SOURCE:
        setSource((LocationActivity)newValue);
        return;
      case TracePackage.EDGE_ACTIVITY__TARGET:
        setTarget((LocationActivity)newValue);
        return;
      case TracePackage.EDGE_ACTIVITY__DETAILS:
        setDetails((String)newValue);
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
      case TracePackage.EDGE_ACTIVITY__SOURCE:
        setSource((LocationActivity)null);
        return;
      case TracePackage.EDGE_ACTIVITY__TARGET:
        setTarget((LocationActivity)null);
        return;
      case TracePackage.EDGE_ACTIVITY__DETAILS:
        setDetails(DETAILS_EDEFAULT);
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
      case TracePackage.EDGE_ACTIVITY__SOURCE:
        return source != null;
      case TracePackage.EDGE_ACTIVITY__TARGET:
        return target != null;
      case TracePackage.EDGE_ACTIVITY__DETAILS:
        return DETAILS_EDEFAULT == null ? details != null : !DETAILS_EDEFAULT.equals(details);
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
    result.append(" (details: ");
    result.append(details);
    result.append(')');
    return result.toString();
  }

} //EdgeActivityImpl
