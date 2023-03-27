package com.masai.service;

import java.util.List;

import com.masai.model.Student;


public interface StudentService {

	public Student saveStudent(Student student);
	

	public List<Student> getAllStudent();
	
	
	public Student findById(Integer roll);
	
	public Student deleteById(Integer roll);
}
