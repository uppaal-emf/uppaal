
package org.muml.uppaal.trace.properties.trace.editor;

/**
 * @generated
 */
public class SingleNamedElementReferenceEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public SingleNamedElementReferenceEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorNamedElement_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorIndexes_org_muml_uppaalTab_Editor(), false);

		} else if ("org.muml.uppaal".equals(tab)) { // Tab Uppaal

			addPropertyEditor(createEditorNamedElement_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorIndexes_org_muml_uppaalTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorNamedElement_org_muml_uppaalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorNamedElement_org_muml_uppaalTab_Editor() {
		if (this.editorNamedElement_org_muml_uppaalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.trace.TracePackage.eINSTANCE
					.getSingleNamedElementReference_NamedElement();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorNamedElement_org_muml_uppaalTab = editor;
		}
		return this.editorNamedElement_org_muml_uppaalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorIndexes_org_muml_uppaalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorIndexes_org_muml_uppaalTab_Editor() {
		if (this.editorIndexes_org_muml_uppaalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.trace.TracePackage.eINSTANCE
					.getSingleNamedElementReference_Indexes();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			this.editorIndexes_org_muml_uppaalTab = editor;
		}
		return this.editorIndexes_org_muml_uppaalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public SingleNamedElementReferenceEditor(String tab) {
		this(tab, org.muml.uppaal.trace.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.uppaal.trace.TracePackage.eINSTANCE.getSingleNamedElementReference());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new SingleNamedElementReferenceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"org.muml.uppaal", "org.muml.uppaal"}).contains(tab);
		}
	}

}
