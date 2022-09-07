package com.sri.dao;

import java.util.List;

import com.sri.api.Student;

public interface StudentDAO {
	void insert(Student student);

	void insert(List<Student> students);

	boolean deleteRecordByRollNo(int rollNo);

	int deleteRecordByStudentNameAndStudentAddress(String name, String address);

	List<Student> findAllStudents();

	Student findStudentByRollNo(int rolNo);
}
