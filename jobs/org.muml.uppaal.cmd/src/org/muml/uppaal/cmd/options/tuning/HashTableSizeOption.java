package org.muml.uppaal.cmd.options.tuning;

import java.util.Collections;
import java.util.List;

import org.muml.core.common.cmd.Option;
import org.muml.core.common.cmd.OptionArgument;
import org.muml.uppaal.cmd.VerifyTACommand;

public class HashTableSizeOption extends Option<VerifyTACommand> {
	
	public HashTableSizeOption(int n) {
		this.n = n;
	}
	
	private int n;
	
	@Override
	public String getOption() {
		return "H";
	}
	
	@Override
	public List<? extends OptionArgument<HashTableSizeOption>> getArguments() {
	
		return Collections.singletonList(
			
			new OptionArgument<HashTableSizeOption>() {
				
				@Override
				public String getArgument() {
					return String.valueOf(n);
				}
		
			}
				
		);	
		
	}

}
