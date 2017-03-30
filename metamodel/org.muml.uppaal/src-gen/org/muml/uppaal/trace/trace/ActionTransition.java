/**
 */
package org.muml.uppaal.trace.trace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.trace.ActionTransition#getEdgeActivities <em>Edge Activities</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.trace.trace.TracePackage#getActionTransition()
 * @model
 * @generated
 */
public interface ActionTransition extends Transition
{
  /**
   * Returns the value of the '<em><b>Edge Activities</b></em>' containment reference list.
   * The list contents are of type {@link org.muml.uppaal.trace.trace.EdgeActivity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edge Activities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edge Activities</em>' containment reference list.
   * @see org.muml.uppaal.trace.trace.TracePackage#getActionTransition_EdgeActivities()
   * @model containment="true"
   * @generated
   */
  EList<EdgeActivity> getEdgeActivities();

} // ActionTransition
