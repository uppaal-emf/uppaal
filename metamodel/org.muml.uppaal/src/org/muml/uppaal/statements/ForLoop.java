/**
 */
package org.muml.uppaal.statements;

import org.muml.uppaal.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A for-loop statement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.statements.ForLoop#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link org.muml.uppaal.statements.ForLoop#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.muml.uppaal.statements.ForLoop#getIteration <em>Iteration</em>}</li>
 *   <li>{@link org.muml.uppaal.statements.ForLoop#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.statements.StatementsPackage#getForLoop()
 * @model
 * @generated
 */
public interface ForLoop extends Statement {
	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The initialization expression of the for loop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialization</em>' containment reference.
	 * @see #setInitialization(Expression)
	 * @see org.muml.uppaal.statements.StatementsPackage#getForLoop_Initialization()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getInitialization();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.statements.ForLoop#getInitialization <em>Initialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialization</em>' containment reference.
	 * @see #getInitialization()
	 * @generated
	 */
	void setInitialization(Expression value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The condition of the for loop, represented by a boolean expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.muml.uppaal.statements.StatementsPackage#getForLoop_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.statements.ForLoop#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Iteration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The iteration statements of the for loop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iteration</em>' containment reference.
	 * @see #setIteration(Expression)
	 * @see org.muml.uppaal.statements.StatementsPackage#getForLoop_Iteration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getIteration();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.statements.ForLoop#getIteration <em>Iteration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iteration</em>' containment reference.
	 * @see #getIteration()
	 * @generated
	 */
	void setIteration(Expression value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The statement to be evaluated for every value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(Statement)
	 * @see org.muml.uppaal.statements.StatementsPackage#getForLoop_Statement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getStatement();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.statements.ForLoop#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

} // ForLoop
