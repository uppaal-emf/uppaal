package org.muml.uppaal.cmd.options.misc;

import org.muml.core.common.cmd.Option;
import org.muml.uppaal.cmd.VerifyTACommand;

public class NoOptionSummaryOption extends Option<VerifyTACommand> {

	@Override
	public String getOption() {
		return "q";
	}

}
