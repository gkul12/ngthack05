package com.cg.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.backend.entity.ScheduledFlights;
import com.cg.backend.service.ScheduledFlightsService;

@RestController
public class ScheduledFlightsController {
	@Autowired
	ScheduledFlightsService sfservice;
	
	@GetMapping("/searchFlights")
	public List<ScheduledFlights> searchFlights(@RequestParam String source,@RequestParam String destination,@RequestParam String date)
	{
		return sfservice.searchFlights(source, destination, date);
	}
}
