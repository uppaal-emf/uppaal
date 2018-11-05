/**
 */
package org.muml.uppaal.parsable.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.uppaal.UppaalPackage;
import org.muml.uppaal.parsable.IdentifiableLocation;
import org.muml.uppaal.parsable.ParsableFactory;
import org.muml.uppaal.parsable.ParsablePackage;
import org.muml.uppaal.templates.TemplatesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParsablePackageImpl extends EPackageImpl implements ParsablePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableLocationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.muml.uppaal.parsable.ParsablePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ParsablePackageImpl() {
		super(eNS_URI, ParsableFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ParsablePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ParsablePackage init() {
		if (isInited) return (ParsablePackage)EPackage.Registry.INSTANCE.getEPackage(ParsablePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredParsablePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ParsablePackageImpl theParsablePackage = registeredParsablePackage instanceof ParsablePackageImpl ? (ParsablePackageImpl)registeredParsablePackage : new ParsablePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		UppaalPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theParsablePackage.createPackageContents();

		// Initialize created meta-data
		theParsablePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theParsablePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ParsablePackage.eNS_URI, theParsablePackage);
		return theParsablePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiableLocation() {
		return identifiableLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiableLocation_Id() {
		return (EAttribute)identifiableLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParsableFactory getParsableFactory() {
		return (ParsableFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		identifiableLocationEClass = createEClass(IDENTIFIABLE_LOCATION);
		createEAttribute(identifiableLocationEClass, IDENTIFIABLE_LOCATION__ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TemplatesPackage theTemplatesPackage = (TemplatesPackage)EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		identifiableLocationEClass.getESuperTypes().add(theTemplatesPackage.getLocation());

		// Initialize classes and features; add operations and parameters
		initEClass(identifiableLocationEClass, IdentifiableLocation.class, "IdentifiableLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiableLocation_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdentifiableLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ParsablePackageImpl
