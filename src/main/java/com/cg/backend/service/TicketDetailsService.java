package com.cg.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.backend.entity.TicketDetails;
import com.cg.backend.entity.User;
import com.cg.backend.exception.EmptyTicketListException;
import com.cg.backend.exception.FlightDoesNotExistsException;
import com.cg.backend.exception.UserDoesNotExistsException;
import com.cg.backend.repository.FlightRepository;
import com.cg.backend.repository.TicketDetailsRepository;
import com.cg.backend.repository.UserDao;

@Service
public class TicketDetailsService 
{
	@Autowired
	TicketDetailsRepository trepo;
	@Autowired
	UserDao udao;
	@Autowired
	FlightRepository frepo;
	
	public List<TicketDetails> getAllTickets(String emailId,int flightNumber) throws UserDoesNotExistsException, EmptyTicketListException
	{
		try
		{
			List<TicketDetails> tList= udao.findByEmail(emailId).get().getTicketList();

			List<TicketDetails> ticketList=new ArrayList<>();
			for(TicketDetails t:tList)
			{
				if(t.getFlight().getFlightNumber()==flightNumber)
				{
					//System.out.println
					ticketList.add(t);
				}
			}
			
			if(ticketList.isEmpty())
			{
				throw new EmptyTicketListException();
			}
			
			return ticketList;
		}
		catch(NoSuchElementException e)
		{
			throw new UserDoesNotExistsException();
		}
	}
	
	public ResponseEntity<String> addTicket(TicketDetails ticket,String emailId) throws UserDoesNotExistsException, FlightDoesNotExistsException
	{
		try
		{
			User user=udao.findByEmail(emailId).get();
			List<TicketDetails> tList=user.getTicketList();
			try
			{
				ticket.setFlight(frepo.findByFlightNumber(ticket.getFlightNum()));
			}
			catch(NoSuchElementException e)
			{
				throw new FlightDoesNotExistsException();
			}
			tList.add(ticket);
			user.setTicketList(tList);
			udao.save(user);

			return ResponseEntity.ok("Ticket Added");
		}
		catch(NoSuchElementException e)
		{
			throw new UserDoesNotExistsException();
		}
		
	}
	
	public ResponseEntity<String> deleteTicket(int ticketId,String emailId) throws UserDoesNotExistsException {
		try
		{
			User user=udao.findByEmail(emailId).get();
			List<TicketDetails> tList=user.getTicketList();

			for(TicketDetails t:tList)
			{
				if(t.getId()==ticketId)
				{
					tList.remove(t);
					break;
				}
			}
			
			user.setTicketList(tList);
			udao.save(user);
			return ResponseEntity.ok("Ticket deleted..");
		}
		catch(NoSuchElementException e)
		{
			throw new UserDoesNotExistsException();
		}
		
	}
	
}
