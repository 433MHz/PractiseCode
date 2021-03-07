package pl.krystian.JWT;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.Jwts;

public class ApiFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		
		String header = httpServletRequest.getHeader("Authorization");
		
		if(header != null && header.startsWith("Bearer ")) {
			header = header.substring(7);
			
			try {
			Claims body = Jwts.parser().setSigningKey("Kluczyk").parseClaimsJws(header).getBody();
			JwsHeader headerResult = Jwts.parser().setSigningKey("Kluczyk").parseClaimsJws(header).getHeader();
			String signatureResult = Jwts.parser().setSigningKey("Kluczyk").parseClaimsJws(header).getSignature();
			
			System.out.println("Body: " + body.toString());
			System.out.println("Header " + headerResult.toString());
			System.out.println("Signature Result: " + signatureResult);
			
			chain.doFilter(httpServletRequest, response);
			}
			catch (Exception e) {
				throw new ServletException("Wrong password");
			}
		}
		else {
		throw new ServletException("Wrong token format");	
		}
		
	}

}
