package com.sri.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.security.dao.SignupDAO;
import com.sri.security.dto.SignupDTO;
@Service
public class SignupServiceImpl implements SignupService {

	@Autowired
	private SignupDAO signupDAO;
	
	@Override
	public void insertUser(SignupDTO signupDTO) {
		signupDAO.insertUser(signupDTO);
		
	}
	
}
