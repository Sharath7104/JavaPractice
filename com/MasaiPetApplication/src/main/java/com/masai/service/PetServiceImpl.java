package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.PetException;
import com.masai.model.Pet;
import com.masai.repository.PetRepository;

@Service
public class PetServiceImpl implements PetService{

	@Autowired
	private PetRepository petRepository;
	
	@Override
	public Pet addNewPet(Pet pet) throws PetException {
		// TODO Auto-generated method stub
		Pet savedPet = petRepository.save(pet);
		return savedPet;
	}

	@Override
	public Pet getPetById(Integer id) throws PetException {
		// TODO Auto-generated method stub
		Optional<Pet> findPet = petRepository.findById(id);
		
		if(findPet.isPresent()) {
			return findPet.get();
		}else {
			throw new PetException("No Pet Found for the given Id");
		}
//		Pet findPet = petRepository.findById(id).orElseThrow(()-> new PetException("No Pet Found for the given Id"));
		
//		return findPet;
	}

	@Override
	public List<Pet> getPetsBySpecies(String species) throws PetException {
		// TODO Auto-generated method stub
		List<Pet> petsBySpecies = petRepository.findBySpecies(species);
		
		if(petsBySpecies.size()>0) {
			return petsBySpecies;
		}else {
			throw new PetException("No Data Found");
		}
	}

	@Override
	public String deletePetById(Integer petId) throws PetException {
		// TODO Auto-generated method stub
		Optional<Pet> findPet = petRepository.findById(petId);
		
		if(findPet.isPresent()) {
			Pet existingPet = findPet.get();
			petRepository.delete(existingPet);
			
			return "Pet Deleted Successfully";
		}else {
			throw new PetException("Pet Not Found for the given Id");
		}
		
	}

}
