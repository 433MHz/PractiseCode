package pl.krystian.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    	
    	Vehicle obj = (Vehicle) context.getBean("bike");
    	obj.turnOn();
    	obj.drive();
    	obj.turnOff();
    	
    	
    	Tyre tyre = (Tyre) context.getBean("tyre");
    	System.out.println("Brand of tyre is: " + tyre.getBrand());
    	System.out.println("Tyre size is: " + tyre.getSize());
    }
}
