package com.ui;

import java.util.Scanner;

import com.dao.StudentDAO;
import com.dao.StudentDAOImpl;
import com.dto.StudentImpl;


public class UIMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDAO std = new StudentDAOImpl();
		int choice = 0;
		do {
			System.out.println("Select Option \n 1.Add Student \n 2.Delete Student\n 3.Update Student\n 4.Display All Student\n 0.For exit");
			choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter roll no");
				int rollno = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter name");
				String name = sc.nextLine();
				System.out.println("Enter email");
				String email = sc.next();
				System.out.println("Enter X_per");
				Double x_per = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter State");
				String state = sc.nextLine();
				std.addStudent(new StudentImpl(rollno,name,email,x_per,state));
			}else if(choice == 2) {
				System.out.println("Enter Roll No");
				int rollno = sc.nextInt();
				std.deleteStudent(rollno);
			}else if(choice == 3) {
				System.out.println("Enter roll no");
				int rollno = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter name");
				String name = sc.nextLine();
				System.out.println("Enter email");
				String email = sc.next();
				System.out.println("Enter X_per");
				Double x_per = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter State");
				String state = sc.nextLine();
				
				std.updateStudent(new StudentImpl(rollno,name,email,x_per,state));
			}else if(choice == 4) {
				System.out.println(std.displayStudent());
			}
		}while(choice != 0);
		System.out.println("Thanks for using our service");
	}
}
