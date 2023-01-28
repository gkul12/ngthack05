package com.cg.backend.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.backend.entity.AirlineDetails;
import com.cg.backend.service.AirlineService;

@CrossOrigin(origins =  "*")
@RestController
public class AirlineController {
	
	@Autowired
	AirlineService airservice;
	
	@GetMapping("/getAllAirlines")
	public List<AirlineDetails> getAll()
	{
		return airservice.getAll();
	}
	
	@PostMapping("/addAeroplaneDetails")
	public ResponseEntity<String> addAeroplaneDetails(@RequestBody AirlineDetails aeroplane)
	{
		return airservice.addAeroplaneDetails(aeroplane);
	}
	
	@PostMapping("/deleteAeroplane")
	public ResponseEntity<String> deleteAeroplane(@RequestBody Map<String,String> aeroplane)
	{
		return airservice.deleteAeroplane(aeroplane.get("aeroplane_id"));
	}
}
