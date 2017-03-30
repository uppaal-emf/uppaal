/**
 */
package org.muml.uppaal.trace.trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.muml.uppaal.templates.AbstractTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.trace.ProcessIdentifier#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.trace.ProcessIdentifier#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.trace.trace.TracePackage#getProcessIdentifier()
 * @model
 * @generated
 */
public interface ProcessIdentifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Template</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template</em>' reference.
   * @see #setTemplate(AbstractTemplate)
   * @see org.muml.uppaal.trace.trace.TracePackage#getProcessIdentifier_Template()
   * @model
   * @generated
   */
  AbstractTemplate getTemplate();

  /**
   * Sets the value of the '{@link org.muml.uppaal.trace.trace.ProcessIdentifier#getTemplate <em>Template</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template</em>' reference.
   * @see #getTemplate()
   * @generated
   */
  void setTemplate(AbstractTemplate value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' attribute list.
   * @see org.muml.uppaal.trace.trace.TracePackage#getProcessIdentifier_Arguments()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getArguments();

} // ProcessIdentifier
