/**
 */
package org.muml.uppaal.trace.trace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.muml.uppaal.trace.trace.NamedElementReference;
import org.muml.uppaal.trace.trace.SingleNamedElementReference;
import org.muml.uppaal.trace.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.trace.impl.NamedElementReferenceImpl#getSingleNamedElementReference <em>Single Named Element Reference</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.trace.impl.NamedElementReferenceImpl#getNamedElementReference <em>Named Element Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedElementReferenceImpl extends MinimalEObjectImpl.Container implements NamedElementReference
{
  /**
   * The cached value of the '{@link #getSingleNamedElementReference() <em>Single Named Element Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingleNamedElementReference()
   * @generated
   * @ordered
   */
  protected SingleNamedElementReference singleNamedElementReference;

  /**
   * The cached value of the '{@link #getNamedElementReference() <em>Named Element Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamedElementReference()
   * @generated
   * @ordered
   */
  protected NamedElementReference namedElementReference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamedElementReferenceImpl()
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
    return TracePackage.Literals.NAMED_ELEMENT_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleNamedElementReference getSingleNamedElementReference()
  {
    return singleNamedElementReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSingleNamedElementReference(SingleNamedElementReference newSingleNamedElementReference, NotificationChain msgs)
  {
    SingleNamedElementReference oldSingleNamedElementReference = singleNamedElementReference;
    singleNamedElementReference = newSingleNamedElementReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TracePackage.NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE, oldSingleNamedElementReference, newSingleNamedElementReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSingleNamedElementReference(SingleNamedElementReference newSingleNamedElementReference)
  {
    if (newSingleNamedElementReference != singleNamedElementReference)
    {
      NotificationChain msgs = null;
      if (singleNamedElementReference != null)
        msgs = ((InternalEObject)singleNamedElementReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TracePackage.NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE, null, msgs);
      if (newSingleNamedElementReference != null)
        msgs = ((InternalEObject)newSingleNamedElementReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TracePackage.NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE, null, msgs);
      msgs = basicSetSingleNamedElementReference(newSingleNamedElementReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE, newSingleNamedElementReference, newSingleNamedElementReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElementReference getNamedElementReference()
  {
    return namedElementReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamedElementReference(NamedElementReference newNamedElementReference, NotificationChain msgs)
  {
    NamedElementReference oldNamedElementReference = namedElementReference;
    namedElementReference = newNamedElementReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TracePackage.NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE, oldNamedElementReference, newNamedElementReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamedElementReference(NamedElementReference newNamedElementReference)
  {
    if (newNamedElementReference != namedElementReference)
    {
      NotificationChain msgs = null;
      if (namedElementReference != null)
        msgs = ((InternalEObject)namedElementReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TracePackage.NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE, null, msgs);
      if (newNamedElementReference != null)
        msgs = ((InternalEObject)newNamedElementReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TracePackage.NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE, null, msgs);
      msgs = basicSetNamedElementReference(newNamedElementReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE, newNamedElementReference, newNamedElementReference));
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
      case TracePackage.NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE:
        return basicSetSingleNamedElementReference(null, msgs);
      case TracePackage.NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE:
        return basicSetNamedElementReference(null, msgs);
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
      case TracePackage.NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE:
        return getSingleNamedElementReference();
      case TracePackage.NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE:
        return getNamedElementReference();
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
      case TracePackage.NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE:
        setSingleNamedElementReference((SingleNamedElementReference)newValue);
        return;
      case TracePackage.NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE:
        setNamedElementReference((NamedElementReference)newValue);
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
      case TracePackage.NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE:
        setSingleNamedElementReference((SingleNamedElementReference)null);
        return;
      case TracePackage.NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE:
        setNamedElementReference((NamedElementReference)null);
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
      case TracePackage.NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE:
        return singleNamedElementReference != null;
      case TracePackage.NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE:
        return namedElementReference != null;
    }
    return super.eIsSet(featureID);
  }

} //NamedElementReferenceImpl
