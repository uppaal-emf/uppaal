/**
 */
package org.muml.uppaal.options.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.uppaal.options.CoordinationProtocolOptions;
import org.muml.uppaal.options.HideOptionExtension;
import org.muml.uppaal.options.Options;
import org.muml.uppaal.options.OptionsFactory;
import org.muml.uppaal.options.OptionsPackage;
import org.muml.uppaal.options.StateSpaceReduction;
import org.muml.uppaal.options.TraceOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptionsFactoryImpl extends EFactoryImpl implements OptionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OptionsFactory init() {
		try {
			OptionsFactory theOptionsFactory = (OptionsFactory)EPackage.Registry.INSTANCE.getEFactory(OptionsPackage.eNS_URI);
			if (theOptionsFactory != null) {
				return theOptionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OptionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OptionsPackage.OPTIONS: return createOptions();
			case OptionsPackage.COORDINATION_PROTOCOL_OPTIONS: return createCoordinationProtocolOptions();
			case OptionsPackage.HIDE_OPTION_EXTENSION: return createHideOptionExtension();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OptionsPackage.STATE_SPACE_REDUCTION:
				return createStateSpaceReductionFromString(eDataType, initialValue);
			case OptionsPackage.TRACE_OPTIONS:
				return createTraceOptionsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OptionsPackage.STATE_SPACE_REDUCTION:
				return convertStateSpaceReductionToString(eDataType, instanceValue);
			case OptionsPackage.TRACE_OPTIONS:
				return convertTraceOptionsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Options createOptions() {
		OptionsImpl options = new OptionsImpl();
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocolOptions createCoordinationProtocolOptions() {
		CoordinationProtocolOptionsImpl coordinationProtocolOptions = new CoordinationProtocolOptionsImpl();
		return coordinationProtocolOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HideOptionExtension createHideOptionExtension() {
		HideOptionExtensionImpl hideOptionExtension = new HideOptionExtensionImpl();
		return hideOptionExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSpaceReduction createStateSpaceReductionFromString(EDataType eDataType, String initialValue) {
		StateSpaceReduction result = StateSpaceReduction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateSpaceReductionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceOptions createTraceOptionsFromString(EDataType eDataType, String initialValue) {
		TraceOptions result = TraceOptions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTraceOptionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionsPackage getOptionsPackage() {
		return (OptionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OptionsPackage getPackage() {
		return OptionsPackage.eINSTANCE;
	}

} //OptionsFactoryImpl
