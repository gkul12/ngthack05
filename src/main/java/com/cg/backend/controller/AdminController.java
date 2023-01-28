package com.cg.backend.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.backend.entity.Admin;
import com.cg.backend.entity.TicketDetails;
import com.cg.backend.entity.User;
import com.cg.backend.service.AdminService;


@CrossOrigin(origins =  "*")
@RestController
public class AdminController {
	@Autowired
	AdminService adminservice;
	
	@GetMapping("/getalladmins")
	public List<Admin> getAdmins()
	{
		return adminservice.getAdmins();
	}
	
	//getAllCustomerByAdmin
		@GetMapping("/getAllUsers")
		
		public List<User> adminGetAllUser()
		{
			return adminservice.adminGetAllUser();
		}
		
		//UpdateUserByEmail ByAdmin
		@PutMapping("/UpdateUserByEmail")  
		public ResponseEntity<String> adminupdateUserByEmail(@RequestBody User user){
			return adminservice.adminUpdateUserByEmail(user) ;
		
		}

		//getCustomerByEmail ByAdmin
		@GetMapping("/getUserByEmail")
		public ResponseEntity<String> adminGetUserByEmail(@RequestBody User user){
			return adminservice.adminGetUserByEmail(user) ;
		
		}
		
//		@GetMapping("/getUserByFirstName/{firstName}")
//		public ResponseEntity<String> adminGetUserByFirstName(@PathVariable String firstName)
//		{
//			return 
//		}
		
		@PostMapping("/getCustomerByFlightNumber")
		public List<TicketDetails> getCustomerByFlightNumber(@RequestBody Map<String, String> obj)
		{
			return adminservice.getCustomerByFlightNumber(obj.get("flightNumber"),obj.get("departureDate"));
		}
}
