/**
 */
package org.muml.uppaal.requirements;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.requirements.PropertyRepository#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.requirements.RequirementsPackage#getPropertyRepository()
 * @model
 * @generated
 */
public interface PropertyRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.uppaal.requirements.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.muml.uppaal.requirements.RequirementsPackage#getPropertyRepository_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // PropertyRepository
