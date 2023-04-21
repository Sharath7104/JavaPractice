package com.masai.controller;

import java.util.List;

import org.springframework.aot.nativex.NativeConfigurationWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.OwnerException;
import com.masai.exception.PetException;
import com.masai.model.Owner;
import com.masai.model.Pet;
import com.masai.service.OwnerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/masaiClinic")
public class OwnerController {
	
	@Autowired
	private OwnerService ownerService;

	@PostMapping("/owners")
	public ResponseEntity<Integer> addOwner(@Valid @RequestBody Owner owner) throws OwnerException{
		 Integer ownerid = ownerService.addOwner(owner);
		
		return new ResponseEntity<>(ownerid, HttpStatus.OK);
	}
	
	
	@GetMapping("/owners/{ownerid}")
	public ResponseEntity<Owner> getOwnerById(@PathVariable Integer ownerid) throws OwnerException{
		Owner getOwner = ownerService.getOwnerById(ownerid);
		
		
		return new ResponseEntity<>(getOwner,HttpStatus.OK);
	}
	
	
	@GetMapping("/owners/{ownerid}/pets")
	public ResponseEntity<List<Pet>> getAllPetsByOwnerId(Integer ownerId) throws OwnerException {
		List<Pet> allPetsByOwnerId = ownerService.getAllPetsByOwnerId(ownerId);
		
		return new ResponseEntity<>(allPetsByOwnerId, HttpStatus.OK);
	}
	
	@GetMapping("/owners")
	public ResponseEntity<List<Owner>> getAllOwnersByPetsAge(@RequestParam Integer age) throws OwnerException{
		List<Owner> allOwnersByPetAge = ownerService.getAllOwnersByPetsAge(age);
		
		return new ResponseEntity<>(allOwnersByPetAge, HttpStatus.OK);
	}

}

