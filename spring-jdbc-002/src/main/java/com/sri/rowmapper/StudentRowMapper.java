package com.sri.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sri.api.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student newStudent = new Student();
		newStudent.setRollNo(rs.getInt("rollNo"));
		newStudent.setName(rs.getString("name"));
		newStudent.setAddress(rs.getString("address"));
		//System.out.println("maprow( ) called.....");
		return newStudent;
	}

}
