/**
 */
package org.muml.uppaal.trace.trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.trace.TraceRepository#getTraces <em>Traces</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.trace.trace.TracePackage#getTraceRepository()
 * @model
 * @generated
 */
public interface TraceRepository extends EObject
{
  /**
   * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
   * The list contents are of type {@link org.muml.uppaal.trace.trace.Trace}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Traces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Traces</em>' containment reference list.
   * @see org.muml.uppaal.trace.trace.TracePackage#getTraceRepository_Traces()
   * @model containment="true"
   * @generated
   */
  EList<Trace> getTraces();

} // TraceRepository
