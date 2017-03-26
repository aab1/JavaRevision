package lesson2;

import java.util.Random;

abstract public class Axa_Insurace {
	protected String customerName;
	private int policyNumber;
	protected static int totalNumOfAxaCustomer = 0;
	protected final double premiumAmount = 50;
	
	Axa_Insurace(){
		totalNumOfAxaCustomer++;
	}
	  
	public final int policy_number(){
		Random rand = new Random(); 
		policyNumber = rand.nextInt(40);
		return policyNumber;
				
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	abstract public double premium();// this method must be implemented in every child class cos it is abstract
	
	
}
