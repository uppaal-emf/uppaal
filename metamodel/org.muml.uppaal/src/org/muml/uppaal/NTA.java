/**
 */
package org.muml.uppaal;

import org.eclipse.emf.common.util.EList;
import org.muml.uppaal.core.CommentableElement;
import org.muml.uppaal.core.NamedElement;
import org.muml.uppaal.declarations.GlobalDeclarations;
import org.muml.uppaal.declarations.SystemDeclarations;
import org.muml.uppaal.templates.Template;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NTA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A 'Network of Timed Automata' as basic input to Uppaal.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.NTA#getGlobalDeclarations <em>Global Declarations</em>}</li>
 *   <li>{@link org.muml.uppaal.NTA#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.muml.uppaal.NTA#getSystemDeclarations <em>System Declarations</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.UppaalPackage#getNTA()
 * @model extendedMetaData="name='NTA' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueTemplateNames='self.template->isUnique(name)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueTemplateNames'"
 * @generated
 */
public interface NTA extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Global Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The global declarations for the NTA.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Global Declarations</em>' containment reference.
	 * @see #setGlobalDeclarations(GlobalDeclarations)
	 * @see org.muml.uppaal.UppaalPackage#getNTA_GlobalDeclarations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='globalDeclarations'"
	 * @generated
	 */
	GlobalDeclarations getGlobalDeclarations();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.NTA#getGlobalDeclarations <em>Global Declarations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Declarations</em>' containment reference.
	 * @see #getGlobalDeclarations()
	 * @generated
	 */
	void setGlobalDeclarations(GlobalDeclarations value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.uppaal.templates.Template}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Timed Automata templates of the NTA.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' containment reference list.
	 * @see org.muml.uppaal.UppaalPackage#getNTA_Template()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='template'"
	 * @generated
	 */
	EList<Template> getTemplate();

	/**
	 * Returns the value of the '<em><b>System Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The declarations of process instantiations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Declarations</em>' containment reference.
	 * @see #setSystemDeclarations(SystemDeclarations)
	 * @see org.muml.uppaal.UppaalPackage#getNTA_SystemDeclarations()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='systemDeclarations'"
	 * @generated
	 */
	SystemDeclarations getSystemDeclarations();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.NTA#getSystemDeclarations <em>System Declarations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Declarations</em>' containment reference.
	 * @see #getSystemDeclarations()
	 * @generated
	 */
	void setSystemDeclarations(SystemDeclarations value);

} // NTA
