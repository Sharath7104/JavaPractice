package com.ui;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.dto.Student;
import com.dto.StudentImpl;

import java.util.Scanner;
public class UiMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDao studao = new StudentDaoImpl();
		
		System.out.println("Select any Option\n 1.Add Student \n 2.Delete Student");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter Roll no");
			System.out.println("Enter name");
			System.out.println("Enter email");
			System.out.println("Enter xper");
			System.out.println("Enter state");
			int rollNo = sc.nextInt();
			sc.nextLine();
			String name = sc.next();
			String email = sc.next();
			Double x_per = sc.nextDouble();
			String state = sc.next();
			
			studao.addStudent(new StudentImpl(rollNo,name,email,x_per,state));
		}else {
			
		}
		
		
	}
}
