/**
 */
package org.muml.uppaal.templates;

import org.muml.uppaal.declarations.VariableContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A non-deterministic selection of a value from a range. The range is specified by a bounded type.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.uppaal.templates.TemplatesPackage#getSelection()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SingleVariable='self.variable-&gt;size() &lt;= 1' IntegerBasedType='(not self.typeDefinition.oclIsUndefined())\r\nimplies\r\nself.typeDefinition.baseType = types::BuiltInType::INT'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SingleVariable IntegerBasedType'"
 * @generated
 */
public interface Selection extends VariableContainer {
} // Selection
