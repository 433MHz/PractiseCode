package pl.krystian;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CarApi {
	
	private CarRepo carRepo;
	
	@Autowired
	public CarApi(CarRepo carRepo) {
		this.carRepo = carRepo;
	}

	@PostMapping("/addCar")
	public void addCar(@RequestBody Car car) {
		carRepo.save(car);
	}
	
	@GetMapping("/getCars")
	public @ResponseBody List<Car> getCars(){
		return (List<Car>) carRepo.findAll();
	}
	
	@DeleteMapping("/removeCar")
	public void removeCar(@RequestParam int id) {
		carRepo.deleteById(id);
	}
}
