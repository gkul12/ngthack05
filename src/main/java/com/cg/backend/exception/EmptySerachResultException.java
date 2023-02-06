package com.cg.backend.exception;

public class EmptySerachResultException extends Exception
{
	public EmptySerachResultException() {};

	public String toString()
	{
		return "Sorry User currently no flights are available for this route";
	}
}
