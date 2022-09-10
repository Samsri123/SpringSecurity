package com.sri.security.dao;

import com.sri.security.dto.SignupDTO;

public interface SignupDAO {
	void insertUser(SignupDTO signupDTO);
}
