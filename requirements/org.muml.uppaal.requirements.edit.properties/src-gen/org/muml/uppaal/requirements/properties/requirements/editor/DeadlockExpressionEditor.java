
package org.muml.uppaal.requirements.properties.requirements.editor;

/**
 * @generated
 */
public class DeadlockExpressionEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public DeadlockExpressionEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

		} else {
		}
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public DeadlockExpressionEditor(String tab) {
		this(tab, org.muml.uppaal.requirements.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.uppaal.requirements.RequirementsPackage.eINSTANCE.getDeadlockExpression());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new DeadlockExpressionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{}).contains(tab);
		}
	}

}
