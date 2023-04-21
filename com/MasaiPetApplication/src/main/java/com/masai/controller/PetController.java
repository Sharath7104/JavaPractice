package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.PetException;
import com.masai.model.Pet;
import com.masai.service.PetService;

@RestController
@RequestMapping("/masaiClinic")
public class PetController {

	@Autowired
	private PetService petService;
	
	@PostMapping("/pets")
	public ResponseEntity<Pet> addNewPet(@RequestBody Pet pet) throws PetException {
		Pet addPet = petService.addNewPet(pet);
		
		return new ResponseEntity<>(addPet, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/pets/{petid}")
	public ResponseEntity<Pet> getPetById(@PathVariable Integer petid) throws PetException{
		Pet petById = petService.getPetById(petid);
		
		return new ResponseEntity<>(petById, HttpStatus.OK);
	}
	
	@GetMapping("/pets")
	public ResponseEntity<List<Pet>> getPetsBySpecies(@RequestParam String species) throws PetException{
		List<Pet> petsList = petService.getPetsBySpecies(species);
		
		return new ResponseEntity<>(petsList, HttpStatus.OK);
	}
	
	@DeleteMapping("/pets/{petId}")
	public ResponseEntity<String> deletePetById(Integer petId) throws PetException{
		String responseString = petService.deletePetById(petId);
		
		return new ResponseEntity<>(responseString, HttpStatus.OK);
		
	}
}
