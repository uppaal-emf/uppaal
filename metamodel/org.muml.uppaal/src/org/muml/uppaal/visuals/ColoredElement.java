/**
 */
package org.muml.uppaal.visuals;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colored Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A model element that has an optional color.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.visuals.ColoredElement#getColorCode <em>Color Code</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.visuals.VisualsPackage#getColoredElement()
 * @model abstract="true"
 * @generated
 */
public interface ColoredElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Color Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hexadecimal color code of the model element that must be defined if a self-defined color should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color Code</em>' attribute.
	 * @see #setColorCode(String)
	 * @see org.muml.uppaal.visuals.VisualsPackage#getColoredElement_ColorCode()
	 * @model
	 * @generated
	 */
	String getColorCode();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.visuals.ColoredElement#getColorCode <em>Color Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Code</em>' attribute.
	 * @see #getColorCode()
	 * @generated
	 */
	void setColorCode(String value);

} // ColoredElement
