package com.cg.backend.exception;

public class AeroplaneNotFoundException extends Exception
{
	public AeroplaneNotFoundException() {}
	
	public String toString()
	{
		return "Aeroplane does not exists";
	}

}
