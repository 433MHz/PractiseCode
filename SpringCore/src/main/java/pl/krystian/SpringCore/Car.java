package pl.krystian.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

	@Autowired
	private Tyre tyre;
	
	public void drive() {
		System.out.println("Drive car with tyre brand " + tyre.getBrand() + " and size of tyre " + tyre.getSize());
	}

	public void turnOn() {
		System.out.println("Turn on car");
	}

	public void turnOff() {
		System.out.println("Turn off car");
	}
	

}
