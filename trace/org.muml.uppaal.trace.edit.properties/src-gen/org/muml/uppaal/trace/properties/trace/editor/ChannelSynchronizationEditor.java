
package org.muml.uppaal.trace.properties.trace.editor;

/**
 * @generated
 */
public class ChannelSynchronizationEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ChannelSynchronizationEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorChannel_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorKind_org_muml_uppaalTab_Editor(), false);

		} else if ("org.muml.uppaal".equals(tab)) { // Tab Uppaal

			addPropertyEditor(createEditorChannel_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorKind_org_muml_uppaalTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorChannel_org_muml_uppaalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorChannel_org_muml_uppaalTab_Editor() {
		if (this.editorChannel_org_muml_uppaalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.trace.TracePackage.eINSTANCE
					.getChannelSynchronization_Channel();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorChannel_org_muml_uppaalTab = editor;
		}
		return this.editorChannel_org_muml_uppaalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorKind_org_muml_uppaalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorKind_org_muml_uppaalTab_Editor() {
		if (this.editorKind_org_muml_uppaalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.trace.TracePackage.eINSTANCE
					.getChannelSynchronization_Kind();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			this.editorKind_org_muml_uppaalTab = editor;
		}
		return this.editorKind_org_muml_uppaalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ChannelSynchronizationEditor(String tab) {
		this(tab, org.muml.uppaal.trace.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.uppaal.trace.TracePackage.eINSTANCE.getChannelSynchronization());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ChannelSynchronizationEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"org.muml.uppaal", "org.muml.uppaal"}).contains(tab);
		}
	}

}
