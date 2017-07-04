package org.muml.uppaal.cmd.options.misc;

import java.util.Collections;
import java.util.List;

import org.muml.core.common.cmd.Option;
import org.muml.core.common.cmd.OptionArgument;
import org.muml.uppaal.cmd.VerifyTACommand;

public class SeedOption extends Option<VerifyTACommand> {
	
	public SeedOption(int seed) {
		this.seed = seed;
	}
	
	private int seed;
	
	@Override
	public String getOption() {
		return "r";
	}
	
	@Override
	public List<? extends OptionArgument<SeedOption>> getArguments() {
	
		return Collections.singletonList(
			
			new OptionArgument<SeedOption>() {
				
				@Override
				public String getArgument() {
					return String.valueOf(seed);
				}
		
			}
				
		);	
		
	}

}
