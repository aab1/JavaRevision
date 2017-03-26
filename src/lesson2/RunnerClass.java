package lesson2;

public class RunnerClass {
	/*Here we learn about inheritance
	 * polymorphism has the form of override and overload
	 * overload is done in a class and override happens in cases of inheritance
	 * for abstract classes, you cannot create an object of an abstract class but you can inherit abstract class
	 * e.g  Axa_Insurace axa = new Axa_Insurace(); you can't do this cos it is an abstract class            
	 * abstract method can only be created in abstract class but they must be implemented in the sub class
	 * when a class is not abstract, it is said to be concrete
	 * story to understand override: my father(Super class) has a phone(nokia 3310) and son(derived class) does not have a phone
	 * when u  ask the son if he has a phone he will say yes(he has nokia 3310)  cos his father has one and he can use it
	 * later the son bought a phone (samsung note 5)
	 * if the son is asked if he has a phone, he will say yes he has samsung note 5 cos it is private to him
	 * this is the idea of overriding a method
	 * */

	public static void main(String[] args) {
		Axa_Insurace client1 = new Home(); // this is polymorphism
		client1.setCustomerName("yemi");
		client1.premium();
		client1.policy_number();
		System.out.println(client1.getCustomerName()+" your premium is " +client1.premium()+" and your policy number is "+client1.policy_number());
		
		//##################################################################
		
		Car client2 = new Car();//this is not polymorphism but an instance of car class
		client2.setCustomerName("yemi");
		client2.premium();
		client2.policy_number();
		
		System.out.println("The total number of customers with axa policy "+Axa_Insurace.totalNumOfAxaCustomer);
		
		System.out.println("The number of home customers: "+Home.allHomePolicyCustomers);
		
		
		
	}

}
