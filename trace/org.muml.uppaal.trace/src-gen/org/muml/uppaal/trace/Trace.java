/**
 */
package org.muml.uppaal.trace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.Trace#getProperty <em>Property</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.Trace#getLine <em>Line</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.Trace#getResult <em>Result</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.Trace#getTraceItems <em>Trace Items</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.trace.TracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' attribute.
   * @see #setProperty(int)
   * @see org.muml.uppaal.trace.TracePackage#getTrace_Property()
   * @model
   * @generated
   */
  int getProperty();

  /**
   * Sets the value of the '{@link org.muml.uppaal.trace.Trace#getProperty <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' attribute.
   * @see #getProperty()
   * @generated
   */
  void setProperty(int value);

  /**
   * Returns the value of the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Line</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line</em>' attribute.
   * @see #setLine(int)
   * @see org.muml.uppaal.trace.TracePackage#getTrace_Line()
   * @model
   * @generated
   */
  int getLine();

  /**
   * Sets the value of the '{@link org.muml.uppaal.trace.Trace#getLine <em>Line</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line</em>' attribute.
   * @see #getLine()
   * @generated
   */
  void setLine(int value);

  /**
   * Returns the value of the '<em><b>Result</b></em>' attribute.
   * The literals are from the enumeration {@link org.muml.uppaal.trace.Result}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' attribute.
   * @see org.muml.uppaal.trace.Result
   * @see #setResult(Result)
   * @see org.muml.uppaal.trace.TracePackage#getTrace_Result()
   * @model
   * @generated
   */
  Result getResult();

  /**
   * Sets the value of the '{@link org.muml.uppaal.trace.Trace#getResult <em>Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' attribute.
   * @see org.muml.uppaal.trace.Result
   * @see #getResult()
   * @generated
   */
  void setResult(Result value);

  /**
   * Returns the value of the '<em><b>Trace Items</b></em>' containment reference list.
   * The list contents are of type {@link org.muml.uppaal.trace.TraceItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trace Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trace Items</em>' containment reference list.
   * @see org.muml.uppaal.trace.TracePackage#getTrace_TraceItems()
   * @model containment="true"
   * @generated
   */
  EList<TraceItem> getTraceItems();

} // Trace
