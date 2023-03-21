package com.masai;

public class StaticExample {
	
	
	static {
		System.out.println("Inside static block");
	}
	
	StaticExample(){
		System.out.println("Inside default constructor");
	}
	
	public void method(){
		System.out.println("Inside Method");
	}
	
	
}
