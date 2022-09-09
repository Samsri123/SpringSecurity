package com.sri.dao;

import java.util.List;

import com.sri.api.Student;

public interface StudentDAO {
	List<Student> loadStudents();
	
	void saveStudent(Student student);
	
	void updateStudent(Student student);
	
	Student getStudent(int id);
	
	boolean deleteStudentById(int id);
}
