package org.muml.uppaal.valueconversion;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class UppaalValueConverter extends DefaultTerminalConverters {

	public UppaalValueConverter() {
		super();
	}
	
	@ValueConverter(rule = "QUOTED_INT")
	public IValueConverter<Integer> QUOTED_INT() {
		return new IValueConverter<Integer>() {

			public String toString(Integer value) {
				return "\"" + value + "\"";
			}

			public Integer toValue(String string, INode node)
					throws ValueConverterException {

				if (string == null || string.length() <= 2) {
					throw new ValueConverterException(
							"Only integer values are allowed.", node, null);
				}

				// Trim quotes.
				string = string.substring(1, string.length() - 1).trim();

				// Check format.
				if (!string.matches("-?[0-9]+")) {
					throw new ValueConverterException(
							"Only integer values are allowed.", node, null);
				}

				return Integer.valueOf(string);
			}

		};

	}
	
	@ValueConverter(rule = "ChannelPrefixExpression_Urgent")
	public IValueConverter<Boolean> ChannelPrefixExpression_Urgent() {
		return new IValueConverter<Boolean>() {
			public String toString(Boolean value) {
				return (value.booleanValue()) ? "urgent" : "";
			}

			public Boolean toValue(String string, INode node)
					throws ValueConverterException {
				return string.equals("urgent");
			}
		};
	}
	
	@ValueConverter(rule = "ChannelPrefixExpression_Broadcast")
	public IValueConverter<Boolean> ChannelPrefixExpression_Broadcast() {
		return new IValueConverter<Boolean>() {
			public String toString(Boolean value) {
				return (value.booleanValue()) ? "broadcast" : "";
			}

			public Boolean toValue(String string, INode node)
					throws ValueConverterException {
				return string.equals("broadcast");
			}
		};
	}
}
