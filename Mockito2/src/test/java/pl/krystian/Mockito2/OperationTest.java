package pl.krystian.Mockito2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import static org.mockito.BDDMockito.*;

import java.util.ArrayList;


class OperationTest {


	@Test
	void count_object() {
		//given
		Operation operation = mock(Operation.class);
		given(operation.CountListSize(anyList())).willReturn(20);
		
		//when
		int result = operation.CountListSize(new ArrayList());
		
		//then
		System.out.println(result);
		assertEquals(result, 20);
	}

}
