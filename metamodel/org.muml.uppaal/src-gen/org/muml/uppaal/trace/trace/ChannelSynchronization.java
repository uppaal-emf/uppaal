/**
 */
package org.muml.uppaal.trace.trace;

import org.muml.uppaal.declarations.Variable;

import org.muml.uppaal.templates.SynchronizationKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Synchronization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.trace.ChannelSynchronization#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.trace.ChannelSynchronization#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.trace.trace.TracePackage#getChannelSynchronization()
 * @model
 * @generated
 */
public interface ChannelSynchronization extends Synchronization
{
  /**
   * Returns the value of the '<em><b>Channel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Channel</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Channel</em>' reference.
   * @see #setChannel(Variable)
   * @see org.muml.uppaal.trace.trace.TracePackage#getChannelSynchronization_Channel()
   * @model
   * @generated
   */
  Variable getChannel();

  /**
   * Sets the value of the '{@link org.muml.uppaal.trace.trace.ChannelSynchronization#getChannel <em>Channel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Channel</em>' reference.
   * @see #getChannel()
   * @generated
   */
  void setChannel(Variable value);

  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link org.muml.uppaal.templates.SynchronizationKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see org.muml.uppaal.templates.SynchronizationKind
   * @see #setKind(SynchronizationKind)
   * @see org.muml.uppaal.trace.trace.TracePackage#getChannelSynchronization_Kind()
   * @model
   * @generated
   */
  SynchronizationKind getKind();

  /**
   * Sets the value of the '{@link org.muml.uppaal.trace.trace.ChannelSynchronization#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see org.muml.uppaal.templates.SynchronizationKind
   * @see #getKind()
   * @generated
   */
  void setKind(SynchronizationKind value);

} // ChannelSynchronization
