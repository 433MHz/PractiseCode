package pl.krystian.SpringCore;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

	public void drive() {
		System.out.println("Driveee bike");
	}

	public void turnOn() {
		System.out.println("Turn on bike");
		
	}

	public void turnOff() {
		System.out.println("Turn off bike");
	}

}
