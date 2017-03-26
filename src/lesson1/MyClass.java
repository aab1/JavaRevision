package lesson1;

public class MyClass {

	public static void main(String[] args) {
		Student mark = new Student();// mark --> intance or object
		/*mark.id = 1;
		mark.name = "Mark";
		mark.age = 15;
		instead of writing the code as shown above, we use getters and setters.
		 This method is called encapsulation
		*/
		mark.setId(1);
		mark.setAge(15);
		mark.setName("Mark");
		System.out.println(mark.getName()+" is "+mark.getAge()+"yrs old");
		System.out.println("The static variable: number of student = "+Student.numberOfStudent);
		System.out.println("The final variable prints the school name : "+Student.schoolName);
		
		
		/*create an instance of Cube class
		new Cube(); is a default constructor
		constructor has the same name as the class
		constructor can be used to give default value 
		*/
		Cube cube1 = new Cube();
		Cube cube2 = new Cube(5, 5, 5);
		
		System.out.println(cube1.getCubeVolume());
		System.out.println(cube2.getCubeVolume());
		
		System.out.println("...................Method overloading..............................");
		MethodOverloading MethodOverloading_object = new MethodOverloading();
		System.out.println(MethodOverloading_object.add(2,3));
		System.out.println(MethodOverloading_object.add(2.5, 3.5));
		
		System.out.println("...................Static Method ..............................");
		System.out.println(StaticMethod.methodGreeting("calling static method with the class name and not the instance"));
	}
	
	

}
