package com.masai.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.model.Flight;
import com.masai.model.FlightDTO;

public interface FlightRepository extends JpaRepository<Flight, Long>{
	
	@Query("select new com.masai.model.FlightDTO(f.flightNumber,f.airline,f.departureAirport.airportName,f.arrivalAirport.airportName,f.departureDateTime,f.arrivalDateTime,f.flightFare) from Flight f")
	public List<FlightDTO> findAllFlightDTOs();
}
