/**
 */
package org.muml.uppaal.declarations.global.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.uppaal.declarations.global.ChannelItem;
import org.muml.uppaal.declarations.global.ChannelPriorityDeclaration;
import org.muml.uppaal.declarations.global.ChannelPriorityGroup;
import org.muml.uppaal.declarations.global.DefaultItem;
import org.muml.uppaal.declarations.global.GlobalPackage;
import org.muml.uppaal.declarations.global.PriorityItem;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.uppaal.declarations.global.GlobalPackage
 * @generated
 */
public class GlobalValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GlobalValidator INSTANCE = new GlobalValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.uppaal.declarations.global";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return GlobalPackage.eINSTANCE;
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
			case GlobalPackage.CHANNEL_PRIORITY_DECLARATION:
				return validateChannelPriorityDeclaration((ChannelPriorityDeclaration)value, diagnostics, context);
			case GlobalPackage.CHANNEL_PRIORITY_GROUP:
				return validateChannelPriorityGroup((ChannelPriorityGroup)value, diagnostics, context);
			case GlobalPackage.PRIORITY_ITEM:
				return validatePriorityItem((PriorityItem)value, diagnostics, context);
			case GlobalPackage.CHANNEL_ITEM:
				return validateChannelItem((ChannelItem)value, diagnostics, context);
			case GlobalPackage.DEFAULT_ITEM:
				return validateDefaultItem((DefaultItem)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelPriorityDeclaration(ChannelPriorityDeclaration channelPriorityDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(channelPriorityDeclaration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(channelPriorityDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(channelPriorityDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(channelPriorityDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(channelPriorityDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(channelPriorityDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(channelPriorityDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(channelPriorityDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(channelPriorityDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validateChannelPriorityDeclaration_AtMostOneDefaultItem(channelPriorityDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validateChannelPriorityDeclaration_EachChannelContainedAtMostOnce(channelPriorityDeclaration, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AtMostOneDefaultItem constraint of '<em>Channel Priority Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CHANNEL_PRIORITY_DECLARATION__AT_MOST_ONE_DEFAULT_ITEM__EEXPRESSION = "self.groups.items->select(oclIsKindOf(uppaal::declarations::global::DefaultItem))->size() <= 1";

	/**
	 * Validates the AtMostOneDefaultItem constraint of '<em>Channel Priority Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelPriorityDeclaration_AtMostOneDefaultItem(ChannelPriorityDeclaration channelPriorityDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GlobalPackage.Literals.CHANNEL_PRIORITY_DECLARATION,
				 channelPriorityDeclaration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AtMostOneDefaultItem",
				 CHANNEL_PRIORITY_DECLARATION__AT_MOST_ONE_DEFAULT_ITEM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the EachChannelContainedAtMostOnce constraint of '<em>Channel Priority Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CHANNEL_PRIORITY_DECLARATION__EACH_CHANNEL_CONTAINED_AT_MOST_ONCE__EEXPRESSION = "self.groups.items\r\n" +
		"->select(oclIsKindOf(uppaal::declarations::global::ChannelItem))\r\n" +
		"->collect(oclAsType(uppaal::declarations::global::ChannelItem))\r\n" +
		"->isUnique(channelExpression.identifier)";

	/**
	 * Validates the EachChannelContainedAtMostOnce constraint of '<em>Channel Priority Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelPriorityDeclaration_EachChannelContainedAtMostOnce(ChannelPriorityDeclaration channelPriorityDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GlobalPackage.Literals.CHANNEL_PRIORITY_DECLARATION,
				 channelPriorityDeclaration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "EachChannelContainedAtMostOnce",
				 CHANNEL_PRIORITY_DECLARATION__EACH_CHANNEL_CONTAINED_AT_MOST_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelPriorityGroup(ChannelPriorityGroup channelPriorityGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(channelPriorityGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityItem(PriorityItem priorityItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(priorityItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelItem(ChannelItem channelItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(channelItem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(channelItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(channelItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(channelItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(channelItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(channelItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(channelItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(channelItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(channelItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateChannelItem_ChannelVariablesOnly(channelItem, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ChannelVariablesOnly constraint of '<em>Channel Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CHANNEL_ITEM__CHANNEL_VARIABLES_ONLY__EEXPRESSION = "\t(not self.channelExpression.oclIsUndefined())\r\n" +
		"implies\r\n" +
		"\tself.channelExpression.identifier.oclIsKindOf(uppaal::declarations::Variable)\r\n" +
		"\tand\r\n" +
		"\t(\r\n" +
		"\tlet typeDefinition : uppaal::expressions::Expression = self.channelExpression.identifier.oclAsType(uppaal::declarations::Variable).typeDefinition in\r\n" +
		"\t\tif (\r\n" +
		"\t\t\ttypeDefinition.oclIsKindOf(uppaal::expressions::IdentifierExpression) and\r\n" +
		"\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclIsKindOf(uppaal::types::Type)\r\n" +
		"\t\t) then\r\n" +
		"\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType=uppaal::types::BuiltInType::CHAN\r\n" +
		"\t\telse\r\n" +
		"\t\t\ttypeDefinition.oclIsKindOf(uppaal::expressions::ChannelPrefixExpression)\r\n" +
		"\t\tendif\r\n" +
		"\t)";

	/**
	 * Validates the ChannelVariablesOnly constraint of '<em>Channel Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelItem_ChannelVariablesOnly(ChannelItem channelItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GlobalPackage.Literals.CHANNEL_ITEM,
				 channelItem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ChannelVariablesOnly",
				 CHANNEL_ITEM__CHANNEL_VARIABLES_ONLY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultItem(DefaultItem defaultItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(defaultItem, diagnostics, context);
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

} //GlobalValidator
