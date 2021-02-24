package pl.krystian.SpringCore;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

	public void drive() {
		System.out.println("Drive car");
	}

	public void turnOn() {
		System.out.println("Turn on car");
	}

	public void turnOff() {
		System.out.println("Turn off car");
	}
	

}
