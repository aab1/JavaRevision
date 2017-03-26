package lesson2;

public class Car extends Axa_Insurace {
	static int  allCarPolicyCustomers = 0;
	Car(){
		allCarPolicyCustomers++;
	}
	
	public double premium(){
		return premiumAmount * 5;
	}
}
