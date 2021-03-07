package pl.krystian.JWT;

import java.io.IOException;
import java.util.Collections;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.rsocket.RSocketSecurity.JwtSpec;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;

public class JwtFiletr extends BasicAuthenticationFilter {

	public JwtFiletr(AuthenticationManager authenticationManager) {
		super(authenticationManager);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String header = request.getHeader("Authorization");
		UsernamePasswordAuthenticationToken authResult  = getAuthenticationByToken(header);
		SecurityContextHolder.getContext().setAuthentication(authResult);
		
		chain.doFilter(request, response);
	}
	
	
	
	private UsernamePasswordAuthenticationToken getAuthenticationByToken(String header) {
		Jws<Claims> result = Jwts.parser().setSigningKey("tomek".getBytes())
				.parseClaimsJws(header.replace("Bearer ", ""));
		
		String username = result.getBody().get("name").toString();
		String role = result.getBody().get("role").toString();		
		Set<SimpleGrantedAuthority> simpleGrantedAuthority = Collections.singleton(new SimpleGrantedAuthority(role));
		
		UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = 
				new UsernamePasswordAuthenticationToken(username, null, simpleGrantedAuthority);
		return usernamePasswordAuthenticationToken;
	}



}
