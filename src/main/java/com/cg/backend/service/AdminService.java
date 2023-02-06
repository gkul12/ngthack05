package com.cg.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.backend.entity.Admin;
import com.cg.backend.entity.TicketDetails;
import com.cg.backend.entity.User;
import com.cg.backend.repository.AdminDao;
import com.cg.backend.repository.TicketDetailsRepository;
import com.cg.backend.repository.UserDao;



@Service
public class AdminService 
{

	@Autowired
	AdminDao admindao;
	@Autowired
	UserDao userdao;
	@Autowired 
	TicketDetailsRepository ticketRepo;
	
	
	public List<Admin> getAdmins()
	{
		return admindao.findAll();
	}
	
	public List<User> adminGetAllUser()   
	{  
		return userdao.findAll();
	}  
	
	
	public ResponseEntity<String> adminUpdateUserByEmail(@RequestBody User user){
		if (admindao.existsByEmail(user.getEmail())) {
			return ResponseEntity
					.badRequest()
					.body("Error: Email is already in use!");
		}
		
		
		// Create new user's account
		User user1 = new User();
//		admindao.save(user1);
		return ResponseEntity.ok("Admin Update the User Successfully!");

		
		
	}


	public ResponseEntity<String> adminGetUserByEmail(User user) {
		
		User user1 = new User();
		admindao.findByEmail("email").get();

		return ResponseEntity.ok("Admin get the User Successfully!");
	}

	
//	public List<TicketDetails> getCustomerByFlightNumber(String flightNumber, String departureDate)
//	{
//		List<TicketDetails> tList=ticketRepo.findAll();
//		List<TicketDetails> tickets=new ArrayList<>();
//		int flightNum = Integer.parseInt(flightNumber);
//			for(TicketDetails t:tList)
//			{
//				if(t.getFlight().getFlightNumber()==flightNum && t.getFlight().getDepartureDate().equals(departureDate))
//				{
//					tickets.add(t);
//				}
//			}
//
//		return tickets;
//	}
}
