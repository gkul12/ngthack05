package com.cg.backend.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.backend.dto.FlightDto;
import com.cg.backend.entity.Airports;
import com.cg.backend.entity.Flight;
import com.cg.backend.exception.EmptySerachResultException;
import com.cg.backend.exception.FlightDoesNotExistsException;
import com.cg.backend.exception.InvalidDepartureDateException;
import com.cg.backend.exception.SourceDestinationException;
import com.cg.backend.service.FlightService;

@RestController
@CrossOrigin(origins = "*")
public class FlightController {

	@Autowired
	FlightService fService;
	
	@PostMapping("/addFlight")
	ResponseEntity<String> addFlight(@RequestBody Flight airplane) throws ParseException {
		return fService.addFlight(airplane);
	}	
	
	@GetMapping("/getAllFlights")
	public List<Flight> getAll()
	{
		return fService.findAll();
	}
	
	@GetMapping("/getSource")
	public List<String> getSource()
	{
		return fService.getSource();
	}
	
	@GetMapping("/getDestination")
	public List<String> getDestination()
	{
		return fService.getDestination();
	}
	
	@GetMapping("/getAllAirports")
	public List<Airports> getAirports()
	{
		return fService.getAirports();
	}
	
	@PostMapping("/updateFlight")
	public String updateFlight(@RequestBody Flight flight) {
		return fService.updateFlight(flight);
	}
	
	@PostMapping("/getFlightById")
	public Flight getFlightById(@RequestBody Map<String, Integer> id) throws FlightDoesNotExistsException
	{	
		//System.out.println();
		return fService.getFlightById(id.get("flightNumber"));
	}
	
//	@GetMapping("/serachFlight")
//	public List<FlightDto> serachFlight(@RequestParam(value = "source") String source,@RequestParam(value = "destination") String destination,@RequestParam(value = "departureDate") String departureDate) throws ParseException, SourceDestinationException, InvalidDepartureDateException, EmptySerachResultException
//	{
//		return fService.serachFlight(source, destination, departureDate);
//	}
	
	@PostMapping("/delayFlight")
	public ResponseEntity<String> delayFlight(@RequestBody int flightId) throws FlightDoesNotExistsException
	{
			return fService.delayFlight(flightId);
	}
		
	@PostMapping("/cancleFlight")
	public ResponseEntity<String> cancleFlight(@RequestBody int flightId) throws FlightDoesNotExistsException
	{
			return fService.cancleFlight(flightId);
	}
			
}
