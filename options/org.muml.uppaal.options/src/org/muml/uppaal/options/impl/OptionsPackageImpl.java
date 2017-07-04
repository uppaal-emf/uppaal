/**
 */
package org.muml.uppaal.options.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.uppaal.options.CoordinationProtocolOptions;
import org.muml.uppaal.options.HideOptionExtension;
import org.muml.uppaal.options.Options;
import org.muml.uppaal.options.OptionsFactory;
import org.muml.uppaal.options.OptionsPackage;
import org.muml.uppaal.options.StateSpaceReduction;
import org.muml.uppaal.options.TraceOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptionsPackageImpl extends EPackageImpl implements OptionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationProtocolOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hideOptionExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateSpaceReductionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum traceOptionsEEnum = null;

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
	 * @see org.muml.uppaal.options.OptionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OptionsPackageImpl() {
		super(eNS_URI, OptionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OptionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OptionsPackage init() {
		if (isInited) return (OptionsPackage)EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI);

		// Obtain or create and register package
		OptionsPackageImpl theOptionsPackage = (OptionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OptionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OptionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOptionsPackage.createPackageContents();

		// Initialize created meta-data
		theOptionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOptionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OptionsPackage.eNS_URI, theOptionsPackage);
		return theOptionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptions() {
		return optionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptions_ConnectorOutBufferSize() {
		return (EAttribute)optionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptions_HashTableSize() {
		return (EAttribute)optionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptions_StateSpaceReduction() {
		return (EAttribute)optionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptions_TraceOptions() {
		return (EAttribute)optionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinationProtocolOptions() {
		return coordinationProtocolOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinationProtocolOptions_RoleMultiplicity() {
		return (EAttribute)coordinationProtocolOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHideOptionExtension() {
		return hideOptionExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHideOptionExtension_Option() {
		return (EAttribute)hideOptionExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStateSpaceReduction() {
		return stateSpaceReductionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTraceOptions() {
		return traceOptionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionsFactory getOptionsFactory() {
		return (OptionsFactory)getEFactoryInstance();
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
		optionsEClass = createEClass(OPTIONS);
		createEAttribute(optionsEClass, OPTIONS__CONNECTOR_OUT_BUFFER_SIZE);
		createEAttribute(optionsEClass, OPTIONS__HASH_TABLE_SIZE);
		createEAttribute(optionsEClass, OPTIONS__STATE_SPACE_REDUCTION);
		createEAttribute(optionsEClass, OPTIONS__TRACE_OPTIONS);

		coordinationProtocolOptionsEClass = createEClass(COORDINATION_PROTOCOL_OPTIONS);
		createEAttribute(coordinationProtocolOptionsEClass, COORDINATION_PROTOCOL_OPTIONS__ROLE_MULTIPLICITY);

		hideOptionExtensionEClass = createEClass(HIDE_OPTION_EXTENSION);
		createEAttribute(hideOptionExtensionEClass, HIDE_OPTION_EXTENSION__OPTION);

		// Create enums
		stateSpaceReductionEEnum = createEEnum(STATE_SPACE_REDUCTION);
		traceOptionsEEnum = createEEnum(TRACE_OPTIONS);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		optionsEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		coordinationProtocolOptionsEClass.getESuperTypes().add(this.getOptions());
		hideOptionExtensionEClass.getESuperTypes().add(theCorePackage.getExtension());

		// Initialize classes, features, and operations; add parameters
		initEClass(optionsEClass, Options.class, "Options", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptions_ConnectorOutBufferSize(), ecorePackage.getEInt(), "connectorOutBufferSize", "5", 0, 1, Options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptions_HashTableSize(), ecorePackage.getEInt(), "hashTableSize", "27", 1, 1, Options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptions_StateSpaceReduction(), this.getStateSpaceReduction(), "stateSpaceReduction", "conservative", 0, 1, Options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptions_TraceOptions(), this.getTraceOptions(), "traceOptions", "some", 0, 1, Options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinationProtocolOptionsEClass, CoordinationProtocolOptions.class, "CoordinationProtocolOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoordinationProtocolOptions_RoleMultiplicity(), ecorePackage.getEInt(), "roleMultiplicity", "1", 0, 1, CoordinationProtocolOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hideOptionExtensionEClass, HideOptionExtension.class, "HideOptionExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHideOptionExtension_Option(), ecorePackage.getEString(), "option", "", 0, 1, HideOptionExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(stateSpaceReductionEEnum, StateSpaceReduction.class, "StateSpaceReduction");
		addEEnumLiteral(stateSpaceReductionEEnum, StateSpaceReduction.NONE);
		addEEnumLiteral(stateSpaceReductionEEnum, StateSpaceReduction.CONSERVATIVE);
		addEEnumLiteral(stateSpaceReductionEEnum, StateSpaceReduction.AGGRESSIVE);

		initEEnum(traceOptionsEEnum, TraceOptions.class, "TraceOptions");
		addEEnumLiteral(traceOptionsEEnum, TraceOptions.SOME);
		addEEnumLiteral(traceOptionsEEnum, TraceOptions.SHORTEST);
		addEEnumLiteral(traceOptionsEEnum, TraceOptions.FASTEST);
		addEEnumLiteral(traceOptionsEEnum, TraceOptions.NONE);

		// Create resource
		createResource(eNS_URI);
	}

} //OptionsPackageImpl
