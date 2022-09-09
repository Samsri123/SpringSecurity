package com.sri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.api.Student;
import com.sri.dao.StudentDAO;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO studentDAO;

	@Override
	public List<Student> loadStudents() {
		List<Student> loadStudents = studentDAO.loadStudents();
		return loadStudents;
	}

	@Override
	public void saveStudent(Student student) {
		studentDAO.saveStudent(student);

	}

	@Override
	public void updateStudent(Student student) {

		studentDAO.updateStudent(student);

	}

	@Override
	public Student getStudent(int id) {
		
		return studentDAO.getStudent(id);
	}

	@Override
	public boolean deleteStudentById(int id) {
		
		return studentDAO.deleteStudentById(id);
	}

}
