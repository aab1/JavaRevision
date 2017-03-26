package lesson2;

public class Home extends Axa_Insurace {
	static int  allHomePolicyCustomers = 0;
	Home(){
		allHomePolicyCustomers++;
	}
	
	public double premium(){
		return premiumAmount * 2;
	}
}
