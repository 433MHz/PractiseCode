package pl.krystian.LambdaExpression;
import pl.krystian.LambdaExpression.AddTwoDigits;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	Showing showing = App::show;
    	
    	showing.show(AddTwoDigits.addTwoInts(5, 3));
    }
    
    
    
    private static void show(String message) {
    	System.out.println(message);
    }
}
