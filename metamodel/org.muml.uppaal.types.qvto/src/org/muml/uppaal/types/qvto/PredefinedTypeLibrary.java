package org.muml.uppaal.types.qvto;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.muml.uppaal.types.Library;
import org.muml.uppaal.types.PredefinedType;

public class PredefinedTypeLibrary {

	public PredefinedTypeLibrary() {

	}
	
	private static Library LIBRARY = null;
	private static PredefinedType INT = null;
	private static PredefinedType BOOL = null;
	private static PredefinedType VOID = null;
	private static PredefinedType CHAN = null;
	private static PredefinedType CLOCK = null;
	
	public PredefinedType getInt()
	{
		this.getLibrary();
		if (INT == null)
			throw new RuntimeException("Could not find PredefinedType 'int'");
		return INT;
	}
	
	public PredefinedType getBool()
	{
		this.getLibrary();
		if (BOOL == null)
			throw new RuntimeException("Could not find PredefinedType 'bool'");
		return BOOL;
	}
	
	public PredefinedType getVoid()
	{
		this.getLibrary();
		if (VOID == null)
			throw new RuntimeException("Could not find PredefinedType 'void'");
		return VOID;
	}
	
	public PredefinedType getChan()
	{
		this.getLibrary();
		if (CHAN == null)
			throw new RuntimeException("Could not find PredefinedType 'chan'");
		return CHAN;
	}
	
	public PredefinedType getClock()
	{
		this.getLibrary();
		if (CLOCK == null)
			throw new RuntimeException("Could not find PredefinedType 'clock'");
		return CLOCK;
	}

	private void getLibrary()
	{
		if (LIBRARY == null)
		{
			ResourceSet set = new ResourceSetImpl();
			Resource res = set.getResource(URI.createURI("platform:/plugin/org.muml.uppaal/model/stdlib.xmi", false), true);
			LIBRARY = (Library) res.getContents().get(0);
			
			for (PredefinedType type : LIBRARY.getTypes())
			{
				if ("int".equals(type.getName()))
					INT = type;
				else if ("bool".equals(type.getName()))
					BOOL = type;
				else if ("void".equals(type.getName()))
					VOID = type;
				else if ("chan".equals(type.getName()))
					CHAN = type;
				else if ("clock".equals(type.getName()))
					CLOCK = type;
			}
		}
	}
}
