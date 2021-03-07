package pl.krystian.JWT;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class UserApi {

	
	@PostMapping("/getToken")
	public @ResponseBody String getToken(@RequestBody User user) {
		
		long currentTime = System.currentTimeMillis();
		long expirationTime = currentTime + 20000;
		
		return Jwts.builder()
		.claim("roles", "ADMIN")
		.setSubject(user.getLogin())
		.setIssuedAt(new Date(currentTime))
		.setExpiration(new Date(expirationTime))
		.signWith(SignatureAlgorithm.HS512, "Kluczyk")
		.compact();
	}
	
	
	@GetMapping("/getInfo")
	public @ResponseBody String getInfo() {
		return "finished";
	}
}
