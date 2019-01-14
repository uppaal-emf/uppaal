/**
 */
package org.muml.uppaal.expressions;

import org.eclipse.emf.common.util.EList;
import org.muml.uppaal.declarations.Function;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An expression representing a call to a function.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.expressions.FunctionCallExpression#getFunction <em>Function</em>}</li>
 *   <li>{@link org.muml.uppaal.expressions.FunctionCallExpression#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.expressions.ExpressionsPackage#getFunctionCallExpression()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NumberOfArgumentsMatchesDeclaration='(not self.function.oclIsUndefined())\r\nimplies\r\nself.argument-&gt;size() = self.function.parameter-&gt;size()'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NumberOfArgumentsMatchesDeclaration'"
 * @generated
 */
public interface FunctionCallExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The function to be called.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(Function)
	 * @see org.muml.uppaal.expressions.ExpressionsPackage#getFunctionCallExpression_Function()
	 * @model required="true"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.expressions.FunctionCallExpression#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.uppaal.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of expressions representing the argument values for the function call. Must conform to the parameters of the function declaration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.muml.uppaal.expressions.ExpressionsPackage#getFunctionCallExpression_Argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArgument();

} // FunctionCallExpression
