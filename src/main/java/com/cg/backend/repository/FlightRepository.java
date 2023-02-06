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
	
	@Query(value="select * from flight where 'Monday'=ANY(days)",nativeQuery=true)
	public List<Flight> findFlightsForMonday();
	
	@Query(value="select * from flight where 'Tuesday'=ANY(days)",nativeQuery=true)
	public List<Flight> findFlightsForTuesday();
	
	@Query(value="select * from flight where 'Wednesday'=ANY(days)",nativeQuery=true)
	public List<Flight> findFlightsForWednesday();
	
	@Query(value="select * from flight where 'Thursday'=ANY(days)",nativeQuery=true)
	public List<Flight> findFlightsForThursday();
	
	@Query(value="select * from flight where 'Friday'=ANY(days)",nativeQuery=true)
	public List<Flight> findFlightsForFriday();
	
	@Query(value="select * from flight where 'Saturday'=ANY(days)",nativeQuery=true)
	public List<Flight> findFlightsForSaturday();
	
	@Query(value="select * from flight where 'Sunday'=ANY(days)",nativeQuery=true)
	public List<Flight> findFlightsForSunday();
	
	public Flight findByFlightNumber(int id);
}
