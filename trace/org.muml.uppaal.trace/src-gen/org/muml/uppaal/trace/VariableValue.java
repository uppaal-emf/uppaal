/**
 */
package org.muml.uppaal.trace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.VariableValue#getFirstNamedElementReference <em>First Named Element Reference</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.VariableValue#getSecondNamedElementReference <em>Second Named Element Reference</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.VariableValue#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.VariableValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.trace.TracePackage#getVariableValue()
 * @model
 * @generated
 */
public interface VariableValue extends EObject
{
  /**
   * Returns the value of the '<em><b>First Named Element Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Named Element Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Named Element Reference</em>' containment reference.
   * @see #setFirstNamedElementReference(NamedElementReference)
   * @see org.muml.uppaal.trace.TracePackage#getVariableValue_FirstNamedElementReference()
   * @model containment="true"
   * @generated
   */
  NamedElementReference getFirstNamedElementReference();

  /**
   * Sets the value of the '{@link org.muml.uppaal.trace.VariableValue#getFirstNamedElementReference <em>First Named Element Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Named Element Reference</em>' containment reference.
   * @see #getFirstNamedElementReference()
   * @generated
   */
  void setFirstNamedElementReference(NamedElementReference value);

  /**
   * Returns the value of the '<em><b>Second Named Element Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Named Element Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Named Element Reference</em>' containment reference.
   * @see #setSecondNamedElementReference(NamedElementReference)
   * @see org.muml.uppaal.trace.TracePackage#getVariableValue_SecondNamedElementReference()
   * @model containment="true"
   * @generated
   */
  NamedElementReference getSecondNamedElementReference();

  /**
   * Sets the value of the '{@link org.muml.uppaal.trace.VariableValue#getSecondNamedElementReference <em>Second Named Element Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Named Element Reference</em>' containment reference.
   * @see #getSecondNamedElementReference()
   * @generated
   */
  void setSecondNamedElementReference(NamedElementReference value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.muml.uppaal.trace.CompareOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.muml.uppaal.trace.CompareOperator
   * @see #setOperator(CompareOperator)
   * @see org.muml.uppaal.trace.TracePackage#getVariableValue_Operator()
   * @model
   * @generated
   */
  CompareOperator getOperator();

  /**
   * Sets the value of the '{@link org.muml.uppaal.trace.VariableValue#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.muml.uppaal.trace.CompareOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(CompareOperator value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.muml.uppaal.trace.TracePackage#getVariableValue_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.muml.uppaal.trace.VariableValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // VariableValue
