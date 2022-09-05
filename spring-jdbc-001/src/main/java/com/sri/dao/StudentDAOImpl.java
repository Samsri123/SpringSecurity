package com.sri.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sri.api.Student;

public class StudentDAOImpl implements StudentDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insert(Student student) {
		String sql = "INSERT INTO STUDENT VALUES(?,?,?)";
		Object[] arr = { student.getRollNo(), student.getName(), student.getAddress() };

		int noOfRowInserted = jdbcTemplate.update(sql, arr);
		System.out.println("No of row inserted is :" + noOfRowInserted);

	}

}
