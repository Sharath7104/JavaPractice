package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.service.StudentService;
import com.masai.service.StudentServiceImpl;

@RestController
public class StudentController {

	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/students")
	public ResponseEntity<Student> registerStudentHandler(@RequestBody Student student){
		
		Student savedStudent= studentService.saveStudent(student);
		
		
		return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudentsHandler(){
		
		List<Student> students= studentService.getAllStudents();
		
		return new ResponseEntity<>(students,HttpStatus.OK);
	}
	
	
	@GetMapping("/students/{roll}")
	public ResponseEntity<Student> getStudentByRollHandler(@PathVariable Integer roll){
		
		
		Student student= studentService.getStudentByRoll(roll);
		
		
		return new ResponseEntity<>(student,HttpStatus.OK);
	}
	
	
	
	
	
	
	
}
