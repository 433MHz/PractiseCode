package pl.krystian.MockitoTesting;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNum {
	public int get() {
		return ThreadLocalRandom.current().nextInt(0,100+1);
	}
}
