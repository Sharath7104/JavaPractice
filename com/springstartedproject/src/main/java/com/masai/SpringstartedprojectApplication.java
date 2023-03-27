package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringstartedprojectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringstartedprojectApplication.class, args);
		MyController mc = ctx.getBean(MyController.class);
		
		mc.updateStudentDetails(new Student(1, "Babu", "Kolkata", 260), 240);
		
	}

}
