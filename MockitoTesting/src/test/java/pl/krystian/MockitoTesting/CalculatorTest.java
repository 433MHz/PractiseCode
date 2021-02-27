package pl.krystian.MockitoTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class CalculatorTest {
	
	@Test
	public void add_two_numbers() {
		
		//given
			Calculator calculator = new Calculator();
		//when
			int result = calculator.add(10, 15);
		//then
			assertEquals(25, result);
	}
	
	@Test
	public void add_no_two_numbers() {
		
		//given
			Calculator calculator = new Calculator();
		//when
			
		//then
			assertNotEquals(20 , calculator.add(5,10));
	}
	
	@Test
	public void divide_two_numbers() {
		
		//given
			Calculator calculator = new Calculator();
		//when
			int result = calculator.divide(10, 5);
		//then 
			assertEquals(2, result);
	}
	
	@Test
	public void add_random_number() {
		
		//given
			Calculator calculator = new Calculator();
			RandomNum randomNum = mock(RandomNum.class);
			when(randomNum.get()).thenReturn(getNumber());
		//when
			int first = randomNum.get();
		//then
			assertEquals(calculator.add(first, 10), 20);
	}
	
	private int getNumber() {
		return 10;
	}
}
