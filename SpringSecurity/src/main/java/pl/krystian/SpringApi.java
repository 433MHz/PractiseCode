package pl.krystian;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringApi {

	
	@GetMapping("/sayHello")
	public @ResponseBody String sayHello() {
		return "Hello";
	}
	
	@GetMapping("/sayHello2")
	public @ResponseBody String sayHello2() {
		return "Hello2";
	}
}
