
package org.muml.uppaal.options.properties.editor;

/**
 * @generated
 */
public class CoordinationProtocolOptionsEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public CoordinationProtocolOptionsEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorConnectorOutBufferSize_optionsTab_Editor(), false);

			addPropertyEditor(createEditorHashTableSize_optionsTab_Editor(), false);

			addPropertyEditor(createEditorStateSpaceReduction_optionsTab_Editor(), false);

			addPropertyEditor(createEditorTraceOptions_optionsTab_Editor(), false);

			addPropertyEditor(createEditorRoleMultiplicity_optionsTab_Editor(), false);

		} else if ("options".equals(tab)) { // Tab Options

			addPropertyEditor(createEditorConnectorOutBufferSize_optionsTab_Editor(), false);

			addPropertyEditor(createEditorHashTableSize_optionsTab_Editor(), false);

			addPropertyEditor(createEditorStateSpaceReduction_optionsTab_Editor(), false);

			addPropertyEditor(createEditorTraceOptions_optionsTab_Editor(), false);

			addPropertyEditor(createEditorRoleMultiplicity_optionsTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorRoleMultiplicity_optionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorRoleMultiplicity_optionsTab_Editor() {
		if (this.editorRoleMultiplicity_optionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.options.OptionsPackage.eINSTANCE
					.getCoordinationProtocolOptions_RoleMultiplicity();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			{
				final org.eclipse.ocl.ecore.OCLExpression expression = org.muml.ape.runtime.RuntimePlugin
						.createOCLExpression(
								"not self.extension->exists(ext | ext.oclAsType(HideOptionExtension).option = 'roleMultiplicity')",
								feature, getEClass());
				editor.setInput(input);
				editor.registerOCLAdapter(new org.eclipse.emf.common.notify.impl.AdapterImpl() {
					@Override
					public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
						boolean visibleBefore = editor.isVisible();
						editor.updateVisibility(true);

						// Set default value, if we are hiding the editor and it was not hidden before.
						if (!editor.isVisible() && visibleBefore) {
							editor.setDefaultValue();
						}
					}
				});
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = org.muml.ape.runtime.RuntimePlugin.OCL_ECORE
						.createQuery(expression);
				org.eclipse.jface.viewers.IFilter filter = new org.eclipse.jface.viewers.IFilter() {

					@Override
					public boolean select(Object object) {
						return object != null && Boolean.TRUE.equals(query.evaluate(object));
					}

				};
				if (filter != null && expression != null) {
					editor.addVisibilityFilter(filter);
				}
			}

			this.editorRoleMultiplicity_optionsTab = editor;
		}
		return this.editorRoleMultiplicity_optionsTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorConnectorOutBufferSize_optionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorConnectorOutBufferSize_optionsTab_Editor() {
		if (this.editorConnectorOutBufferSize_optionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.options.OptionsPackage.eINSTANCE
					.getOptions_ConnectorOutBufferSize();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			{
				final org.eclipse.ocl.ecore.OCLExpression expression = org.muml.ape.runtime.RuntimePlugin
						.createOCLExpression(
								"not self.extension->exists(ext | ext.oclAsType(HideOptionExtension).option = 'connectorOutBufferSize')",
								feature, getEClass());
				editor.setInput(input);
				editor.registerOCLAdapter(new org.eclipse.emf.common.notify.impl.AdapterImpl() {
					@Override
					public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
						boolean visibleBefore = editor.isVisible();
						editor.updateVisibility(true);

						// Set default value, if we are hiding the editor and it was not hidden before.
						if (!editor.isVisible() && visibleBefore) {
							editor.setDefaultValue();
						}
					}
				});
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = org.muml.ape.runtime.RuntimePlugin.OCL_ECORE
						.createQuery(expression);
				org.eclipse.jface.viewers.IFilter filter = new org.eclipse.jface.viewers.IFilter() {

					@Override
					public boolean select(Object object) {
						return object != null && Boolean.TRUE.equals(query.evaluate(object));
					}

				};
				if (filter != null && expression != null) {
					editor.addVisibilityFilter(filter);
				}
			}

			editor.setTooltipMessage("the size of the outgoing connector buffers");

			this.editorConnectorOutBufferSize_optionsTab = editor;
		}
		return this.editorConnectorOutBufferSize_optionsTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorHashTableSize_optionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorHashTableSize_optionsTab_Editor() {
		if (this.editorHashTableSize_optionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.options.OptionsPackage.eINSTANCE
					.getOptions_HashTableSize();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			{
				final org.eclipse.ocl.ecore.OCLExpression expression = org.muml.ape.runtime.RuntimePlugin
						.createOCLExpression(
								"not self.extension->exists(ext | ext.oclAsType(HideOptionExtension).option = 'hashTableSize')",
								feature, getEClass());
				editor.setInput(input);
				editor.registerOCLAdapter(new org.eclipse.emf.common.notify.impl.AdapterImpl() {
					@Override
					public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
						boolean visibleBefore = editor.isVisible();
						editor.updateVisibility(true);

						// Set default value, if we are hiding the editor and it was not hidden before.
						if (!editor.isVisible() && visibleBefore) {
							editor.setDefaultValue();
						}
					}
				});
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = org.muml.ape.runtime.RuntimePlugin.OCL_ECORE
						.createQuery(expression);
				org.eclipse.jface.viewers.IFilter filter = new org.eclipse.jface.viewers.IFilter() {

					@Override
					public boolean select(Object object) {
						return object != null && Boolean.TRUE.equals(query.evaluate(object));
					}

				};
				if (filter != null && expression != null) {
					editor.addVisibilityFilter(filter);
				}
			}

			editor.setTooltipMessage("the hash table size for bit state hashing will be 2^hashTableSize");

			this.editorHashTableSize_optionsTab = editor;
		}
		return this.editorHashTableSize_optionsTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorStateSpaceReduction_optionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorStateSpaceReduction_optionsTab_Editor() {
		if (this.editorStateSpaceReduction_optionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.options.OptionsPackage.eINSTANCE
					.getOptions_StateSpaceReduction();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			{
				final org.eclipse.ocl.ecore.OCLExpression expression = org.muml.ape.runtime.RuntimePlugin
						.createOCLExpression(
								"not self.extension->exists(ext | ext.oclAsType(HideOptionExtension).option = 'stateSpaceReduction')",
								feature, getEClass());
				editor.setInput(input);
				editor.registerOCLAdapter(new org.eclipse.emf.common.notify.impl.AdapterImpl() {
					@Override
					public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
						boolean visibleBefore = editor.isVisible();
						editor.updateVisibility(true);

						// Set default value, if we are hiding the editor and it was not hidden before.
						if (!editor.isVisible() && visibleBefore) {
							editor.setDefaultValue();
						}
					}
				});
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = org.muml.ape.runtime.RuntimePlugin.OCL_ECORE
						.createQuery(expression);
				org.eclipse.jface.viewers.IFilter filter = new org.eclipse.jface.viewers.IFilter() {

					@Override
					public boolean select(Object object) {
						return object != null && Boolean.TRUE.equals(query.evaluate(object));
					}

				};
				if (filter != null && expression != null) {
					editor.addVisibilityFilter(filter);
				}
			}

			editor.setTooltipMessage("options for the state space consumption");

			this.editorStateSpaceReduction_optionsTab = editor;
		}
		return this.editorStateSpaceReduction_optionsTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTraceOptions_optionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorTraceOptions_optionsTab_Editor() {
		if (this.editorTraceOptions_optionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.options.OptionsPackage.eINSTANCE
					.getOptions_TraceOptions();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			{
				final org.eclipse.ocl.ecore.OCLExpression expression = org.muml.ape.runtime.RuntimePlugin
						.createOCLExpression(
								"not self.extension->exists(ext | ext.oclAsType(HideOptionExtension).option = 'traceOptions')",
								feature, getEClass());
				editor.setInput(input);
				editor.registerOCLAdapter(new org.eclipse.emf.common.notify.impl.AdapterImpl() {
					@Override
					public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
						boolean visibleBefore = editor.isVisible();
						editor.updateVisibility(true);

						// Set default value, if we are hiding the editor and it was not hidden before.
						if (!editor.isVisible() && visibleBefore) {
							editor.setDefaultValue();
						}
					}
				});
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = org.muml.ape.runtime.RuntimePlugin.OCL_ECORE
						.createQuery(expression);
				org.eclipse.jface.viewers.IFilter filter = new org.eclipse.jface.viewers.IFilter() {

					@Override
					public boolean select(Object object) {
						return object != null && Boolean.TRUE.equals(query.evaluate(object));
					}

				};
				if (filter != null && expression != null) {
					editor.addVisibilityFilter(filter);
				}
			}

			editor.setTooltipMessage("options for the generated traces");

			this.editorTraceOptions_optionsTab = editor;
		}
		return this.editorTraceOptions_optionsTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtensions_property_tab_extensionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtensions_property_tab_extensionsTab_Editor() {
		if (this.editorExtensions_property_tab_extensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getExtendableElement_Extensions();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Extendable Elements can be extended by an Extension.");

			this.editorExtensions_property_tab_extensionsTab = editor;
		}
		return this.editorExtensions_property_tab_extensionsTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public CoordinationProtocolOptionsEditor(String tab) {
		this(tab, org.muml.uppaal.options.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.uppaal.options.OptionsPackage.eINSTANCE.getCoordinationProtocolOptions());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new CoordinationProtocolOptionsEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"options", "options", "options", "options", "options",
					"property.tab.extensions"}).contains(tab);
		}
	}

}
