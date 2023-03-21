package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		A obj = ctx.getBean("a", A.class);
		obj.funA();
		
		ClassPathXmlApplicationContext ctx1 =(ClassPathXmlApplicationContext)ctx;
//		A obj1 = ctx.getBean("a", A.class);
//		obj1.funA();
//		
//		System.out.println(obj == obj1);
		ctx1.close();
	}

}
