package com.masai;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {
	
	
	private B b1;

	@Autowired
	public void setB1(B b1) {
		this.b1 = b1;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inside init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
	public void funA() {
		System.out.println("Inside funA of A");
		System.out.println("B1 is :"+b1);
	}
	
	
}
