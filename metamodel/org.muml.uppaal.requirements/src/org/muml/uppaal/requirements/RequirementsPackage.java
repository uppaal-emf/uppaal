/**
 */
package org.muml.uppaal.requirements;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.muml.uppaal.requirements.RequirementsFactory
 * @model kind="package"
 * @generated
 */
public interface RequirementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/uppaal/requirements/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "requirements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementsPackage eINSTANCE = org.muml.uppaal.requirements.impl.RequirementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.uppaal.requirements.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.requirements.impl.PropertyImpl
	 * @see org.muml.uppaal.requirements.impl.RequirementsPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.requirements.impl.UnaryPropertyImpl <em>Unary Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.requirements.impl.UnaryPropertyImpl
	 * @see org.muml.uppaal.requirements.impl.RequirementsPackageImpl#getUnaryProperty()
	 * @generated
	 */
	int UNARY_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PROPERTY__COMMENT = PROPERTY__COMMENT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PROPERTY__EXPRESSION = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PROPERTY__QUANTIFIER = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PROPERTY__OPERATOR = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Unary Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.requirements.impl.BinaryPropertyImpl <em>Binary Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.requirements.impl.BinaryPropertyImpl
	 * @see org.muml.uppaal.requirements.impl.RequirementsPackageImpl#getBinaryProperty()
	 * @generated
	 */
	int BINARY_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PROPERTY__COMMENT = PROPERTY__COMMENT;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PROPERTY__LEFT_EXPRESSION = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PROPERTY__RIGHT_EXPRESSION = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.requirements.impl.LeadsToPropertyImpl <em>Leads To Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.requirements.impl.LeadsToPropertyImpl
	 * @see org.muml.uppaal.requirements.impl.RequirementsPackageImpl#getLeadsToProperty()
	 * @generated
	 */
	int LEADS_TO_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_PROPERTY__COMMENT = BINARY_PROPERTY__COMMENT;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_PROPERTY__LEFT_EXPRESSION = BINARY_PROPERTY__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_PROPERTY__RIGHT_EXPRESSION = BINARY_PROPERTY__RIGHT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Leads To Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_PROPERTY_FEATURE_COUNT = BINARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.requirements.impl.DeadlockExpressionImpl <em>Deadlock Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.requirements.impl.DeadlockExpressionImpl
	 * @see org.muml.uppaal.requirements.impl.RequirementsPackageImpl#getDeadlockExpression()
	 * @generated
	 */
	int DEADLOCK_EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>Deadlock Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.requirements.impl.PropertyRepositoryImpl <em>Property Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.requirements.impl.PropertyRepositoryImpl
	 * @see org.muml.uppaal.requirements.impl.RequirementsPackageImpl#getPropertyRepository()
	 * @generated
	 */
	int PROPERTY_REPOSITORY = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REPOSITORY__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Property Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.requirements.PathQuantifier <em>Path Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.requirements.PathQuantifier
	 * @see org.muml.uppaal.requirements.impl.RequirementsPackageImpl#getPathQuantifier()
	 * @generated
	 */
	int PATH_QUANTIFIER = 6;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.requirements.TemporalOperator <em>Temporal Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.requirements.TemporalOperator
	 * @see org.muml.uppaal.requirements.impl.RequirementsPackageImpl#getTemporalOperator()
	 * @generated
	 */
	int TEMPORAL_OPERATOR = 7;


	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.requirements.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.muml.uppaal.requirements.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.requirements.PropertyRepository <em>Property Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Repository</em>'.
	 * @see org.muml.uppaal.requirements.PropertyRepository
	 * @generated
	 */
	EClass getPropertyRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.uppaal.requirements.PropertyRepository#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.muml.uppaal.requirements.PropertyRepository#getProperties()
	 * @see #getPropertyRepository()
	 * @generated
	 */
	EReference getPropertyRepository_Properties();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.requirements.UnaryProperty <em>Unary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Property</em>'.
	 * @see org.muml.uppaal.requirements.UnaryProperty
	 * @generated
	 */
	EClass getUnaryProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.uppaal.requirements.UnaryProperty#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.muml.uppaal.requirements.UnaryProperty#getExpression()
	 * @see #getUnaryProperty()
	 * @generated
	 */
	EReference getUnaryProperty_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.uppaal.requirements.UnaryProperty#getQuantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantifier</em>'.
	 * @see org.muml.uppaal.requirements.UnaryProperty#getQuantifier()
	 * @see #getUnaryProperty()
	 * @generated
	 */
	EAttribute getUnaryProperty_Quantifier();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.uppaal.requirements.UnaryProperty#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.muml.uppaal.requirements.UnaryProperty#getOperator()
	 * @see #getUnaryProperty()
	 * @generated
	 */
	EAttribute getUnaryProperty_Operator();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.requirements.BinaryProperty <em>Binary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Property</em>'.
	 * @see org.muml.uppaal.requirements.BinaryProperty
	 * @generated
	 */
	EClass getBinaryProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.uppaal.requirements.BinaryProperty#getLeftExpression <em>Left Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Expression</em>'.
	 * @see org.muml.uppaal.requirements.BinaryProperty#getLeftExpression()
	 * @see #getBinaryProperty()
	 * @generated
	 */
	EReference getBinaryProperty_LeftExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.uppaal.requirements.BinaryProperty#getRightExpression <em>Right Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Expression</em>'.
	 * @see org.muml.uppaal.requirements.BinaryProperty#getRightExpression()
	 * @see #getBinaryProperty()
	 * @generated
	 */
	EReference getBinaryProperty_RightExpression();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.requirements.LeadsToProperty <em>Leads To Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leads To Property</em>'.
	 * @see org.muml.uppaal.requirements.LeadsToProperty
	 * @generated
	 */
	EClass getLeadsToProperty();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.requirements.DeadlockExpression <em>Deadlock Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadlock Expression</em>'.
	 * @see org.muml.uppaal.requirements.DeadlockExpression
	 * @generated
	 */
	EClass getDeadlockExpression();

	/**
	 * Returns the meta object for enum '{@link org.muml.uppaal.requirements.PathQuantifier <em>Path Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Path Quantifier</em>'.
	 * @see org.muml.uppaal.requirements.PathQuantifier
	 * @generated
	 */
	EEnum getPathQuantifier();

	/**
	 * Returns the meta object for enum '{@link org.muml.uppaal.requirements.TemporalOperator <em>Temporal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Temporal Operator</em>'.
	 * @see org.muml.uppaal.requirements.TemporalOperator
	 * @generated
	 */
	EEnum getTemporalOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementsFactory getRequirementsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.uppaal.requirements.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.requirements.impl.PropertyImpl
		 * @see org.muml.uppaal.requirements.impl.RequirementsPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.requirements.impl.PropertyRepositoryImpl <em>Property Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.requirements.impl.PropertyRepositoryImpl
		 * @see org.muml.uppaal.requirements.impl.RequirementsPackageImpl#getPropertyRepository()
		 * @generated
		 */
		EClass PROPERTY_REPOSITORY = eINSTANCE.getPropertyRepository();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REPOSITORY__PROPERTIES = eINSTANCE.getPropertyRepository_Properties();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.requirements.impl.UnaryPropertyImpl <em>Unary Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.requirements.impl.UnaryPropertyImpl
		 * @see org.muml.uppaal.requirements.impl.RequirementsPackageImpl#getUnaryProperty()
		 * @generated
		 */
		EClass UNARY_PROPERTY = eINSTANCE.getUnaryProperty();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_PROPERTY__EXPRESSION = eINSTANCE.getUnaryProperty_Expression();

		/**
		 * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_PROPERTY__QUANTIFIER = eINSTANCE.getUnaryProperty_Quantifier();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_PROPERTY__OPERATOR = eINSTANCE.getUnaryProperty_Operator();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.requirements.impl.BinaryPropertyImpl <em>Binary Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.requirements.impl.BinaryPropertyImpl
		 * @see org.muml.uppaal.requirements.impl.RequirementsPackageImpl#getBinaryProperty()
		 * @generated
		 */
		EClass BINARY_PROPERTY = eINSTANCE.getBinaryProperty();

		/**
		 * The meta object literal for the '<em><b>Left Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_PROPERTY__LEFT_EXPRESSION = eINSTANCE.getBinaryProperty_LeftExpression();

		/**
		 * The meta object literal for the '<em><b>Right Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_PROPERTY__RIGHT_EXPRESSION = eINSTANCE.getBinaryProperty_RightExpression();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.requirements.impl.LeadsToPropertyImpl <em>Leads To Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.requirements.impl.LeadsToPropertyImpl
		 * @see org.muml.uppaal.requirements.impl.RequirementsPackageImpl#getLeadsToProperty()
		 * @generated
		 */
		EClass LEADS_TO_PROPERTY = eINSTANCE.getLeadsToProperty();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.requirements.impl.DeadlockExpressionImpl <em>Deadlock Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.requirements.impl.DeadlockExpressionImpl
		 * @see org.muml.uppaal.requirements.impl.RequirementsPackageImpl#getDeadlockExpression()
		 * @generated
		 */
		EClass DEADLOCK_EXPRESSION = eINSTANCE.getDeadlockExpression();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.requirements.PathQuantifier <em>Path Quantifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.requirements.PathQuantifier
		 * @see org.muml.uppaal.requirements.impl.RequirementsPackageImpl#getPathQuantifier()
		 * @generated
		 */
		EEnum PATH_QUANTIFIER = eINSTANCE.getPathQuantifier();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.requirements.TemporalOperator <em>Temporal Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.requirements.TemporalOperator
		 * @see org.muml.uppaal.requirements.impl.RequirementsPackageImpl#getTemporalOperator()
		 * @generated
		 */
		EEnum TEMPORAL_OPERATOR = eINSTANCE.getTemporalOperator();

	}

} //RequirementsPackage
