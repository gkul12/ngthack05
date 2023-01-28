package com.cg.backend.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;

@Entity
public class Flight {

		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int flightNumber;
		
		@OneToOne(cascade = CascadeType.ALL)
		private AirlineDetails airoplane;
		
		@Transient
		private String aId;
		private String source;
		private String destination;
		private String departureDate;
		private String departureTime;
		private String type;
		private String arrivalDate;
		private String arrivalTime;
		private Double economyFare;
		private Double businessFare;
		private int businessSeats;
		private int economySeats;
		private String status;
		
		public Flight() {
			super();
		}

		public Flight(AirlineDetails airoplane, int flightNumber, String source, String destination,
				String departureDate, String departureTime, String type, String arrivalDate, String arrivalTime,
				Double economyFare, Double businessFare, int businessSeats, int economySeats, String status) {
			super();
			this.airoplane = airoplane;
			this.flightNumber = flightNumber;
			this.source = source;
			this.destination = destination;
			this.departureDate = departureDate;
			this.departureTime = departureTime;
			this.type = type;
			this.arrivalDate = arrivalDate;
			this.arrivalTime = arrivalTime;
			this.economyFare = economyFare;
			this.businessFare = businessFare;
			this.businessSeats = businessSeats;
			this.economySeats = economySeats;
			this.status = status;
		}

		public AirlineDetails getAiroplane() {
			return airoplane;
		}

		public void setAiroplane(AirlineDetails airoplane) {
			this.airoplane = airoplane;
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

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getArrivalDate() {
			return arrivalDate;
		}

		public void setArrivalDate(String arrivalDate) {
			this.arrivalDate = arrivalDate;
		}

		public String getArrivalTime() {
			return arrivalTime;
		}

		public void setArrivalTime(String arrivalTime) {
			this.arrivalTime = arrivalTime;
		}

		public Double getEconomyFare() {
			return economyFare;
		}

		public void setEconomyFare(Double economyFare) {
			this.economyFare = economyFare;
		}

		public Double getBusinessFare() {
			return businessFare;
		}

		public void setBusinessFare(Double businessFare) {
			this.businessFare = businessFare;
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

		public String getaId() {
			return aId;
		}

		public void setaId(String aId) {
			this.aId = aId;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "Flight [flightNumber=" + flightNumber + ", airoplane=" + airoplane + ", aId=" + aId + ", source="
					+ source + ", destination=" + destination + ", departureDate=" + departureDate + ", departureTime="
					+ departureTime + ", type=" + type + ", arrivalDate=" + arrivalDate + ", arrivalTime=" + arrivalTime
					+ ", economyFare=" + economyFare + ", businessFare=" + businessFare + ", businessSeats="
					+ businessSeats + ", economySeats=" + economySeats + ", status=" + status + "]";
		}
		
		
		
		
		
	}



