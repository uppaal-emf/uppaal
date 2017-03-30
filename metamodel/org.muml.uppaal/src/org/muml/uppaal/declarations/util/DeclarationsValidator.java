/**
 */
package org.muml.uppaal.declarations.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.uppaal.core.util.CoreValidator;
import org.muml.uppaal.declarations.ArrayInitializer;
import org.muml.uppaal.declarations.CallType;
import org.muml.uppaal.declarations.DataVariablePrefix;
import org.muml.uppaal.declarations.Declaration;
import org.muml.uppaal.declarations.Declarations;
import org.muml.uppaal.declarations.DeclarationsPackage;
import org.muml.uppaal.declarations.ExpressionInitializer;
import org.muml.uppaal.declarations.Function;
import org.muml.uppaal.declarations.GlobalDeclarations;
import org.muml.uppaal.declarations.Initializer;
import org.muml.uppaal.declarations.LocalDeclarations;
import org.muml.uppaal.declarations.Parameter;
import org.muml.uppaal.declarations.ParameterContainer;
import org.muml.uppaal.declarations.SystemDeclarations;
import org.muml.uppaal.declarations.TypeDeclaration;
import org.muml.uppaal.declarations.TypedDeclaration;
import org.muml.uppaal.declarations.TypedElementContainer;
import org.muml.uppaal.declarations.Variable;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.uppaal.declarations.DeclarationsPackage
 * @generated
 */
public class DeclarationsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DeclarationsValidator INSTANCE = new DeclarationsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.uppaal.declarations";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreValidator coreValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationsValidator() {
		super();
		coreValidator = CoreValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DeclarationsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DeclarationsPackage.DECLARATIONS:
				return validateDeclarations((Declarations)value, diagnostics, context);
			case DeclarationsPackage.GLOBAL_DECLARATIONS:
				return validateGlobalDeclarations((GlobalDeclarations)value, diagnostics, context);
			case DeclarationsPackage.LOCAL_DECLARATIONS:
				return validateLocalDeclarations((LocalDeclarations)value, diagnostics, context);
			case DeclarationsPackage.SYSTEM_DECLARATIONS:
				return validateSystemDeclarations((SystemDeclarations)value, diagnostics, context);
			case DeclarationsPackage.DECLARATION:
				return validateDeclaration((Declaration)value, diagnostics, context);
			case DeclarationsPackage.FUNCTION:
				return validateFunction((Function)value, diagnostics, context);
			case DeclarationsPackage.TYPE_DECLARATION:
				return validateTypeDeclaration((TypeDeclaration)value, diagnostics, context);
			case DeclarationsPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case DeclarationsPackage.TYPED_ELEMENT_CONTAINER:
				return validateTypedElementContainer((TypedElementContainer)value, diagnostics, context);
			case DeclarationsPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case DeclarationsPackage.INITIALIZER:
				return validateInitializer((Initializer)value, diagnostics, context);
			case DeclarationsPackage.EXPRESSION_INITIALIZER:
				return validateExpressionInitializer((ExpressionInitializer)value, diagnostics, context);
			case DeclarationsPackage.ARRAY_INITIALIZER:
				return validateArrayInitializer((ArrayInitializer)value, diagnostics, context);
			case DeclarationsPackage.TYPED_DECLARATION:
				return validateTypedDeclaration((TypedDeclaration)value, diagnostics, context);
			case DeclarationsPackage.PARAMETER_CONTAINER:
				return validateParameterContainer((ParameterContainer)value, diagnostics, context);
			case DeclarationsPackage.DATA_VARIABLE_PREFIX:
				return validateDataVariablePrefix((DataVariablePrefix)value, diagnostics, context);
			case DeclarationsPackage.CALL_TYPE:
				return validateCallType((CallType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclarations(Declarations declarations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(declarations, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(declarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(declarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(declarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(declarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(declarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(declarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(declarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(declarations, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeclarations_UniqueTypeNames(declarations, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeclarations_UniqueTypedElementNames(declarations, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueTypeNames constraint of '<em>Declarations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DECLARATIONS__UNIQUE_TYPE_NAMES__EEXPRESSION = "self.declaration->select(oclIsKindOf(TypeDeclaration)).oclAsType(TypeDeclaration)->collect(type)->isUnique(name)";

	/**
	 * Validates the UniqueTypeNames constraint of '<em>Declarations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclarations_UniqueTypeNames(Declarations declarations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeclarationsPackage.Literals.DECLARATIONS,
				 declarations,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueTypeNames",
				 DECLARATIONS__UNIQUE_TYPE_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueTypedElementNames constraint of '<em>Declarations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DECLARATIONS__UNIQUE_TYPED_ELEMENT_NAMES__EEXPRESSION = "self.declaration->select(e | e.oclIsKindOf(uppaal::declarations::TypedDeclaration))->collect(oclAsType(uppaal::declarations::TypedDeclaration))->collect(elements)->select(e | e.oclIsKindOf(uppaal::core::NamedElement))->collect(oclAsType(uppaal::core::NamedElement))->isUnique(name)";

	/**
	 * Validates the UniqueTypedElementNames constraint of '<em>Declarations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclarations_UniqueTypedElementNames(Declarations declarations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeclarationsPackage.Literals.DECLARATIONS,
				 declarations,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueTypedElementNames",
				 DECLARATIONS__UNIQUE_TYPED_ELEMENT_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalDeclarations(GlobalDeclarations globalDeclarations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(globalDeclarations, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(globalDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(globalDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(globalDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(globalDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(globalDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(globalDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(globalDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(globalDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeclarations_UniqueTypeNames(globalDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeclarations_UniqueTypedElementNames(globalDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalDeclarations_NoTemplateDeclarations(globalDeclarations, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoTemplateDeclarations constraint of '<em>Global Declarations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GLOBAL_DECLARATIONS__NO_TEMPLATE_DECLARATIONS__EEXPRESSION = "not self.declaration->exists(oclIsKindOf(system::TemplateDeclaration))";

	/**
	 * Validates the NoTemplateDeclarations constraint of '<em>Global Declarations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalDeclarations_NoTemplateDeclarations(GlobalDeclarations globalDeclarations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeclarationsPackage.Literals.GLOBAL_DECLARATIONS,
				 globalDeclarations,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoTemplateDeclarations",
				 GLOBAL_DECLARATIONS__NO_TEMPLATE_DECLARATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalDeclarations(LocalDeclarations localDeclarations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(localDeclarations, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(localDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(localDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(localDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(localDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(localDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(localDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(localDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(localDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeclarations_UniqueTypeNames(localDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeclarations_UniqueTypedElementNames(localDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocalDeclarations_NoTemplateDeclarations(localDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocalDeclarations_NoChannelDeclarations(localDeclarations, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoTemplateDeclarations constraint of '<em>Local Declarations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOCAL_DECLARATIONS__NO_TEMPLATE_DECLARATIONS__EEXPRESSION = "not self.declaration->exists(oclIsKindOf(system::TemplateDeclaration))";

	/**
	 * Validates the NoTemplateDeclarations constraint of '<em>Local Declarations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalDeclarations_NoTemplateDeclarations(LocalDeclarations localDeclarations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeclarationsPackage.Literals.LOCAL_DECLARATIONS,
				 localDeclarations,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoTemplateDeclarations",
				 LOCAL_DECLARATIONS__NO_TEMPLATE_DECLARATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoChannelDeclarations constraint of '<em>Local Declarations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOCAL_DECLARATIONS__NO_CHANNEL_DECLARATIONS__EEXPRESSION = "not self.declaration->exists(\r\n" +
		"\toclIsKindOf(uppaal::declarations::TypedDeclaration)\r\n" +
		"\tand\r\n" +
		"\tlet typeDefinition : uppaal::expressions::Expression = oclAsType(uppaal::declarations::TypedDeclaration).typeDefinition in\r\n" +
		"\t(\r\n" +
		"\t\t\r\n" +
		"\t\ttypeDefinition.oclIsKindOf(uppaal::expressions::ChannelPrefixExpression)\r\n" +
		"\t\tor\r\n" +
		"\t\t(\r\n" +
		"\t\t\ttypeDefinition.oclIsKindOf(uppaal::expressions::IdentifierExpression)\r\n" +
		"\t\t\tand\r\n" +
		"\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclIsKindOf(uppaal::types::Type)\r\n" +
		"\t\t\tand\r\n" +
		"\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType=uppaal::types::BuiltInType::CHAN\r\n" +
		"\t\t)\r\n" +
		"\t)\r\n" +
		")";

	/**
	 * Validates the NoChannelDeclarations constraint of '<em>Local Declarations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalDeclarations_NoChannelDeclarations(LocalDeclarations localDeclarations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeclarationsPackage.Literals.LOCAL_DECLARATIONS,
				 localDeclarations,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoChannelDeclarations",
				 LOCAL_DECLARATIONS__NO_CHANNEL_DECLARATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemDeclarations(SystemDeclarations systemDeclarations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemDeclarations, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeclarations_UniqueTypeNames(systemDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeclarations_UniqueTypedElementNames(systemDeclarations, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemDeclarations_UniqueTemplateNames(systemDeclarations, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueTemplateNames constraint of '<em>System Declarations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM_DECLARATIONS__UNIQUE_TEMPLATE_NAMES__EEXPRESSION = "self.declaration->select(oclIsKindOf(system::TemplateDeclaration)).oclAsType(system::TemplateDeclaration)->collect(declaredTemplate)->isUnique(name)";

	/**
	 * Validates the UniqueTemplateNames constraint of '<em>System Declarations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemDeclarations_UniqueTemplateNames(SystemDeclarations systemDeclarations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeclarationsPackage.Literals.SYSTEM_DECLARATIONS,
				 systemDeclarations,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueTemplateNames",
				 SYSTEM_DECLARATIONS__UNIQUE_TEMPLATE_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclaration(Declaration declaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(declaration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(function, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(function, diagnostics, context);
		if (result || diagnostics != null) result &= coreValidator.validateNamedElement_NoWhitespace(function, diagnostics, context);
		if (result || diagnostics != null) result &= coreValidator.validateNamedElement_NoDigitStart(function, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunction_ValidReturnType(function, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunction_UniqueParameterNames(function, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ValidReturnType constraint of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FUNCTION__VALID_RETURN_TYPE__EEXPRESSION = "(not typeDefinition.oclIsUndefined())\r\n" +
		"implies\r\n" +
		"(\r\n" +
		"\t(\r\n" +
		"\t\ttypeDefinition.oclIsKindOf(uppaal::expressions::IdentifierExpression) and\r\n" +
		"\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclIsKindOf(uppaal::types::Type) and\r\n" +
		"\t\t(\r\n" +
		"\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType = uppaal::types::BuiltInType::VOID or\r\n" +
		"\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType = uppaal::types::BuiltInType::INT or\r\n" +
		"\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType = uppaal::types::BuiltInType::BOOL\r\n" +
		"\t\t)\r\n" +
		"\t)\r\n" +
		"\tor\r\n" +
		"\t\ttypeDefinition.oclIsKindOf(uppaal::types::RangeTypeSpecification)\r\n" +
		")";

	/**
	 * Validates the ValidReturnType constraint of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction_ValidReturnType(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeclarationsPackage.Literals.FUNCTION,
				 function,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidReturnType",
				 FUNCTION__VALID_RETURN_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueParameterNames constraint of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FUNCTION__UNIQUE_PARAMETER_NAMES__EEXPRESSION = "self.parameter->collect(elements)->select(e | e.oclIsKindOf(uppaal::core::NamedElement))->collect(oclAsType(uppaal::core::NamedElement))->isUnique(name)";

	/**
	 * Validates the UniqueParameterNames constraint of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction_UniqueParameterNames(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeclarationsPackage.Literals.FUNCTION,
				 function,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueParameterNames",
				 FUNCTION__UNIQUE_PARAMETER_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDeclaration(TypeDeclaration typeDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(typeDeclaration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(typeDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(typeDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(typeDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(typeDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(typeDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(typeDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(typeDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(typeDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDeclaration_UniqueTypeNames(typeDeclaration, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueTypeNames constraint of '<em>Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TYPE_DECLARATION__UNIQUE_TYPE_NAMES__EEXPRESSION = "self.type->isUnique(name)";

	/**
	 * Validates the UniqueTypeNames constraint of '<em>Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDeclaration_UniqueTypeNames(TypeDeclaration typeDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeclarationsPackage.Literals.TYPE_DECLARATION,
				 typeDeclaration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueTypeNames",
				 TYPE_DECLARATION__UNIQUE_TYPE_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variable, diagnostics, context);
		if (result || diagnostics != null) result &= coreValidator.validateNamedElement_NoWhitespace(variable, diagnostics, context);
		if (result || diagnostics != null) result &= coreValidator.validateNamedElement_NoDigitStart(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariable_NoInitializerForClockAndChannelVariables(variable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoInitializerForClockAndChannelVariables constraint of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VARIABLE__NO_INITIALIZER_FOR_CLOCK_AND_CHANNEL_VARIABLES__EEXPRESSION = "if (not self.typeDefinition.oclIsUndefined()) then\r\n" +
		"\t-- No channels allowed.\r\n" +
		"\tif (self.typeDefinition.oclIsKindOf(uppaal::expressions::ChannelPrefixExpression)) then\r\n" +
		"\t\tself.initializer.oclIsUndefined()\r\n" +
		"\telse if (self.typeDefinition.oclIsKindOf(uppaal::expressions::IdentifierExpression)) then\r\n" +
		"\t\tif (self.typeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclIsKindOf(uppaal::types::Type)) then\r\n" +
		"\t\t\t(\r\n" +
		"\t\t\t\t(\r\n" +
		"\t\t\t\t\tself.typeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType=uppaal::types::BuiltInType::CHAN or\r\n" +
		"\t\t\t\t\tself.typeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType=uppaal::types::BuiltInType::CLOCK\r\n" +
		"\t\t\t\t)\r\n" +
		"\t\t\t\timplies\r\n" +
		"\t\t\t\t\tself.initializer.oclIsUndefined()\r\n" +
		"\t\t\t)\r\n" +
		"\t\telse true endif\r\n" +
		"\telse true endif endif\r\n" +
		"else\r\n" +
		"\ttrue\r\n" +
		"endif";

	/**
	 * Validates the NoInitializerForClockAndChannelVariables constraint of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable_NoInitializerForClockAndChannelVariables(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeclarationsPackage.Literals.VARIABLE,
				 variable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoInitializerForClockAndChannelVariables",
				 VARIABLE__NO_INITIALIZER_FOR_CLOCK_AND_CHANNEL_VARIABLES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedElementContainer(TypedElementContainer typedElementContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(typedElementContainer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(typedElementContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(typedElementContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(typedElementContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(typedElementContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(typedElementContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(typedElementContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(typedElementContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(typedElementContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypedElementContainer_ElementsMustHaveSameType(typedElementContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypedElementContainer_TypeExpressionMustBeType(typedElementContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypedElementContainer_UniqueElementNames(typedElementContainer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ElementsMustHaveSameType constraint of '<em>Typed Element Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TYPED_ELEMENT_CONTAINER__ELEMENTS_MUST_HAVE_SAME_TYPE__EEXPRESSION = "self.elements->forAll(oclIsKindOf(declarations::Parameter))\r\n" +
		"or\r\n" +
		"self.elements->forAll(oclIsKindOf(declarations::Variable))\r\n" +
		"or\r\n" +
		"self.elements->forAll(oclIsKindOf(declarations::Function))";

	/**
	 * Validates the ElementsMustHaveSameType constraint of '<em>Typed Element Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedElementContainer_ElementsMustHaveSameType(TypedElementContainer typedElementContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER,
				 typedElementContainer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ElementsMustHaveSameType",
				 TYPED_ELEMENT_CONTAINER__ELEMENTS_MUST_HAVE_SAME_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TypeExpressionMustBeType constraint of '<em>Typed Element Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TYPED_ELEMENT_CONTAINER__TYPE_EXPRESSION_MUST_BE_TYPE__EEXPRESSION = "typeDefinition.oclIsKindOf(types::TypeExpression)\r\n" +
		"or\r\n" +
		"(\r\n" +
		"\ttypeDefinition.oclIsKindOf(expressions::IdentifierExpression) and\r\n" +
		"\ttypeDefinition.oclAsType(expressions::IdentifierExpression).identifier.oclIsKindOf(types::Type)\r\n" +
		")\r\n" +
		"or\r\n" +
		"typeDefinition.oclIsKindOf(expressions::ChannelPrefixExpression)\r\n" +
		"or\r\n" +
		"typeDefinition.oclIsKindOf(expressions::DataPrefixExpression)";

	/**
	 * Validates the TypeExpressionMustBeType constraint of '<em>Typed Element Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedElementContainer_TypeExpressionMustBeType(TypedElementContainer typedElementContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER,
				 typedElementContainer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "TypeExpressionMustBeType",
				 TYPED_ELEMENT_CONTAINER__TYPE_EXPRESSION_MUST_BE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueElementNames constraint of '<em>Typed Element Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TYPED_ELEMENT_CONTAINER__UNIQUE_ELEMENT_NAMES__EEXPRESSION = "self.elements->select(oclIsKindOf(core::NamedElement))->collect(oclAsType(core::NamedElement))->isUnique(name)";

	/**
	 * Validates the UniqueElementNames constraint of '<em>Typed Element Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedElementContainer_UniqueElementNames(TypedElementContainer typedElementContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER,
				 typedElementContainer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueElementNames",
				 TYPED_ELEMENT_CONTAINER__UNIQUE_ELEMENT_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= coreValidator.validateNamedElement_NoWhitespace(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= coreValidator.validateNamedElement_NoDigitStart(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariable_NoInitializerForClockAndChannelVariables(parameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitializer(Initializer initializer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(initializer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionInitializer(ExpressionInitializer expressionInitializer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expressionInitializer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayInitializer(ArrayInitializer arrayInitializer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayInitializer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedDeclaration(TypedDeclaration typedDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(typedDeclaration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(typedDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(typedDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(typedDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(typedDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(typedDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(typedDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(typedDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(typedDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypedElementContainer_ElementsMustHaveSameType(typedDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypedElementContainer_TypeExpressionMustBeType(typedDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypedElementContainer_UniqueElementNames(typedDeclaration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterContainer(ParameterContainer parameterContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterContainer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameterContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameterContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameterContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameterContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameterContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypedElementContainer_ElementsMustHaveSameType(parameterContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypedElementContainer_TypeExpressionMustBeType(parameterContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypedElementContainer_UniqueElementNames(parameterContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameterContainer_SingleParameter(parameterContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameterContainer_ParametersOnly(parameterContainer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SingleParameter constraint of '<em>Parameter Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER_CONTAINER__SINGLE_PARAMETER__EEXPRESSION = "self.elements->size() <= 1";

	/**
	 * Validates the SingleParameter constraint of '<em>Parameter Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterContainer_SingleParameter(ParameterContainer parameterContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeclarationsPackage.Literals.PARAMETER_CONTAINER,
				 parameterContainer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SingleParameter",
				 PARAMETER_CONTAINER__SINGLE_PARAMETER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ParametersOnly constraint of '<em>Parameter Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER_CONTAINER__PARAMETERS_ONLY__EEXPRESSION = "self.elements->forAll(oclIsKindOf(declarations::Parameter))";

	/**
	 * Validates the ParametersOnly constraint of '<em>Parameter Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterContainer_ParametersOnly(ParameterContainer parameterContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeclarationsPackage.Literals.PARAMETER_CONTAINER,
				 parameterContainer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ParametersOnly",
				 PARAMETER_CONTAINER__PARAMETERS_ONLY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataVariablePrefix(DataVariablePrefix dataVariablePrefix, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallType(CallType callType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DeclarationsValidator
