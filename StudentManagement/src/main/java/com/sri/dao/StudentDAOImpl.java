package com.sri.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sri.api.Student;
import com.sri.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> loadStudents() {

		String sql = "SELECT * FROM students";
		List<Student> theListOfStudents = jdbcTemplate.query(sql, new StudentRowMapper()); // ,new
																							// BeanPropertyRowMapper<Student>(Student.class));

		return theListOfStudents;
	}

	@Override
	public void saveStudent(Student student) {
		String sql = "INSERT INTO students(name,mobile,country) VALUES(?,?,?)";
		Object[] args = { student.getName(), student.getMobile(), student.getCountry() };
		jdbcTemplate.update(sql, args);
		System.out.println("1 record inserted");
	}

	@Override
	public void updateStudent(Student student) {
		String sql = "UPDATE students SET name=?,mobile=?,country=? WHERE id=?";
		Object[] args = { student.getName(), student.getMobile(), student.getCountry(), student.getId() };
		jdbcTemplate.update(sql, args);
		System.out.println("1 record updated");

	}

	@Override
	public Student getStudent(int id) {
		String sql = "SELECT * FROM students WHERE id=?";
		Student student = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Student>(Student.class), id);
		return student;
	}

	@Override
	public boolean deleteStudentById(int id) {
		String sql ="DELETE FROM students WHERE id=?";
		int update = jdbcTemplate.update(sql, id);
		return update==1;
	}

}
