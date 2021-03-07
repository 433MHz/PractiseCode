package com.example.filters;

import java.util.Collection;
import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FiltersInApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiltersInApiApplication.class, args);
	}
	
	
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new GetUserFilter());
		filterRegistrationBean.setUrlPatterns(Collections.singleton("/getUsers/*"));
		return filterRegistrationBean;
	}
	
	@Bean
	public FilterRegistrationBean filterRegistrationBean2() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new AddUserFilter());
		filterRegistrationBean.setUrlPatterns(Collections.singleton("/addUser/*"));
		return filterRegistrationBean;
	}

}
