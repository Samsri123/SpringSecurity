package com.sri.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
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
				.password("$2a$12$0gZAGFx4DfTRvnXHn4MCkeywLhLa8oHZQlyZTBuTsE8Idoe0FALxa").roles("admin").and()
				.withUser("hari").password("$2a$10$bC80RhL7cQS6qpf2yJF/I.syWWaEVXjD3sRMlsIWGtG8mdUduOS2i")
				.roles("user");// $2a$12$0gZAGFx4DfTRvnXHn4MCkeywLhLa8oHZQlyZTBuTsE8Idoe0FALxa
		// $2a$12$4qLu8nU0JwZACyx3QnmE3ucnDEliDMqtIif1bkb4VVmbxm/vpSKDy

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/hello").authenticated().antMatchers("/bye").authenticated()
				.antMatchers("/").permitAll().antMatchers("/login").permitAll().and().formLogin().loginPage("/login").loginProcessingUrl("/process-login").and().httpBasic().and().logout();
	}

}
