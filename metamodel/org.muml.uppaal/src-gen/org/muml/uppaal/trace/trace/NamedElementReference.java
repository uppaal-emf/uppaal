/**
 */
package org.muml.uppaal.trace.trace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.trace.NamedElementReference#getSingleNamedElementReference <em>Single Named Element Reference</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.trace.NamedElementReference#getNamedElementReference <em>Named Element Reference</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.trace.trace.TracePackage#getNamedElementReference()
 * @model
 * @generated
 */
public interface NamedElementReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Single Named Element Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Single Named Element Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Single Named Element Reference</em>' containment reference.
   * @see #setSingleNamedElementReference(SingleNamedElementReference)
   * @see org.muml.uppaal.trace.trace.TracePackage#getNamedElementReference_SingleNamedElementReference()
   * @model containment="true"
   * @generated
   */
  SingleNamedElementReference getSingleNamedElementReference();

  /**
   * Sets the value of the '{@link org.muml.uppaal.trace.trace.NamedElementReference#getSingleNamedElementReference <em>Single Named Element Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Single Named Element Reference</em>' containment reference.
   * @see #getSingleNamedElementReference()
   * @generated
   */
  void setSingleNamedElementReference(SingleNamedElementReference value);

  /**
   * Returns the value of the '<em><b>Named Element Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Named Element Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Named Element Reference</em>' containment reference.
   * @see #setNamedElementReference(NamedElementReference)
   * @see org.muml.uppaal.trace.trace.TracePackage#getNamedElementReference_NamedElementReference()
   * @model containment="true"
   * @generated
   */
  NamedElementReference getNamedElementReference();

  /**
   * Sets the value of the '{@link org.muml.uppaal.trace.trace.NamedElementReference#getNamedElementReference <em>Named Element Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Named Element Reference</em>' containment reference.
   * @see #getNamedElementReference()
   * @generated
   */
  void setNamedElementReference(NamedElementReference value);

} // NamedElementReference
