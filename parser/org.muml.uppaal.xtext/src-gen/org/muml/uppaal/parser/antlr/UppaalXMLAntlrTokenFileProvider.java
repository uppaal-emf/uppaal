/*
 * generated by Xtext
 */
package org.muml.uppaal.parser.antlr;

import java.io.InputStream;

import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class UppaalXMLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/muml/uppaal/parser/antlr/internal/InternalUppaalXML.tokens");
	}
}
