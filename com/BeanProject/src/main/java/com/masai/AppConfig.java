package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.masai")
public class AppConfig {
	
	@Bean
	public B getB() {
		B b1 = new B();
		
		return b1;
	}
	
	@Bean("b1")
	public B getB1() {
		B b1 = new B();
		return b1;
	}
	
	@Bean("clist")
	public List<String> getCities(){
		List<String> cities = new ArrayList<String>();
		
		cities.add("delhi");
		cities.add("chennai");
		cities.add("mumbai");
		cities.add("kolkata");
		
		return cities;
	}
}
