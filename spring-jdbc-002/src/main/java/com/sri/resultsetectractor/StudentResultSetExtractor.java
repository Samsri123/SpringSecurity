package com.sri.resultsetectractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sri.api.Student;

public class StudentResultSetExtractor implements ResultSetExtractor<List<Student>> {

	@Override
	public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {

		List<Student> studentList = new ArrayList<Student>();

		while (rs.next()) {
			Student s = new Student();
			s.setRollNo(rs.getInt("rollNo"));
			s.setName(rs.getString("name"));
			s.setAddress(rs.getString("address"));
			studentList.add(s);
		}
		System.out.println("Inside the extractData() method...");
		return studentList;
	}

}
