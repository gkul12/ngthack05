package com.cg.backend.service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.backend.dto.FlightDto;
import com.cg.backend.entity.Airports;
import com.cg.backend.entity.Flight;
import com.cg.backend.exception.EmptySerachResultException;
import com.cg.backend.exception.FlightDoesNotExistsException;
import com.cg.backend.exception.InvalidDepartureDateException;
import com.cg.backend.exception.SourceDestinationException;
import com.cg.backend.repository.AirlineDao;
import com.cg.backend.repository.AirportRepository;
import com.cg.backend.repository.FlightRepository;


@Service
public class FlightService {

	@Autowired
	FlightRepository airplaneRepo;
	@Autowired
	AirportRepository airportRepo;
	@Autowired
	AirlineDao aDao;
	
	public ResponseEntity<String> addFlight(Flight airplane) throws ParseException 
	{

//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
//		
//		Date today = new Date();
//		
//		Date arrivalDate = formatter.parse(airplane.getArrivalDate());
//		Date departureDate = formatter.parse(airplane.getDepartureDate());
//		
//		long time_difference1 = arrivalDate.getTime() - today.getTime();
//		long time_difference2 = departureDate.getTime() - today.getTime();
//
//		long days_difference1 = (time_difference1 / (1000*60*60*24)) % 365;
//		long days_difference2 = (time_difference2 / (1000*60*60*24)) % 365;
		
		if(airplane.getDestination().equals(airplane.getSource()))
		{
			
			return ResponseEntity
					.badRequest()
					.body("Error: Source and Destination must be different");
			
		}
		
//		if(airplane.getEconomySeats()+airplane.getBusinessSeats()>180)
//		{
//			return ResponseEntity
//					.badRequest()
//					.body("Error: Total seats cannot be more than flight capacity");
//
//		}
//
//		if(days_difference1<0)
//		{
//			return ResponseEntity
//					.badRequest()
//					.body("Error: Select appropriate arrival date");
//
//		}
//
//		if(days_difference2<0)
//		{
//			return ResponseEntity
//				.badRequest()
//				.body("Error: Select appropriate departure date");
//
//		}
		
		airplane.setAiroplane(aDao.findById(airplane.getaId()).get());
		System.out.println(airplane.getAiroplane());
		airplaneRepo.save(airplane);
		return new ResponseEntity<String>("Flight added", HttpStatus.OK);
	}

	public List<Flight> findAll() {
		// TODO Auto-generated method stub
		return airplaneRepo.findAll();
	}
	
	public ResponseEntity<String> delayFlight(int flightId) throws FlightDoesNotExistsException
	{
		try
		{
			Optional<Flight> flight = airplaneRepo.findById(flightId);
			Flight flightdata = flight.get();
			flightdata.setStatus("Delayed");
			airplaneRepo.save(flightdata);
			return ResponseEntity.ok("Flight delayed");
		}
		catch(NoSuchElementException ne)
		{
			throw new FlightDoesNotExistsException();
		}
		
	}
	
	public ResponseEntity<String> cancleFlight(int flightId) throws FlightDoesNotExistsException
	{
		try
		{
			Optional<Flight> flight = airplaneRepo.findById(flightId);
			Flight flightdata = flight.get();
			flightdata.setStatus("Cancelled");
			airplaneRepo.save(flightdata);
			return ResponseEntity.ok("Flight cancelled");
		}
		catch(NoSuchElementException ne)
		{
			throw new FlightDoesNotExistsException();
		}
	
	}
	
	public List<Airports> getAirports()
	{
		
		return airportRepo.findAll();
	}

	public Flight getFlightById(int id) throws FlightDoesNotExistsException 
	{
		try
		{
			return airplaneRepo.findByFlightNumber(id);
		}
		catch(NoSuchElementException ne)
		{
			throw new FlightDoesNotExistsException();
		}
	}

	public String updateFlight(Flight flight) 
	{
		airplaneRepo.saveAndFlush(flight);
		return "Updated";
	}
	
//	public List<FlightDto> serachFlight(String source, String destination, String departureDate) throws EmptySerachResultException
//	{
////		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
////		Date today = new Date();
////		Date departDate = formatter.parse(departureDate);
////
////		long time_difference = departDate.getTime() - today.getTime();
////		long days_difference = (time_difference / (1000*60*60*24)) % 365;
////	
////		if(source.equals(destination))
////		{
////			throw new SourceDestinationException();
////		}
////		
////		if(days_difference<0)
////		{
////			throw new InvalidDepartureDateException();
////		}
////	
////		
////	//	System.out.println(airplaneRepo.findBySourceAndDestinationAndDepartureDate(source, destination, departureDate));
////		System.out.println(source.getClass() + " " + destination.getClass() + " " + departureDate.getClass());
////		List<FlightDto> flt= null;
////				//System.out.println(airplaneRepo.findBySourceAndDestinationAndDepartureDate(source, destination, departureDate));
////	
////		if(days_difference<5)
////		{
////			for(FlightDto f:flt)
////			{
////				Double updatedEcoPrice=f.getFareEconomy()+800;
////				f.setFareEconomy(updatedEcoPrice);
////				Double updatedBussPrice=f.getFareBusiness()+900;
////				f.setFareBusiness(updatedBussPrice);
////		
////			}
////	
////		//return new ResponseEntity<List<FlightDto>>(flight,HttpStatus.OK);
////	
////		}
////	
////		if(days_difference<15 && days_difference>5)
////		{
////			for(FlightDto f:flt)
////			{
////		
////				Double updatedEcoPrice=f.getFareEconomy()+400;
////				f.setFareEconomy(updatedEcoPrice);
////				Double updatedBussPrice=f.getFareBusiness()+500;
////				f.setFareBusiness(updatedBussPrice);
////		
////			}
////		
////		//return new ResponseEntity<List<FlightDto>>(flight,HttpStatus.OK);
////	
////		}
//
//		List<FlightDto> fList=airplaneRepo.findBySourceAndDestinationAndDepartureDate(source, destination, departureDate).stream().map(flight -> new FlightDto(flight)).toList();
//		
//		if(fList.size()==0)
//		{
//			throw new EmptySerachResultException();
//		}
//		return fList;
//	}
	
	public List<String> getSource()
	{
		List<Flight> fList=airplaneRepo.findAll();
		List<String> source=new ArrayList<>();
		
		for(Flight f:fList)
		{
			if(!source.contains(f.getSource()))
			{
				source.add(f.getSource());
			}
		}
		
		return source;
	}
	

	public List<String> getDestination()
	{
		List<Flight> fList=airplaneRepo.findAll();
		List<String> destination=new ArrayList<>();
		
		for(Flight f:fList)
		{
			if(!destination.contains(f.getSource()))
			{
				destination.add(f.getSource());
			}
		}
		
		return destination;
	}
	
}
