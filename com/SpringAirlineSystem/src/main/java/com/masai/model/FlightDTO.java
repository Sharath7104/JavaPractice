package com.masai.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightDTO {
//	flightNumber: Long;
//	airline: String;
//	departureAirportCode: String;
//	arrivalAirportCode: String;
//	departureDateTime: LocalDateTime;
//	arrivalDateTime: LocalDateTime;
//	flightFare: Double;
	
	private Long flightNumber;
	private String airline;
	private String departureAirport;
	private String arrivalAirport;
	private LocalDateTime departureDateTime;
	private LocalDateTime arrivalDateTime;
	private Double flightFare;
	
	
}
