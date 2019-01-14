/**
 */
package org.muml.uppaal.declarations;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a set of variable, type, function, or template declarations, that are either global, local to a template, local to a block, or system declarations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.declarations.Declarations#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.declarations.DeclarationsPackage#getDeclarations()
 * @model abstract="true"
 *        extendedMetaData="name='Declarations' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueFunctionNames='self.declaration-&gt;select(oclIsKindOf(FunctionDeclaration)).oclAsType(FunctionDeclaration)-&gt;collect(function)-&gt;isUnique(name)' UniqueVariableNames='self.declaration-&gt;select(oclIsKindOf(VariableDeclaration)).oclAsType(VariableDeclaration)-&gt;collect(variable)-&gt;isUnique(name)' UniqueTypeNames='self.declaration-&gt;select(oclIsKindOf(TypeDeclaration)).oclAsType(TypeDeclaration)-&gt;collect(type)-&gt;isUnique(name)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueFunctionNames UniqueVariableNames UniqueTypeNames'"
 * @generated
 */
public interface Declarations extends EObject {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.uppaal.declarations.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The single declarations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declaration</em>' containment reference list.
	 * @see org.muml.uppaal.declarations.DeclarationsPackage#getDeclarations_Declaration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaration> getDeclaration();

} // Declarations
