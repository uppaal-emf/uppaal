/**
 */
package org.muml.uppaal.declarations;

import org.muml.uppaal.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An index specified by an expression value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.declarations.ValueIndex#getSizeExpression <em>Size Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.declarations.DeclarationsPackage#getValueIndex()
 * @model
 * @generated
 */
public interface ValueIndex extends Index {
	/**
	 * Returns the value of the '<em><b>Size Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer-based expression representing size and range of the indexed type or variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size Expression</em>' containment reference.
	 * @see #setSizeExpression(Expression)
	 * @see org.muml.uppaal.declarations.DeclarationsPackage#getValueIndex_SizeExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getSizeExpression();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.declarations.ValueIndex#getSizeExpression <em>Size Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Expression</em>' containment reference.
	 * @see #getSizeExpression()
	 * @generated
	 */
	void setSizeExpression(Expression value);

} // ValueIndex
