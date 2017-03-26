package lesson1;

public class StaticMethod {
	/*static method only belong to the class and not the instance of the class
	 *it can be called by the class and not the instance
	 *see another example in the student class constructor */
	public static String methodGreeting(String message)
	{
		return message;
	}
	
	// final keyword tutorial
	/*
	 * method with final keyword cannot be overriden by a subclass
	 * variable with final can only be initialised once so it be used as a constant
	 * class created with final keyword cannot be subclassed
	 * see example of final variable in student class*/
}
