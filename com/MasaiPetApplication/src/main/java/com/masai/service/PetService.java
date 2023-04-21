package com.masai.service;

import com.masai.exception.PetException;
import com.masai.model.Pet;
import java.util.List;


public interface PetService {
	public Pet addNewPet(Pet pet) throws PetException;
	
	public Pet getPetById(Integer id) throws PetException;
	
	public List<Pet> getPetsBySpecies(String species) throws PetException;
	
	public String deletePetById(Integer petId) throws PetException;
}
