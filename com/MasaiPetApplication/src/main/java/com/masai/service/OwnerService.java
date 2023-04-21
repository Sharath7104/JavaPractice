package com.masai.service;

import com.masai.exception.OwnerException;
import com.masai.exception.PetException;
import com.masai.model.Owner;
import com.masai.model.Pet;
import java.util.List;


public interface OwnerService {

	public Integer addOwner(Owner owner) throws OwnerException;
	
	public Owner getOwnerById(Integer ownerid) throws OwnerException;
	
	public List<Pet> getAllPetsByOwnerId(Integer ownerId) throws OwnerException;
	
	public List<Owner> getAllOwnersByPetsAge(Integer age) throws OwnerException;
}
