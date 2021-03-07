package pl.krystian.JWT;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

	
	@GetMapping("/test")
	public @ResponseBody String getTest() {
		return "test";
	}
}
