package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Owner;
import com.masai.model.Pet;



@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer>{

	@Query("Select p from Pet p where p.owner.ownerId = ?1")
	public List<Pet> getAllPetsByOwnerId(Integer ownerId);
	
	
	
}
