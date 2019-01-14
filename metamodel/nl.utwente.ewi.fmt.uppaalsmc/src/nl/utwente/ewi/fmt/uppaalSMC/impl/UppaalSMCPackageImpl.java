/**
 */
package nl.utwente.ewi.fmt.uppaalSMC.impl;

import nl.utwente.ewi.fmt.uppaalSMC.ChanceEdge;
import nl.utwente.ewi.fmt.uppaalSMC.ChanceNode;
import nl.utwente.ewi.fmt.uppaalSMC.DoubleType;
import nl.utwente.ewi.fmt.uppaalSMC.ExponentialLocation;
import nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCFactory;
import nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.muml.uppaal.UppaalPackage;

import org.muml.uppaal.expressions.ExpressionsPackage;

import org.muml.uppaal.templates.TemplatesPackage;

import org.muml.uppaal.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UppaalSMCPackageImpl extends EPackageImpl implements UppaalSMCPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nstaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chanceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chanceEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exponentialLocationEClass = null;

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
	 * @see nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UppaalSMCPackageImpl() {
		super(eNS_URI, UppaalSMCFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UppaalSMCPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UppaalSMCPackage init() {
		if (isInited) return (UppaalSMCPackage)EPackage.Registry.INSTANCE.getEPackage(UppaalSMCPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUppaalSMCPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UppaalSMCPackageImpl theUppaalSMCPackage = registeredUppaalSMCPackage instanceof UppaalSMCPackageImpl ? (UppaalSMCPackageImpl)registeredUppaalSMCPackage : new UppaalSMCPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		UppaalPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUppaalSMCPackage.createPackageContents();

		// Initialize created meta-data
		theUppaalSMCPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUppaalSMCPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UppaalSMCPackage.eNS_URI, theUppaalSMCPackage);
		return theUppaalSMCPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNSTA() {
		return nstaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNSTA_Double() {
		return (EReference)nstaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleType() {
		return doubleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChanceNode() {
		return chanceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChanceEdge() {
		return chanceEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChanceEdge_Weight() {
		return (EAttribute)chanceEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExponentialLocation() {
		return exponentialLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExponentialLocation_ExitRate() {
		return (EReference)exponentialLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UppaalSMCFactory getUppaalSMCFactory() {
		return (UppaalSMCFactory)getEFactoryInstance();
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
		nstaEClass = createEClass(NSTA);
		createEReference(nstaEClass, NSTA__DOUBLE);

		doubleTypeEClass = createEClass(DOUBLE_TYPE);

		chanceNodeEClass = createEClass(CHANCE_NODE);

		chanceEdgeEClass = createEClass(CHANCE_EDGE);
		createEAttribute(chanceEdgeEClass, CHANCE_EDGE__WEIGHT);

		exponentialLocationEClass = createEClass(EXPONENTIAL_LOCATION);
		createEReference(exponentialLocationEClass, EXPONENTIAL_LOCATION__EXIT_RATE);
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
		UppaalPackage theUppaalPackage = (UppaalPackage)EPackage.Registry.INSTANCE.getEPackage(UppaalPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		TemplatesPackage theTemplatesPackage = (TemplatesPackage)EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nstaEClass.getESuperTypes().add(theUppaalPackage.getNTA());
		doubleTypeEClass.getESuperTypes().add(theTypesPackage.getType());
		chanceNodeEClass.getESuperTypes().add(theTemplatesPackage.getLocation());
		chanceEdgeEClass.getESuperTypes().add(theTemplatesPackage.getEdge());
		exponentialLocationEClass.getESuperTypes().add(theTemplatesPackage.getLocation());

		// Initialize classes and features; add operations and parameters
		initEClass(nstaEClass, nl.utwente.ewi.fmt.uppaalSMC.NSTA.class, "NSTA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNSTA_Double(), this.getDoubleType(), null, "double", null, 1, 1, nl.utwente.ewi.fmt.uppaalSMC.NSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleTypeEClass, DoubleType.class, "DoubleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chanceNodeEClass, ChanceNode.class, "ChanceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chanceEdgeEClass, ChanceEdge.class, "ChanceEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChanceEdge_Weight(), ecorePackage.getEInt(), "weight", null, 1, 1, ChanceEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exponentialLocationEClass, ExponentialLocation.class, "ExponentialLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExponentialLocation_ExitRate(), theExpressionsPackage.getExpression(), null, "exitRate", null, 1, 1, ExponentialLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UppaalSMCPackageImpl
