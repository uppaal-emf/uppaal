/**
 */
package org.muml.uppaal.declarations;

import org.muml.uppaal.declarations.global.ChannelPriority;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Declarations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Global declarations of an NTA.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.declarations.GlobalDeclarations#getChannelPriority <em>Channel Priority</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.declarations.DeclarationsPackage#getGlobalDeclarations()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoTemplateDeclarations='not self.declaration-&gt;exists(oclIsKindOf(system::TemplateDeclaration))'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoTemplateDeclarations'"
 * @generated
 */
public interface GlobalDeclarations extends Declarations {
	/**
	 * Returns the value of the '<em><b>Channel Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The declaration of the synchronization channel priorities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel Priority</em>' containment reference.
	 * @see #setChannelPriority(ChannelPriority)
	 * @see org.muml.uppaal.declarations.DeclarationsPackage#getGlobalDeclarations_ChannelPriority()
	 * @model containment="true"
	 * @generated
	 */
	ChannelPriority getChannelPriority();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.declarations.GlobalDeclarations#getChannelPriority <em>Channel Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Priority</em>' containment reference.
	 * @see #getChannelPriority()
	 * @generated
	 */
	void setChannelPriority(ChannelPriority value);

} // GlobalDeclarations
