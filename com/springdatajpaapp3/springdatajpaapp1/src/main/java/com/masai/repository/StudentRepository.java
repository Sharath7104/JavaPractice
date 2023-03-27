package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	
	//Spring Data JPA f/w will provide the implementation of this interface 
	// and register that implementation object with the spring container as a Spring bean
	
}
