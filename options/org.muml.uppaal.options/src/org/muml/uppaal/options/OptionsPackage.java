/**
 */
package org.muml.uppaal.options;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.muml.core.CorePackage;

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
 * @see org.muml.uppaal.options.OptionsFactory
 * @model kind="package"
 * @generated
 */
public interface OptionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "options";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/uppaal/options/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "options";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OptionsPackage eINSTANCE = org.muml.uppaal.options.impl.OptionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.uppaal.options.impl.OptionsImpl <em>Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.options.impl.OptionsImpl
	 * @see org.muml.uppaal.options.impl.OptionsPackageImpl#getOptions()
	 * @generated
	 */
	int OPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Connector Out Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__CONNECTOR_OUT_BUFFER_SIZE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hash Table Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__HASH_TABLE_SIZE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State Space Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__STATE_SPACE_REDUCTION = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__TRACE_OPTIONS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.options.impl.CoordinationProtocolOptionsImpl <em>Coordination Protocol Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.options.impl.CoordinationProtocolOptionsImpl
	 * @see org.muml.uppaal.options.impl.OptionsPackageImpl#getCoordinationProtocolOptions()
	 * @generated
	 */
	int COORDINATION_PROTOCOL_OPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_OPTIONS__EXTENSIONS = OPTIONS__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Connector Out Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_OPTIONS__CONNECTOR_OUT_BUFFER_SIZE = OPTIONS__CONNECTOR_OUT_BUFFER_SIZE;

	/**
	 * The feature id for the '<em><b>Hash Table Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_OPTIONS__HASH_TABLE_SIZE = OPTIONS__HASH_TABLE_SIZE;

	/**
	 * The feature id for the '<em><b>State Space Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_OPTIONS__STATE_SPACE_REDUCTION = OPTIONS__STATE_SPACE_REDUCTION;

	/**
	 * The feature id for the '<em><b>Trace Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_OPTIONS__TRACE_OPTIONS = OPTIONS__TRACE_OPTIONS;

	/**
	 * The feature id for the '<em><b>Role Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_OPTIONS__ROLE_MULTIPLICITY = OPTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coordination Protocol Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_OPTIONS_FEATURE_COUNT = OPTIONS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_OPTIONS___GET_EXTENSION__ECLASS = OPTIONS___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Coordination Protocol Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_OPTIONS_OPERATION_COUNT = OPTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.options.impl.HideOptionExtensionImpl <em>Hide Option Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.options.impl.HideOptionExtensionImpl
	 * @see org.muml.uppaal.options.impl.OptionsPackageImpl#getHideOptionExtension()
	 * @generated
	 */
	int HIDE_OPTION_EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_OPTION_EXTENSION__EXTENSIONS = CorePackage.EXTENSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_OPTION_EXTENSION__EXTENDABLE_BASE = CorePackage.EXTENSION__EXTENDABLE_BASE;

	/**
	 * The feature id for the '<em><b>Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_OPTION_EXTENSION__OPTION = CorePackage.EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hide Option Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_OPTION_EXTENSION_FEATURE_COUNT = CorePackage.EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_OPTION_EXTENSION___GET_EXTENSION__ECLASS = CorePackage.EXTENSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Hide Option Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_OPTION_EXTENSION_OPERATION_COUNT = CorePackage.EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.options.StateSpaceReduction <em>State Space Reduction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.options.StateSpaceReduction
	 * @see org.muml.uppaal.options.impl.OptionsPackageImpl#getStateSpaceReduction()
	 * @generated
	 */
	int STATE_SPACE_REDUCTION = 3;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.options.TraceOptions <em>Trace Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.options.TraceOptions
	 * @see org.muml.uppaal.options.impl.OptionsPackageImpl#getTraceOptions()
	 * @generated
	 */
	int TRACE_OPTIONS = 4;


	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.options.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options</em>'.
	 * @see org.muml.uppaal.options.Options
	 * @generated
	 */
	EClass getOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.uppaal.options.Options#getConnectorOutBufferSize <em>Connector Out Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Out Buffer Size</em>'.
	 * @see org.muml.uppaal.options.Options#getConnectorOutBufferSize()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_ConnectorOutBufferSize();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.uppaal.options.Options#getHashTableSize <em>Hash Table Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Table Size</em>'.
	 * @see org.muml.uppaal.options.Options#getHashTableSize()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_HashTableSize();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.uppaal.options.Options#getStateSpaceReduction <em>State Space Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Space Reduction</em>'.
	 * @see org.muml.uppaal.options.Options#getStateSpaceReduction()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_StateSpaceReduction();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.uppaal.options.Options#getTraceOptions <em>Trace Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Options</em>'.
	 * @see org.muml.uppaal.options.Options#getTraceOptions()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_TraceOptions();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.options.CoordinationProtocolOptions <em>Coordination Protocol Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Protocol Options</em>'.
	 * @see org.muml.uppaal.options.CoordinationProtocolOptions
	 * @generated
	 */
	EClass getCoordinationProtocolOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.uppaal.options.CoordinationProtocolOptions#getRoleMultiplicity <em>Role Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Multiplicity</em>'.
	 * @see org.muml.uppaal.options.CoordinationProtocolOptions#getRoleMultiplicity()
	 * @see #getCoordinationProtocolOptions()
	 * @generated
	 */
	EAttribute getCoordinationProtocolOptions_RoleMultiplicity();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.options.HideOptionExtension <em>Hide Option Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hide Option Extension</em>'.
	 * @see org.muml.uppaal.options.HideOptionExtension
	 * @generated
	 */
	EClass getHideOptionExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.uppaal.options.HideOptionExtension#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option</em>'.
	 * @see org.muml.uppaal.options.HideOptionExtension#getOption()
	 * @see #getHideOptionExtension()
	 * @generated
	 */
	EAttribute getHideOptionExtension_Option();

	/**
	 * Returns the meta object for enum '{@link org.muml.uppaal.options.StateSpaceReduction <em>State Space Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State Space Reduction</em>'.
	 * @see org.muml.uppaal.options.StateSpaceReduction
	 * @generated
	 */
	EEnum getStateSpaceReduction();

	/**
	 * Returns the meta object for enum '{@link org.muml.uppaal.options.TraceOptions <em>Trace Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trace Options</em>'.
	 * @see org.muml.uppaal.options.TraceOptions
	 * @generated
	 */
	EEnum getTraceOptions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OptionsFactory getOptionsFactory();

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
		 * The meta object literal for the '{@link org.muml.uppaal.options.impl.OptionsImpl <em>Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.options.impl.OptionsImpl
		 * @see org.muml.uppaal.options.impl.OptionsPackageImpl#getOptions()
		 * @generated
		 */
		EClass OPTIONS = eINSTANCE.getOptions();

		/**
		 * The meta object literal for the '<em><b>Connector Out Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS__CONNECTOR_OUT_BUFFER_SIZE = eINSTANCE.getOptions_ConnectorOutBufferSize();

		/**
		 * The meta object literal for the '<em><b>Hash Table Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS__HASH_TABLE_SIZE = eINSTANCE.getOptions_HashTableSize();

		/**
		 * The meta object literal for the '<em><b>State Space Reduction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS__STATE_SPACE_REDUCTION = eINSTANCE.getOptions_StateSpaceReduction();

		/**
		 * The meta object literal for the '<em><b>Trace Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS__TRACE_OPTIONS = eINSTANCE.getOptions_TraceOptions();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.options.impl.CoordinationProtocolOptionsImpl <em>Coordination Protocol Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.options.impl.CoordinationProtocolOptionsImpl
		 * @see org.muml.uppaal.options.impl.OptionsPackageImpl#getCoordinationProtocolOptions()
		 * @generated
		 */
		EClass COORDINATION_PROTOCOL_OPTIONS = eINSTANCE.getCoordinationProtocolOptions();

		/**
		 * The meta object literal for the '<em><b>Role Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATION_PROTOCOL_OPTIONS__ROLE_MULTIPLICITY = eINSTANCE.getCoordinationProtocolOptions_RoleMultiplicity();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.options.impl.HideOptionExtensionImpl <em>Hide Option Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.options.impl.HideOptionExtensionImpl
		 * @see org.muml.uppaal.options.impl.OptionsPackageImpl#getHideOptionExtension()
		 * @generated
		 */
		EClass HIDE_OPTION_EXTENSION = eINSTANCE.getHideOptionExtension();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIDE_OPTION_EXTENSION__OPTION = eINSTANCE.getHideOptionExtension_Option();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.options.StateSpaceReduction <em>State Space Reduction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.options.StateSpaceReduction
		 * @see org.muml.uppaal.options.impl.OptionsPackageImpl#getStateSpaceReduction()
		 * @generated
		 */
		EEnum STATE_SPACE_REDUCTION = eINSTANCE.getStateSpaceReduction();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.options.TraceOptions <em>Trace Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.options.TraceOptions
		 * @see org.muml.uppaal.options.impl.OptionsPackageImpl#getTraceOptions()
		 * @generated
		 */
		EEnum TRACE_OPTIONS = eINSTANCE.getTraceOptions();

	}

} //OptionsPackage
