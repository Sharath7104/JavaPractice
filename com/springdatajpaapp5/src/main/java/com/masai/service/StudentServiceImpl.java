package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		Student savedStudent= studentRepository.save(student);
		
		return savedStudent;
		
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> studentlist = studentRepository.findAll();
		
		return studentlist;
	}

	@Override
	public Student findById(Integer roll) {
		// TODO Auto-generated method stub
		
		Optional<Student> opt = studentRepository.findById(roll);
		
		if(opt.isPresent()) {
			Student st = opt.get();
			
			return st;
		}else {
			throw new StudentException("No Student found for the given rollNo : "+roll);
		}
		
		
	}

	@Override
	public Student deleteById(Integer roll) {
		// TODO Auto-generated method stub
		
		Optional<Student> opt = studentRepository.findById(roll);
		
		if(opt.isPresent()) {
			Student st = opt.get();
			studentRepository.delete(st);
			return st;
			
		}else
			throw new StudentException("Student not found for the given rollNo : "+roll);
	}



}
