package com.cg.backend.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.cg.backend.entity.Flight;
import com.cg.backend.entity.ScheduledFlights;
import com.cg.backend.repository.FlightRepository;
import com.cg.backend.repository.ScheduledFlightsDao;

@Service
public class ScheduledFlightsService 
{
	@Autowired ScheduledFlightsDao fsdao;
	@Autowired
	FlightRepository fdao;
	
	@Scheduled(cron="* 0 12 * 8 *")
	public void scheduleFlightsForTuesday()
	{		
		List<Flight> flights=fdao.findFlightsForTuesday();
		//System.out.println(flights);
		Calendar calendar = Calendar.getInstance();
		List<Date> tuesdays = getDatesforDayOfWeek(calendar.get(Calendar.YEAR)+1, Calendar.TUESDAY);
	    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		for(Flight f:flights)
		{
			for(Date d:tuesdays)
			{
				ScheduledFlights sf=new ScheduledFlights();
				sf.setFlightNumber(f.getFlightNumber());
				sf.setDepartureDate(df.format(d));
				sf.setSource(f.getSource());
				sf.setDestination(f.getDestination());
				sf.setArrivalTime(f.getArrivalTime());
				sf.setDepartureTime(f.getDepartureTime());
				
				fsdao.save(sf);
			}
			
		}
	}
	
	@Scheduled(cron="* 0 12 * 8 *")
	public void scheduleFlightsForMonday()
	{		
		List<Flight> flights=fdao.findFlightsForMonday();
		//System.out.println(flights);
		Calendar calendar = Calendar.getInstance();
		List<Date> tuesdays = getDatesforDayOfWeek(calendar.get(Calendar.YEAR)+1, Calendar.MONDAY);
	    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		for(Flight f:flights)
		{
			for(Date d:tuesdays)
			{
				ScheduledFlights sf=new ScheduledFlights();
				sf.setFlightNumber(f.getFlightNumber());
				sf.setDepartureDate(df.format(d));
				sf.setSource(f.getSource());
				sf.setDestination(f.getDestination());
				sf.setArrivalTime(f.getArrivalTime());
				sf.setDepartureTime(f.getDepartureTime());
				
				fsdao.save(sf);
			}
			
		}
	}
	
	
	@Scheduled(cron="* 0 12 * 8 *")
	public void scheduleFlightsForWednesday()
	{		
		List<Flight> flights=fdao.findFlightsForWednesday();
		//System.out.println(flights);
		Calendar calendar = Calendar.getInstance();
		List<Date> tuesdays = getDatesforDayOfWeek(calendar.get(Calendar.YEAR)+1, Calendar.WEDNESDAY);
	    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		for(Flight f:flights)
		{
			for(Date d:tuesdays)
			{
				ScheduledFlights sf=new ScheduledFlights();
				sf.setFlightNumber(f.getFlightNumber());
				sf.setDepartureDate(df.format(d));
				sf.setSource(f.getSource());
				sf.setDestination(f.getDestination());
				sf.setArrivalTime(f.getArrivalTime());
				sf.setDepartureTime(f.getDepartureTime());
				
				fsdao.save(sf);
			}
			
		}
	}
	
	
	@Scheduled(cron="* 0 12 * 8 *")
	public void scheduleFlightsForThursday()
	{		
		List<Flight> flights=fdao.findFlightsForThursday();
		//System.out.println(flights);
		Calendar calendar = Calendar.getInstance();
		List<Date> tuesdays = getDatesforDayOfWeek(calendar.get(Calendar.YEAR)+1, Calendar.THURSDAY);
	    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		for(Flight f:flights)
		{
			for(Date d:tuesdays)
			{
				ScheduledFlights sf=new ScheduledFlights();
				sf.setFlightNumber(f.getFlightNumber());
				sf.setDepartureDate(df.format(d));
				sf.setSource(f.getSource());
				sf.setDestination(f.getDestination());
				sf.setArrivalTime(f.getArrivalTime());
				sf.setDepartureTime(f.getDepartureTime());
				
				fsdao.save(sf);
			}
			
		}
	}
	
	
	@Scheduled(cron="* 0 12 * 8 *")
	public void scheduleFlightsForFriday()
	{		
		List<Flight> flights=fdao.findFlightsForFriday();
		//System.out.println(flights);
		Calendar calendar = Calendar.getInstance();
		List<Date> tuesdays = getDatesforDayOfWeek(calendar.get(Calendar.YEAR)+1, Calendar.FRIDAY);
	    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		for(Flight f:flights)
		{
			for(Date d:tuesdays)
			{
				ScheduledFlights sf=new ScheduledFlights();
				sf.setFlightNumber(f.getFlightNumber());
				sf.setDepartureDate(df.format(d));
				sf.setSource(f.getSource());
				sf.setDestination(f.getDestination());
				sf.setArrivalTime(f.getArrivalTime());
				sf.setDepartureTime(f.getDepartureTime());
				
				fsdao.save(sf);
			}
			
		}
	}
	
	
	@Scheduled(cron="* 0 12 * 8 *")
	public void scheduleFlightsForSaturday()
	{		
		List<Flight> flights=fdao.findFlightsForSaturday();
		//System.out.println(flights);
		Calendar calendar = Calendar.getInstance();
		List<Date> tuesdays = getDatesforDayOfWeek(calendar.get(Calendar.YEAR)+1, Calendar.SATURDAY);
	    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		for(Flight f:flights)
		{
			for(Date d:tuesdays)
			{
				ScheduledFlights sf=new ScheduledFlights();
				sf.setFlightNumber(f.getFlightNumber());
				sf.setDepartureDate(df.format(d));
				sf.setSource(f.getSource());
				sf.setDestination(f.getDestination());
				sf.setArrivalTime(f.getArrivalTime());
				sf.setDepartureTime(f.getDepartureTime());
				
				fsdao.save(sf);
			}
			
		}
	}
	
	
	@Scheduled(cron="* 0 12 * 8 *")
	public void scheduleFlightsForSunday()
	{		
		List<Flight> flights=fdao.findFlightsForSunday();
		//System.out.println(flights);
		Calendar calendar = Calendar.getInstance();
		List<Date> tuesdays = getDatesforDayOfWeek(calendar.get(Calendar.YEAR)+1, Calendar.SUNDAY);
	    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		for(Flight f:flights)
		{
			for(Date d:tuesdays)
			{
				ScheduledFlights sf=new ScheduledFlights();
				sf.setFlightNumber(f.getFlightNumber());
				sf.setDepartureDate(df.format(d));
				sf.setSource(f.getSource());
				sf.setDestination(f.getDestination());
				sf.setArrivalTime(f.getArrivalTime());
				sf.setDepartureTime(f.getDepartureTime());
				
				fsdao.save(sf);
			}
			
		}
	}
	
	public static List<Date> getDatesforDayOfWeek(int year, int dayOfWeek) {
	    List<Date> dateList = new ArrayList<>();
	        Calendar newCal = Calendar.getInstance();
	        newCal.set(Calendar.YEAR, year);
	        newCal.set(Calendar.DAY_OF_YEAR, 1);
	        // First, let's loop until we're at the correct day of the week.
	        while (newCal.get(Calendar.DAY_OF_WEEK) != dayOfWeek) 
	        {
	            newCal.add(Calendar.DAY_OF_MONTH, 1);
	        }
	        // Now, add the Date to the List. Then add a week and loop (stop
	        // when the year changes).
	        do {
	            dateList.add(newCal.getTime());
	            newCal.add(Calendar.DAY_OF_MONTH, 7);
	        } while (newCal.get(Calendar.YEAR) == year);
	    
	    return dateList;
	}
	
	@Scheduled(cron="* 0 12 * * *")
	public void deletePastFlights()
	{
		Date d=new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		fsdao.deletePastFlights(df.format(d));
	}
	public List<ScheduledFlights> searchFlights(String source,String destination,String date)
	{
		return fsdao.searchFlights(source, destination, date);
	}

}
