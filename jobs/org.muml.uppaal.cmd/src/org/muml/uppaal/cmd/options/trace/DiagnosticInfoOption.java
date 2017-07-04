package org.muml.uppaal.cmd.options.trace;

import java.util.Collections;
import java.util.List;

import org.muml.core.common.cmd.Option;
import org.muml.core.common.cmd.OptionArgument;
import org.muml.uppaal.cmd.VerifyTACommand;

public class DiagnosticInfoOption extends Option<VerifyTACommand> {
	
	public DiagnosticInfoOption(TraceKind kind) {
		this.kind = kind;
	}
	
	private TraceKind kind;
	
	@Override
	public List<? extends OptionArgument<DiagnosticInfoOption>> getArguments() {
	
		return Collections.singletonList(
			
			new OptionArgument<DiagnosticInfoOption>() {
				
				@Override
				public String getArgument() {
					return String.valueOf(kind.getOperator());
				}
		
			}
				
		);	
		
	}
		
	@Override
	public String getOption() {
		return "t";
	}
				
	public enum TraceKind {
		
		Some(0),
        Shortest(1),
        Fastest(2);
		
		private int operator;
		
		private TraceKind(int operator) {
			this.operator = operator;
		}
		
		private int getOperator() {
			return operator;
		}
		
	}

}
