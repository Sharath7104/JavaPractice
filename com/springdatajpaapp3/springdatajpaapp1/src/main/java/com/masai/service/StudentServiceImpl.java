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
		
		Student savedStudent= studentRepository.save(student);
		
		return savedStudent;
		
	}



	@Override
	public List<Student> getAllStudents() throws StudentException {
		
		List<Student> students= studentRepository.findAll();
		
		if(students.isEmpty())
			throw new StudentException("No student available");
		
		
		
		return students;
		
	}



	@Override
	public Student getStudentByRoll(Integer roll) throws StudentException {
		
		Optional<Student> opt= studentRepository.findById(roll);
//		
//		if(opt.isPresent()) {
//			
//			Student student= opt.get();
//			
//			return student;
//		}else
//			throw new StudentException("Student does not exist with roll number :"+roll);
//		
		
		
		return opt.orElseThrow(() -> new StudentException("Student does not exist with roll "+roll));
		
		
		
	}

}
