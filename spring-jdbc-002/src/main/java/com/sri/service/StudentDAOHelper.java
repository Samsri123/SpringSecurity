package com.sri.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.api.Student;
import com.sri.dao.StudentDAO;

@Service
public class StudentDAOHelper {
	@Autowired
	private StudentDAO studentDAOImpl;

	public void setUpStudentTable() {
		Student s1 = new Student();
		s1.setName("Rani");
		s1.setRollNo(012);
		s1.setAddress("Tirupathi");

		Student s2 = new Student();
		s2.setName("Pinky");
		s2.setRollNo(013);
		s2.setAddress("Viazag");

		Student s3 = new Student();
		s3.setName("Roanalds");
		s3.setRollNo(014);
		s3.setAddress("Hyderabad");

		Student s4 = new Student();
		s4.setName("Raimonds");
		s4.setRollNo(015);
		s4.setAddress("Italy");

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentDAOImpl.insert(studentList);
	}

	public void printStudentsList(List<Student> students) {
		for (Student tempStudentList : students) {
			System.out.println(tempStudentList);
		}
	}

}
