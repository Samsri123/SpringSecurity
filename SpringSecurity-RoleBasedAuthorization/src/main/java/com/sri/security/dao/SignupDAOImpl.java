package com.sri.security.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sri.security.dto.SignupDTO;

@Repository
public class SignupDAOImpl implements SignupDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertUser(SignupDTO signupDTO) {

		String sql = "INSERT INTO users VALUES(?,?,?)";
		String sql2 = "INSERT INTO authorities VALUES(?,?)";

		jdbcTemplate.update(sql, signupDTO.getUsername(), signupDTO.getPassword(), 1);
		jdbcTemplate.update(sql2, signupDTO.getUsername(), "USER");

	}

}
