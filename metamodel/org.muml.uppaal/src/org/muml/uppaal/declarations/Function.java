/**
 */
package org.muml.uppaal.declarations;

import org.eclipse.emf.common.util.EList;
import org.muml.uppaal.core.NamedElement;
import org.muml.uppaal.statements.Block;
import org.muml.uppaal.types.TypeDefinition;

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
 *   <li>{@link org.muml.uppaal.declarations.Function#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.muml.uppaal.declarations.Function#getBlock <em>Block</em>}</li>
 *   <li>{@link org.muml.uppaal.declarations.Function#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.declarations.DeclarationsPackage#getFunction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ValidReturnType='(not returnType.oclIsUndefined())\r\nimplies\r\n(returnType.baseType = types::BuiltInType::VOID or\r\n returnType.baseType = types::BuiltInType::INT or\r\n returnType.baseType = types::BuiltInType::BOOL)' UniqueParameterNames='self.parameter-&gt;collect(variableDeclaration)-&gt;collect(variable)-&gt;isUnique(name)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidReturnType UniqueParameterNames'"
 * @generated
 */
public interface Function extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The return type of this function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(TypeDefinition)
	 * @see org.muml.uppaal.declarations.DeclarationsPackage#getFunction_ReturnType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeDefinition getReturnType();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.declarations.Function#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(TypeDefinition value);

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
	 * The list contents are of type {@link org.muml.uppaal.declarations.Parameter}.
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
	EList<Parameter> getParameter();

} // Function
