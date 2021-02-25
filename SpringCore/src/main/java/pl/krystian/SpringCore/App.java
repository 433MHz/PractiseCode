package pl.krystian.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	Phone phone =(Phone) context.getBean(Phone.class);
    	
    	System.out.println(phone.getPhone());
    }
}
