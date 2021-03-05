package pl.krystian;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/database")
public class DatabaseApi {

	UserRepo userRepo;
	
	@Autowired
	public DatabaseApi(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	@PostMapping("/addUser")
	public @ResponseBody boolean addUser(@RequestBody User user) {
		userRepo.save(user);
		return true;
	}
	
	@DeleteMapping("/removeUser")
	public @ResponseBody boolean removeUser(@RequestParam Long id) {
		userRepo.deleteById(id);
		return true;
	}
	
	@GetMapping("/getUser")
	public @ResponseBody Optional<User> getUser(@RequestParam Long id) {
		return userRepo.findById(id);
	}
	
	@GetMapping("/getUsers")
	public @ResponseBody List<User> getUsers() {
		return (List<User>) userRepo.findAll();
	}
}
