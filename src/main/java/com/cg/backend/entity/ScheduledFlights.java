package com.cg.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ScheduledFlights 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int scheduledId;
	private int flightNumber;
	private String source;
	private String destination;
	private String departureDate;
	private String departureTime;
	private String arrivalTime;
	
	
	public ScheduledFlights() {}


	public ScheduledFlights(int flightNumber, String source, String destination, String departureDate,
			String departureTime, String arrivalTime) {
		super();
		this.flightNumber = flightNumber;
		this.source = source;
		this.destination = destination;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}

	public int getScheduledId() {
		return scheduledId;
	}


	public void setScheduledId(int scheduledId) {
		this.scheduledId = scheduledId;
	}


	public int getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getDepartureDate() {
		return departureDate;
	}


	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}


	public String getDepartureTime() {
		return departureTime;
	}


	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}


	public String getArrivalTime() {
		return arrivalTime;
	}


	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

}
