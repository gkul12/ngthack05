package com.cg.backend.exception;

public class FlightDoesNotExistsException extends Exception
{
	public FlightDoesNotExistsException() {}
	
	public String toString()
	{
		return "No Flight exists for given flight number";
	}
}
