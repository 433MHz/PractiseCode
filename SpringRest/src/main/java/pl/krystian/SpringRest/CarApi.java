package pl.krystian.SpringRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarApi {

	private CarManager carManager;

	@Autowired
	public CarApi(CarManager carManager) {
		this.carManager = carManager;
	}

	@PostMapping("/addCar")
	public boolean addCar(@RequestBody Car car) {
		return carManager.addCar(car);
	}

	@GetMapping("/getCars")
	public List<Car> getCars() {
		return carManager.getList();
	}
}
