package com.masai.model;

import java.time.LocalDateTime;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
public class Flight {
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private Long flightNumber;
			private String airline;
			
			@Embedded
			@AttributeOverrides({
				@AttributeOverride(name = "airportCode",column = @Column(name = "departureAirportCode")),
				@AttributeOverride(name = "airportName",column = @Column(name = "departureAirportName")),
				@AttributeOverride(name = "city",column = @Column(name = "departureAirportCity")),
				@AttributeOverride(name = "country",column = @Column(name = "departureAirportCountry"))
			
			})
			private Airport departureAirport;
			@Embedded
			@AttributeOverrides({
				@AttributeOverride(name = "airportCode",column = @Column(name = "arrivalAirportCode")),
				@AttributeOverride(name = "airportName",column = @Column(name = "arrivalAirportName")),
				@AttributeOverride(name = "city",column = @Column(name = "arrivalAirportCity")),
				@AttributeOverride(name = "country",column = @Column(name = "arrivalAirportCountry"))
			
			})
			private Airport arrivalAirport;
			private LocalDateTime departureDateTime;
			private LocalDateTime arrivalDateTime;
			private Integer availableSeats;
			private Double flightFare;
			
}
