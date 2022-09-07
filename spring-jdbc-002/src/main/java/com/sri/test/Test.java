package com.sri.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sri.api.Student;
import com.sri.dao.StudentDAOImpl;
import com.sri.service.StudentDAOHelper;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("ApplicationContext is loaded");
		StudentDAOHelper studentDAOHelper = context.getBean("studentDAOHelper", StudentDAOHelper.class);
//		StudentDAOHelper helper = context.getBean("studentDAOHelper", StudentDAOHelper.class);
//		helper.setUpStudentTable();
		studentDAOHelper.setUpStudentTable();
		StudentDAOImpl studentDAOImpl = context.getBean("studentDAO", StudentDAOImpl.class);
		List<Student> stdudent = studentDAOImpl.findAllStudents();
		studentDAOHelper.printStudentsList(stdudent);
		Student s1 = studentDAOImpl.findStudentByRollNo(12);
		System.out.println(s1);
		System.out.println("...........................");

		List<Student> findStudent = studentDAOImpl.findStudentByName("Roanalds");
		studentDAOHelper.printStudentsList(findStudent);
		studentDAOImpl.cleanUp();
	}
}
