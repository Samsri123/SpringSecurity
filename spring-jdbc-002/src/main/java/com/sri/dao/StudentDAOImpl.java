package com.sri.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sri.api.Student;
import com.sri.rowmapper.StudentRowMapper;

@Repository("studentDAO")
public class StudentDAOImpl implements StudentDAO {
	@Autowired
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

	@Override
	public void insert(List<Student> students) {
		String sql = "INSERT INTO STUDENT(rollNo,name,address) VALUES(?,?,?)";
		ArrayList<Object[]> sqlArgs = new ArrayList<>();
		for (Student tempStudent : students) {
			Object[] studentData = { tempStudent.getRollNo(), tempStudent.getName(), tempStudent.getAddress() };
			sqlArgs.add(studentData);
		}
		jdbcTemplate.batchUpdate(sql, sqlArgs);
		System.out.println("Batch update completed");

	}

	@Override
	public boolean deleteRecordByRollNo(int rollNo) {
		String sql = "DELETE FROM STUDENT WHERE rollNo=?";
		int noOfrecordDeleted = jdbcTemplate.update(sql, rollNo);
		System.out.println("No of record deleted is " + noOfrecordDeleted);
		return noOfrecordDeleted == 1;
	}

	@Override
	public int deleteRecordByStudentNameAndStudentAddress(String name, String address) {
		String sql = "DELETE FROM STUDENT WHERE name=? OR address =?";
		Object[] args = { name, address };
		int noOfRowsDeleted = jdbcTemplate.update(sql, args);
		System.out.println("No of rows deleted " + noOfRowsDeleted);
		return noOfRowsDeleted;
	}

	public void cleanUp() {
		String sql = "TRUNCATE TABLE STUDENT";
		jdbcTemplate.execute(sql);
		System.out.println("All records deleted successfully");
	}

	@Override
	public List<Student> findAllStudents() {
		String sql = "SELECT * FROM STUDENT";
		List<Student> studentList = jdbcTemplate.query(sql, new StudentRowMapper());
		return studentList;
	}

	@Override
	public Student findStudentByRollNo(int rolNo) {
		String sql = "SELECT * FROM STUDENT WHERE rollNo=?";
		Student student = jdbcTemplate.queryForObject(sql, new StudentRowMapper(),rolNo);
		return student;
	}

}
