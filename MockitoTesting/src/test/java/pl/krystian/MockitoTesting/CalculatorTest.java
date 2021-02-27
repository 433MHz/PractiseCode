package pl.krystian.MockitoTesting;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void get_given_numbers() {
		
		//given
		Calculator calculator = new Calculator();
		GiveNumber10 giveNumber10 = mock(GiveNumber10.class);
		GiveNumber5 giveNumber5 = mock(GiveNumber5.class);
		
		given(giveNumber10.give()).willReturn(setUpGive10());
		given(giveNumber5.give()).willReturn(setUpGive5());
		
		//when
		int result = calculator.addTwoGiven(giveNumber10, giveNumber5);
		
		//then
		System.out.println(result);
		assertEquals(result, 50);
	}
	
	private int setUpGive5() {
		return 30;
	}
	
	
	private int setUpGive10() {
		return 20;
	}

}
