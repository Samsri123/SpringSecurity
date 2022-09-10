package com.sri.security.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
	// creating user credentials inside server memory
	// username, password, role

	@Autowired
	PasswordEncoder bcryPasswordEncoder;

	@Autowired
	DataSource dataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// Load the users from the DB
		// username, password, role

		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(bcryPasswordEncoder);

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/hello").authenticated().antMatchers("/bye").authenticated()
				.antMatchers("/").permitAll().antMatchers("/login").permitAll().and().formLogin().loginPage("/login")
				.loginProcessingUrl("/process-login").and().httpBasic().and().logout();
	}

}
