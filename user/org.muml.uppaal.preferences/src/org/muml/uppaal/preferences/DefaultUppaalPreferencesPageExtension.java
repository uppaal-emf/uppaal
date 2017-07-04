package org.muml.uppaal.preferences;

import java.io.File;

import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;

public class DefaultUppaalPreferencesPageExtension implements IUppaalPreferencesPageExtension {
	private UppaalPreferencePage page = null;
	
	@Override
	public void init(UppaalPreferencePage page, IWorkbench workbench) {
		this.page = page;
	}

	@Override
	public void createTableControls(Composite parent) {
		StringFieldEditor uppaalPathEditor = new FileFieldEditor(
				UppaalPreferencesPlugin.VERIFYTA_KEY, "&UPPAAL verifyta path:", parent) {
			protected boolean doCheckState() {
				// Allow empty string
				String fileName = getStringValue();
				fileName = fileName.trim();
				if (fileName.length() == 0 && isEmptyStringAllowed()) {
					return true;
				}

				// Make sure the uppaal binary can be found.
				File verifyta = getVerifyTAFile();
				return isValidVerifyTAFile(verifyta);
			}

			@Override
			protected void doStore() {
				File binary = getVerifyTAFile();
				getPreferenceStore().setValue(getPreferenceName(),
						binary.getAbsolutePath());
			}

			private File getVerifyTAFile() {
				
				return new File(getStringValue());
			
			}
			
			private boolean isValidVerifyTAFile(File file) {
				
				return file.isFile() && file.getName().toLowerCase().startsWith("verifyta");
			}

		};
		uppaalPathEditor
				.setErrorMessage("File is not recognized as UPPAAL verifyta binary.");
		uppaalPathEditor.setEmptyStringAllowed(true);
		page.addField(uppaalPathEditor);
	}

}
