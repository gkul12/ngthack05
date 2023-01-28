package com.cg.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.backend.entity.Flight;



@Repository
public interface FlightRepository extends JpaRepository<Flight,Integer>
{
//	@Query("SELECT new com.cg.backend.dto.FlightDto(flightNumber,source,destination,departureTime,arrivalTime,arrivalDate,departureDate,economyFare,businessFare) from Flight f")
	@Query(value = " select * from flight where source = ?1 and destination = ?2 and departure_date = ?3", nativeQuery = true)
	public List<Flight> findBySourceAndDestinationAndDepartureDate(String source,String destination,String departureDate);
	
	
	
	public Flight findByFlightNumber(int id);
}
