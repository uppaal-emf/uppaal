/**
 */
package org.muml.uppaal.declarations.global.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.uppaal.UppaalPackage;
import org.muml.uppaal.core.CorePackage;
import org.muml.uppaal.core.impl.CorePackageImpl;
import org.muml.uppaal.declarations.DeclarationsPackage;
import org.muml.uppaal.declarations.global.ChannelList;
import org.muml.uppaal.declarations.global.ChannelPriority;
import org.muml.uppaal.declarations.global.ChannelPriorityItem;
import org.muml.uppaal.declarations.global.DefaultChannelPriority;
import org.muml.uppaal.declarations.global.GlobalFactory;
import org.muml.uppaal.declarations.global.GlobalPackage;
import org.muml.uppaal.declarations.global.util.GlobalValidator;
import org.muml.uppaal.declarations.impl.DeclarationsPackageImpl;
import org.muml.uppaal.declarations.system.SystemPackage;
import org.muml.uppaal.declarations.system.impl.SystemPackageImpl;
import org.muml.uppaal.expressions.ExpressionsPackage;
import org.muml.uppaal.expressions.impl.ExpressionsPackageImpl;
import org.muml.uppaal.impl.UppaalPackageImpl;
import org.muml.uppaal.statements.StatementsPackage;
import org.muml.uppaal.statements.impl.StatementsPackageImpl;
import org.muml.uppaal.templates.TemplatesPackage;
import org.muml.uppaal.templates.impl.TemplatesPackageImpl;
import org.muml.uppaal.types.TypesPackage;
import org.muml.uppaal.types.impl.TypesPackageImpl;
import org.muml.uppaal.visuals.VisualsPackage;
import org.muml.uppaal.visuals.impl.VisualsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalPackageImpl extends EPackageImpl implements GlobalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelPriorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelPriorityItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultChannelPriorityEClass = null;

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
	 * @see org.muml.uppaal.declarations.global.GlobalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GlobalPackageImpl() {
		super(eNS_URI, GlobalFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GlobalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GlobalPackage init() {
		if (isInited) return (GlobalPackage)EPackage.Registry.INSTANCE.getEPackage(GlobalPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGlobalPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GlobalPackageImpl theGlobalPackage = registeredGlobalPackage instanceof GlobalPackageImpl ? (GlobalPackageImpl)registeredGlobalPackage : new GlobalPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UppaalPackage.eNS_URI);
		UppaalPackageImpl theUppaalPackage = (UppaalPackageImpl)(registeredPackage instanceof UppaalPackageImpl ? registeredPackage : UppaalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(registeredPackage instanceof TypesPackageImpl ? registeredPackage : TypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI);
		DeclarationsPackageImpl theDeclarationsPackage = (DeclarationsPackageImpl)(registeredPackage instanceof DeclarationsPackageImpl ? registeredPackage : DeclarationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(registeredPackage instanceof SystemPackageImpl ? registeredPackage : SystemPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI);
		TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl)(registeredPackage instanceof TemplatesPackageImpl ? registeredPackage : TemplatesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl)(registeredPackage instanceof StatementsPackageImpl ? registeredPackage : StatementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(registeredPackage instanceof ExpressionsPackageImpl ? registeredPackage : ExpressionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VisualsPackage.eNS_URI);
		VisualsPackageImpl theVisualsPackage = (VisualsPackageImpl)(registeredPackage instanceof VisualsPackageImpl ? registeredPackage : VisualsPackage.eINSTANCE);

		// Create package meta-data objects
		theGlobalPackage.createPackageContents();
		theUppaalPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theDeclarationsPackage.createPackageContents();
		theSystemPackage.createPackageContents();
		theTemplatesPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theVisualsPackage.createPackageContents();

		// Initialize created meta-data
		theGlobalPackage.initializePackageContents();
		theUppaalPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theDeclarationsPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();
		theTemplatesPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theVisualsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGlobalPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return GlobalValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGlobalPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GlobalPackage.eNS_URI, theGlobalPackage);
		return theGlobalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelPriority() {
		return channelPriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelPriority_Item() {
		return (EReference)channelPriorityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelPriorityItem() {
		return channelPriorityItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelList() {
		return channelListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelList_ChannelExpression() {
		return (EReference)channelListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultChannelPriority() {
		return defaultChannelPriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalFactory getGlobalFactory() {
		return (GlobalFactory)getEFactoryInstance();
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
		channelPriorityEClass = createEClass(CHANNEL_PRIORITY);
		createEReference(channelPriorityEClass, CHANNEL_PRIORITY__ITEM);

		channelPriorityItemEClass = createEClass(CHANNEL_PRIORITY_ITEM);

		channelListEClass = createEClass(CHANNEL_LIST);
		createEReference(channelListEClass, CHANNEL_LIST__CHANNEL_EXPRESSION);

		defaultChannelPriorityEClass = createEClass(DEFAULT_CHANNEL_PRIORITY);
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
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		channelListEClass.getESuperTypes().add(this.getChannelPriorityItem());
		defaultChannelPriorityEClass.getESuperTypes().add(this.getChannelPriorityItem());

		// Initialize classes and features; add operations and parameters
		initEClass(channelPriorityEClass, ChannelPriority.class, "ChannelPriority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannelPriority_Item(), this.getChannelPriorityItem(), null, "item", null, 1, -1, ChannelPriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelPriorityItemEClass, ChannelPriorityItem.class, "ChannelPriorityItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(channelListEClass, ChannelList.class, "ChannelList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannelList_ChannelExpression(), theExpressionsPackage.getIdentifierExpression(), null, "channelExpression", null, 1, -1, ChannelList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultChannelPriorityEClass, DefaultChannelPriority.class, "DefaultChannelPriority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
		addAnnotation
		  (channelPriorityEClass,
		   source,
		   new String[] {
			   "constraints", "AtMostOneDefaultItem EachChannelContainedAtMostOnce"
		   });
		addAnnotation
		  (channelListEClass,
		   source,
		   new String[] {
			   "constraints", "ChannelVariablesOnly"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation
		  (channelListEClass,
		   source,
		   new String[] {
			   "ChannelVariablesOnly", "self.channelExpression->forAll(\r\n\t(not identifier.typeDefinition.oclIsUndefined()) implies identifier.typeDefinition.baseType = types::BuiltInType::CHAN\r\n)"
		   });
	}

} //GlobalPackageImpl
