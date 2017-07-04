
package org.muml.uppaal.requirements.properties.requirements.editor;

/**
 * @generated
 */
public class LeadsToPropertyEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public LeadsToPropertyEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
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
	public LeadsToPropertyEditor(String tab) {
		this(tab, org.muml.uppaal.requirements.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.uppaal.requirements.RequirementsPackage.eINSTANCE.getLeadsToProperty());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new LeadsToPropertyEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{}).contains(tab);
		}
	}

}
