/**
 */
package org.muml.uppaal.declarations;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.muml.uppaal.core.TypedElement;
import org.muml.uppaal.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for objects containing variables like variable declarations, iterations, quantifications or selections.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.declarations.TypedElementContainer#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link org.muml.uppaal.declarations.TypedElementContainer#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.declarations.DeclarationsPackage#getTypedElementContainer()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueElementNames='self.elements->select(oclIsKindOf(core::NamedElement))->collect(oclAsType(core::NamedElement))->isUnique(name)' ElementsMustHaveSameType='self.elements->forAll(oclIsKindOf(declarations::Parameter))\r\nor\r\nself.elements->forAll(oclIsKindOf(declarations::Variable))\r\nor\r\nself.elements->forAll(oclIsKindOf(declarations::Function))' TypeExpressionMustBeType='typeDefinition.oclIsKindOf(types::TypeExpression)\r\nor\r\n(\r\n\ttypeDefinition.oclIsKindOf(expressions::IdentifierExpression) and\r\n\ttypeDefinition.oclAsType(expressions::IdentifierExpression).identifier.oclIsKindOf(types::Type)\r\n)\r\nor\r\ntypeDefinition.oclIsKindOf(expressions::ChannelPrefixExpression)\r\nor\r\ntypeDefinition.oclIsKindOf(expressions::DataPrefixExpression)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ElementsMustHaveSameType TypeExpressionMustBeType UniqueElementNames'"
 * @generated
 */
public interface TypedElementContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type definition for the contained variables.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Definition</em>' containment reference.
	 * @see #setTypeDefinition(Expression)
	 * @see org.muml.uppaal.declarations.DeclarationsPackage#getTypedElementContainer_TypeDefinition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getTypeDefinition();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.declarations.TypedElementContainer#getTypeDefinition <em>Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition</em>' containment reference.
	 * @see #getTypeDefinition()
	 * @generated
	 */
	void setTypeDefinition(Expression value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.uppaal.core.TypedElement}.
	 * It is bidirectional and its opposite is '{@link org.muml.uppaal.core.TypedElement#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contained variables.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.muml.uppaal.declarations.DeclarationsPackage#getTypedElementContainer_Elements()
	 * @see org.muml.uppaal.core.TypedElement#getContainer
	 * @model opposite="container" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='variable'"
	 * @generated
	 */
	EList<TypedElement> getElements();

} // TypedElementContainer
