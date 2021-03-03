package app;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value = "/rest")
public class ApiHello {

	private FirstCarListAdder first;
	private SecondCarListAdder second;
	private CarList list;
	
	
	@Autowired
	public ApiHello(FirstCarListAdder first, SecondCarListAdder second, CarList list) {
		this.first = first;
		this.second = second;
		this.list = list;
	}
	
	
	@GetMapping(value = "/runFirst")
	public String addFirstCar() {
		Car car = new Car("VW", "Polo");
		first.add(car);
		return "Added first car";	
	}
	
	@GetMapping(value = "/runSecond")
	public String addSecondCar() {
		Car car = new Car("Audi", "A4");
		second.add(car);
		return "Added second car";
	}
	
	
	@GetMapping(value = "/returnList")
	public String returnList(){
		String result = list.getList().stream()
				.map(n -> n.getMark() + n.getModel())
				.collect(Collectors.joining(" "));
		
		return result;
		}
}
