package com.masai.service;

import java.util.List;

import com.masai.exception.StudentException;
import com.masai.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents()throws StudentException;
	
	public Student getStudentByRoll(Integer roll)throws StudentException;

}
