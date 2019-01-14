/**
 */
package org.muml.uppaal.statements;

import org.muml.uppaal.declarations.VariableContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iteration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An iteration over all possible values of a bounded type using the 'for' keyword.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.statements.Iteration#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.statements.StatementsPackage#getIteration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SingleVariable='self.variable-&gt;size() &lt;= 1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SingleVariable'"
 * @generated
 */
public interface Iteration extends Statement, VariableContainer {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The statement to be evaluated for every value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(Statement)
	 * @see org.muml.uppaal.statements.StatementsPackage#getIteration_Statement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getStatement();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.statements.Iteration#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

} // Iteration
