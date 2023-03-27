package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/students")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		
		Student addedstudent = studentService.saveStudent(student);
		
		return new ResponseEntity<>(addedstudent, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getStudents(){
		
		List<Student> studentlist = studentService.getAllStudent();
		
		return new ResponseEntity<>(studentlist, HttpStatus.OK);
	}
	
	@GetMapping("/students/{roll}")
	public ResponseEntity<Student> getStudentByRoll(@PathVariable Integer roll) {
		Student st = studentService.findById(roll);
		
		return new ResponseEntity<>(st,HttpStatus.OK);
	}
	
	@DeleteMapping("/students/{roll}")
	public Student deleteByRoll(@PathVariable Integer roll) {
		Student st = studentService.deleteById(roll);
		
		return st;
	}

}


