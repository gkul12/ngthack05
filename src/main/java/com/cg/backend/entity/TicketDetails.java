package com.cg.backend.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;


@Entity

public class TicketDetails

{

	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String gender;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Flight flight;
	
	@Transient
	private int flightNum;
	
	
	 
	
	@Override
	public String toString() {
		return "TicketDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", flight=" + flight + ", flightNum=" + flightNum + "]";
	}

	public TicketDetails() {
		super();
	}

	public TicketDetails(int id, String firstName, String lastName, String gender) {
	
		super();
		
		this.id = id;
		
		this.firstName = firstName;
		
		this.lastName = lastName;
		
		this.gender = gender;
		
	
	}
	
	public int getId() {
	
		return id;
	
	}
	
	public void setId(int id) {
	
		this.id = id;
	
	}
	
	public String getFirstName() {
	
		return firstName;
	
	}
	
	public void setFirstName(String firstName) {
	
		this.firstName = firstName;
	
	}
	
	public String getLastName() {
	
		return lastName;
	
	}
	
	public void setLastName(String lastName) {
	
		this.lastName = lastName;
	
	}
	
	public String getGender() {
	
		return gender;
	
	}
	
	public void setGender(String gender) {
	
		this.gender = gender;
	
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public int getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(int flightNum) {
		this.flightNum = flightNum;
	}
	
	

}

 
