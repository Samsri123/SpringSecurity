package com.sri.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.sri.api.Student;

public class StudentDaoImpl implements StudentDAO {

	private JdbcTemplate jdbcTemplate= new JdbcTemplate(getDataSource());
	@Override
	public void insert(Student student) {
		String sql = "INSERT INTO STUDENT VALUES(?,?,?)";
		Object[] arr = { student.getRollNo(), student.getName(), student.getAddress() };

		int noOfRowInserted = jdbcTemplate.update(sql, arr);
		System.out.println("No of row inserted is :" + noOfRowInserted);

	}

	public DataSource getDataSource() {
		String url = "jdbc:mysql://localhost:3306/STUDENT";
		String userName = "srikanth";
		String password = "srikanth";
		DataSource dataSource = new DriverManagerDataSource(url, userName, password);
		return dataSource;
	}

}
