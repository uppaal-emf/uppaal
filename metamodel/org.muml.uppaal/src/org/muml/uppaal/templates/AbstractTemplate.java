/**
 */
package org.muml.uppaal.templates;

import org.eclipse.emf.common.util.EList;
import org.muml.uppaal.core.CommentableElement;
import org.muml.uppaal.core.NamedElement;
import org.muml.uppaal.declarations.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for ordinary timed automata templates as well as redefined templates.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.templates.AbstractTemplate#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.templates.TemplatesPackage#getAbstractTemplate()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueParameterNames='self.parameter-&gt;collect(variableDeclaration)-&gt;collect(variable)-&gt;isUnique(name)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueParameterNames'"
 * @generated
 */
public interface AbstractTemplate extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.uppaal.declarations.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter declarations of the template.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.muml.uppaal.templates.TemplatesPackage#getAbstractTemplate_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // AbstractTemplate
