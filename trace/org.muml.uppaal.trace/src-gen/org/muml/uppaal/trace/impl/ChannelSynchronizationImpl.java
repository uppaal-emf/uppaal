/**
 */
package org.muml.uppaal.trace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.uppaal.declarations.Variable;
import org.muml.uppaal.templates.SynchronizationKind;
import org.muml.uppaal.trace.ChannelSynchronization;
import org.muml.uppaal.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel Synchronization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.impl.ChannelSynchronizationImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.impl.ChannelSynchronizationImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelSynchronizationImpl extends SynchronizationImpl implements ChannelSynchronization
{
  /**
   * The cached value of the '{@link #getChannel() <em>Channel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannel()
   * @generated
   * @ordered
   */
  protected Variable channel;

  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final SynchronizationKind KIND_EDEFAULT = SynchronizationKind.RECEIVE;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected SynchronizationKind kind = KIND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChannelSynchronizationImpl()
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
    return TracePackage.Literals.CHANNEL_SYNCHRONIZATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getChannel()
  {
    if (channel != null && channel.eIsProxy())
    {
      InternalEObject oldChannel = (InternalEObject)channel;
      channel = (Variable)eResolveProxy(oldChannel);
      if (channel != oldChannel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.CHANNEL_SYNCHRONIZATION__CHANNEL, oldChannel, channel));
      }
    }
    return channel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetChannel()
  {
    return channel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChannel(Variable newChannel)
  {
    Variable oldChannel = channel;
    channel = newChannel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.CHANNEL_SYNCHRONIZATION__CHANNEL, oldChannel, channel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SynchronizationKind getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(SynchronizationKind newKind)
  {
    SynchronizationKind oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.CHANNEL_SYNCHRONIZATION__KIND, oldKind, kind));
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
      case TracePackage.CHANNEL_SYNCHRONIZATION__CHANNEL:
        if (resolve) return getChannel();
        return basicGetChannel();
      case TracePackage.CHANNEL_SYNCHRONIZATION__KIND:
        return getKind();
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
      case TracePackage.CHANNEL_SYNCHRONIZATION__CHANNEL:
        setChannel((Variable)newValue);
        return;
      case TracePackage.CHANNEL_SYNCHRONIZATION__KIND:
        setKind((SynchronizationKind)newValue);
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
      case TracePackage.CHANNEL_SYNCHRONIZATION__CHANNEL:
        setChannel((Variable)null);
        return;
      case TracePackage.CHANNEL_SYNCHRONIZATION__KIND:
        setKind(KIND_EDEFAULT);
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
      case TracePackage.CHANNEL_SYNCHRONIZATION__CHANNEL:
        return channel != null;
      case TracePackage.CHANNEL_SYNCHRONIZATION__KIND:
        return kind != KIND_EDEFAULT;
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
    result.append(" (kind: ");
    result.append(kind);
    result.append(')');
    return result.toString();
  }

} //ChannelSynchronizationImpl
