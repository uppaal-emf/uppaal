package org.muml.uppaal.cmd.options.trace;

import org.muml.core.common.cmd.Option;
import org.muml.uppaal.cmd.VerifyTACommand;

public class PrefixOption extends Option<VerifyTACommand> {

	@Override
	public String getOption() {
		return "f";
	}

}
