package com.masai;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {

	@Autowired
	private List<String> cities;
	
	
	@PostConstruct
	public void init() {
		System.out.println("inside init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("inside destroy method");
	}
	
	public void funA() {
		System.out.println("Inside funA of A");
		System.out.println("Cities list : "+cities);
	}
}
