package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FirstCarListAdder {

	@Autowired
	CarList list;
	
	public void add(Car car) {
		list.addToList(car);
	}
}
