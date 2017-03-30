/**
 */
package org.muml.uppaal.declarations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.uppaal.core.CorePackage;

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
 * <!-- begin-model-doc -->
 * Support for all kinds of declarations, e.g. types, functions, or variables.
 * <!-- end-model-doc -->
 * @see org.muml.uppaal.declarations.DeclarationsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface DeclarationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "declarations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/uppaal/declarations/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "declarations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeclarationsPackage eINSTANCE = org.muml.uppaal.declarations.impl.DeclarationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.impl.DeclarationsImpl <em>Declarations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.impl.DeclarationsImpl
	 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getDeclarations()
	 * @generated
	 */
	int DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIONS__DECLARATION = 0;

	/**
	 * The number of structural features of the '<em>Declarations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.impl.GlobalDeclarationsImpl <em>Global Declarations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.impl.GlobalDeclarationsImpl
	 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getGlobalDeclarations()
	 * @generated
	 */
	int GLOBAL_DECLARATIONS = 1;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_DECLARATIONS__DECLARATION = DECLARATIONS__DECLARATION;

	/**
	 * The feature id for the '<em><b>Channel Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_DECLARATIONS__CHANNEL_PRIORITY = DECLARATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Declarations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_DECLARATIONS_FEATURE_COUNT = DECLARATIONS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.impl.LocalDeclarationsImpl <em>Local Declarations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.impl.LocalDeclarationsImpl
	 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getLocalDeclarations()
	 * @generated
	 */
	int LOCAL_DECLARATIONS = 2;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DECLARATIONS__DECLARATION = DECLARATIONS__DECLARATION;

	/**
	 * The number of structural features of the '<em>Local Declarations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DECLARATIONS_FEATURE_COUNT = DECLARATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.impl.SystemDeclarationsImpl <em>System Declarations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.impl.SystemDeclarationsImpl
	 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getSystemDeclarations()
	 * @generated
	 */
	int SYSTEM_DECLARATIONS = 3;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DECLARATIONS__DECLARATION = DECLARATIONS__DECLARATION;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DECLARATIONS__SYSTEM = DECLARATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Progress Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DECLARATIONS__PROGRESS_MEASURE = DECLARATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Declarations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DECLARATIONS_FEATURE_COUNT = DECLARATIONS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.impl.DeclarationImpl
	 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 4;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.impl.FunctionImpl
	 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CONTAINER = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TYPE_DEFINITION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BLOCK = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETER = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.impl.TypeDeclarationImpl
	 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getTypeDeclaration()
	 * @generated
	 */
	int TYPE_DECLARATION = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__TYPE = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__TYPE_DEFINITION = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.impl.VariableImpl
	 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CONTAINER = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE_DEFINITION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INDEX = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INITIALIZER = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.impl.TypedElementContainerImpl <em>Typed Element Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.impl.TypedElementContainerImpl
	 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getTypedElementContainer()
	 * @generated
	 */
	int TYPED_ELEMENT_CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_CONTAINER__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Typed Element Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.impl.ParameterImpl
	 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONTAINER = VARIABLE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE_DEFINITION = VARIABLE__TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__INDEX = VARIABLE__INDEX;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__INITIALIZER = VARIABLE__INITIALIZER;

	/**
	 * The feature id for the '<em><b>Call Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CALL_TYPE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.impl.InitializerImpl <em>Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.impl.InitializerImpl
	 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getInitializer()
	 * @generated
	 */
	int INITIALIZER = 10;

	/**
	 * The number of structural features of the '<em>Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.impl.ExpressionInitializerImpl <em>Expression Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.impl.ExpressionInitializerImpl
	 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getExpressionInitializer()
	 * @generated
	 */
	int EXPRESSION_INITIALIZER = 11;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_INITIALIZER__EXPRESSION = INITIALIZER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_INITIALIZER_FEATURE_COUNT = INITIALIZER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.impl.ArrayInitializerImpl <em>Array Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.impl.ArrayInitializerImpl
	 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getArrayInitializer()
	 * @generated
	 */
	int ARRAY_INITIALIZER = 12;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER__INITIALIZER = INITIALIZER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER_FEATURE_COUNT = INITIALIZER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.impl.TypedDeclarationImpl <em>Typed Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.impl.TypedDeclarationImpl
	 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getTypedDeclaration()
	 * @generated
	 */
	int TYPED_DECLARATION = 13;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DECLARATION__TYPE_DEFINITION = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DECLARATION__ELEMENTS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Typed Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.impl.ParameterContainerImpl <em>Parameter Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.impl.ParameterContainerImpl
	 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getParameterContainer()
	 * @generated
	 */
	int PARAMETER_CONTAINER = 14;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONTAINER__TYPE_DEFINITION = TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONTAINER__ELEMENTS = TYPED_ELEMENT_CONTAINER__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Parameter Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONTAINER_FEATURE_COUNT = TYPED_ELEMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.DataVariablePrefix <em>Data Variable Prefix</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.DataVariablePrefix
	 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getDataVariablePrefix()
	 * @generated
	 */
	int DATA_VARIABLE_PREFIX = 15;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.CallType <em>Call Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.CallType
	 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getCallType()
	 * @generated
	 */
	int CALL_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.Declarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declarations</em>'.
	 * @see org.muml.uppaal.declarations.Declarations
	 * @generated
	 */
	EClass getDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.uppaal.declarations.Declarations#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see org.muml.uppaal.declarations.Declarations#getDeclaration()
	 * @see #getDeclarations()
	 * @generated
	 */
	EReference getDeclarations_Declaration();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.GlobalDeclarations <em>Global Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Declarations</em>'.
	 * @see org.muml.uppaal.declarations.GlobalDeclarations
	 * @generated
	 */
	EClass getGlobalDeclarations();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.uppaal.declarations.GlobalDeclarations#getChannelPriority <em>Channel Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channel Priority</em>'.
	 * @see org.muml.uppaal.declarations.GlobalDeclarations#getChannelPriority()
	 * @see #getGlobalDeclarations()
	 * @generated
	 */
	EReference getGlobalDeclarations_ChannelPriority();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.LocalDeclarations <em>Local Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Declarations</em>'.
	 * @see org.muml.uppaal.declarations.LocalDeclarations
	 * @generated
	 */
	EClass getLocalDeclarations();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.SystemDeclarations <em>System Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Declarations</em>'.
	 * @see org.muml.uppaal.declarations.SystemDeclarations
	 * @generated
	 */
	EClass getSystemDeclarations();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.uppaal.declarations.SystemDeclarations#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see org.muml.uppaal.declarations.SystemDeclarations#getSystem()
	 * @see #getSystemDeclarations()
	 * @generated
	 */
	EReference getSystemDeclarations_System();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.uppaal.declarations.SystemDeclarations#getProgressMeasure <em>Progress Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Progress Measure</em>'.
	 * @see org.muml.uppaal.declarations.SystemDeclarations#getProgressMeasure()
	 * @see #getSystemDeclarations()
	 * @generated
	 */
	EReference getSystemDeclarations_ProgressMeasure();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see org.muml.uppaal.declarations.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.muml.uppaal.declarations.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.uppaal.declarations.Function#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see org.muml.uppaal.declarations.Function#getBlock()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Block();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.uppaal.declarations.Function#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.muml.uppaal.declarations.Function#getParameter()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameter();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.TypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Declaration</em>'.
	 * @see org.muml.uppaal.declarations.TypeDeclaration
	 * @generated
	 */
	EClass getTypeDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.uppaal.declarations.TypeDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see org.muml.uppaal.declarations.TypeDeclaration#getType()
	 * @see #getTypeDeclaration()
	 * @generated
	 */
	EReference getTypeDeclaration_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.uppaal.declarations.TypeDeclaration#getTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Definition</em>'.
	 * @see org.muml.uppaal.declarations.TypeDeclaration#getTypeDefinition()
	 * @see #getTypeDeclaration()
	 * @generated
	 */
	EReference getTypeDeclaration_TypeDefinition();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.muml.uppaal.declarations.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.uppaal.declarations.Variable#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see org.muml.uppaal.declarations.Variable#getIndex()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Index();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.uppaal.declarations.Variable#getInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initializer</em>'.
	 * @see org.muml.uppaal.declarations.Variable#getInitializer()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Initializer();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.TypedElementContainer <em>Typed Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element Container</em>'.
	 * @see org.muml.uppaal.declarations.TypedElementContainer
	 * @generated
	 */
	EClass getTypedElementContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.uppaal.declarations.TypedElementContainer#getTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Definition</em>'.
	 * @see org.muml.uppaal.declarations.TypedElementContainer#getTypeDefinition()
	 * @see #getTypedElementContainer()
	 * @generated
	 */
	EReference getTypedElementContainer_TypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.uppaal.declarations.TypedElementContainer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.muml.uppaal.declarations.TypedElementContainer#getElements()
	 * @see #getTypedElementContainer()
	 * @generated
	 */
	EReference getTypedElementContainer_Elements();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.muml.uppaal.declarations.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.uppaal.declarations.Parameter#getCallType <em>Call Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Type</em>'.
	 * @see org.muml.uppaal.declarations.Parameter#getCallType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_CallType();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.Initializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initializer</em>'.
	 * @see org.muml.uppaal.declarations.Initializer
	 * @generated
	 */
	EClass getInitializer();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.ExpressionInitializer <em>Expression Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Initializer</em>'.
	 * @see org.muml.uppaal.declarations.ExpressionInitializer
	 * @generated
	 */
	EClass getExpressionInitializer();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.uppaal.declarations.ExpressionInitializer#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.muml.uppaal.declarations.ExpressionInitializer#getExpression()
	 * @see #getExpressionInitializer()
	 * @generated
	 */
	EReference getExpressionInitializer_Expression();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.ArrayInitializer <em>Array Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Initializer</em>'.
	 * @see org.muml.uppaal.declarations.ArrayInitializer
	 * @generated
	 */
	EClass getArrayInitializer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.uppaal.declarations.ArrayInitializer#getInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initializer</em>'.
	 * @see org.muml.uppaal.declarations.ArrayInitializer#getInitializer()
	 * @see #getArrayInitializer()
	 * @generated
	 */
	EReference getArrayInitializer_Initializer();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.TypedDeclaration <em>Typed Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Declaration</em>'.
	 * @see org.muml.uppaal.declarations.TypedDeclaration
	 * @generated
	 */
	EClass getTypedDeclaration();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.ParameterContainer <em>Parameter Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Container</em>'.
	 * @see org.muml.uppaal.declarations.ParameterContainer
	 * @generated
	 */
	EClass getParameterContainer();

	/**
	 * Returns the meta object for enum '{@link org.muml.uppaal.declarations.DataVariablePrefix <em>Data Variable Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Variable Prefix</em>'.
	 * @see org.muml.uppaal.declarations.DataVariablePrefix
	 * @generated
	 */
	EEnum getDataVariablePrefix();

	/**
	 * Returns the meta object for enum '{@link org.muml.uppaal.declarations.CallType <em>Call Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Call Type</em>'.
	 * @see org.muml.uppaal.declarations.CallType
	 * @generated
	 */
	EEnum getCallType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeclarationsFactory getDeclarationsFactory();

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
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.impl.DeclarationsImpl <em>Declarations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.impl.DeclarationsImpl
		 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getDeclarations()
		 * @generated
		 */
		EClass DECLARATIONS = eINSTANCE.getDeclarations();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATIONS__DECLARATION = eINSTANCE.getDeclarations_Declaration();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.impl.GlobalDeclarationsImpl <em>Global Declarations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.impl.GlobalDeclarationsImpl
		 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getGlobalDeclarations()
		 * @generated
		 */
		EClass GLOBAL_DECLARATIONS = eINSTANCE.getGlobalDeclarations();

		/**
		 * The meta object literal for the '<em><b>Channel Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_DECLARATIONS__CHANNEL_PRIORITY = eINSTANCE.getGlobalDeclarations_ChannelPriority();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.impl.LocalDeclarationsImpl <em>Local Declarations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.impl.LocalDeclarationsImpl
		 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getLocalDeclarations()
		 * @generated
		 */
		EClass LOCAL_DECLARATIONS = eINSTANCE.getLocalDeclarations();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.impl.SystemDeclarationsImpl <em>System Declarations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.impl.SystemDeclarationsImpl
		 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getSystemDeclarations()
		 * @generated
		 */
		EClass SYSTEM_DECLARATIONS = eINSTANCE.getSystemDeclarations();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DECLARATIONS__SYSTEM = eINSTANCE.getSystemDeclarations_System();

		/**
		 * The meta object literal for the '<em><b>Progress Measure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DECLARATIONS__PROGRESS_MEASURE = eINSTANCE.getSystemDeclarations_ProgressMeasure();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.impl.DeclarationImpl
		 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.impl.FunctionImpl
		 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__BLOCK = eINSTANCE.getFunction_Block();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMETER = eINSTANCE.getFunction_Parameter();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.impl.TypeDeclarationImpl
		 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getTypeDeclaration()
		 * @generated
		 */
		EClass TYPE_DECLARATION = eINSTANCE.getTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DECLARATION__TYPE = eINSTANCE.getTypeDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Type Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DECLARATION__TYPE_DEFINITION = eINSTANCE.getTypeDeclaration_TypeDefinition();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.impl.VariableImpl
		 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__INDEX = eINSTANCE.getVariable_Index();

		/**
		 * The meta object literal for the '<em><b>Initializer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__INITIALIZER = eINSTANCE.getVariable_Initializer();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.impl.TypedElementContainerImpl <em>Typed Element Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.impl.TypedElementContainerImpl
		 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getTypedElementContainer()
		 * @generated
		 */
		EClass TYPED_ELEMENT_CONTAINER = eINSTANCE.getTypedElementContainer();

		/**
		 * The meta object literal for the '<em><b>Type Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION = eINSTANCE.getTypedElementContainer_TypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT_CONTAINER__ELEMENTS = eINSTANCE.getTypedElementContainer_Elements();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.impl.ParameterImpl
		 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Call Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__CALL_TYPE = eINSTANCE.getParameter_CallType();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.impl.InitializerImpl <em>Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.impl.InitializerImpl
		 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getInitializer()
		 * @generated
		 */
		EClass INITIALIZER = eINSTANCE.getInitializer();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.impl.ExpressionInitializerImpl <em>Expression Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.impl.ExpressionInitializerImpl
		 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getExpressionInitializer()
		 * @generated
		 */
		EClass EXPRESSION_INITIALIZER = eINSTANCE.getExpressionInitializer();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_INITIALIZER__EXPRESSION = eINSTANCE.getExpressionInitializer_Expression();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.impl.ArrayInitializerImpl <em>Array Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.impl.ArrayInitializerImpl
		 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getArrayInitializer()
		 * @generated
		 */
		EClass ARRAY_INITIALIZER = eINSTANCE.getArrayInitializer();

		/**
		 * The meta object literal for the '<em><b>Initializer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_INITIALIZER__INITIALIZER = eINSTANCE.getArrayInitializer_Initializer();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.impl.TypedDeclarationImpl <em>Typed Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.impl.TypedDeclarationImpl
		 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getTypedDeclaration()
		 * @generated
		 */
		EClass TYPED_DECLARATION = eINSTANCE.getTypedDeclaration();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.impl.ParameterContainerImpl <em>Parameter Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.impl.ParameterContainerImpl
		 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getParameterContainer()
		 * @generated
		 */
		EClass PARAMETER_CONTAINER = eINSTANCE.getParameterContainer();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.DataVariablePrefix <em>Data Variable Prefix</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.DataVariablePrefix
		 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getDataVariablePrefix()
		 * @generated
		 */
		EEnum DATA_VARIABLE_PREFIX = eINSTANCE.getDataVariablePrefix();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.CallType <em>Call Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.CallType
		 * @see org.muml.uppaal.declarations.impl.DeclarationsPackageImpl#getCallType()
		 * @generated
		 */
		EEnum CALL_TYPE = eINSTANCE.getCallType();

	}

} //DeclarationsPackage
