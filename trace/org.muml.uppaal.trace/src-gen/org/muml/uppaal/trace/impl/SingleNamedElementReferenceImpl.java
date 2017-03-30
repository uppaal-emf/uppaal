/**
 */
package org.muml.uppaal.trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.muml.uppaal.core.NamedElement;
import org.muml.uppaal.trace.SingleNamedElementReference;
import org.muml.uppaal.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Named Element Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.impl.SingleNamedElementReferenceImpl#getNamedElement <em>Named Element</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.impl.SingleNamedElementReferenceImpl#getIndexes <em>Indexes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleNamedElementReferenceImpl extends MinimalEObjectImpl.Container implements SingleNamedElementReference
{
  /**
   * The cached value of the '{@link #getNamedElement() <em>Named Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamedElement()
   * @generated
   * @ordered
   */
  protected NamedElement namedElement;

  /**
   * The cached value of the '{@link #getIndexes() <em>Indexes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexes()
   * @generated
   * @ordered
   */
  protected EList<Integer> indexes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SingleNamedElementReferenceImpl()
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
    return TracePackage.Literals.SINGLE_NAMED_ELEMENT_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement getNamedElement()
  {
    if (namedElement != null && namedElement.eIsProxy())
    {
      InternalEObject oldNamedElement = (InternalEObject)namedElement;
      namedElement = (NamedElement)eResolveProxy(oldNamedElement);
      if (namedElement != oldNamedElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.SINGLE_NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT, oldNamedElement, namedElement));
      }
    }
    return namedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement basicGetNamedElement()
  {
    return namedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamedElement(NamedElement newNamedElement)
  {
    NamedElement oldNamedElement = namedElement;
    namedElement = newNamedElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.SINGLE_NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT, oldNamedElement, namedElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getIndexes()
  {
    if (indexes == null)
    {
      indexes = new EDataTypeEList<Integer>(Integer.class, this, TracePackage.SINGLE_NAMED_ELEMENT_REFERENCE__INDEXES);
    }
    return indexes;
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
      case TracePackage.SINGLE_NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT:
        if (resolve) return getNamedElement();
        return basicGetNamedElement();
      case TracePackage.SINGLE_NAMED_ELEMENT_REFERENCE__INDEXES:
        return getIndexes();
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
      case TracePackage.SINGLE_NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT:
        setNamedElement((NamedElement)newValue);
        return;
      case TracePackage.SINGLE_NAMED_ELEMENT_REFERENCE__INDEXES:
        getIndexes().clear();
        getIndexes().addAll((Collection<? extends Integer>)newValue);
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
      case TracePackage.SINGLE_NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT:
        setNamedElement((NamedElement)null);
        return;
      case TracePackage.SINGLE_NAMED_ELEMENT_REFERENCE__INDEXES:
        getIndexes().clear();
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
      case TracePackage.SINGLE_NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT:
        return namedElement != null;
      case TracePackage.SINGLE_NAMED_ELEMENT_REFERENCE__INDEXES:
        return indexes != null && !indexes.isEmpty();
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
    result.append(" (indexes: ");
    result.append(indexes);
    result.append(')');
    return result.toString();
  }

} //SingleNamedElementReferenceImpl
