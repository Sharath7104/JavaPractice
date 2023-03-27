package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class MyController {
	
	@RequestMapping("/hello")
	//@ResponseBody
	public String sayHello() {
		return "welcome"; //here it will be represented as raw data
	}
	
	@PostMapping("/postStudent")
	public String getStudent() {
		Student st = new Student(1,"Sharath","Bangalore",555);
		
		return st+"Student saved";
	}
	
	@PutMapping(value = "/updateStudent/{gMarks}")
	public Student updateStudentDetails(@RequestBody Student student,@PathVariable("graceMarks")int gMarks) {

		student.setMarks(student.getMarks()+gMarks);

		return student;
	}
	
	@RequestMapping(value = "/students/{roll}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Student getStudentHandler(@PathVariable int roll) {
		if(roll<100)
			throw new IllegalArgumentException("Roll no should be greater than 100");
		Student s1 = new Student(roll, "ram", "delhi", 800);
		
		return s1;
	}
	
//	@GetMapping("/getstudents")
	@RequestMapping(value = "/getstudents", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getstudents(){
		List<Student> stlist = new ArrayList<>();
		stlist.add(new Student(1, "Sham", "Gujarat", 450));
		stlist.add(new Student(2, "Sham", "Gujarat", 450));
		stlist.add(new Student(3, "Sham", "Gujarat", 450));
		stlist.add(new Student(4, "Sham", "Gujarat", 450));
		stlist.add(new Student(5, "Sham", "Gujarat", 450));
		
		return stlist;
	}
}
