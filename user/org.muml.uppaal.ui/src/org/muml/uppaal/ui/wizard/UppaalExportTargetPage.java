package org.muml.uppaal.ui.wizard;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.muml.core.export.pages.AbstractFujabaExportTargetPage;

public class UppaalExportTargetPage extends AbstractFujabaExportTargetPage {
	
	public UppaalExportTargetPage(String name, FormToolkit toolkit) {
		super(name, toolkit);
	}

	@Override
	public boolean wizardPageSupportsOverwriteOption() {
		return true;
	}

	@Override
	public boolean wizardPageDirectoryDestination() {
		return true;
	}

	@Override
	public void createOptions(Composite parent) {
		super.createOptions(parent);
	}
	
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
	}
}
