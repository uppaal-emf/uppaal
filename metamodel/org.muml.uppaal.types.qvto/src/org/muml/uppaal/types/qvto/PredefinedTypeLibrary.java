package org.muml.uppaal.types.qvto;

import org.muml.uppaal.types.PredefinedType;
import org.muml.uppaal.types.StdLib;

public class PredefinedTypeLibrary {
		
	public PredefinedType getInt()
	{
		return StdLib.INT;
	}
	
	public PredefinedType getBool()
	{
		return StdLib.BOOL;
	}
	
	public PredefinedType getVoid()
	{
		return StdLib.VOID;
	}
	
	public PredefinedType getChan()
	{
		return StdLib.CHAN;
	}
	
	public PredefinedType getClock()
	{
		return StdLib.CLOCK;
	}

}
