package com.sri.lp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class LPAppEmailServiceImpl implements LPAppEmailService {
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void sendEmail(String userName,String crushName ,String userEmail, String result) {
		SimpleMailMessage newEmail = new SimpleMailMessage();
		newEmail.setTo(userEmail);
		newEmail.setSubject(result);
		newEmail.setText("Hi " + userName + ",\nThe result predicted by the Love Calculator for the names "+userName+" and "+crushName +" is : "+ result);

		javaMailSender.send(newEmail);
	}

}
