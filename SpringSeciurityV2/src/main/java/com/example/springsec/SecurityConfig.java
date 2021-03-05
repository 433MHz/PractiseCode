package com.example.springsec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public UserDetailsService userDetailsService() {
		
		UserDetails user = User.withDefaultPasswordEncoder()
				.username("user")
				.password("user")
				.roles("USER")
				.build();
		
		UserDetails admin = User.withDefaultPasswordEncoder()
				.username("admin")
				.password("admin")
				.roles("ADMIN")
				.build();
		
		UserDetails moderator = User.withDefaultPasswordEncoder()
				.username("moderator")
				.password("moderator")
				.roles("MODERATOR")
				.build();
		
		return new InMemoryUserDetailsManager(user, admin, moderator);
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.httpBasic().and().authorizeRequests()
		.antMatchers(HttpMethod.GET, "/user").hasAnyRole("USER", "MODERATOR", "ADMIN")
		.antMatchers(HttpMethod.POST, "/user").hasAnyRole("MODERATOR", "ADMIN")
		.antMatchers(HttpMethod.DELETE, "/user").hasRole("ADMIN")
		.and()
		.csrf().disable();
	}
}
