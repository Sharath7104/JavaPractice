package com.dao;

import com.dto.Student;

public interface StudentDao {
	void addStudent(Student st);
	void updateStudent(Student st);
	void deleteStudent(String rollNo);
	void displayStudents();
}
