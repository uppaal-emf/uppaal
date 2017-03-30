/**
 */
package org.muml.uppaal.declarations.global.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.uppaal.declarations.Declaration;
import org.muml.uppaal.declarations.global.ChannelItem;
import org.muml.uppaal.declarations.global.ChannelPriorityDeclaration;
import org.muml.uppaal.declarations.global.ChannelPriorityGroup;
import org.muml.uppaal.declarations.global.DefaultItem;
import org.muml.uppaal.declarations.global.GlobalPackage;
import org.muml.uppaal.declarations.global.PriorityItem;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.muml.uppaal.declarations.global.GlobalPackage
 * @generated
 */
public class GlobalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GlobalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalSwitch() {
		if (modelPackage == null) {
			modelPackage = GlobalPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GlobalPackage.CHANNEL_PRIORITY_DECLARATION: {
				ChannelPriorityDeclaration channelPriorityDeclaration = (ChannelPriorityDeclaration)theEObject;
				T result = caseChannelPriorityDeclaration(channelPriorityDeclaration);
				if (result == null) result = caseDeclaration(channelPriorityDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GlobalPackage.CHANNEL_PRIORITY_GROUP: {
				ChannelPriorityGroup channelPriorityGroup = (ChannelPriorityGroup)theEObject;
				T result = caseChannelPriorityGroup(channelPriorityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GlobalPackage.PRIORITY_ITEM: {
				PriorityItem priorityItem = (PriorityItem)theEObject;
				T result = casePriorityItem(priorityItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GlobalPackage.CHANNEL_ITEM: {
				ChannelItem channelItem = (ChannelItem)theEObject;
				T result = caseChannelItem(channelItem);
				if (result == null) result = casePriorityItem(channelItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GlobalPackage.DEFAULT_ITEM: {
				DefaultItem defaultItem = (DefaultItem)theEObject;
				T result = caseDefaultItem(defaultItem);
				if (result == null) result = casePriorityItem(defaultItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Priority Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Priority Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelPriorityDeclaration(ChannelPriorityDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Priority Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Priority Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelPriorityGroup(ChannelPriorityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Priority Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Priority Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriorityItem(PriorityItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelItem(ChannelItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultItem(DefaultItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GlobalSwitch
