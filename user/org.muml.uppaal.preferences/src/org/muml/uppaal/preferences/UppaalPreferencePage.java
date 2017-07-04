package org.muml.uppaal.preferences;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class UppaalPreferencePage extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {
	
	private class Extension {
		public String id;
		public String after;
		public IUppaalPreferencesPageExtension implementation;
	}
	private List<Extension> extensions = new ArrayList<Extension>();
	
	public UppaalPreferencePage() {
		super(GRID);
		for (IConfigurationElement element : Platform.getExtensionRegistry().
		        getConfigurationElementsFor("org.muml.uppaal.preferences.preferencesPageExtension")) {
			Extension extension = new Extension();
			extension.id = element.getAttribute("id");
			extension.after = element.getAttribute("after");
			Object impl = null;
			try {
				impl = element.createExecutableExtension("implementation");
			} catch (CoreException e) {
				e.printStackTrace();
			}
			if (impl instanceof IUppaalPreferencesPageExtension) {
				extension.implementation = (IUppaalPreferencesPageExtension) impl;
			}
			if (extension.id != null) {
				extensions.add(extension);
			}
		}
		extensions.sort(new Comparator<Extension>() {
			@Override
			public int compare(Extension e1, Extension e2) {
				if (e1.id.equals(e2.after)) {
					return -1;
				}
				if (e2.id.equals(e1.after)) {
					return 1;
				}
				return 0;
			}
		});
	}

	@Override
	protected void adjustGridLayout() {
		super.adjustGridLayout();
		((GridLayout) getFieldEditorParent().getLayout()).marginTop = 20;
	}

	public void createFieldEditors() {
		Composite parent = getFieldEditorParent();
		for (Extension extension : extensions) {
			extension.implementation.createTableControls(parent);
		}
	}
	
	// Override to make public
    public void addField(FieldEditor editor) {
    	super.addField(editor);
    }


	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(UppaalPreferencesPlugin.getDefault()
				.getPreferenceStore());
		for (Extension extension : extensions) {
			extension.implementation.init(this, workbench);
		}
	}
}