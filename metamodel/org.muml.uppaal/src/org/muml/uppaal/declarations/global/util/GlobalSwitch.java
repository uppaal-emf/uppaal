/**
 */
package org.muml.uppaal.declarations.global.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.uppaal.declarations.global.*;
import org.muml.uppaal.declarations.global.ChannelList;
import org.muml.uppaal.declarations.global.ChannelPriority;
import org.muml.uppaal.declarations.global.ChannelPriorityItem;
import org.muml.uppaal.declarations.global.DefaultChannelPriority;
import org.muml.uppaal.declarations.global.GlobalPackage;

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
			case GlobalPackage.CHANNEL_PRIORITY: {
				ChannelPriority channelPriority = (ChannelPriority)theEObject;
				T result = caseChannelPriority(channelPriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GlobalPackage.CHANNEL_PRIORITY_ITEM: {
				ChannelPriorityItem channelPriorityItem = (ChannelPriorityItem)theEObject;
				T result = caseChannelPriorityItem(channelPriorityItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GlobalPackage.CHANNEL_LIST: {
				ChannelList channelList = (ChannelList)theEObject;
				T result = caseChannelList(channelList);
				if (result == null) result = caseChannelPriorityItem(channelList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GlobalPackage.DEFAULT_CHANNEL_PRIORITY: {
				DefaultChannelPriority defaultChannelPriority = (DefaultChannelPriority)theEObject;
				T result = caseDefaultChannelPriority(defaultChannelPriority);
				if (result == null) result = caseChannelPriorityItem(defaultChannelPriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelPriority(ChannelPriority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Priority Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Priority Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelPriorityItem(ChannelPriorityItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelList(ChannelList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Channel Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Channel Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultChannelPriority(DefaultChannelPriority object) {
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
