package pl.krystian.MockitoTesting;

public class Calculator {
	
	public int addTwoGiven(GiveNumber10 give10, GiveNumber5 give5) {
		return give10.give() + give5.give();
	}
}
