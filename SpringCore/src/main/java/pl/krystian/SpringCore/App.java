package pl.krystian.SpringCore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Vehicle vehicle = new Bike();
    	
    	
    	vehicle.turnOn();
    	vehicle.drive();
    	vehicle.turnOff();
    }
}
