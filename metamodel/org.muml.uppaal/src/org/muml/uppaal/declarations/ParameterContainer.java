/**
 */
package org.muml.uppaal.declarations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A container for single instances of Parameter, used for function and template parameters.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.uppaal.declarations.DeclarationsPackage#getParameterContainer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SingleParameter='self.elements->size() <= 1' ParametersOnly='self.elements->forAll(oclIsKindOf(declarations::Parameter))'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SingleParameter ParametersOnly'"
 * @generated
 */
public interface ParameterContainer extends TypedElementContainer {
} // ParameterContainer
