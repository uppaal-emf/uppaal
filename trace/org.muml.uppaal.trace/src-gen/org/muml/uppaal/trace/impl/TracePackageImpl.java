/**
 */
package org.muml.uppaal.trace.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.uppaal.core.CorePackage;
import org.muml.uppaal.declarations.DeclarationsPackage;
import org.muml.uppaal.expressions.ExpressionsPackage;
import org.muml.uppaal.statements.StatementsPackage;
import org.muml.uppaal.templates.TemplatesPackage;
import org.muml.uppaal.trace.ActionTransition;
import org.muml.uppaal.trace.ChannelSynchronization;
import org.muml.uppaal.trace.CompareOperator;
import org.muml.uppaal.trace.DelayTransition;
import org.muml.uppaal.trace.EdgeActivity;
import org.muml.uppaal.trace.LocationActivity;
import org.muml.uppaal.trace.NamedElementReference;
import org.muml.uppaal.trace.ProcessIdentifier;
import org.muml.uppaal.trace.Result;
import org.muml.uppaal.trace.SingleNamedElementReference;
import org.muml.uppaal.trace.State;
import org.muml.uppaal.trace.Synchronization;
import org.muml.uppaal.trace.Trace;
import org.muml.uppaal.trace.TraceFactory;
import org.muml.uppaal.trace.TraceItem;
import org.muml.uppaal.trace.TracePackage;
import org.muml.uppaal.trace.TraceRepository;
import org.muml.uppaal.trace.Transition;
import org.muml.uppaal.trace.VariableValue;
import org.muml.uppaal.types.TypesPackage;
import org.muml.uppaal.visuals.VisualsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TracePackageImpl extends EPackageImpl implements TracePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass traceRepositoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass traceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processIdentifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass locationActivityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleNamedElementReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedElementReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass traceItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass edgeActivityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass synchronizationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass channelSynchronizationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass delayTransitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionTransitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum resultEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum compareOperatorEEnum = null;

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
   * @see org.muml.uppaal.trace.TracePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TracePackageImpl()
  {
    super(eNS_URI, TraceFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link TracePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TracePackage init()
  {
    if (isInited) return (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);

    // Obtain or create and register package
    TracePackageImpl theTracePackage = (TracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TracePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    CorePackage.eINSTANCE.eClass();
    DeclarationsPackage.eINSTANCE.eClass();
    TemplatesPackage.eINSTANCE.eClass();
    TypesPackage.eINSTANCE.eClass();
    StatementsPackage.eINSTANCE.eClass();
    ExpressionsPackage.eINSTANCE.eClass();
    VisualsPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theTracePackage.createPackageContents();

    // Initialize created meta-data
    theTracePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTracePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TracePackage.eNS_URI, theTracePackage);
    return theTracePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTraceRepository()
  {
    return traceRepositoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTraceRepository_Traces()
  {
    return (EReference)traceRepositoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrace()
  {
    return traceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrace_Property()
  {
    return (EAttribute)traceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrace_Line()
  {
    return (EAttribute)traceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrace_Result()
  {
    return (EAttribute)traceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrace_TraceItems()
  {
    return (EReference)traceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessIdentifier()
  {
    return processIdentifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcessIdentifier_Template()
  {
    return (EReference)processIdentifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcessIdentifier_Arguments()
  {
    return (EAttribute)processIdentifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocationActivity()
  {
    return locationActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocationActivity_Process()
  {
    return (EReference)locationActivityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocationActivity_Location()
  {
    return (EReference)locationActivityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableValue()
  {
    return variableValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableValue_FirstNamedElementReference()
  {
    return (EReference)variableValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableValue_SecondNamedElementReference()
  {
    return (EReference)variableValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableValue_Operator()
  {
    return (EAttribute)variableValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableValue_Value()
  {
    return (EAttribute)variableValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleNamedElementReference()
  {
    return singleNamedElementReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleNamedElementReference_NamedElement()
  {
    return (EReference)singleNamedElementReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSingleNamedElementReference_Indexes()
  {
    return (EAttribute)singleNamedElementReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedElementReference()
  {
    return namedElementReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedElementReference_SingleNamedElementReference()
  {
    return (EReference)namedElementReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedElementReference_NamedElementReference()
  {
    return (EReference)namedElementReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTraceItem()
  {
    return traceItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getState()
  {
    return stateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_LocationActivities()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_VariableValues()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEdgeActivity()
  {
    return edgeActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEdgeActivity_Source()
  {
    return (EReference)edgeActivityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEdgeActivity_Target()
  {
    return (EReference)edgeActivityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEdgeActivity_Details()
  {
    return (EAttribute)edgeActivityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSynchronization()
  {
    return synchronizationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChannelSynchronization()
  {
    return channelSynchronizationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChannelSynchronization_Channel()
  {
    return (EReference)channelSynchronizationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChannelSynchronization_Kind()
  {
    return (EAttribute)channelSynchronizationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDelayTransition()
  {
    return delayTransitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDelayTransition_Duration()
  {
    return (EAttribute)delayTransitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionTransition()
  {
    return actionTransitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionTransition_EdgeActivities()
  {
    return (EReference)actionTransitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransition()
  {
    return transitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getResult()
  {
    return resultEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCompareOperator()
  {
    return compareOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraceFactory getTraceFactory()
  {
    return (TraceFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    traceRepositoryEClass = createEClass(TRACE_REPOSITORY);
    createEReference(traceRepositoryEClass, TRACE_REPOSITORY__TRACES);

    traceEClass = createEClass(TRACE);
    createEAttribute(traceEClass, TRACE__PROPERTY);
    createEAttribute(traceEClass, TRACE__LINE);
    createEAttribute(traceEClass, TRACE__RESULT);
    createEReference(traceEClass, TRACE__TRACE_ITEMS);

    processIdentifierEClass = createEClass(PROCESS_IDENTIFIER);
    createEReference(processIdentifierEClass, PROCESS_IDENTIFIER__TEMPLATE);
    createEAttribute(processIdentifierEClass, PROCESS_IDENTIFIER__ARGUMENTS);

    locationActivityEClass = createEClass(LOCATION_ACTIVITY);
    createEReference(locationActivityEClass, LOCATION_ACTIVITY__PROCESS);
    createEReference(locationActivityEClass, LOCATION_ACTIVITY__LOCATION);

    variableValueEClass = createEClass(VARIABLE_VALUE);
    createEReference(variableValueEClass, VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE);
    createEReference(variableValueEClass, VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE);
    createEAttribute(variableValueEClass, VARIABLE_VALUE__OPERATOR);
    createEAttribute(variableValueEClass, VARIABLE_VALUE__VALUE);

    singleNamedElementReferenceEClass = createEClass(SINGLE_NAMED_ELEMENT_REFERENCE);
    createEReference(singleNamedElementReferenceEClass, SINGLE_NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT);
    createEAttribute(singleNamedElementReferenceEClass, SINGLE_NAMED_ELEMENT_REFERENCE__INDEXES);

    namedElementReferenceEClass = createEClass(NAMED_ELEMENT_REFERENCE);
    createEReference(namedElementReferenceEClass, NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE);
    createEReference(namedElementReferenceEClass, NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE);

    traceItemEClass = createEClass(TRACE_ITEM);

    stateEClass = createEClass(STATE);
    createEReference(stateEClass, STATE__LOCATION_ACTIVITIES);
    createEReference(stateEClass, STATE__VARIABLE_VALUES);

    edgeActivityEClass = createEClass(EDGE_ACTIVITY);
    createEReference(edgeActivityEClass, EDGE_ACTIVITY__SOURCE);
    createEReference(edgeActivityEClass, EDGE_ACTIVITY__TARGET);
    createEAttribute(edgeActivityEClass, EDGE_ACTIVITY__DETAILS);

    synchronizationEClass = createEClass(SYNCHRONIZATION);

    channelSynchronizationEClass = createEClass(CHANNEL_SYNCHRONIZATION);
    createEReference(channelSynchronizationEClass, CHANNEL_SYNCHRONIZATION__CHANNEL);
    createEAttribute(channelSynchronizationEClass, CHANNEL_SYNCHRONIZATION__KIND);

    delayTransitionEClass = createEClass(DELAY_TRANSITION);
    createEAttribute(delayTransitionEClass, DELAY_TRANSITION__DURATION);

    actionTransitionEClass = createEClass(ACTION_TRANSITION);
    createEReference(actionTransitionEClass, ACTION_TRANSITION__EDGE_ACTIVITIES);

    transitionEClass = createEClass(TRANSITION);

    // Create enums
    resultEEnum = createEEnum(RESULT);
    compareOperatorEEnum = createEEnum(COMPARE_OPERATOR);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TemplatesPackage theTemplatesPackage = (TemplatesPackage)EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI);
    CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
    DeclarationsPackage theDeclarationsPackage = (DeclarationsPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    stateEClass.getESuperTypes().add(this.getTraceItem());
    channelSynchronizationEClass.getESuperTypes().add(this.getSynchronization());
    delayTransitionEClass.getESuperTypes().add(this.getTransition());
    actionTransitionEClass.getESuperTypes().add(this.getTransition());
    transitionEClass.getESuperTypes().add(this.getTraceItem());

    // Initialize classes and features; add operations and parameters
    initEClass(traceRepositoryEClass, TraceRepository.class, "TraceRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTraceRepository_Traces(), this.getTrace(), null, "traces", null, 0, -1, TraceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTrace_Property(), ecorePackage.getEInt(), "property", null, 0, 1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTrace_Line(), ecorePackage.getEInt(), "line", null, 0, 1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTrace_Result(), this.getResult(), "result", null, 0, 1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrace_TraceItems(), this.getTraceItem(), null, "traceItems", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processIdentifierEClass, ProcessIdentifier.class, "ProcessIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcessIdentifier_Template(), theTemplatesPackage.getAbstractTemplate(), null, "template", null, 0, 1, ProcessIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProcessIdentifier_Arguments(), ecorePackage.getEInt(), "arguments", null, 0, -1, ProcessIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(locationActivityEClass, LocationActivity.class, "LocationActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocationActivity_Process(), this.getProcessIdentifier(), null, "process", null, 0, 1, LocationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocationActivity_Location(), theTemplatesPackage.getLocation(), null, "location", null, 0, 1, LocationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableValueEClass, VariableValue.class, "VariableValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableValue_FirstNamedElementReference(), this.getNamedElementReference(), null, "firstNamedElementReference", null, 0, 1, VariableValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableValue_SecondNamedElementReference(), this.getNamedElementReference(), null, "secondNamedElementReference", null, 0, 1, VariableValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableValue_Operator(), this.getCompareOperator(), "operator", null, 0, 1, VariableValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, VariableValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleNamedElementReferenceEClass, SingleNamedElementReference.class, "SingleNamedElementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSingleNamedElementReference_NamedElement(), theCorePackage.getNamedElement(), null, "namedElement", null, 0, 1, SingleNamedElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSingleNamedElementReference_Indexes(), ecorePackage.getEInt(), "indexes", null, 0, -1, SingleNamedElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedElementReferenceEClass, NamedElementReference.class, "NamedElementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamedElementReference_SingleNamedElementReference(), this.getSingleNamedElementReference(), null, "singleNamedElementReference", null, 0, 1, NamedElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamedElementReference_NamedElementReference(), this.getNamedElementReference(), null, "namedElementReference", null, 0, 1, NamedElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(traceItemEClass, TraceItem.class, "TraceItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getState_LocationActivities(), this.getLocationActivity(), null, "locationActivities", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_VariableValues(), this.getVariableValue(), null, "variableValues", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(edgeActivityEClass, EdgeActivity.class, "EdgeActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEdgeActivity_Source(), this.getLocationActivity(), null, "source", null, 0, 1, EdgeActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEdgeActivity_Target(), this.getLocationActivity(), null, "target", null, 0, 1, EdgeActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEdgeActivity_Details(), ecorePackage.getEString(), "details", null, 0, 1, EdgeActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(synchronizationEClass, Synchronization.class, "Synchronization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(channelSynchronizationEClass, ChannelSynchronization.class, "ChannelSynchronization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChannelSynchronization_Channel(), theDeclarationsPackage.getVariable(), null, "channel", null, 0, 1, ChannelSynchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChannelSynchronization_Kind(), theTemplatesPackage.getSynchronizationKind(), "kind", null, 0, 1, ChannelSynchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(delayTransitionEClass, DelayTransition.class, "DelayTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDelayTransition_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, DelayTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionTransitionEClass, ActionTransition.class, "ActionTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActionTransition_EdgeActivities(), this.getEdgeActivity(), null, "edgeActivities", null, 0, -1, ActionTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(resultEEnum, Result.class, "Result");
    addEEnumLiteral(resultEEnum, Result.SUCCESS);
    addEEnumLiteral(resultEEnum, Result.FAILURE);

    initEEnum(compareOperatorEEnum, CompareOperator.class, "CompareOperator");
    addEEnumLiteral(compareOperatorEEnum, CompareOperator.EQ);
    addEEnumLiteral(compareOperatorEEnum, CompareOperator.LEQ);
    addEEnumLiteral(compareOperatorEEnum, CompareOperator.GEQ);

    // Create resource
    createResource(eNS_URI);
  }

} //TracePackageImpl
