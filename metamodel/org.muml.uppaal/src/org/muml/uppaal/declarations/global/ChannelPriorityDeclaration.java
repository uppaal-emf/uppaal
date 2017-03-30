/**
 */
package org.muml.uppaal.declarations.global;

import org.eclipse.emf.common.util.EList;
import org.muml.uppaal.declarations.Declaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Priority Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A priority ordering for synchronization channels.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.declarations.global.ChannelPriorityDeclaration#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.declarations.global.GlobalPackage#getChannelPriorityDeclaration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AtMostOneDefaultItem='self.groups.items->select(oclIsKindOf(uppaal::declarations::global::DefaultItem))->size() <= 1' EachChannelContainedAtMostOnce='self.groups.items\r\n->select(oclIsKindOf(uppaal::declarations::global::ChannelItem))\r\n->collect(oclAsType(uppaal::declarations::global::ChannelItem))\r\n->isUnique(channelExpression.identifier)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtMostOneDefaultItem EachChannelContainedAtMostOnce'"
 * @generated
 */
public interface ChannelPriorityDeclaration extends Declaration {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.uppaal.declarations.global.ChannelPriorityGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The items of the channel priority ordering.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see org.muml.uppaal.declarations.global.GlobalPackage#getChannelPriorityDeclaration_Groups()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ChannelPriorityGroup> getGroups();

} // ChannelPriorityDeclaration
