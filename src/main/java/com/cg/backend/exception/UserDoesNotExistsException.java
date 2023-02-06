package com.cg.backend.exception;

public class UserDoesNotExistsException extends Exception
{
	public UserDoesNotExistsException() {}
	
	public String toString()
	{
		return "User does not exists";
	}

}
