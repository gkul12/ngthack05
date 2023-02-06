package com.cg.backend.exception;

public class EmptyTicketListException extends Exception
{
	public EmptyTicketListException() {}

	public String toString()
	{
		return "Ticket List is empty";
	}
}
