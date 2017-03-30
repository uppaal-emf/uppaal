/**
 */
package org.muml.uppaal.trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.uppaal.trace.LocationActivity;
import org.muml.uppaal.trace.State;
import org.muml.uppaal.trace.TracePackage;
import org.muml.uppaal.trace.VariableValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.impl.StateImpl#getLocationActivities <em>Location Activities</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.impl.StateImpl#getVariableValues <em>Variable Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends TraceItemImpl implements State
{
  /**
   * The cached value of the '{@link #getLocationActivities() <em>Location Activities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocationActivities()
   * @generated
   * @ordered
   */
  protected EList<LocationActivity> locationActivities;

  /**
   * The cached value of the '{@link #getVariableValues() <em>Variable Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableValues()
   * @generated
   * @ordered
   */
  protected EList<VariableValue> variableValues;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateImpl()
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
    return TracePackage.Literals.STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LocationActivity> getLocationActivities()
  {
    if (locationActivities == null)
    {
      locationActivities = new EObjectContainmentEList<LocationActivity>(LocationActivity.class, this, TracePackage.STATE__LOCATION_ACTIVITIES);
    }
    return locationActivities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableValue> getVariableValues()
  {
    if (variableValues == null)
    {
      variableValues = new EObjectContainmentEList<VariableValue>(VariableValue.class, this, TracePackage.STATE__VARIABLE_VALUES);
    }
    return variableValues;
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
      case TracePackage.STATE__LOCATION_ACTIVITIES:
        return ((InternalEList<?>)getLocationActivities()).basicRemove(otherEnd, msgs);
      case TracePackage.STATE__VARIABLE_VALUES:
        return ((InternalEList<?>)getVariableValues()).basicRemove(otherEnd, msgs);
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
      case TracePackage.STATE__LOCATION_ACTIVITIES:
        return getLocationActivities();
      case TracePackage.STATE__VARIABLE_VALUES:
        return getVariableValues();
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
      case TracePackage.STATE__LOCATION_ACTIVITIES:
        getLocationActivities().clear();
        getLocationActivities().addAll((Collection<? extends LocationActivity>)newValue);
        return;
      case TracePackage.STATE__VARIABLE_VALUES:
        getVariableValues().clear();
        getVariableValues().addAll((Collection<? extends VariableValue>)newValue);
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
      case TracePackage.STATE__LOCATION_ACTIVITIES:
        getLocationActivities().clear();
        return;
      case TracePackage.STATE__VARIABLE_VALUES:
        getVariableValues().clear();
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
      case TracePackage.STATE__LOCATION_ACTIVITIES:
        return locationActivities != null && !locationActivities.isEmpty();
      case TracePackage.STATE__VARIABLE_VALUES:
        return variableValues != null && !variableValues.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StateImpl
