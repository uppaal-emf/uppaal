package org.muml.uppaal.cmd;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.preference.IPreferenceStore;
import org.muml.core.common.cmd.PathCommand;
import org.muml.uppaal.preferences.UppaalPreferencesPlugin;

public class VerifyTACommand extends PathCommand {
	
	public VerifyTACommand() {
		super(getVerifyTAPath());
		
	}
	
	private static IPath getVerifyTAPath() {
	    IPreferenceStore preferenceStore = UppaalPreferencesPlugin.getDefault().getPreferenceStore();
	    
	    String value = preferenceStore.getString(UppaalPreferencesPlugin.VERIFYTA_KEY);
	    
	    if (value == null || value.isEmpty()) {
	    	throw new IllegalStateException("No path to the UPPAAL verifyta executable has been set in the preferences yet.");
	    }
	    
        return Path.fromOSString(value);
	}
				
}
