package app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class CarList {
	private List<Car> list = new ArrayList<Car>();

	public List<Car> getList() {
		return list;
	}
	
	public void addToList(Car car) {
		list.add(car);
	}
}
