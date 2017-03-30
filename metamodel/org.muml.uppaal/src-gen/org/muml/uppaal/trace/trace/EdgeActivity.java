/**
 */
package org.muml.uppaal.trace.trace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.trace.EdgeActivity#getSource <em>Source</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.trace.EdgeActivity#getTarget <em>Target</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.trace.EdgeActivity#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.trace.trace.TracePackage#getEdgeActivity()
 * @model
 * @generated
 */
public interface EdgeActivity extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(LocationActivity)
   * @see org.muml.uppaal.trace.trace.TracePackage#getEdgeActivity_Source()
   * @model containment="true"
   * @generated
   */
  LocationActivity getSource();

  /**
   * Sets the value of the '{@link org.muml.uppaal.trace.trace.EdgeActivity#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(LocationActivity value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(LocationActivity)
   * @see org.muml.uppaal.trace.trace.TracePackage#getEdgeActivity_Target()
   * @model containment="true"
   * @generated
   */
  LocationActivity getTarget();

  /**
   * Sets the value of the '{@link org.muml.uppaal.trace.trace.EdgeActivity#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(LocationActivity value);

  /**
   * Returns the value of the '<em><b>Details</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Details</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Details</em>' attribute.
   * @see #setDetails(String)
   * @see org.muml.uppaal.trace.trace.TracePackage#getEdgeActivity_Details()
   * @model
   * @generated
   */
  String getDetails();

  /**
   * Sets the value of the '{@link org.muml.uppaal.trace.trace.EdgeActivity#getDetails <em>Details</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Details</em>' attribute.
   * @see #getDetails()
   * @generated
   */
  void setDetails(String value);

} // EdgeActivity
