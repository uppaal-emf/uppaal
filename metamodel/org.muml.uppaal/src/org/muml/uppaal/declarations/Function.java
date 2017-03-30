/**
 */
package org.muml.uppaal.declarations;

import org.eclipse.emf.common.util.EList;
import org.muml.uppaal.core.NamedElement;
import org.muml.uppaal.core.TypedElement;
import org.muml.uppaal.statements.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A function with a return type and optional parameters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.declarations.Function#getBlock <em>Block</em>}</li>
 *   <li>{@link org.muml.uppaal.declarations.Function#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.declarations.DeclarationsPackage#getFunction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ValidReturnType='(not typeDefinition.oclIsUndefined())\r\nimplies\r\n(\r\n\t(\r\n\t\ttypeDefinition.oclIsKindOf(uppaal::expressions::IdentifierExpression) and\r\n\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclIsKindOf(uppaal::types::Type) and\r\n\t\t(\r\n\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType = uppaal::types::BuiltInType::VOID or\r\n\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType = uppaal::types::BuiltInType::INT or\r\n\t\t\ttypeDefinition.oclAsType(uppaal::expressions::IdentifierExpression).identifier.oclAsType(uppaal::types::Type).baseType = uppaal::types::BuiltInType::BOOL\r\n\t\t)\r\n\t)\r\n\tor\r\n\t\ttypeDefinition.oclIsKindOf(uppaal::types::RangeTypeSpecification)\r\n)' UniqueParameterNames='self.parameter->collect(elements)->select(e | e.oclIsKindOf(uppaal::core::NamedElement))->collect(oclAsType(uppaal::core::NamedElement))->isUnique(name)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidReturnType UniqueParameterNames'"
 * @generated
 */
public interface Function extends NamedElement, TypedElement {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The block of statements representing the function body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(Block)
	 * @see org.muml.uppaal.declarations.DeclarationsPackage#getFunction_Block()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.declarations.Function#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.uppaal.declarations.ParameterContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The function's parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.muml.uppaal.declarations.DeclarationsPackage#getFunction_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterContainer> getParameter();

} // Function
