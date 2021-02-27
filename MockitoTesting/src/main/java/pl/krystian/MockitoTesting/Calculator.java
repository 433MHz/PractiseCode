package pl.krystian.MockitoTesting;

public class Calculator {

	public int add(int first, int second) {
		return first + second;
	}

	public int divide(int first, int second) {
		if (first == 0) {
			throw new ArithmeticException("Can not divide by zero");
		}
		return first / second;
	}

	public int randomNum() {
		return new RandomNum().get();
	}
}
