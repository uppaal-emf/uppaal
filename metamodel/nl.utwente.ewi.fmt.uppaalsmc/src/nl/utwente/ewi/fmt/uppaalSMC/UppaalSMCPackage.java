/**
 */
package nl.utwente.ewi.fmt.uppaalSMC;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.muml.uppaal.UppaalPackage;

import org.muml.uppaal.templates.TemplatesPackage;

import org.muml.uppaal.types.TypesPackage;

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
 * @see nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCFactory
 * @model kind="package"
 * @generated
 */
public interface UppaalSMCPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uppaalSMC";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fmt.ewi.utwente.nl/FMT/AFTModel/uppaalSMC";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uppaalSMC";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UppaalSMCPackage eINSTANCE = nl.utwente.ewi.fmt.uppaalSMC.impl.UppaalSMCPackageImpl.init();

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.uppaalSMC.impl.NSTAImpl <em>NSTA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.NSTAImpl
	 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.UppaalSMCPackageImpl#getNSTA()
	 * @generated
	 */
	int NSTA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSTA__NAME = UppaalPackage.NTA__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSTA__COMMENT = UppaalPackage.NTA__COMMENT;

	/**
	 * The feature id for the '<em><b>Global Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSTA__GLOBAL_DECLARATIONS = UppaalPackage.NTA__GLOBAL_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSTA__TEMPLATE = UppaalPackage.NTA__TEMPLATE;

	/**
	 * The feature id for the '<em><b>System Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSTA__SYSTEM_DECLARATIONS = UppaalPackage.NTA__SYSTEM_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSTA__INT = UppaalPackage.NTA__INT;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSTA__BOOL = UppaalPackage.NTA__BOOL;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSTA__CLOCK = UppaalPackage.NTA__CLOCK;

	/**
	 * The feature id for the '<em><b>Chan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSTA__CHAN = UppaalPackage.NTA__CHAN;

	/**
	 * The feature id for the '<em><b>Void</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSTA__VOID = UppaalPackage.NTA__VOID;

	/**
	 * The feature id for the '<em><b>Double</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSTA__DOUBLE = UppaalPackage.NTA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NSTA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSTA_FEATURE_COUNT = UppaalPackage.NTA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.uppaalSMC.impl.DoubleTypeImpl <em>Double Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.DoubleTypeImpl
	 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.UppaalSMCPackageImpl#getDoubleType()
	 * @generated
	 */
	int DOUBLE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_TYPE__NAME = TypesPackage.TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_TYPE__INDEX = TypesPackage.TYPE__INDEX;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_TYPE__BASE_TYPE = TypesPackage.TYPE__BASE_TYPE;

	/**
	 * The feature id for the '<em><b>Type Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_TYPE__TYPE_SPECIFICATION = TypesPackage.TYPE__TYPE_SPECIFICATION;

	/**
	 * The number of structural features of the '<em>Double Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_TYPE_FEATURE_COUNT = TypesPackage.TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.uppaalSMC.impl.ChanceNodeImpl <em>Chance Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.ChanceNodeImpl
	 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.UppaalSMCPackageImpl#getChanceNode()
	 * @generated
	 */
	int CHANCE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_NODE__NAME = TemplatesPackage.LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_NODE__COMMENT = TemplatesPackage.LOCATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_NODE__POSITION = TemplatesPackage.LOCATION__POSITION;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_NODE__COLOR = TemplatesPackage.LOCATION__COLOR;

	/**
	 * The feature id for the '<em><b>Color Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_NODE__COLOR_CODE = TemplatesPackage.LOCATION__COLOR_CODE;

	/**
	 * The feature id for the '<em><b>Parent Template</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_NODE__PARENT_TEMPLATE = TemplatesPackage.LOCATION__PARENT_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_NODE__INVARIANT = TemplatesPackage.LOCATION__INVARIANT;

	/**
	 * The feature id for the '<em><b>Location Time Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_NODE__LOCATION_TIME_KIND = TemplatesPackage.LOCATION__LOCATION_TIME_KIND;

	/**
	 * The number of structural features of the '<em>Chance Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_NODE_FEATURE_COUNT = TemplatesPackage.LOCATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.uppaalSMC.impl.ChanceEdgeImpl <em>Chance Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.ChanceEdgeImpl
	 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.UppaalSMCPackageImpl#getChanceEdge()
	 * @generated
	 */
	int CHANCE_EDGE = 3;

	/**
	 * The feature id for the '<em><b>Bend Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_EDGE__BEND_POINT = TemplatesPackage.EDGE__BEND_POINT;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_EDGE__COMMENT = TemplatesPackage.EDGE__COMMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_EDGE__COLOR = TemplatesPackage.EDGE__COLOR;

	/**
	 * The feature id for the '<em><b>Color Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_EDGE__COLOR_CODE = TemplatesPackage.EDGE__COLOR_CODE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_EDGE__SOURCE = TemplatesPackage.EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_EDGE__TARGET = TemplatesPackage.EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Parent Template</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_EDGE__PARENT_TEMPLATE = TemplatesPackage.EDGE__PARENT_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_EDGE__GUARD = TemplatesPackage.EDGE__GUARD;

	/**
	 * The feature id for the '<em><b>Update</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_EDGE__UPDATE = TemplatesPackage.EDGE__UPDATE;

	/**
	 * The feature id for the '<em><b>Synchronization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_EDGE__SYNCHRONIZATION = TemplatesPackage.EDGE__SYNCHRONIZATION;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_EDGE__SELECTION = TemplatesPackage.EDGE__SELECTION;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_EDGE__WEIGHT = TemplatesPackage.EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chance Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANCE_EDGE_FEATURE_COUNT = TemplatesPackage.EDGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.uppaalSMC.impl.ExponentialLocationImpl <em>Exponential Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.ExponentialLocationImpl
	 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.UppaalSMCPackageImpl#getExponentialLocation()
	 * @generated
	 */
	int EXPONENTIAL_LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_LOCATION__NAME = TemplatesPackage.LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_LOCATION__COMMENT = TemplatesPackage.LOCATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_LOCATION__POSITION = TemplatesPackage.LOCATION__POSITION;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_LOCATION__COLOR = TemplatesPackage.LOCATION__COLOR;

	/**
	 * The feature id for the '<em><b>Color Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_LOCATION__COLOR_CODE = TemplatesPackage.LOCATION__COLOR_CODE;

	/**
	 * The feature id for the '<em><b>Parent Template</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_LOCATION__PARENT_TEMPLATE = TemplatesPackage.LOCATION__PARENT_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_LOCATION__INVARIANT = TemplatesPackage.LOCATION__INVARIANT;

	/**
	 * The feature id for the '<em><b>Location Time Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_LOCATION__LOCATION_TIME_KIND = TemplatesPackage.LOCATION__LOCATION_TIME_KIND;

	/**
	 * The feature id for the '<em><b>Exit Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_LOCATION__EXIT_RATE = TemplatesPackage.LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exponential Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_LOCATION_FEATURE_COUNT = TemplatesPackage.LOCATION_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.uppaalSMC.NSTA <em>NSTA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NSTA</em>'.
	 * @see nl.utwente.ewi.fmt.uppaalSMC.NSTA
	 * @generated
	 */
	EClass getNSTA();

	/**
	 * Returns the meta object for the containment reference '{@link nl.utwente.ewi.fmt.uppaalSMC.NSTA#getDouble <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Double</em>'.
	 * @see nl.utwente.ewi.fmt.uppaalSMC.NSTA#getDouble()
	 * @see #getNSTA()
	 * @generated
	 */
	EReference getNSTA_Double();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.uppaalSMC.DoubleType <em>Double Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Type</em>'.
	 * @see nl.utwente.ewi.fmt.uppaalSMC.DoubleType
	 * @generated
	 */
	EClass getDoubleType();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.uppaalSMC.ChanceNode <em>Chance Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chance Node</em>'.
	 * @see nl.utwente.ewi.fmt.uppaalSMC.ChanceNode
	 * @generated
	 */
	EClass getChanceNode();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.uppaalSMC.ChanceEdge <em>Chance Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chance Edge</em>'.
	 * @see nl.utwente.ewi.fmt.uppaalSMC.ChanceEdge
	 * @generated
	 */
	EClass getChanceEdge();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.uppaalSMC.ChanceEdge#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see nl.utwente.ewi.fmt.uppaalSMC.ChanceEdge#getWeight()
	 * @see #getChanceEdge()
	 * @generated
	 */
	EAttribute getChanceEdge_Weight();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.uppaalSMC.ExponentialLocation <em>Exponential Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential Location</em>'.
	 * @see nl.utwente.ewi.fmt.uppaalSMC.ExponentialLocation
	 * @generated
	 */
	EClass getExponentialLocation();

	/**
	 * Returns the meta object for the containment reference '{@link nl.utwente.ewi.fmt.uppaalSMC.ExponentialLocation#getExitRate <em>Exit Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit Rate</em>'.
	 * @see nl.utwente.ewi.fmt.uppaalSMC.ExponentialLocation#getExitRate()
	 * @see #getExponentialLocation()
	 * @generated
	 */
	EReference getExponentialLocation_ExitRate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UppaalSMCFactory getUppaalSMCFactory();

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
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.uppaalSMC.impl.NSTAImpl <em>NSTA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.NSTAImpl
		 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.UppaalSMCPackageImpl#getNSTA()
		 * @generated
		 */
		EClass NSTA = eINSTANCE.getNSTA();

		/**
		 * The meta object literal for the '<em><b>Double</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NSTA__DOUBLE = eINSTANCE.getNSTA_Double();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.uppaalSMC.impl.DoubleTypeImpl <em>Double Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.DoubleTypeImpl
		 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.UppaalSMCPackageImpl#getDoubleType()
		 * @generated
		 */
		EClass DOUBLE_TYPE = eINSTANCE.getDoubleType();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.uppaalSMC.impl.ChanceNodeImpl <em>Chance Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.ChanceNodeImpl
		 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.UppaalSMCPackageImpl#getChanceNode()
		 * @generated
		 */
		EClass CHANCE_NODE = eINSTANCE.getChanceNode();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.uppaalSMC.impl.ChanceEdgeImpl <em>Chance Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.ChanceEdgeImpl
		 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.UppaalSMCPackageImpl#getChanceEdge()
		 * @generated
		 */
		EClass CHANCE_EDGE = eINSTANCE.getChanceEdge();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANCE_EDGE__WEIGHT = eINSTANCE.getChanceEdge_Weight();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.uppaalSMC.impl.ExponentialLocationImpl <em>Exponential Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.ExponentialLocationImpl
		 * @see nl.utwente.ewi.fmt.uppaalSMC.impl.UppaalSMCPackageImpl#getExponentialLocation()
		 * @generated
		 */
		EClass EXPONENTIAL_LOCATION = eINSTANCE.getExponentialLocation();

		/**
		 * The meta object literal for the '<em><b>Exit Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPONENTIAL_LOCATION__EXIT_RATE = eINSTANCE.getExponentialLocation_ExitRate();

	}

} //UppaalSMCPackage
