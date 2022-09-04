package com.sri.test;

import com.sri.api.Student;
import com.sri.dao.StudentDAO;
import com.sri.dao.StudentDaoImpl;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("NAVEEN");
		s1.setAddress("DHARMAVARAM");
		s1.setRollNo(002);
		StudentDAO studentDAO = new StudentDaoImpl();
		studentDAO.insert(s1);
	}
}
