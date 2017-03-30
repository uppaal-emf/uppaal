/**
 */
package org.muml.uppaal.trace;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.uppaal.trace.TracePackage
 * @generated
 */
public interface TraceFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TraceFactory eINSTANCE = org.muml.uppaal.trace.impl.TraceFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Repository</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repository</em>'.
   * @generated
   */
  TraceRepository createTraceRepository();

  /**
   * Returns a new object of class '<em>Trace</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trace</em>'.
   * @generated
   */
  Trace createTrace();

  /**
   * Returns a new object of class '<em>Process Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Identifier</em>'.
   * @generated
   */
  ProcessIdentifier createProcessIdentifier();

  /**
   * Returns a new object of class '<em>Location Activity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Location Activity</em>'.
   * @generated
   */
  LocationActivity createLocationActivity();

  /**
   * Returns a new object of class '<em>Variable Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Value</em>'.
   * @generated
   */
  VariableValue createVariableValue();

  /**
   * Returns a new object of class '<em>Single Named Element Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Named Element Reference</em>'.
   * @generated
   */
  SingleNamedElementReference createSingleNamedElementReference();

  /**
   * Returns a new object of class '<em>Named Element Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Element Reference</em>'.
   * @generated
   */
  NamedElementReference createNamedElementReference();

  /**
   * Returns a new object of class '<em>Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item</em>'.
   * @generated
   */
  TraceItem createTraceItem();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Edge Activity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Edge Activity</em>'.
   * @generated
   */
  EdgeActivity createEdgeActivity();

  /**
   * Returns a new object of class '<em>Synchronization</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Synchronization</em>'.
   * @generated
   */
  Synchronization createSynchronization();

  /**
   * Returns a new object of class '<em>Channel Synchronization</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Channel Synchronization</em>'.
   * @generated
   */
  ChannelSynchronization createChannelSynchronization();

  /**
   * Returns a new object of class '<em>Delay Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delay Transition</em>'.
   * @generated
   */
  DelayTransition createDelayTransition();

  /**
   * Returns a new object of class '<em>Action Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Transition</em>'.
   * @generated
   */
  ActionTransition createActionTransition();

  /**
   * Returns a new object of class '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TracePackage getTracePackage();

} //TraceFactory
