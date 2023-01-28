package com.cg.backend.exception;

public class SourceDestinationException extends Exception
{
	public SourceDestinationException() {}
	
	public String toString()
	{
		return "Source and Destination must be different";
	}
}
