package pl.krystian.MockitoTesting;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CalculatorTestV2 {

	@Test
	void add_two_numbers() {
		//given
		Calculator calculator = mock(Calculator.class);
		GiveNumber10 giveNumber10 = new GiveNumber10();
		GiveNumber5 giveNumber5 = new GiveNumber5();
		given(calculator.addTwoGiven(Mockito.any(GiveNumber10.class), Mockito.any(GiveNumber5.class))).willReturn(10);
		//when
		int result = calculator.addTwoGiven(giveNumber10, giveNumber5);
		//then
		System.out.println(result);
		assertEquals(result, 10);
	}

}
