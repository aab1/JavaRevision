package lesson1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTestForString {

	@Test
	public void test() {
		MethodOverloading methoOverloadingClassObj = new MethodOverloading();
		String actualResult = methoOverloadingClassObj.add("Hello ","World");
		assertEquals("Hello World", actualResult);
	}

}
