package lesson1;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class AddTestForInt {

	@Test
	public void testAddInOverloadingClass() {
		MethodOverloading int_add = new MethodOverloading();
		int result = int_add.add(4, 5);
		assertEquals(9,result);
	}
	
	
}
 