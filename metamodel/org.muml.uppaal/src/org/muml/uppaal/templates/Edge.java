/**
 */
package org.muml.uppaal.templates;

import org.eclipse.emf.common.util.EList;
import org.muml.uppaal.core.CommentableElement;
import org.muml.uppaal.expressions.Expression;
import org.muml.uppaal.visuals.ColoredElement;
import org.muml.uppaal.visuals.LinearElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An edge connecting two locations inside a template.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.templates.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link org.muml.uppaal.templates.Edge#getTarget <em>Target</em>}</li>
 *   <li>{@link org.muml.uppaal.templates.Edge#getParentTemplate <em>Parent Template</em>}</li>
 *   <li>{@link org.muml.uppaal.templates.Edge#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.muml.uppaal.templates.Edge#getUpdate <em>Update</em>}</li>
 *   <li>{@link org.muml.uppaal.templates.Edge#getSynchronization <em>Synchronization</em>}</li>
 *   <li>{@link org.muml.uppaal.templates.Edge#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.templates.TemplatesPackage#getEdge()
 * @model extendedMetaData="name='Edge' kind='empty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueParentTemplate='(not (self.source.oclIsUndefined() or self.target.oclIsUndefined()))\r\nimplies\r\nself.source.parentTemplate = self.target.parentTemplate'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueParentTemplate'"
 * @generated
 */
public interface Edge extends LinearElement, CommentableElement, ColoredElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.uppaal.templates.Location#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source location of the edge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Location)
	 * @see org.muml.uppaal.templates.TemplatesPackage#getEdge_Source()
	 * @see org.muml.uppaal.templates.Location#getOutgoingEdges
	 * @model opposite="outgoingEdges" required="true"
	 *        extendedMetaData="kind='attribute' name='source'"
	 * @generated
	 */
	Location getSource();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.templates.Edge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Location value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.uppaal.templates.Location#getIncomingEdges <em>Incoming Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target location of the edge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Location)
	 * @see org.muml.uppaal.templates.TemplatesPackage#getEdge_Target()
	 * @see org.muml.uppaal.templates.Location#getIncomingEdges
	 * @model opposite="incomingEdges" required="true"
	 *        extendedMetaData="kind='attribute' name='target'"
	 * @generated
	 */
	Location getTarget();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.templates.Edge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Location value);

	/**
	 * Returns the value of the '<em><b>Parent Template</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.uppaal.templates.Template#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent template containing the edge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Template</em>' container reference.
	 * @see #setParentTemplate(Template)
	 * @see org.muml.uppaal.templates.TemplatesPackage#getEdge_ParentTemplate()
	 * @see org.muml.uppaal.templates.Template#getEdge
	 * @model opposite="edge" required="true" transient="false"
	 * @generated
	 */
	Template getParentTemplate();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.templates.Edge#getParentTemplate <em>Parent Template</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Template</em>' container reference.
	 * @see #getParentTemplate()
	 * @generated
	 */
	void setParentTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The guard expression of the edge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Expression)
	 * @see org.muml.uppaal.templates.TemplatesPackage#getEdge_Guard()
	 * @model containment="true"
	 * @generated
	 */
	Expression getGuard();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.templates.Edge#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Expression value);

	/**
	 * Returns the value of the '<em><b>Update</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.uppaal.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of update expressions for the edge, evaluated if the edge fires.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update</em>' containment reference list.
	 * @see org.muml.uppaal.templates.TemplatesPackage#getEdge_Update()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getUpdate();

	/**
	 * Returns the value of the '<em><b>Synchronization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A synchronization performed when the edge fires.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synchronization</em>' containment reference.
	 * @see #setSynchronization(Synchronization)
	 * @see org.muml.uppaal.templates.TemplatesPackage#getEdge_Synchronization()
	 * @model containment="true"
	 * @generated
	 */
	Synchronization getSynchronization();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.templates.Edge#getSynchronization <em>Synchronization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronization</em>' containment reference.
	 * @see #getSynchronization()
	 * @generated
	 */
	void setSynchronization(Synchronization value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.uppaal.templates.Selection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of non-deterministic value selections.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selection</em>' containment reference list.
	 * @see org.muml.uppaal.templates.TemplatesPackage#getEdge_Selection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Selection> getSelection();

} // Edge
