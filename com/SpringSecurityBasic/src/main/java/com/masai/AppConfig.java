package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AppConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests()
		.requestMatchers("/hello").permitAll()
		.requestMatchers("/hello1").authenticated() //can also use .anyrequest() for all other request to be authenticated
		.requestMatchers("/hello2").denyAll()
		.and()
		.formLogin()
		.and()
		.httpBasic();
		
		DefaultSecurityFilterChain dsf = http.build();
		
		
		
		return dsf;
		
	}
}
