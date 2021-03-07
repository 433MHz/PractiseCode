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
public class Api {

	
	
	@PostMapping("/getToken")
	public @ResponseBody String getToken(@RequestBody User user) {
		
		long currentTime = System.currentTimeMillis();
		long expireTime = currentTime + 20000;
		
		String result = Jwts.builder()
			.setSubject(user.getLogin())
			.claim("roles", "USER")
			.setIssuedAt(new Date(currentTime))
			.setExpiration(new Date(expireTime))
			.signWith(SignatureAlgorithm.HS512, "`MRaKZ6Ef'~@vl%mZ^k1Br;:r2aCExUY\\LsG@$3s'3uRe*ccJExF2I3XW8cW*:Jd")
			.compact();
		
		return result;
	}
	
	
	@GetMapping("/getInfo")
	public String getInfo() {
		return "finish";
	}
}
