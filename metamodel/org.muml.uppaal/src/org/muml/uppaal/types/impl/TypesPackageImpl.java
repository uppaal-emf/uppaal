/**
 */
package org.muml.uppaal.types.impl;

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
import org.muml.uppaal.declarations.DeclarationsPackage;
import org.muml.uppaal.declarations.global.GlobalPackage;
import org.muml.uppaal.declarations.global.impl.GlobalPackageImpl;
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
import org.muml.uppaal.types.BuiltInType;
import org.muml.uppaal.types.DeclaredType;
import org.muml.uppaal.types.IntegerBounds;
import org.muml.uppaal.types.Library;
import org.muml.uppaal.types.PredefinedType;
import org.muml.uppaal.types.RangeTypeSpecification;
import org.muml.uppaal.types.ScalarTypeSpecification;
import org.muml.uppaal.types.StructTypeSpecification;
import org.muml.uppaal.types.Type;
import org.muml.uppaal.types.TypeExpression;
import org.muml.uppaal.types.TypesFactory;
import org.muml.uppaal.types.TypesPackage;
import org.muml.uppaal.types.util.TypesValidator;
import org.muml.uppaal.visuals.VisualsPackage;
import org.muml.uppaal.visuals.impl.VisualsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesPackageImpl extends EPackageImpl implements TypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predefinedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaredTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalarTypeSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structTypeSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeTypeSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerBoundsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum builtInTypeEEnum = null;

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
	 * @see org.muml.uppaal.types.TypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypesPackageImpl() {
		super(eNS_URI, TypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypesPackage init() {
		if (isInited) return (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTypesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TypesPackageImpl theTypesPackage = registeredTypesPackage instanceof TypesPackageImpl ? (TypesPackageImpl)registeredTypesPackage : new TypesPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UppaalPackage.eNS_URI);
		UppaalPackageImpl theUppaalPackage = (UppaalPackageImpl)(registeredPackage instanceof UppaalPackageImpl ? registeredPackage : UppaalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI);
		DeclarationsPackageImpl theDeclarationsPackage = (DeclarationsPackageImpl)(registeredPackage instanceof DeclarationsPackageImpl ? registeredPackage : DeclarationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GlobalPackage.eNS_URI);
		GlobalPackageImpl theGlobalPackage = (GlobalPackageImpl)(registeredPackage instanceof GlobalPackageImpl ? registeredPackage : GlobalPackage.eINSTANCE);
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
		theTypesPackage.createPackageContents();
		theUppaalPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theDeclarationsPackage.createPackageContents();
		theGlobalPackage.createPackageContents();
		theSystemPackage.createPackageContents();
		theTemplatesPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theVisualsPackage.createPackageContents();

		// Initialize created meta-data
		theTypesPackage.initializePackageContents();
		theUppaalPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theDeclarationsPackage.initializePackageContents();
		theGlobalPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();
		theTemplatesPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theVisualsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTypesPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TypesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTypesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypesPackage.eNS_URI, theTypesPackage);
		return theTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_BaseType() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredefinedType() {
		return predefinedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredefinedType_Type() {
		return (EAttribute)predefinedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaredType() {
		return declaredTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaredType_TypeDeclaration() {
		return (EReference)declaredTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaredType_TypeDefinition() {
		return (EReference)declaredTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeExpression() {
		return typeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalarTypeSpecification() {
		return scalarTypeSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalarTypeSpecification_SizeExpression() {
		return (EReference)scalarTypeSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructTypeSpecification() {
		return structTypeSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructTypeSpecification_Declaration() {
		return (EReference)structTypeSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeTypeSpecification() {
		return rangeTypeSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeTypeSpecification_Bounds() {
		return (EReference)rangeTypeSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerBounds() {
		return integerBoundsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerBounds_LowerBound() {
		return (EReference)integerBoundsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerBounds_UpperBound() {
		return (EReference)integerBoundsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Types() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBuiltInType() {
		return builtInTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactory getTypesFactory() {
		return (TypesFactory)getEFactoryInstance();
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
		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__BASE_TYPE);

		predefinedTypeEClass = createEClass(PREDEFINED_TYPE);
		createEAttribute(predefinedTypeEClass, PREDEFINED_TYPE__TYPE);

		declaredTypeEClass = createEClass(DECLARED_TYPE);
		createEReference(declaredTypeEClass, DECLARED_TYPE__TYPE_DECLARATION);
		createEReference(declaredTypeEClass, DECLARED_TYPE__TYPE_DEFINITION);

		typeExpressionEClass = createEClass(TYPE_EXPRESSION);

		scalarTypeSpecificationEClass = createEClass(SCALAR_TYPE_SPECIFICATION);
		createEReference(scalarTypeSpecificationEClass, SCALAR_TYPE_SPECIFICATION__SIZE_EXPRESSION);

		structTypeSpecificationEClass = createEClass(STRUCT_TYPE_SPECIFICATION);
		createEReference(structTypeSpecificationEClass, STRUCT_TYPE_SPECIFICATION__DECLARATION);

		rangeTypeSpecificationEClass = createEClass(RANGE_TYPE_SPECIFICATION);
		createEReference(rangeTypeSpecificationEClass, RANGE_TYPE_SPECIFICATION__BOUNDS);

		integerBoundsEClass = createEClass(INTEGER_BOUNDS);
		createEReference(integerBoundsEClass, INTEGER_BOUNDS__LOWER_BOUND);
		createEReference(integerBoundsEClass, INTEGER_BOUNDS__UPPER_BOUND);

		libraryEClass = createEClass(LIBRARY);
		createEReference(libraryEClass, LIBRARY__TYPES);

		// Create enums
		builtInTypeEEnum = createEEnum(BUILT_IN_TYPE);
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
		DeclarationsPackage theDeclarationsPackage = (DeclarationsPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typeEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		predefinedTypeEClass.getESuperTypes().add(this.getType());
		declaredTypeEClass.getESuperTypes().add(this.getType());
		typeExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		scalarTypeSpecificationEClass.getESuperTypes().add(this.getTypeExpression());
		structTypeSpecificationEClass.getESuperTypes().add(this.getTypeExpression());
		rangeTypeSpecificationEClass.getESuperTypes().add(this.getTypeExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_BaseType(), this.getBuiltInType(), "baseType", null, 0, 1, Type.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(predefinedTypeEClass, PredefinedType.class, "PredefinedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredefinedType_Type(), this.getBuiltInType(), "type", null, 1, 1, PredefinedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declaredTypeEClass, DeclaredType.class, "DeclaredType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclaredType_TypeDeclaration(), theDeclarationsPackage.getTypeDeclaration(), theDeclarationsPackage.getTypeDeclaration_Type(), "typeDeclaration", null, 1, 1, DeclaredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaredType_TypeDefinition(), theExpressionsPackage.getExpression(), null, "typeDefinition", null, 1, 1, DeclaredType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(typeExpressionEClass, TypeExpression.class, "TypeExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scalarTypeSpecificationEClass, ScalarTypeSpecification.class, "ScalarTypeSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScalarTypeSpecification_SizeExpression(), theExpressionsPackage.getExpression(), null, "sizeExpression", null, 1, 1, ScalarTypeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structTypeSpecificationEClass, StructTypeSpecification.class, "StructTypeSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructTypeSpecification_Declaration(), theDeclarationsPackage.getTypedDeclaration(), null, "declaration", null, 1, -1, StructTypeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeTypeSpecificationEClass, RangeTypeSpecification.class, "RangeTypeSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRangeTypeSpecification_Bounds(), this.getIntegerBounds(), null, "bounds", null, 1, 1, RangeTypeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerBoundsEClass, IntegerBounds.class, "IntegerBounds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerBounds_LowerBound(), theExpressionsPackage.getExpression(), null, "lowerBound", null, 1, 1, IntegerBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerBounds_UpperBound(), theExpressionsPackage.getExpression(), null, "upperBound", null, 1, 1, IntegerBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibrary_Types(), this.getPredefinedType(), null, "types", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(builtInTypeEEnum, BuiltInType.class, "BuiltInType");
		addEEnumLiteral(builtInTypeEEnum, BuiltInType.INT);
		addEEnumLiteral(builtInTypeEEnum, BuiltInType.CLOCK);
		addEEnumLiteral(builtInTypeEEnum, BuiltInType.CHAN);
		addEEnumLiteral(builtInTypeEEnum, BuiltInType.BOOL);
		addEEnumLiteral(builtInTypeEEnum, BuiltInType.VOID);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (structTypeSpecificationEClass,
		   source,
		   new String[] {
			   "constraints", "UniqueFieldNames"
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
		  (getType_BaseType(),
		   source,
		   new String[] {
			   "derivation", "if self.oclIsKindOf(DeclaredType) then \r\n\tif self.oclAsType(DeclaredType).typeDefinition.oclIsUndefined() then\r\n\t\tnull\r\n\telse\r\n\t\tif self.oclAsType(DeclaredType).typeDefinition.oclIsKindOf(uppaal::expressions::IdentifierExpression) then\r\n\t\t\t-- Identifier reference to either a predefined or a declared type.\r\n\t\t\tif self.oclAsType(DeclaredType).typeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclIsKindOf(Type) then\r\n\t\t\t\tself.oclAsType(DeclaredType).typeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(Type).baseType\r\n\t\t\telse\r\n\t\t\t\tnull\r\n\t\t\tendif\r\n\t\telse\r\n\t\t\t-- A channel prefix leading to a channel type.\r\n\t\t\tif self.oclAsType(DeclaredType).typeDefinition.oclIsKindOf(uppaal::expressions::ChannelPrefixExpression) then\r\n\t\t\t\tself.oclAsType(DeclaredType).typeDefinition.oclAsType(uppaal::expressions::ChannelPrefixExpression).channelType.baseType\r\n\t\t\t-- A data prefix leading to another type.\r\n\t\t\telse\r\n\t\t\t\tif self.oclAsType(DeclaredType).typeDefinition.oclIsKindOf(uppaal::expressions::DataPrefixExpression) then\r\n\t\t\t\t\tif self.oclAsType(DeclaredType).typeDefinition.oclAsType(uppaal::expressions::DataPrefixExpression).dataTypeExpression.oclIsKindOf(uppaal::expressions::IdentifierExpression) then\r\n\t\t\t\t\t\tif self.oclAsType(DeclaredType).typeDefinition.oclAsType(uppaal::expressions::DataPrefixExpression).dataTypeExpression.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclIsKindOf(Type) then\r\n\t\t\t\t\t\t\tself.oclAsType(DeclaredType).typeDefinition.oclAsType(uppaal::expressions::DataPrefixExpression).dataTypeExpression.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(Type).baseType\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\tnull\r\n\t\t\t\t\t\tendif\r\n\t\t\t\t\telse\r\n\t\t\t\t\t\tnull\r\n\t\t\t\t\tendif\t\t\t\r\n\t\t\t\telse\r\n\t\t\t\t\t-- Or, finally, a range type.\r\n\t\t\t\t\tif self.oclAsType(DeclaredType).typeDefinition.oclIsKindOf(uppaal::types::RangeTypeSpecification) then\r\n\t\t\t\t\t\tuppaal::types::BuiltInType::INT\r\n\t\t\t\t\telse\r\n\t\t\t\t\t\tnull\r\n\t\t\t\t\tendif\r\n\t\t\t\tendif\r\n\t\t\tendif\r\n\t\tendif\r\n\tendif\r\nelse \r\n\t-- Only a boring predefined type.\r\n\tif self.oclIsKindOf(PredefinedType) then\r\n\t\tself.oclAsType(PredefinedType).type\r\n\telse\r\n\t\tnull\r\n\tendif\r\nendif"
		   });
		addAnnotation
		  (getDeclaredType_TypeDefinition(),
		   source,
		   new String[] {
			   "derivation", "if self.typeDeclaration.oclIsUndefined()\r\nthen null\r\nelse self.typeDeclaration.typeDefinition\r\nendif"
		   });
		addAnnotation
		  (structTypeSpecificationEClass,
		   source,
		   new String[] {
			   "UniqueFieldNames", "self.declaration->collect(elements)->collect(oclAsType(core::NamedElement))->isUnique(name)"
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
		  (integerBoundsEClass,
		   source,
		   new String[] {
			   "name", "IntegerBounds",
			   "kind", "empty"
		   });
	}

} //TypesPackageImpl
