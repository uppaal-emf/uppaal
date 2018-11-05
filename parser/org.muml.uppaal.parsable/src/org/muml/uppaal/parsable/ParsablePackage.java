/**
 */
package org.muml.uppaal.parsable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.muml.uppaal.templates.TemplatesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.muml.uppaal.parsable.ParsableFactory
 * @model kind="package"
 * @generated
 */
public interface ParsablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "parsable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/uppaal/parsable/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "parsable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParsablePackage eINSTANCE = org.muml.uppaal.parsable.impl.ParsablePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.uppaal.parsable.impl.IdentifiableLocationImpl <em>Identifiable Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.parsable.impl.IdentifiableLocationImpl
	 * @see org.muml.uppaal.parsable.impl.ParsablePackageImpl#getIdentifiableLocation()
	 * @generated
	 */
	int IDENTIFIABLE_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_LOCATION__NAME = TemplatesPackage.LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_LOCATION__COMMENT = TemplatesPackage.LOCATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_LOCATION__POSITION = TemplatesPackage.LOCATION__POSITION;

	/**
	 * The feature id for the '<em><b>Color Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_LOCATION__COLOR_CODE = TemplatesPackage.LOCATION__COLOR_CODE;

	/**
	 * The feature id for the '<em><b>Parent Template</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_LOCATION__PARENT_TEMPLATE = TemplatesPackage.LOCATION__PARENT_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_LOCATION__INVARIANT = TemplatesPackage.LOCATION__INVARIANT;

	/**
	 * The feature id for the '<em><b>Location Time Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_LOCATION__LOCATION_TIME_KIND = TemplatesPackage.LOCATION__LOCATION_TIME_KIND;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_LOCATION__INCOMING_EDGES = TemplatesPackage.LOCATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_LOCATION__OUTGOING_EDGES = TemplatesPackage.LOCATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_LOCATION__ID = TemplatesPackage.LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identifiable Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_LOCATION_FEATURE_COUNT = TemplatesPackage.LOCATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.parsable.IdentifiableLocation <em>Identifiable Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable Location</em>'.
	 * @see org.muml.uppaal.parsable.IdentifiableLocation
	 * @generated
	 */
	EClass getIdentifiableLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.uppaal.parsable.IdentifiableLocation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.muml.uppaal.parsable.IdentifiableLocation#getId()
	 * @see #getIdentifiableLocation()
	 * @generated
	 */
	EAttribute getIdentifiableLocation_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParsableFactory getParsableFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.uppaal.parsable.impl.IdentifiableLocationImpl <em>Identifiable Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.parsable.impl.IdentifiableLocationImpl
		 * @see org.muml.uppaal.parsable.impl.ParsablePackageImpl#getIdentifiableLocation()
		 * @generated
		 */
		EClass IDENTIFIABLE_LOCATION = eINSTANCE.getIdentifiableLocation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_LOCATION__ID = eINSTANCE.getIdentifiableLocation_Id();

	}

} //ParsablePackage
