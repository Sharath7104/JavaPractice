package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.FlightException;
import com.masai.model.Flight;
import com.masai.model.FlightDTO;
import com.masai.service.FlightService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/flights")
public class FlightController {
	@Autowired
	private FlightService flightService;
	
	
	@PostMapping("/addflight")
	public ResponseEntity<Flight> addFlight(@Valid @RequestBody Flight flight) throws FlightException{
		Flight addflight=flightService.addFlight(flight);
		return new ResponseEntity<Flight>(addflight,HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<FlightDTO>> getAllFlights() throws FlightException{
		List<FlightDTO> allflights = flightService.getAllFlights();
		
		return new ResponseEntity<>(allflights, HttpStatus.OK);
	}
	
	@GetMapping("/flightdtos")
	public ResponseEntity<List<FlightDTO>> findAllFlightDTOs(){
		List<FlightDTO> allflights = flightService.findAllFlightDTOs();
		
		return new ResponseEntity<>(allflights, HttpStatus.OK);
	}
}
