package pl.krystian.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {

	
	@GetMapping("/getInfo")
	public @ResponseBody String getInfo() {
		return "Information 1";
	}
}
