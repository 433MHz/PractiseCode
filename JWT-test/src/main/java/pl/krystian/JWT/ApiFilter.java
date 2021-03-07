package pl.krystian.JWT;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class ApiFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		
		String header = httpServletRequest.getHeader("Authorization");

		if(header != null && header.startsWith("Bearer "))
		{
			System.out.println();
			System.out.println("Zgadza się");
			System.out.println(header);
			System.out.println();
			header = header.substring(7);
			
			Claims claims = Jwts.parser().setSigningKey("`MRaKZ6Ef'~@vl%mZ^k1Br;:r2aCExUY\\LsG@$3s'3uRe*ccJExF2I3XW8cW*:Jd").parseClaimsJws(header).getBody();
			System.out.println(claims.toString());
			chain.doFilter(httpServletRequest, response);
		}
		else {
			System.out.println();
			System.out.println("Nie zgadza się");
			System.out.println(header);
			System.out.println();
		}
		
			
	}

}
