/**
 */
package org.muml.uppaal.declarations;

import org.eclipse.emf.common.util.EList;
import org.muml.uppaal.core.NamedElement;
import org.muml.uppaal.core.TypedElement;
import org.muml.uppaal.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A typed variable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.declarations.Variable#getIndex <em>Index</em>}</li>
 *   <li>{@link org.muml.uppaal.declarations.Variable#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.declarations.DeclarationsPackage#getVariable()
 * @model extendedMetaData="name='Variable' kind='empty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoInitializerForClockAndChannelVariables='if (not self.typeDefinition.oclIsUndefined()) then\r\n\t-- No channels allowed.\r\n\tif (self.typeDefinition.oclIsKindOf(uppaal::expressions::ChannelPrefixExpression)) then\r\n\t\tself.initializer.oclIsUndefined()\r\n\telse if (self.typeDefinition.oclIsKindOf(uppaal::expressions::IdentifierExpression)) then\r\n\t\tif (self.typeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclIsKindOf(uppaal::types::Type)) then\r\n\t\t\t(\r\n\t\t\t\t(\r\n\t\t\t\t\tself.typeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType=uppaal::types::BuiltInType::CHAN or\r\n\t\t\t\t\tself.typeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType=uppaal::types::BuiltInType::CLOCK\r\n\t\t\t\t)\r\n\t\t\t\timplies\r\n\t\t\t\t\tself.initializer.oclIsUndefined()\r\n\t\t\t)\r\n\t\telse true endif\r\n\telse true endif endif\r\nelse\r\n\ttrue\r\nendif'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoInitializerForClockAndChannelVariables'"
 * @generated
 */
public interface Variable extends NamedElement, TypedElement {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.uppaal.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of array indexes for the variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index</em>' containment reference list.
	 * @see org.muml.uppaal.declarations.DeclarationsPackage#getVariable_Index()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getIndex();

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the variable's initial value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initializer</em>' containment reference.
	 * @see #setInitializer(Initializer)
	 * @see org.muml.uppaal.declarations.DeclarationsPackage#getVariable_Initializer()
	 * @model containment="true"
	 * @generated
	 */
	Initializer getInitializer();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.declarations.Variable#getInitializer <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' containment reference.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(Initializer value);

} // Variable
