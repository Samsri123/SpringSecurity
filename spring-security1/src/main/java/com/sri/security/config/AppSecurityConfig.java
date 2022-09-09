package com.sri.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
	// creating user credentials inside server memory
	// username, password, role
	
	@Autowired
	PasswordEncoder bcryPasswordEncoder;

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication().withUser("srikanth")
				.password("$2a$12$0gZAGFx4DfTRvnXHn4MCkeywLhLa8oHZQlyZTBuTsE8Idoe0FALxa").roles("admin");//$2a$12$0gZAGFx4DfTRvnXHn4MCkeywLhLa8oHZQlyZTBuTsE8Idoe0FALxa
		//$2a$12$4qLu8nU0JwZACyx3QnmE3ucnDEliDMqtIif1bkb4VVmbxm/vpSKDy
		System.out.println(bcryPasswordEncoder.encode("srikanth"));
	}

	
}
