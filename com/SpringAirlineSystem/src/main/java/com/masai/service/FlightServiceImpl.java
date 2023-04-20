package com.masai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.FlightException;
import com.masai.model.Flight;
import com.masai.model.FlightDTO;
import com.masai.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService{
	
	@Autowired
	private FlightRepository flightRepository;
	
	@Override
	public List<FlightDTO> getAllFlights() throws FlightException {
		// TODO Auto-generated method stub
	    List<Flight> flightlists = flightRepository.findAll();
	    
	    List<FlightDTO> flightDTO = new ArrayList();
	    for (Flight flight : flightlists) {
			FlightDTO newflight = new FlightDTO();
			newflight.setFlightNumber(flight.getFlightNumber());
			newflight.setAirline(flight.getAirline());
			newflight.setArrivalAirport(flight.getArrivalAirport().getAirportName());
			newflight.setArrivalDateTime(flight.getArrivalDateTime());
			newflight.setDepartureAirport(flight.getDepartureAirport().getAirportName());
			newflight.setDepartureDateTime(flight.getDepartureDateTime());
			newflight.setFlightFare(flight.getFlightFare());
			flightDTO.add(newflight);
		}
	    
		return flightDTO;
	}

	@Override
	public Flight addFlight(Flight flight) throws FlightException {
		// TODO Auto-generated method stub
		Flight saveFlight = flightRepository.save(flight);
		return saveFlight;
	}

	@Override
	public List<FlightDTO> findAllFlightDTOs() {
			List<FlightDTO> flightlists = flightRepository.findAllFlightDTOs();
	    
			return flightlists;
	}

}
