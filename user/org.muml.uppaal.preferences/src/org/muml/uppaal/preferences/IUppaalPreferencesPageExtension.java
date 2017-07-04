package org.muml.uppaal.preferences;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;

public interface IUppaalPreferencesPageExtension {
	public void init(UppaalPreferencePage page, IWorkbench workbench);
	public void createTableControls(Composite parent);
}
