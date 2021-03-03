package pl.krystian.SpringRest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CarManager {

	private List<Car> list = new ArrayList<Car>();

	public List<Car> getList() {
		return list;
	}
	
	
	public boolean addCar(Car car) {
		list.add(car);
		return true;
	}
}
