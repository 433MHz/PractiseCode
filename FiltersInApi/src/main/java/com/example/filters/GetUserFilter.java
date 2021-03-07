package com.example.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class GetUserFilter implements javax.servlet.Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		String header = httpServletRequest.getHeader("login");
		
		if(header == null){
			System.out.println("Brakuje headera");
		}
		else if(header.equals("krystian")) {
			System.out.println("Zalogowano krystiana");
		}
		else if(header.equals("tomek")) {
			System.out.println("Zalogowano tomka");
		}
		else {
			System.out.println("Nie zalogowano nikogo");
		}
	
		chain.doFilter(httpServletRequest, response);
	}

}
