/**
 */
package org.muml.uppaal.options;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>State Space Reduction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * NONE stores all reachable states. Uses most memory, but avoids that any state is
 * explored more than once.
 * CONSERVATIVE stores all non-committed states. Less memory when committed locations are
 * used, and for most models states are only explored once.
 * AGGRESSIVE tries hard to reduce the number of states stored. Uses much less memory, but
 * might take much more time.
 * <!-- end-model-doc -->
 * @see org.muml.uppaal.options.OptionsPackage#getStateSpaceReduction()
 * @model
 * @generated
 */
public enum StateSpaceReduction implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "none"),

	/**
	 * The '<em><b>CONSERVATIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSERVATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	CONSERVATIVE(1, "CONSERVATIVE", "conservative"),

	/**
	 * The '<em><b>AGGRESSIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGRESSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	AGGRESSIVE(2, "AGGRESSIVE", "aggressive");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model literal="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>CONSERVATIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONSERVATIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSERVATIVE
	 * @model literal="conservative"
	 * @generated
	 * @ordered
	 */
	public static final int CONSERVATIVE_VALUE = 1;

	/**
	 * The '<em><b>AGGRESSIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AGGRESSIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGGRESSIVE
	 * @model literal="aggressive"
	 * @generated
	 * @ordered
	 */
	public static final int AGGRESSIVE_VALUE = 2;

	/**
	 * An array of all the '<em><b>State Space Reduction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StateSpaceReduction[] VALUES_ARRAY =
		new StateSpaceReduction[] {
			NONE,
			CONSERVATIVE,
			AGGRESSIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>State Space Reduction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StateSpaceReduction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>State Space Reduction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateSpaceReduction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateSpaceReduction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Space Reduction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateSpaceReduction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateSpaceReduction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Space Reduction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateSpaceReduction get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case CONSERVATIVE_VALUE: return CONSERVATIVE;
			case AGGRESSIVE_VALUE: return AGGRESSIVE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StateSpaceReduction(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //StateSpaceReduction
