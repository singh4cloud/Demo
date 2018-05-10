package com.example.demo.secconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(HttpSecurity httpSecurity) throws Exception {

		httpSecurity.authorizeRequests().antMatchers("/SBI/v1/private/account/*").hasRole("USER").and().formLogin();

	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {

		authenticationManagerBuilder.inMemoryAuthentication()
		.withUser("monu").password("monu").roles("USER")
		.and()
		.withUser("admin").password("admin").roles("USER","ADMIN");
	}

}
