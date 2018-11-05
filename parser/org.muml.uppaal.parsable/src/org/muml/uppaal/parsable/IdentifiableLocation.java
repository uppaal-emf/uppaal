/**
 */
package org.muml.uppaal.parsable;

import org.muml.uppaal.templates.Location;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.parsable.IdentifiableLocation#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.parsable.ParsablePackage#getIdentifiableLocation()
 * @model
 * @generated
 */
public interface IdentifiableLocation extends Location {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.muml.uppaal.parsable.ParsablePackage#getIdentifiableLocation_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.parsable.IdentifiableLocation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // IdentifiableLocation
