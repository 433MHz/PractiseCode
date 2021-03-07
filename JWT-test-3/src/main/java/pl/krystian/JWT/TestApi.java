package pl.krystian.JWT;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

	
	@GetMapping("/test1")
	public @ResponseBody String test1() {
		return "test1";
	}
	
	@GetMapping("/test2")
	public @ResponseBody String test2() {
		return "test2";
	}
	
	
	@GetMapping("/test3")
	public @ResponseBody String test3() {
		return "test3";
	}
}
