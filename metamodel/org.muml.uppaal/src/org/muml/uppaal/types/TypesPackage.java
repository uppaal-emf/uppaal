/**
 */
package org.muml.uppaal.types;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.uppaal.core.CorePackage;
import org.muml.uppaal.expressions.ExpressionsPackage;

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
 * Provides support for built-in and user-defined types.
 * <!-- end-model-doc -->
 * @see org.muml.uppaal.types.TypesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/uppaal/types/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = org.muml.uppaal.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.uppaal.types.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.types.impl.TypeImpl
	 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__BASE_TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.types.impl.PredefinedTypeImpl <em>Predefined Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.types.impl.PredefinedTypeImpl
	 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getPredefinedType()
	 * @generated
	 */
	int PREDEFINED_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_TYPE__BASE_TYPE = TYPE__BASE_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predefined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.types.impl.DeclaredTypeImpl <em>Declared Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.types.impl.DeclaredTypeImpl
	 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getDeclaredType()
	 * @generated
	 */
	int DECLARED_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__BASE_TYPE = TYPE__BASE_TYPE;

	/**
	 * The feature id for the '<em><b>Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__TYPE_DECLARATION = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__TYPE_DEFINITION = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Declared Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.types.impl.TypeExpressionImpl <em>Type Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.types.impl.TypeExpressionImpl
	 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getTypeExpression()
	 * @generated
	 */
	int TYPE_EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>Type Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.types.impl.ScalarTypeSpecificationImpl <em>Scalar Type Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.types.impl.ScalarTypeSpecificationImpl
	 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getScalarTypeSpecification()
	 * @generated
	 */
	int SCALAR_TYPE_SPECIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Size Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_TYPE_SPECIFICATION__SIZE_EXPRESSION = TYPE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scalar Type Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_TYPE_SPECIFICATION_FEATURE_COUNT = TYPE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.types.impl.StructTypeSpecificationImpl <em>Struct Type Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.types.impl.StructTypeSpecificationImpl
	 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getStructTypeSpecification()
	 * @generated
	 */
	int STRUCT_TYPE_SPECIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE_SPECIFICATION__DECLARATION = TYPE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Struct Type Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE_SPECIFICATION_FEATURE_COUNT = TYPE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.types.impl.RangeTypeSpecificationImpl <em>Range Type Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.types.impl.RangeTypeSpecificationImpl
	 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getRangeTypeSpecification()
	 * @generated
	 */
	int RANGE_TYPE_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE_SPECIFICATION__BOUNDS = TYPE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Range Type Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE_SPECIFICATION_FEATURE_COUNT = TYPE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.types.impl.IntegerBoundsImpl <em>Integer Bounds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.types.impl.IntegerBoundsImpl
	 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getIntegerBounds()
	 * @generated
	 */
	int INTEGER_BOUNDS = 7;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BOUNDS__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BOUNDS__UPPER_BOUND = 1;

	/**
	 * The number of structural features of the '<em>Integer Bounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BOUNDS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.types.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.types.impl.LibraryImpl
	 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 8;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__TYPES = 0;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.types.BuiltInType <em>Built In Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.types.BuiltInType
	 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getBuiltInType()
	 * @generated
	 */
	int BUILT_IN_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.types.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.muml.uppaal.types.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.uppaal.types.Type#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Type</em>'.
	 * @see org.muml.uppaal.types.Type#getBaseType()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_BaseType();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.types.PredefinedType <em>Predefined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predefined Type</em>'.
	 * @see org.muml.uppaal.types.PredefinedType
	 * @generated
	 */
	EClass getPredefinedType();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.uppaal.types.PredefinedType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.muml.uppaal.types.PredefinedType#getType()
	 * @see #getPredefinedType()
	 * @generated
	 */
	EAttribute getPredefinedType_Type();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.types.DeclaredType <em>Declared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Type</em>'.
	 * @see org.muml.uppaal.types.DeclaredType
	 * @generated
	 */
	EClass getDeclaredType();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.uppaal.types.DeclaredType#getTypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type Declaration</em>'.
	 * @see org.muml.uppaal.types.DeclaredType#getTypeDeclaration()
	 * @see #getDeclaredType()
	 * @generated
	 */
	EReference getDeclaredType_TypeDeclaration();

	/**
	 * Returns the meta object for the reference '{@link org.muml.uppaal.types.DeclaredType#getTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Definition</em>'.
	 * @see org.muml.uppaal.types.DeclaredType#getTypeDefinition()
	 * @see #getDeclaredType()
	 * @generated
	 */
	EReference getDeclaredType_TypeDefinition();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.types.TypeExpression <em>Type Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Expression</em>'.
	 * @see org.muml.uppaal.types.TypeExpression
	 * @generated
	 */
	EClass getTypeExpression();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.types.ScalarTypeSpecification <em>Scalar Type Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar Type Specification</em>'.
	 * @see org.muml.uppaal.types.ScalarTypeSpecification
	 * @generated
	 */
	EClass getScalarTypeSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.uppaal.types.ScalarTypeSpecification#getSizeExpression <em>Size Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size Expression</em>'.
	 * @see org.muml.uppaal.types.ScalarTypeSpecification#getSizeExpression()
	 * @see #getScalarTypeSpecification()
	 * @generated
	 */
	EReference getScalarTypeSpecification_SizeExpression();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.types.StructTypeSpecification <em>Struct Type Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Type Specification</em>'.
	 * @see org.muml.uppaal.types.StructTypeSpecification
	 * @generated
	 */
	EClass getStructTypeSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.uppaal.types.StructTypeSpecification#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see org.muml.uppaal.types.StructTypeSpecification#getDeclaration()
	 * @see #getStructTypeSpecification()
	 * @generated
	 */
	EReference getStructTypeSpecification_Declaration();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.types.RangeTypeSpecification <em>Range Type Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Type Specification</em>'.
	 * @see org.muml.uppaal.types.RangeTypeSpecification
	 * @generated
	 */
	EClass getRangeTypeSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.uppaal.types.RangeTypeSpecification#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see org.muml.uppaal.types.RangeTypeSpecification#getBounds()
	 * @see #getRangeTypeSpecification()
	 * @generated
	 */
	EReference getRangeTypeSpecification_Bounds();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.types.IntegerBounds <em>Integer Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Bounds</em>'.
	 * @see org.muml.uppaal.types.IntegerBounds
	 * @generated
	 */
	EClass getIntegerBounds();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.uppaal.types.IntegerBounds#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see org.muml.uppaal.types.IntegerBounds#getLowerBound()
	 * @see #getIntegerBounds()
	 * @generated
	 */
	EReference getIntegerBounds_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.uppaal.types.IntegerBounds#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see org.muml.uppaal.types.IntegerBounds#getUpperBound()
	 * @see #getIntegerBounds()
	 * @generated
	 */
	EReference getIntegerBounds_UpperBound();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.types.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.muml.uppaal.types.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.uppaal.types.Library#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.muml.uppaal.types.Library#getTypes()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Types();

	/**
	 * Returns the meta object for enum '{@link org.muml.uppaal.types.BuiltInType <em>Built In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Built In Type</em>'.
	 * @see org.muml.uppaal.types.BuiltInType
	 * @generated
	 */
	EEnum getBuiltInType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

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
		 * The meta object literal for the '{@link org.muml.uppaal.types.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.types.impl.TypeImpl
		 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__BASE_TYPE = eINSTANCE.getType_BaseType();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.types.impl.PredefinedTypeImpl <em>Predefined Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.types.impl.PredefinedTypeImpl
		 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getPredefinedType()
		 * @generated
		 */
		EClass PREDEFINED_TYPE = eINSTANCE.getPredefinedType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDEFINED_TYPE__TYPE = eINSTANCE.getPredefinedType_Type();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.types.impl.DeclaredTypeImpl <em>Declared Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.types.impl.DeclaredTypeImpl
		 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getDeclaredType()
		 * @generated
		 */
		EClass DECLARED_TYPE = eINSTANCE.getDeclaredType();

		/**
		 * The meta object literal for the '<em><b>Type Declaration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_TYPE__TYPE_DECLARATION = eINSTANCE.getDeclaredType_TypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_TYPE__TYPE_DEFINITION = eINSTANCE.getDeclaredType_TypeDefinition();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.types.impl.TypeExpressionImpl <em>Type Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.types.impl.TypeExpressionImpl
		 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getTypeExpression()
		 * @generated
		 */
		EClass TYPE_EXPRESSION = eINSTANCE.getTypeExpression();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.types.impl.ScalarTypeSpecificationImpl <em>Scalar Type Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.types.impl.ScalarTypeSpecificationImpl
		 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getScalarTypeSpecification()
		 * @generated
		 */
		EClass SCALAR_TYPE_SPECIFICATION = eINSTANCE.getScalarTypeSpecification();

		/**
		 * The meta object literal for the '<em><b>Size Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALAR_TYPE_SPECIFICATION__SIZE_EXPRESSION = eINSTANCE.getScalarTypeSpecification_SizeExpression();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.types.impl.StructTypeSpecificationImpl <em>Struct Type Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.types.impl.StructTypeSpecificationImpl
		 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getStructTypeSpecification()
		 * @generated
		 */
		EClass STRUCT_TYPE_SPECIFICATION = eINSTANCE.getStructTypeSpecification();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_TYPE_SPECIFICATION__DECLARATION = eINSTANCE.getStructTypeSpecification_Declaration();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.types.impl.RangeTypeSpecificationImpl <em>Range Type Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.types.impl.RangeTypeSpecificationImpl
		 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getRangeTypeSpecification()
		 * @generated
		 */
		EClass RANGE_TYPE_SPECIFICATION = eINSTANCE.getRangeTypeSpecification();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_TYPE_SPECIFICATION__BOUNDS = eINSTANCE.getRangeTypeSpecification_Bounds();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.types.impl.IntegerBoundsImpl <em>Integer Bounds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.types.impl.IntegerBoundsImpl
		 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getIntegerBounds()
		 * @generated
		 */
		EClass INTEGER_BOUNDS = eINSTANCE.getIntegerBounds();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_BOUNDS__LOWER_BOUND = eINSTANCE.getIntegerBounds_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_BOUNDS__UPPER_BOUND = eINSTANCE.getIntegerBounds_UpperBound();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.types.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.types.impl.LibraryImpl
		 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__TYPES = eINSTANCE.getLibrary_Types();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.types.BuiltInType <em>Built In Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.types.BuiltInType
		 * @see org.muml.uppaal.types.impl.TypesPackageImpl#getBuiltInType()
		 * @generated
		 */
		EEnum BUILT_IN_TYPE = eINSTANCE.getBuiltInType();

	}

} //TypesPackage
