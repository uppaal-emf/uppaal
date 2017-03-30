/**
 */
package org.muml.uppaal.declarations.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.uppaal.UppaalPackage;
import org.muml.uppaal.core.CorePackage;
import org.muml.uppaal.core.impl.CorePackageImpl;
import org.muml.uppaal.declarations.ArrayInitializer;
import org.muml.uppaal.declarations.CallType;
import org.muml.uppaal.declarations.DataVariablePrefix;
import org.muml.uppaal.declarations.Declaration;
import org.muml.uppaal.declarations.Declarations;
import org.muml.uppaal.declarations.DeclarationsFactory;
import org.muml.uppaal.declarations.DeclarationsPackage;
import org.muml.uppaal.declarations.ExpressionInitializer;
import org.muml.uppaal.declarations.Function;
import org.muml.uppaal.declarations.GlobalDeclarations;
import org.muml.uppaal.declarations.Initializer;
import org.muml.uppaal.declarations.LocalDeclarations;
import org.muml.uppaal.declarations.Parameter;
import org.muml.uppaal.declarations.ParameterContainer;
import org.muml.uppaal.declarations.SystemDeclarations;
import org.muml.uppaal.declarations.TypeDeclaration;
import org.muml.uppaal.declarations.TypedDeclaration;
import org.muml.uppaal.declarations.TypedElementContainer;
import org.muml.uppaal.declarations.Variable;
import org.muml.uppaal.declarations.global.GlobalPackage;
import org.muml.uppaal.declarations.global.impl.GlobalPackageImpl;
import org.muml.uppaal.declarations.system.SystemPackage;
import org.muml.uppaal.declarations.system.impl.SystemPackageImpl;
import org.muml.uppaal.declarations.util.DeclarationsValidator;
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
public class DeclarationsPackageImpl extends EPackageImpl implements DeclarationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalDeclarationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localDeclarationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemDeclarationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataVariablePrefixEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum callTypeEEnum = null;

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
	 * @see org.muml.uppaal.declarations.DeclarationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeclarationsPackageImpl() {
		super(eNS_URI, DeclarationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DeclarationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeclarationsPackage init() {
		if (isInited) return (DeclarationsPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI);

		// Obtain or create and register package
		DeclarationsPackageImpl theDeclarationsPackage = (DeclarationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DeclarationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DeclarationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UppaalPackageImpl theUppaalPackage = (UppaalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UppaalPackage.eNS_URI) instanceof UppaalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UppaalPackage.eNS_URI) : UppaalPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		GlobalPackageImpl theGlobalPackage = (GlobalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GlobalPackage.eNS_URI) instanceof GlobalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GlobalPackage.eNS_URI) : GlobalPackage.eINSTANCE);
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) instanceof SystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) : SystemPackage.eINSTANCE);
		TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) : TemplatesPackage.eINSTANCE);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) instanceof StatementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) : StatementsPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		VisualsPackageImpl theVisualsPackage = (VisualsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisualsPackage.eNS_URI) instanceof VisualsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisualsPackage.eNS_URI) : VisualsPackage.eINSTANCE);

		// Create package meta-data objects
		theDeclarationsPackage.createPackageContents();
		theUppaalPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theGlobalPackage.createPackageContents();
		theSystemPackage.createPackageContents();
		theTemplatesPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theVisualsPackage.createPackageContents();

		// Initialize created meta-data
		theDeclarationsPackage.initializePackageContents();
		theUppaalPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theGlobalPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();
		theTemplatesPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theVisualsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDeclarationsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DeclarationsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDeclarationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeclarationsPackage.eNS_URI, theDeclarationsPackage);
		return theDeclarationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclarations() {
		return declarationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclarations_Declaration() {
		return (EReference)declarationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalDeclarations() {
		return globalDeclarationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalDeclarations_ChannelPriority() {
		return (EReference)globalDeclarationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalDeclarations() {
		return localDeclarationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemDeclarations() {
		return systemDeclarationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemDeclarations_System() {
		return (EReference)systemDeclarationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemDeclarations_ProgressMeasure() {
		return (EReference)systemDeclarationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaration() {
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Block() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Parameter() {
		return (EReference)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDeclaration() {
		return typeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDeclaration_Type() {
		return (EReference)typeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDeclaration_TypeDefinition() {
		return (EReference)typeDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Index() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Initializer() {
		return (EReference)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElementContainer() {
		return typedElementContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElementContainer_TypeDefinition() {
		return (EReference)typedElementContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElementContainer_Elements() {
		return (EReference)typedElementContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_CallType() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitializer() {
		return initializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionInitializer() {
		return expressionInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionInitializer_Expression() {
		return (EReference)expressionInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInitializer() {
		return arrayInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayInitializer_Initializer() {
		return (EReference)arrayInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedDeclaration() {
		return typedDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterContainer() {
		return parameterContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataVariablePrefix() {
		return dataVariablePrefixEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCallType() {
		return callTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationsFactory getDeclarationsFactory() {
		return (DeclarationsFactory)getEFactoryInstance();
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
		declarationsEClass = createEClass(DECLARATIONS);
		createEReference(declarationsEClass, DECLARATIONS__DECLARATION);

		globalDeclarationsEClass = createEClass(GLOBAL_DECLARATIONS);
		createEReference(globalDeclarationsEClass, GLOBAL_DECLARATIONS__CHANNEL_PRIORITY);

		localDeclarationsEClass = createEClass(LOCAL_DECLARATIONS);

		systemDeclarationsEClass = createEClass(SYSTEM_DECLARATIONS);
		createEReference(systemDeclarationsEClass, SYSTEM_DECLARATIONS__SYSTEM);
		createEReference(systemDeclarationsEClass, SYSTEM_DECLARATIONS__PROGRESS_MEASURE);

		declarationEClass = createEClass(DECLARATION);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__BLOCK);
		createEReference(functionEClass, FUNCTION__PARAMETER);

		typeDeclarationEClass = createEClass(TYPE_DECLARATION);
		createEReference(typeDeclarationEClass, TYPE_DECLARATION__TYPE);
		createEReference(typeDeclarationEClass, TYPE_DECLARATION__TYPE_DEFINITION);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__INDEX);
		createEReference(variableEClass, VARIABLE__INITIALIZER);

		typedElementContainerEClass = createEClass(TYPED_ELEMENT_CONTAINER);
		createEReference(typedElementContainerEClass, TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION);
		createEReference(typedElementContainerEClass, TYPED_ELEMENT_CONTAINER__ELEMENTS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__CALL_TYPE);

		initializerEClass = createEClass(INITIALIZER);

		expressionInitializerEClass = createEClass(EXPRESSION_INITIALIZER);
		createEReference(expressionInitializerEClass, EXPRESSION_INITIALIZER__EXPRESSION);

		arrayInitializerEClass = createEClass(ARRAY_INITIALIZER);
		createEReference(arrayInitializerEClass, ARRAY_INITIALIZER__INITIALIZER);

		typedDeclarationEClass = createEClass(TYPED_DECLARATION);

		parameterContainerEClass = createEClass(PARAMETER_CONTAINER);

		// Create enums
		dataVariablePrefixEEnum = createEEnum(DATA_VARIABLE_PREFIX);
		callTypeEEnum = createEEnum(CALL_TYPE);
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
		GlobalPackage theGlobalPackage = (GlobalPackage)EPackage.Registry.INSTANCE.getEPackage(GlobalPackage.eNS_URI);
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		StatementsPackage theStatementsPackage = (StatementsPackage)EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theGlobalPackage);
		getESubpackages().add(theSystemPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		globalDeclarationsEClass.getESuperTypes().add(this.getDeclarations());
		localDeclarationsEClass.getESuperTypes().add(this.getDeclarations());
		systemDeclarationsEClass.getESuperTypes().add(this.getDeclarations());
		functionEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		functionEClass.getESuperTypes().add(theCorePackage.getTypedElement());
		typeDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		variableEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		variableEClass.getESuperTypes().add(theCorePackage.getTypedElement());
		parameterEClass.getESuperTypes().add(this.getVariable());
		expressionInitializerEClass.getESuperTypes().add(this.getInitializer());
		arrayInitializerEClass.getESuperTypes().add(this.getInitializer());
		typedDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		typedDeclarationEClass.getESuperTypes().add(this.getTypedElementContainer());
		parameterContainerEClass.getESuperTypes().add(this.getTypedElementContainer());

		// Initialize classes and features; add operations and parameters
		initEClass(declarationsEClass, Declarations.class, "Declarations", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclarations_Declaration(), this.getDeclaration(), null, "declaration", null, 0, -1, Declarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalDeclarationsEClass, GlobalDeclarations.class, "GlobalDeclarations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalDeclarations_ChannelPriority(), theGlobalPackage.getChannelPriorityDeclaration(), null, "channelPriority", null, 0, 1, GlobalDeclarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localDeclarationsEClass, LocalDeclarations.class, "LocalDeclarations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemDeclarationsEClass, SystemDeclarations.class, "SystemDeclarations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemDeclarations_System(), theSystemPackage.getSystem(), null, "system", null, 1, 1, SystemDeclarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDeclarations_ProgressMeasure(), theSystemPackage.getProgressMeasure(), null, "progressMeasure", null, 0, 1, SystemDeclarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Block(), theStatementsPackage.getBlock(), null, "block", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Parameter(), this.getParameterContainer(), null, "parameter", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDeclarationEClass, TypeDeclaration.class, "TypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDeclaration_Type(), theTypesPackage.getDeclaredType(), theTypesPackage.getDeclaredType_TypeDeclaration(), "type", null, 1, -1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDeclaration_TypeDefinition(), theExpressionsPackage.getExpression(), null, "typeDefinition", null, 1, 1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Index(), theExpressionsPackage.getExpression(), null, "index", null, 0, -1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Initializer(), this.getInitializer(), null, "initializer", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedElementContainerEClass, TypedElementContainer.class, "TypedElementContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElementContainer_TypeDefinition(), theExpressionsPackage.getExpression(), null, "typeDefinition", null, 1, 1, TypedElementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypedElementContainer_Elements(), theCorePackage.getTypedElement(), theCorePackage.getTypedElement_Container(), "elements", null, 1, -1, TypedElementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_CallType(), this.getCallType(), "callType", "CALL_BY_VALUE", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initializerEClass, Initializer.class, "Initializer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionInitializerEClass, ExpressionInitializer.class, "ExpressionInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionInitializer_Expression(), theExpressionsPackage.getExpression(), null, "expression", null, 1, 1, ExpressionInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayInitializerEClass, ArrayInitializer.class, "ArrayInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayInitializer_Initializer(), this.getInitializer(), null, "initializer", null, 1, -1, ArrayInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedDeclarationEClass, TypedDeclaration.class, "TypedDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterContainerEClass, ParameterContainer.class, "ParameterContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dataVariablePrefixEEnum, DataVariablePrefix.class, "DataVariablePrefix");
		addEEnumLiteral(dataVariablePrefixEEnum, DataVariablePrefix.CONST);
		addEEnumLiteral(dataVariablePrefixEEnum, DataVariablePrefix.META);

		initEEnum(callTypeEEnum, CallType.class, "CallType");
		addEEnumLiteral(callTypeEEnum, CallType.CALL_BY_VALUE);
		addEEnumLiteral(callTypeEEnum, CallType.CALL_BY_REFERENCE);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (declarationsEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueTypeNames UniqueTypedElementNames"
		   });	
		addAnnotation
		  (globalDeclarationsEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoTemplateDeclarations"
		   });	
		addAnnotation
		  (localDeclarationsEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoTemplateDeclarations NoChannelDeclarations"
		   });	
		addAnnotation
		  (systemDeclarationsEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueTemplateNames"
		   });	
		addAnnotation
		  (functionEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidReturnType UniqueParameterNames"
		   });	
		addAnnotation
		  (typeDeclarationEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueTypeNames"
		   });	
		addAnnotation
		  (variableEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoInitializerForClockAndChannelVariables"
		   });	
		addAnnotation
		  (typedElementContainerEClass, 
		   source, 
		   new String[] {
			 "constraints", "ElementsMustHaveSameType TypeExpressionMustBeType UniqueElementNames"
		   });	
		addAnnotation
		  (parameterContainerEClass, 
		   source, 
		   new String[] {
			 "constraints", "SingleParameter ParametersOnly"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (declarationsEClass, 
		   source, 
		   new String[] {
			 "name", "Declarations",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (variableEClass, 
		   source, 
		   new String[] {
			 "name", "Variable",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getTypedElementContainer_Elements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "variable"
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
		  (declarationsEClass, 
		   source, 
		   new String[] {
			 "UniqueTypeNames", "self.declaration->select(oclIsKindOf(TypeDeclaration)).oclAsType(TypeDeclaration)->collect(type)->isUnique(name)",
			 "UniqueTypedElementNames", "self.declaration->select(e | e.oclIsKindOf(uppaal::declarations::TypedDeclaration))->collect(oclAsType(uppaal::declarations::TypedDeclaration))->collect(elements)->select(e | e.oclIsKindOf(uppaal::core::NamedElement))->collect(oclAsType(uppaal::core::NamedElement))->isUnique(name)"
		   });	
		addAnnotation
		  (globalDeclarationsEClass, 
		   source, 
		   new String[] {
			 "NoTemplateDeclarations", "not self.declaration->exists(oclIsKindOf(system::TemplateDeclaration))"
		   });	
		addAnnotation
		  (localDeclarationsEClass, 
		   source, 
		   new String[] {
			 "NoTemplateDeclarations", "not self.declaration->exists(oclIsKindOf(system::TemplateDeclaration))",
			 "NoChannelDeclarations", "not self.declaration->exists(\r\n\toclIsKindOf(uppaal::declarations::TypedDeclaration)\r\n\tand\r\n\tlet typeDefinition : uppaal::expressions::Expression = oclAsType(uppaal::declarations::TypedDeclaration).typeDefinition in\r\n\t(\r\n\t\t\r\n\t\ttypeDefinition.oclIsKindOf(uppaal::expressions::ChannelPrefixExpression)\r\n\t\tor\r\n\t\t(\r\n\t\t\ttypeDefinition.oclIsKindOf(uppaal::expressions::IdentifierExpression)\r\n\t\t\tand\r\n\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclIsKindOf(uppaal::types::Type)\r\n\t\t\tand\r\n\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType=uppaal::types::BuiltInType::CHAN\r\n\t\t)\r\n\t)\r\n)"
		   });	
		addAnnotation
		  (systemDeclarationsEClass, 
		   source, 
		   new String[] {
			 "UniqueTemplateNames", "self.declaration->select(oclIsKindOf(system::TemplateDeclaration)).oclAsType(system::TemplateDeclaration)->collect(declaredTemplate)->isUnique(name)"
		   });	
		addAnnotation
		  (functionEClass, 
		   source, 
		   new String[] {
			 "ValidReturnType", "(not typeDefinition.oclIsUndefined())\r\nimplies\r\n(\r\n\t(\r\n\t\ttypeDefinition.oclIsKindOf(uppaal::expressions::IdentifierExpression) and\r\n\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclIsKindOf(uppaal::types::Type) and\r\n\t\t(\r\n\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType = uppaal::types::BuiltInType::VOID or\r\n\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType = uppaal::types::BuiltInType::INT or\r\n\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType = uppaal::types::BuiltInType::BOOL\r\n\t\t)\r\n\t)\r\n\tor\r\n\t\ttypeDefinition.oclIsKindOf(uppaal::types::RangeTypeSpecification)\r\n)",
			 "UniqueParameterNames", "self.parameter->collect(elements)->select(e | e.oclIsKindOf(uppaal::core::NamedElement))->collect(oclAsType(uppaal::core::NamedElement))->isUnique(name)"
		   });	
		addAnnotation
		  (typeDeclarationEClass, 
		   source, 
		   new String[] {
			 "UniqueTypeNames", "self.type->isUnique(name)"
		   });	
		addAnnotation
		  (variableEClass, 
		   source, 
		   new String[] {
			 "NoInitializerForClockAndChannelVariables", "if (not self.typeDefinition.oclIsUndefined()) then\r\n\t-- No channels allowed.\r\n\tif (self.typeDefinition.oclIsKindOf(uppaal::expressions::ChannelPrefixExpression)) then\r\n\t\tself.initializer.oclIsUndefined()\r\n\telse if (self.typeDefinition.oclIsKindOf(uppaal::expressions::IdentifierExpression)) then\r\n\t\tif (self.typeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclIsKindOf(uppaal::types::Type)) then\r\n\t\t\t(\r\n\t\t\t\t(\r\n\t\t\t\t\tself.typeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType=uppaal::types::BuiltInType::CHAN or\r\n\t\t\t\t\tself.typeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType=uppaal::types::BuiltInType::CLOCK\r\n\t\t\t\t)\r\n\t\t\t\timplies\r\n\t\t\t\t\tself.initializer.oclIsUndefined()\r\n\t\t\t)\r\n\t\telse true endif\r\n\telse true endif endif\r\nelse\r\n\ttrue\r\nendif"
		   });	
		addAnnotation
		  (typedElementContainerEClass, 
		   source, 
		   new String[] {
			 "UniqueElementNames", "self.elements->select(oclIsKindOf(core::NamedElement))->collect(oclAsType(core::NamedElement))->isUnique(name)",
			 "ElementsMustHaveSameType", "self.elements->forAll(oclIsKindOf(declarations::Parameter))\r\nor\r\nself.elements->forAll(oclIsKindOf(declarations::Variable))\r\nor\r\nself.elements->forAll(oclIsKindOf(declarations::Function))",
			 "TypeExpressionMustBeType", "typeDefinition.oclIsKindOf(types::TypeExpression)\r\nor\r\n(\r\n\ttypeDefinition.oclIsKindOf(expressions::IdentifierExpression) and\r\n\ttypeDefinition.oclAsType(expressions::IdentifierExpression).identifier.oclIsKindOf(types::Type)\r\n)\r\nor\r\ntypeDefinition.oclIsKindOf(expressions::ChannelPrefixExpression)\r\nor\r\ntypeDefinition.oclIsKindOf(expressions::DataPrefixExpression)"
		   });	
		addAnnotation
		  (parameterContainerEClass, 
		   source, 
		   new String[] {
			 "SingleParameter", "self.elements->size() <= 1",
			 "ParametersOnly", "self.elements->forAll(oclIsKindOf(declarations::Parameter))"
		   });
	}

} //DeclarationsPackageImpl
