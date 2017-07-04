package org.muml.uppaal.cmd.options.tuning;

import org.muml.core.common.cmd.Option;
import org.muml.uppaal.cmd.VerifyTACommand;

public class ReuseStateSpaceOption extends Option<VerifyTACommand> {

	@Override
	public String getOption() {
		return "T";
	}

}
