package lesson1;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class AddTestForDouble {

	@Test
	public void testDoubleAddInOverloadingClass() {
		MethodOverloading double_add = new MethodOverloading();
		double ans = double_add.add(5.5, 5.5);
		assertEquals(11.0, ans,1e-8); //this takes 3 param: expected actual,and delta. delta = 1e-8 always.
	}

}
