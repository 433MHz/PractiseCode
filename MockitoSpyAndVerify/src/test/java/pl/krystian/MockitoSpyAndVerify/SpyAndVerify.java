package pl.krystian.MockitoSpyAndVerify;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.BDDMockito.*;

import java.util.ArrayList;
import java.util.List;

class SpyAndVerify {

	@Test
	void testSpy() {
		List list = spy(ArrayList.class);
				
		list.add("Cat");
		list.add("Dog");
		
		assertEquals(2, list.size());
	}
	
	
	@Test
	void testMock() {
		List list = mock(ArrayList.class);
		
		list.add("Cat");
		list.add("Dog");
		
		assertEquals(0, list.size());
	}
	
	
	@Test
	void testVerify() {
		List list = mock(ArrayList.class);
		
		list.add("Cat");
		list.add("Dog");
		
		verify(list).add("Dog");
		verify(list).add("Cat");
	}

}
