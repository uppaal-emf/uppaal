/**
 */
package org.muml.uppaal.requirements.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.uppaal.expressions.impl.ExpressionImpl;
import org.muml.uppaal.requirements.DeadlockExpression;
import org.muml.uppaal.requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deadlock Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DeadlockExpressionImpl extends ExpressionImpl implements DeadlockExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeadlockExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.DEADLOCK_EXPRESSION;
	}

} //DeadlockExpressionImpl
