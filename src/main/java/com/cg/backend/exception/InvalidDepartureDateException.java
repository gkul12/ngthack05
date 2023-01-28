package com.cg.backend.exception;

public class InvalidDepartureDateException extends Exception
{
	public InvalidDepartureDateException()
	{
		
	}
	
	public String toString()
	{
		return "Invalid Departure Date";
	}
}
