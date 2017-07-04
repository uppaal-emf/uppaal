
package org.muml.uppaal.properties.templates.editor;

/**
 * @generated
 */
public class EdgeEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public EdgeEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorColorCode_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorComment_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorBendPoint_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorSource_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorTarget_org_muml_uppaalTab_Editor(), false);

		} else if ("org.muml.uppaal".equals(tab)) { // Tab Uppaal

			addPropertyEditor(createEditorColorCode_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorComment_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorBendPoint_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorSource_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorTarget_org_muml_uppaalTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSource_org_muml_uppaalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSource_org_muml_uppaalTab_Editor() {
		if (this.editorSource_org_muml_uppaalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.templates.TemplatesPackage.eINSTANCE
					.getEdge_Source();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The source location of the edge.");

			this.editorSource_org_muml_uppaalTab = editor;
		}
		return this.editorSource_org_muml_uppaalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTarget_org_muml_uppaalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorTarget_org_muml_uppaalTab_Editor() {
		if (this.editorTarget_org_muml_uppaalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.templates.TemplatesPackage.eINSTANCE
					.getEdge_Target();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The target location of the edge.");

			this.editorTarget_org_muml_uppaalTab = editor;
		}
		return this.editorTarget_org_muml_uppaalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorColorCode_org_muml_uppaalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorColorCode_org_muml_uppaalTab_Editor() {
		if (this.editorColorCode_org_muml_uppaalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.visuals.VisualsPackage.eINSTANCE
					.getColoredElement_ColorCode();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage(
					"The hexadecimal color code of the model element that must be defined if a self-defined color should be used.");

			this.editorColorCode_org_muml_uppaalTab = editor;
		}
		return this.editorColorCode_org_muml_uppaalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComment_org_muml_uppaalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComment_org_muml_uppaalTab_Editor() {
		if (this.editorComment_org_muml_uppaalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.core.CorePackage.eINSTANCE
					.getCommentableElement_Comment();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("The comment for the model element.\n\\todocg{Change cardinality to 1..1?}");

			this.editorComment_org_muml_uppaalTab = editor;
		}
		return this.editorComment_org_muml_uppaalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBendPoint_org_muml_uppaalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBendPoint_org_muml_uppaalTab_Editor() {
		if (this.editorBendPoint_org_muml_uppaalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.visuals.VisualsPackage.eINSTANCE
					.getLinearElement_BendPoint();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The bend points of the linear model element.");

			this.editorBendPoint_org_muml_uppaalTab = editor;
		}
		return this.editorBendPoint_org_muml_uppaalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public EdgeEditor(String tab) {
		this(tab, org.muml.uppaal.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.uppaal.templates.TemplatesPackage.eINSTANCE.getEdge());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new EdgeEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"org.muml.uppaal", "org.muml.uppaal",
					"org.muml.uppaal", "org.muml.uppaal", "org.muml.uppaal"}).contains(tab);
		}
	}

}
