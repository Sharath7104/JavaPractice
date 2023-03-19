package com.masai;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype") //to create new object everytime
public class A {

	private B b1;
	
	@Autowired
	@Qualifier("b5")
	public void setB1(B b1) {
		this.b1 = b1;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inside init method");
	}
	
	@PreDestroy
	public void teardown() {
		System.out.println("Inside teardown method");
	}

	public void funA() {
		System.out.println("Inside funA");
		System.out.println("B is :"+b1);
	}
}
