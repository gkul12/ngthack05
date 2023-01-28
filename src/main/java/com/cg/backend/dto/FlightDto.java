package com.cg.backend.dto;

import com.cg.backend.entity.Flight;

public class FlightDto {

	private int  flightNumber ;
	private String source ;
	private String destination ;
	private String departureTime ;
	private String arrivalTime ;
	private String arrivaleDate ;
	private String departureDate ;
	private Double fareEconomy;
	private Double fareBusiness;
	private int businessSeats;
	private int economySeats;
	
	public FlightDto() {}
	
	public FlightDto(Flight flight) {
		this.flightNumber = flight.getFlightNumber();
		this.source = flight.getSource();
		this.destination = flight.getDestination();
		this.departureTime = flight.getDepartureTime();
		this.arrivalTime = flight.getArrivalTime();
		this.arrivaleDate = flight.getArrivalDate();
		this.departureDate = flight.getDepartureDate();
		this.fareEconomy = flight.getEconomyFare();
		this.fareBusiness = flight.getBusinessFare();
		this.businessSeats = flight.getBusinessSeats();
		this.economySeats = flight.getEconomySeats();
	}

	public FlightDto(int flightNumber, String source, String destination, String departureTime, String arrivalTime,
			String arrivaleDate, String departureDate, Double fareEconomy, Double fareBusiness, int businessSeats,
			int economySeats) {
		super();
		this.flightNumber = flightNumber;
		this.source = source;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.arrivaleDate = arrivaleDate;
		this.departureDate = departureDate;
		this.fareEconomy = fareEconomy;
		this.fareBusiness = fareBusiness;
		this.businessSeats = businessSeats;
		this.economySeats = economySeats;
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

	public String getArrivaleDate() {
		return arrivaleDate;
	}

	public void setArrivaleDate(String arrivaleDate) {
		this.arrivaleDate = arrivaleDate;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public Double getFareEconomy() {
		return fareEconomy;
	}

	public void setFareEconomy(Double fareEconomy) {
		this.fareEconomy = fareEconomy;
	}

	public Double getFareBusiness() {
		return fareBusiness;
	}

	public void setFareBusiness(Double fareBusiness) {
		this.fareBusiness = fareBusiness;
	}

	public int getBusinessSeats() {
		return businessSeats;
	}

	public void setBusinessSeats(int businessSeats) {
		this.businessSeats = businessSeats;
	}

	public int getEconomySeats() {
		return economySeats;
	}

	public void setEconomySeats(int economySeats) {
		this.economySeats = economySeats;
	}


	
}
