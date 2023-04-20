package com.masai.service;

import java.util.List;

import com.masai.exception.FlightException;
import com.masai.model.Flight;
import com.masai.model.FlightDTO;

public interface FlightService {
	public List<FlightDTO> getAllFlights() throws FlightException;

//	public FlightDTO getFlightByFlightNumber(Long flightNumber) throws FlightException; 
//
//
	public Flight addFlight(Flight flight) throws FlightException; 
	
	public List<FlightDTO> findAllFlightDTOs();
//
//
//	public FlightDTO updateFlight(Long flightNumber, FlightDTO flightDTO) throws FlightException; 
//
//
//	public Flight deleteFlight(Long flightNumber) throws FlightException; 
//
//
//	public List<FlightDTO> searchFlights(String departureAirportCode, String arrivalAirportCode, LocalDateTime departureDateTime) throws FlightException; 
//
//
//	public List<FlightDTO> searchFlightsByAirline(String airline) throws FlightException; 
//
//
//	public List<FlightDTO> searchFlightsByFare(Double minFare, Double maxFare) throws FlightException; 
//
//	
//	public List<Flight> getAllFlightsSortedByFare() throws FlightException;
}
