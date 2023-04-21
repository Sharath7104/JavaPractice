package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.stereotype.Service;

import com.masai.exception.OwnerException;
import com.masai.exception.PetException;
import com.masai.model.Owner;
import com.masai.model.Pet;
import com.masai.repository.OwnerRepository;

@Service
public class OwnerServiceImpl implements OwnerService{

	@Autowired
	private OwnerRepository ownerRepository;
	
	@Override
	public Integer addOwner(Owner owner) throws OwnerException {
		// TODO Auto-generated method stub
			Owner savedOwner = ownerRepository.save(owner);
		return savedOwner.getOwnerId();
	}

	@Override
	public Owner getOwnerById(Integer ownerid) throws OwnerException {
		// TODO Auto-generated method stub
		Owner findOwner = ownerRepository.findById(ownerid).orElseThrow(()-> new OwnerException("No Owner Found for the given Id"));
		
		
		return findOwner;
	}

	@Override
	public List<Pet> getAllPetsByOwnerId(Integer ownerId) throws OwnerException {
		List<Pet> allPetsByOwnerId = ownerRepository.getAllPetsByOwnerId(ownerId);
		
		if(allPetsByOwnerId.size()>0) {
			return allPetsByOwnerId;
		}else {
			throw new OwnerException("No Data Found");
		}
		
//		Optional<Owner> owner = ownerRepository.findById(ownerId);
//		
//		if(owner.isPresent()) {
//			return owner.get().getPets();
//		}else {
//			throw new OwnerException("No Data Found");
//		}
		
		
	}

	@Override
	public List<Owner> getAllOwnersByPetsAge(Integer age) throws OwnerException {
		
	        List<Owner> owners = ownerRepository.findAll();
	        List<Owner> result = new ArrayList<>();
	        for (Owner owner : owners) {
	            for (Pet pet : owner.getPets()) {
	                if (pet.getAge()>=age) {
	                    result.add(owner);
	                    break;
	                }
	            }
	        }
	        
	        if(result.size()>0) {
	        	return result;
	        }else {
	        	throw new OwnerException("No Owner found for the given pet age");
	        }
			
	}

}
