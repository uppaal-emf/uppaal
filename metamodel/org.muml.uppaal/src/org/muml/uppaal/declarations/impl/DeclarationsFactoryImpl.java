/**
 */
package org.muml.uppaal.declarations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.uppaal.declarations.ArrayInitializer;
import org.muml.uppaal.declarations.CallType;
import org.muml.uppaal.declarations.DataVariablePrefix;
import org.muml.uppaal.declarations.DeclarationsFactory;
import org.muml.uppaal.declarations.DeclarationsPackage;
import org.muml.uppaal.declarations.ExpressionInitializer;
import org.muml.uppaal.declarations.Function;
import org.muml.uppaal.declarations.GlobalDeclarations;
import org.muml.uppaal.declarations.LocalDeclarations;
import org.muml.uppaal.declarations.Parameter;
import org.muml.uppaal.declarations.ParameterContainer;
import org.muml.uppaal.declarations.SystemDeclarations;
import org.muml.uppaal.declarations.TypeDeclaration;
import org.muml.uppaal.declarations.TypedDeclaration;
import org.muml.uppaal.declarations.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclarationsFactoryImpl extends EFactoryImpl implements DeclarationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeclarationsFactory init() {
		try {
			DeclarationsFactory theDeclarationsFactory = (DeclarationsFactory)EPackage.Registry.INSTANCE.getEFactory(DeclarationsPackage.eNS_URI);
			if (theDeclarationsFactory != null) {
				return theDeclarationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeclarationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationsFactoryImpl() {
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
			case DeclarationsPackage.GLOBAL_DECLARATIONS: return createGlobalDeclarations();
			case DeclarationsPackage.LOCAL_DECLARATIONS: return createLocalDeclarations();
			case DeclarationsPackage.SYSTEM_DECLARATIONS: return createSystemDeclarations();
			case DeclarationsPackage.FUNCTION: return createFunction();
			case DeclarationsPackage.TYPE_DECLARATION: return createTypeDeclaration();
			case DeclarationsPackage.VARIABLE: return createVariable();
			case DeclarationsPackage.PARAMETER: return createParameter();
			case DeclarationsPackage.EXPRESSION_INITIALIZER: return createExpressionInitializer();
			case DeclarationsPackage.ARRAY_INITIALIZER: return createArrayInitializer();
			case DeclarationsPackage.TYPED_DECLARATION: return createTypedDeclaration();
			case DeclarationsPackage.PARAMETER_CONTAINER: return createParameterContainer();
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
			case DeclarationsPackage.DATA_VARIABLE_PREFIX:
				return createDataVariablePrefixFromString(eDataType, initialValue);
			case DeclarationsPackage.CALL_TYPE:
				return createCallTypeFromString(eDataType, initialValue);
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
			case DeclarationsPackage.DATA_VARIABLE_PREFIX:
				return convertDataVariablePrefixToString(eDataType, instanceValue);
			case DeclarationsPackage.CALL_TYPE:
				return convertCallTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalDeclarations createGlobalDeclarations() {
		GlobalDeclarationsImpl globalDeclarations = new GlobalDeclarationsImpl();
		return globalDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDeclarations createLocalDeclarations() {
		LocalDeclarationsImpl localDeclarations = new LocalDeclarationsImpl();
		return localDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemDeclarations createSystemDeclarations() {
		SystemDeclarationsImpl systemDeclarations = new SystemDeclarationsImpl();
		return systemDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclaration createTypeDeclaration() {
		TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
		return typeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionInitializer createExpressionInitializer() {
		ExpressionInitializerImpl expressionInitializer = new ExpressionInitializerImpl();
		return expressionInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInitializer createArrayInitializer() {
		ArrayInitializerImpl arrayInitializer = new ArrayInitializerImpl();
		return arrayInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedDeclaration createTypedDeclaration() {
		TypedDeclarationImpl typedDeclaration = new TypedDeclarationImpl();
		return typedDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterContainer createParameterContainer() {
		ParameterContainerImpl parameterContainer = new ParameterContainerImpl();
		return parameterContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataVariablePrefix createDataVariablePrefixFromString(EDataType eDataType, String initialValue) {
		DataVariablePrefix result = DataVariablePrefix.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataVariablePrefixToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallType createCallTypeFromString(EDataType eDataType, String initialValue) {
		CallType result = CallType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationsPackage getDeclarationsPackage() {
		return (DeclarationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeclarationsPackage getPackage() {
		return DeclarationsPackage.eINSTANCE;
	}

} //DeclarationsFactoryImpl
