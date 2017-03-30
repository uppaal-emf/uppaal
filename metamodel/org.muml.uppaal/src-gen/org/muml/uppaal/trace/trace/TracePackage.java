/**
 */
package org.muml.uppaal.trace.trace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.muml.uppaal.trace.trace.TraceFactory
 * @model kind="package"
 * @generated
 */
public interface TracePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "trace";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.muml.org/uppaal/trace/1.0.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "trace";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TracePackage eINSTANCE = org.muml.uppaal.trace.trace.impl.TracePackageImpl.init();

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.trace.impl.TraceRepositoryImpl <em>Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.trace.impl.TraceRepositoryImpl
   * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getTraceRepository()
   * @generated
   */
  int TRACE_REPOSITORY = 0;

  /**
   * The feature id for the '<em><b>Traces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_REPOSITORY__TRACES = 0;

  /**
   * The number of structural features of the '<em>Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_REPOSITORY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.trace.impl.TraceImpl <em>Trace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.trace.impl.TraceImpl
   * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getTrace()
   * @generated
   */
  int TRACE = 1;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE__PROPERTY = 0;

  /**
   * The feature id for the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE__LINE = 1;

  /**
   * The feature id for the '<em><b>Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE__RESULT = 2;

  /**
   * The feature id for the '<em><b>Trace Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE__TRACE_ITEMS = 3;

  /**
   * The number of structural features of the '<em>Trace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.trace.impl.ProcessIdentifierImpl <em>Process Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.trace.impl.ProcessIdentifierImpl
   * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getProcessIdentifier()
   * @generated
   */
  int PROCESS_IDENTIFIER = 2;

  /**
   * The feature id for the '<em><b>Template</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_IDENTIFIER__TEMPLATE = 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_IDENTIFIER__ARGUMENTS = 1;

  /**
   * The number of structural features of the '<em>Process Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_IDENTIFIER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.trace.impl.LocationActivityImpl <em>Location Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.trace.impl.LocationActivityImpl
   * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getLocationActivity()
   * @generated
   */
  int LOCATION_ACTIVITY = 3;

  /**
   * The feature id for the '<em><b>Process</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_ACTIVITY__PROCESS = 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_ACTIVITY__LOCATION = 1;

  /**
   * The number of structural features of the '<em>Location Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_ACTIVITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.trace.impl.VariableValueImpl <em>Variable Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.trace.impl.VariableValueImpl
   * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getVariableValue()
   * @generated
   */
  int VARIABLE_VALUE = 4;

  /**
   * The feature id for the '<em><b>First Named Element Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Second Named Element Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE = 1;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_VALUE__OPERATOR = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_VALUE__VALUE = 3;

  /**
   * The number of structural features of the '<em>Variable Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_VALUE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.trace.impl.SingleNamedElementReferenceImpl <em>Single Named Element Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.trace.impl.SingleNamedElementReferenceImpl
   * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getSingleNamedElementReference()
   * @generated
   */
  int SINGLE_NAMED_ELEMENT_REFERENCE = 5;

  /**
   * The feature id for the '<em><b>Named Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Indexes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_NAMED_ELEMENT_REFERENCE__INDEXES = 1;

  /**
   * The number of structural features of the '<em>Single Named Element Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_NAMED_ELEMENT_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.trace.impl.NamedElementReferenceImpl <em>Named Element Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.trace.impl.NamedElementReferenceImpl
   * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getNamedElementReference()
   * @generated
   */
  int NAMED_ELEMENT_REFERENCE = 6;

  /**
   * The feature id for the '<em><b>Single Named Element Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Named Element Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE = 1;

  /**
   * The number of structural features of the '<em>Named Element Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.trace.impl.TraceItemImpl <em>Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.trace.impl.TraceItemImpl
   * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getTraceItem()
   * @generated
   */
  int TRACE_ITEM = 7;

  /**
   * The number of structural features of the '<em>Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.trace.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.trace.impl.StateImpl
   * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getState()
   * @generated
   */
  int STATE = 8;

  /**
   * The feature id for the '<em><b>Location Activities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__LOCATION_ACTIVITIES = TRACE_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__VARIABLE_VALUES = TRACE_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = TRACE_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.trace.impl.EdgeActivityImpl <em>Edge Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.trace.impl.EdgeActivityImpl
   * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getEdgeActivity()
   * @generated
   */
  int EDGE_ACTIVITY = 9;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ACTIVITY__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ACTIVITY__TARGET = 1;

  /**
   * The feature id for the '<em><b>Details</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ACTIVITY__DETAILS = 2;

  /**
   * The number of structural features of the '<em>Edge Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ACTIVITY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.trace.impl.SynchronizationImpl <em>Synchronization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.trace.impl.SynchronizationImpl
   * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getSynchronization()
   * @generated
   */
  int SYNCHRONIZATION = 10;

  /**
   * The number of structural features of the '<em>Synchronization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.trace.impl.ChannelSynchronizationImpl <em>Channel Synchronization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.trace.impl.ChannelSynchronizationImpl
   * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getChannelSynchronization()
   * @generated
   */
  int CHANNEL_SYNCHRONIZATION = 11;

  /**
   * The feature id for the '<em><b>Channel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL_SYNCHRONIZATION__CHANNEL = SYNCHRONIZATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL_SYNCHRONIZATION__KIND = SYNCHRONIZATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Channel Synchronization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL_SYNCHRONIZATION_FEATURE_COUNT = SYNCHRONIZATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.trace.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.trace.impl.TransitionImpl
   * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 14;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = TRACE_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.trace.impl.DelayTransitionImpl <em>Delay Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.trace.impl.DelayTransitionImpl
   * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getDelayTransition()
   * @generated
   */
  int DELAY_TRANSITION = 12;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_TRANSITION__DURATION = TRANSITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Delay Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.trace.impl.ActionTransitionImpl <em>Action Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.trace.impl.ActionTransitionImpl
   * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getActionTransition()
   * @generated
   */
  int ACTION_TRANSITION = 13;

  /**
   * The feature id for the '<em><b>Edge Activities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TRANSITION__EDGE_ACTIVITIES = TRANSITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Action Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.trace.Result <em>Result</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.trace.Result
   * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getResult()
   * @generated
   */
  int RESULT = 15;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.trace.CompareOperator <em>Compare Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.trace.CompareOperator
   * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getCompareOperator()
   * @generated
   */
  int COMPARE_OPERATOR = 16;


  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.trace.TraceRepository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repository</em>'.
   * @see org.muml.uppaal.trace.trace.TraceRepository
   * @generated
   */
  EClass getTraceRepository();

  /**
   * Returns the meta object for the containment reference list '{@link org.muml.uppaal.trace.trace.TraceRepository#getTraces <em>Traces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Traces</em>'.
   * @see org.muml.uppaal.trace.trace.TraceRepository#getTraces()
   * @see #getTraceRepository()
   * @generated
   */
  EReference getTraceRepository_Traces();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.trace.Trace <em>Trace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trace</em>'.
   * @see org.muml.uppaal.trace.trace.Trace
   * @generated
   */
  EClass getTrace();

  /**
   * Returns the meta object for the attribute '{@link org.muml.uppaal.trace.trace.Trace#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see org.muml.uppaal.trace.trace.Trace#getProperty()
   * @see #getTrace()
   * @generated
   */
  EAttribute getTrace_Property();

  /**
   * Returns the meta object for the attribute '{@link org.muml.uppaal.trace.trace.Trace#getLine <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line</em>'.
   * @see org.muml.uppaal.trace.trace.Trace#getLine()
   * @see #getTrace()
   * @generated
   */
  EAttribute getTrace_Line();

  /**
   * Returns the meta object for the attribute '{@link org.muml.uppaal.trace.trace.Trace#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Result</em>'.
   * @see org.muml.uppaal.trace.trace.Trace#getResult()
   * @see #getTrace()
   * @generated
   */
  EAttribute getTrace_Result();

  /**
   * Returns the meta object for the containment reference list '{@link org.muml.uppaal.trace.trace.Trace#getTraceItems <em>Trace Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trace Items</em>'.
   * @see org.muml.uppaal.trace.trace.Trace#getTraceItems()
   * @see #getTrace()
   * @generated
   */
  EReference getTrace_TraceItems();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.trace.ProcessIdentifier <em>Process Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Identifier</em>'.
   * @see org.muml.uppaal.trace.trace.ProcessIdentifier
   * @generated
   */
  EClass getProcessIdentifier();

  /**
   * Returns the meta object for the reference '{@link org.muml.uppaal.trace.trace.ProcessIdentifier#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Template</em>'.
   * @see org.muml.uppaal.trace.trace.ProcessIdentifier#getTemplate()
   * @see #getProcessIdentifier()
   * @generated
   */
  EReference getProcessIdentifier_Template();

  /**
   * Returns the meta object for the attribute list '{@link org.muml.uppaal.trace.trace.ProcessIdentifier#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Arguments</em>'.
   * @see org.muml.uppaal.trace.trace.ProcessIdentifier#getArguments()
   * @see #getProcessIdentifier()
   * @generated
   */
  EAttribute getProcessIdentifier_Arguments();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.trace.LocationActivity <em>Location Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Location Activity</em>'.
   * @see org.muml.uppaal.trace.trace.LocationActivity
   * @generated
   */
  EClass getLocationActivity();

  /**
   * Returns the meta object for the containment reference '{@link org.muml.uppaal.trace.trace.LocationActivity#getProcess <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Process</em>'.
   * @see org.muml.uppaal.trace.trace.LocationActivity#getProcess()
   * @see #getLocationActivity()
   * @generated
   */
  EReference getLocationActivity_Process();

  /**
   * Returns the meta object for the reference '{@link org.muml.uppaal.trace.trace.LocationActivity#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Location</em>'.
   * @see org.muml.uppaal.trace.trace.LocationActivity#getLocation()
   * @see #getLocationActivity()
   * @generated
   */
  EReference getLocationActivity_Location();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.trace.VariableValue <em>Variable Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Value</em>'.
   * @see org.muml.uppaal.trace.trace.VariableValue
   * @generated
   */
  EClass getVariableValue();

  /**
   * Returns the meta object for the containment reference '{@link org.muml.uppaal.trace.trace.VariableValue#getFirstNamedElementReference <em>First Named Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First Named Element Reference</em>'.
   * @see org.muml.uppaal.trace.trace.VariableValue#getFirstNamedElementReference()
   * @see #getVariableValue()
   * @generated
   */
  EReference getVariableValue_FirstNamedElementReference();

  /**
   * Returns the meta object for the containment reference '{@link org.muml.uppaal.trace.trace.VariableValue#getSecondNamedElementReference <em>Second Named Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second Named Element Reference</em>'.
   * @see org.muml.uppaal.trace.trace.VariableValue#getSecondNamedElementReference()
   * @see #getVariableValue()
   * @generated
   */
  EReference getVariableValue_SecondNamedElementReference();

  /**
   * Returns the meta object for the attribute '{@link org.muml.uppaal.trace.trace.VariableValue#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.muml.uppaal.trace.trace.VariableValue#getOperator()
   * @see #getVariableValue()
   * @generated
   */
  EAttribute getVariableValue_Operator();

  /**
   * Returns the meta object for the attribute '{@link org.muml.uppaal.trace.trace.VariableValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.muml.uppaal.trace.trace.VariableValue#getValue()
   * @see #getVariableValue()
   * @generated
   */
  EAttribute getVariableValue_Value();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.trace.SingleNamedElementReference <em>Single Named Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Named Element Reference</em>'.
   * @see org.muml.uppaal.trace.trace.SingleNamedElementReference
   * @generated
   */
  EClass getSingleNamedElementReference();

  /**
   * Returns the meta object for the reference '{@link org.muml.uppaal.trace.trace.SingleNamedElementReference#getNamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Named Element</em>'.
   * @see org.muml.uppaal.trace.trace.SingleNamedElementReference#getNamedElement()
   * @see #getSingleNamedElementReference()
   * @generated
   */
  EReference getSingleNamedElementReference_NamedElement();

  /**
   * Returns the meta object for the attribute list '{@link org.muml.uppaal.trace.trace.SingleNamedElementReference#getIndexes <em>Indexes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Indexes</em>'.
   * @see org.muml.uppaal.trace.trace.SingleNamedElementReference#getIndexes()
   * @see #getSingleNamedElementReference()
   * @generated
   */
  EAttribute getSingleNamedElementReference_Indexes();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.trace.NamedElementReference <em>Named Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element Reference</em>'.
   * @see org.muml.uppaal.trace.trace.NamedElementReference
   * @generated
   */
  EClass getNamedElementReference();

  /**
   * Returns the meta object for the containment reference '{@link org.muml.uppaal.trace.trace.NamedElementReference#getSingleNamedElementReference <em>Single Named Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Single Named Element Reference</em>'.
   * @see org.muml.uppaal.trace.trace.NamedElementReference#getSingleNamedElementReference()
   * @see #getNamedElementReference()
   * @generated
   */
  EReference getNamedElementReference_SingleNamedElementReference();

  /**
   * Returns the meta object for the containment reference '{@link org.muml.uppaal.trace.trace.NamedElementReference#getNamedElementReference <em>Named Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Named Element Reference</em>'.
   * @see org.muml.uppaal.trace.trace.NamedElementReference#getNamedElementReference()
   * @see #getNamedElementReference()
   * @generated
   */
  EReference getNamedElementReference_NamedElementReference();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.trace.TraceItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item</em>'.
   * @see org.muml.uppaal.trace.trace.TraceItem
   * @generated
   */
  EClass getTraceItem();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.trace.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.muml.uppaal.trace.trace.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the containment reference list '{@link org.muml.uppaal.trace.trace.State#getLocationActivities <em>Location Activities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Location Activities</em>'.
   * @see org.muml.uppaal.trace.trace.State#getLocationActivities()
   * @see #getState()
   * @generated
   */
  EReference getState_LocationActivities();

  /**
   * Returns the meta object for the containment reference list '{@link org.muml.uppaal.trace.trace.State#getVariableValues <em>Variable Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable Values</em>'.
   * @see org.muml.uppaal.trace.trace.State#getVariableValues()
   * @see #getState()
   * @generated
   */
  EReference getState_VariableValues();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.trace.EdgeActivity <em>Edge Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge Activity</em>'.
   * @see org.muml.uppaal.trace.trace.EdgeActivity
   * @generated
   */
  EClass getEdgeActivity();

  /**
   * Returns the meta object for the containment reference '{@link org.muml.uppaal.trace.trace.EdgeActivity#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see org.muml.uppaal.trace.trace.EdgeActivity#getSource()
   * @see #getEdgeActivity()
   * @generated
   */
  EReference getEdgeActivity_Source();

  /**
   * Returns the meta object for the containment reference '{@link org.muml.uppaal.trace.trace.EdgeActivity#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.muml.uppaal.trace.trace.EdgeActivity#getTarget()
   * @see #getEdgeActivity()
   * @generated
   */
  EReference getEdgeActivity_Target();

  /**
   * Returns the meta object for the attribute '{@link org.muml.uppaal.trace.trace.EdgeActivity#getDetails <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Details</em>'.
   * @see org.muml.uppaal.trace.trace.EdgeActivity#getDetails()
   * @see #getEdgeActivity()
   * @generated
   */
  EAttribute getEdgeActivity_Details();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.trace.Synchronization <em>Synchronization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Synchronization</em>'.
   * @see org.muml.uppaal.trace.trace.Synchronization
   * @generated
   */
  EClass getSynchronization();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.trace.ChannelSynchronization <em>Channel Synchronization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Channel Synchronization</em>'.
   * @see org.muml.uppaal.trace.trace.ChannelSynchronization
   * @generated
   */
  EClass getChannelSynchronization();

  /**
   * Returns the meta object for the reference '{@link org.muml.uppaal.trace.trace.ChannelSynchronization#getChannel <em>Channel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Channel</em>'.
   * @see org.muml.uppaal.trace.trace.ChannelSynchronization#getChannel()
   * @see #getChannelSynchronization()
   * @generated
   */
  EReference getChannelSynchronization_Channel();

  /**
   * Returns the meta object for the attribute '{@link org.muml.uppaal.trace.trace.ChannelSynchronization#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.muml.uppaal.trace.trace.ChannelSynchronization#getKind()
   * @see #getChannelSynchronization()
   * @generated
   */
  EAttribute getChannelSynchronization_Kind();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.trace.DelayTransition <em>Delay Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delay Transition</em>'.
   * @see org.muml.uppaal.trace.trace.DelayTransition
   * @generated
   */
  EClass getDelayTransition();

  /**
   * Returns the meta object for the attribute '{@link org.muml.uppaal.trace.trace.DelayTransition#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see org.muml.uppaal.trace.trace.DelayTransition#getDuration()
   * @see #getDelayTransition()
   * @generated
   */
  EAttribute getDelayTransition_Duration();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.trace.ActionTransition <em>Action Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Transition</em>'.
   * @see org.muml.uppaal.trace.trace.ActionTransition
   * @generated
   */
  EClass getActionTransition();

  /**
   * Returns the meta object for the containment reference list '{@link org.muml.uppaal.trace.trace.ActionTransition#getEdgeActivities <em>Edge Activities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edge Activities</em>'.
   * @see org.muml.uppaal.trace.trace.ActionTransition#getEdgeActivities()
   * @see #getActionTransition()
   * @generated
   */
  EReference getActionTransition_EdgeActivities();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.trace.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see org.muml.uppaal.trace.trace.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for enum '{@link org.muml.uppaal.trace.trace.Result <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Result</em>'.
   * @see org.muml.uppaal.trace.trace.Result
   * @generated
   */
  EEnum getResult();

  /**
   * Returns the meta object for enum '{@link org.muml.uppaal.trace.trace.CompareOperator <em>Compare Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Compare Operator</em>'.
   * @see org.muml.uppaal.trace.trace.CompareOperator
   * @generated
   */
  EEnum getCompareOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TraceFactory getTraceFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.trace.impl.TraceRepositoryImpl <em>Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.trace.impl.TraceRepositoryImpl
     * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getTraceRepository()
     * @generated
     */
    EClass TRACE_REPOSITORY = eINSTANCE.getTraceRepository();

    /**
     * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACE_REPOSITORY__TRACES = eINSTANCE.getTraceRepository_Traces();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.trace.impl.TraceImpl <em>Trace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.trace.impl.TraceImpl
     * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getTrace()
     * @generated
     */
    EClass TRACE = eINSTANCE.getTrace();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRACE__PROPERTY = eINSTANCE.getTrace_Property();

    /**
     * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRACE__LINE = eINSTANCE.getTrace_Line();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRACE__RESULT = eINSTANCE.getTrace_Result();

    /**
     * The meta object literal for the '<em><b>Trace Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACE__TRACE_ITEMS = eINSTANCE.getTrace_TraceItems();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.trace.impl.ProcessIdentifierImpl <em>Process Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.trace.impl.ProcessIdentifierImpl
     * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getProcessIdentifier()
     * @generated
     */
    EClass PROCESS_IDENTIFIER = eINSTANCE.getProcessIdentifier();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_IDENTIFIER__TEMPLATE = eINSTANCE.getProcessIdentifier_Template();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS_IDENTIFIER__ARGUMENTS = eINSTANCE.getProcessIdentifier_Arguments();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.trace.impl.LocationActivityImpl <em>Location Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.trace.impl.LocationActivityImpl
     * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getLocationActivity()
     * @generated
     */
    EClass LOCATION_ACTIVITY = eINSTANCE.getLocationActivity();

    /**
     * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCATION_ACTIVITY__PROCESS = eINSTANCE.getLocationActivity_Process();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCATION_ACTIVITY__LOCATION = eINSTANCE.getLocationActivity_Location();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.trace.impl.VariableValueImpl <em>Variable Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.trace.impl.VariableValueImpl
     * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getVariableValue()
     * @generated
     */
    EClass VARIABLE_VALUE = eINSTANCE.getVariableValue();

    /**
     * The meta object literal for the '<em><b>First Named Element Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE = eINSTANCE.getVariableValue_FirstNamedElementReference();

    /**
     * The meta object literal for the '<em><b>Second Named Element Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE = eINSTANCE.getVariableValue_SecondNamedElementReference();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_VALUE__OPERATOR = eINSTANCE.getVariableValue_Operator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_VALUE__VALUE = eINSTANCE.getVariableValue_Value();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.trace.impl.SingleNamedElementReferenceImpl <em>Single Named Element Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.trace.impl.SingleNamedElementReferenceImpl
     * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getSingleNamedElementReference()
     * @generated
     */
    EClass SINGLE_NAMED_ELEMENT_REFERENCE = eINSTANCE.getSingleNamedElementReference();

    /**
     * The meta object literal for the '<em><b>Named Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT = eINSTANCE.getSingleNamedElementReference_NamedElement();

    /**
     * The meta object literal for the '<em><b>Indexes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINGLE_NAMED_ELEMENT_REFERENCE__INDEXES = eINSTANCE.getSingleNamedElementReference_Indexes();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.trace.impl.NamedElementReferenceImpl <em>Named Element Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.trace.impl.NamedElementReferenceImpl
     * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getNamedElementReference()
     * @generated
     */
    EClass NAMED_ELEMENT_REFERENCE = eINSTANCE.getNamedElementReference();

    /**
     * The meta object literal for the '<em><b>Single Named Element Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE = eINSTANCE.getNamedElementReference_SingleNamedElementReference();

    /**
     * The meta object literal for the '<em><b>Named Element Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE = eINSTANCE.getNamedElementReference_NamedElementReference();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.trace.impl.TraceItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.trace.impl.TraceItemImpl
     * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getTraceItem()
     * @generated
     */
    EClass TRACE_ITEM = eINSTANCE.getTraceItem();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.trace.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.trace.impl.StateImpl
     * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Location Activities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__LOCATION_ACTIVITIES = eINSTANCE.getState_LocationActivities();

    /**
     * The meta object literal for the '<em><b>Variable Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__VARIABLE_VALUES = eINSTANCE.getState_VariableValues();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.trace.impl.EdgeActivityImpl <em>Edge Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.trace.impl.EdgeActivityImpl
     * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getEdgeActivity()
     * @generated
     */
    EClass EDGE_ACTIVITY = eINSTANCE.getEdgeActivity();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_ACTIVITY__SOURCE = eINSTANCE.getEdgeActivity_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_ACTIVITY__TARGET = eINSTANCE.getEdgeActivity_Target();

    /**
     * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_ACTIVITY__DETAILS = eINSTANCE.getEdgeActivity_Details();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.trace.impl.SynchronizationImpl <em>Synchronization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.trace.impl.SynchronizationImpl
     * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getSynchronization()
     * @generated
     */
    EClass SYNCHRONIZATION = eINSTANCE.getSynchronization();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.trace.impl.ChannelSynchronizationImpl <em>Channel Synchronization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.trace.impl.ChannelSynchronizationImpl
     * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getChannelSynchronization()
     * @generated
     */
    EClass CHANNEL_SYNCHRONIZATION = eINSTANCE.getChannelSynchronization();

    /**
     * The meta object literal for the '<em><b>Channel</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANNEL_SYNCHRONIZATION__CHANNEL = eINSTANCE.getChannelSynchronization_Channel();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHANNEL_SYNCHRONIZATION__KIND = eINSTANCE.getChannelSynchronization_Kind();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.trace.impl.DelayTransitionImpl <em>Delay Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.trace.impl.DelayTransitionImpl
     * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getDelayTransition()
     * @generated
     */
    EClass DELAY_TRANSITION = eINSTANCE.getDelayTransition();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELAY_TRANSITION__DURATION = eINSTANCE.getDelayTransition_Duration();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.trace.impl.ActionTransitionImpl <em>Action Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.trace.impl.ActionTransitionImpl
     * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getActionTransition()
     * @generated
     */
    EClass ACTION_TRANSITION = eINSTANCE.getActionTransition();

    /**
     * The meta object literal for the '<em><b>Edge Activities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_TRANSITION__EDGE_ACTIVITIES = eINSTANCE.getActionTransition_EdgeActivities();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.trace.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.trace.impl.TransitionImpl
     * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.trace.Result <em>Result</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.trace.Result
     * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getResult()
     * @generated
     */
    EEnum RESULT = eINSTANCE.getResult();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.trace.CompareOperator <em>Compare Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.trace.CompareOperator
     * @see org.muml.uppaal.trace.trace.impl.TracePackageImpl#getCompareOperator()
     * @generated
     */
    EEnum COMPARE_OPERATOR = eINSTANCE.getCompareOperator();

  }

} //TracePackage
