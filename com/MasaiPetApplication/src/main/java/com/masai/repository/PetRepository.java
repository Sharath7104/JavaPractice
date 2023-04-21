package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Pet;

import jakarta.persistence.criteria.From;


@Repository
public interface PetRepository extends JpaRepository<Pet, Integer>{

	List<Pet> findBySpecies(String species);

//	@Query("SELECT p FROM Pet p WHERE p.species = ?1")
//	public List<Pet> getAllPetsBySpecies(String species);
}
