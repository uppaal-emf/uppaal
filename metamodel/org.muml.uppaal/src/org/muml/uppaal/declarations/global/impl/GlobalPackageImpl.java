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
import org.muml.uppaal.declarations.global.ChannelItem;
import org.muml.uppaal.declarations.global.ChannelPriorityDeclaration;
import org.muml.uppaal.declarations.global.ChannelPriorityGroup;
import org.muml.uppaal.declarations.global.DefaultItem;
import org.muml.uppaal.declarations.global.GlobalFactory;
import org.muml.uppaal.declarations.global.GlobalPackage;
import org.muml.uppaal.declarations.global.PriorityItem;
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
	private EClass channelPriorityDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelPriorityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorityItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultItemEClass = null;

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
		GlobalPackageImpl theGlobalPackage = (GlobalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GlobalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GlobalPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UppaalPackageImpl theUppaalPackage = (UppaalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UppaalPackage.eNS_URI) instanceof UppaalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UppaalPackage.eNS_URI) : UppaalPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		DeclarationsPackageImpl theDeclarationsPackage = (DeclarationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) instanceof DeclarationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) : DeclarationsPackage.eINSTANCE);
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) instanceof SystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) : SystemPackage.eINSTANCE);
		TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) : TemplatesPackage.eINSTANCE);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) instanceof StatementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) : StatementsPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		VisualsPackageImpl theVisualsPackage = (VisualsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisualsPackage.eNS_URI) instanceof VisualsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisualsPackage.eNS_URI) : VisualsPackage.eINSTANCE);

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
	public EClass getChannelPriorityDeclaration() {
		return channelPriorityDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelPriorityDeclaration_Groups() {
		return (EReference)channelPriorityDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelPriorityGroup() {
		return channelPriorityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelPriorityGroup_Items() {
		return (EReference)channelPriorityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriorityItem() {
		return priorityItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelItem() {
		return channelItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelItem_ChannelExpression() {
		return (EReference)channelItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultItem() {
		return defaultItemEClass;
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
		channelPriorityDeclarationEClass = createEClass(CHANNEL_PRIORITY_DECLARATION);
		createEReference(channelPriorityDeclarationEClass, CHANNEL_PRIORITY_DECLARATION__GROUPS);

		channelPriorityGroupEClass = createEClass(CHANNEL_PRIORITY_GROUP);
		createEReference(channelPriorityGroupEClass, CHANNEL_PRIORITY_GROUP__ITEMS);

		priorityItemEClass = createEClass(PRIORITY_ITEM);

		channelItemEClass = createEClass(CHANNEL_ITEM);
		createEReference(channelItemEClass, CHANNEL_ITEM__CHANNEL_EXPRESSION);

		defaultItemEClass = createEClass(DEFAULT_ITEM);
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
		DeclarationsPackage theDeclarationsPackage = (DeclarationsPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		channelPriorityDeclarationEClass.getESuperTypes().add(theDeclarationsPackage.getDeclaration());
		channelItemEClass.getESuperTypes().add(this.getPriorityItem());
		defaultItemEClass.getESuperTypes().add(this.getPriorityItem());

		// Initialize classes and features; add operations and parameters
		initEClass(channelPriorityDeclarationEClass, ChannelPriorityDeclaration.class, "ChannelPriorityDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannelPriorityDeclaration_Groups(), this.getChannelPriorityGroup(), null, "groups", null, 1, -1, ChannelPriorityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelPriorityGroupEClass, ChannelPriorityGroup.class, "ChannelPriorityGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannelPriorityGroup_Items(), this.getPriorityItem(), null, "items", null, 1, -1, ChannelPriorityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(priorityItemEClass, PriorityItem.class, "PriorityItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(channelItemEClass, ChannelItem.class, "ChannelItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannelItem_ChannelExpression(), theExpressionsPackage.getIdentifierExpression(), null, "channelExpression", null, 1, 1, ChannelItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultItemEClass, DefaultItem.class, "DefaultItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (channelPriorityDeclarationEClass, 
		   source, 
		   new String[] {
			 "constraints", "AtMostOneDefaultItem EachChannelContainedAtMostOnce"
		   });	
		addAnnotation
		  (channelItemEClass, 
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
		  (channelPriorityDeclarationEClass, 
		   source, 
		   new String[] {
			 "AtMostOneDefaultItem", "self.groups.items->select(oclIsKindOf(uppaal::declarations::global::DefaultItem))->size() <= 1",
			 "EachChannelContainedAtMostOnce", "self.groups.items\r\n->select(oclIsKindOf(uppaal::declarations::global::ChannelItem))\r\n->collect(oclAsType(uppaal::declarations::global::ChannelItem))\r\n->isUnique(channelExpression.identifier)"
		   });	
		addAnnotation
		  (channelItemEClass, 
		   source, 
		   new String[] {
			 "ChannelVariablesOnly", "\t(not self.channelExpression.oclIsUndefined())\r\nimplies\r\n\tself.channelExpression.identifier.oclIsKindOf(uppaal::declarations::Variable)\r\n\tand\r\n\t(\r\n\tlet typeDefinition : uppaal::expressions::Expression = self.channelExpression.identifier.oclAsType(uppaal::declarations::Variable).typeDefinition in\r\n\t\tif (\r\n\t\t\ttypeDefinition.oclIsKindOf(uppaal::expressions::IdentifierExpression) and\r\n\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclIsKindOf(uppaal::types::Type)\r\n\t\t) then\r\n\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType=uppaal::types::BuiltInType::CHAN\r\n\t\telse\r\n\t\t\ttypeDefinition.oclIsKindOf(uppaal::expressions::ChannelPrefixExpression)\r\n\t\tendif\r\n\t)"
		   });
	}

} //GlobalPackageImpl
