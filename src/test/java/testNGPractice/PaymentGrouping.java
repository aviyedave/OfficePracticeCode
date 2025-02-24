package testNGPractice;

import org.testng.annotations.Test;

public class PaymentGrouping {

	@Test(priority=1, groups= {"sanity","regression"})
	void paymentinRupees()
	{
		System.out.println("payment in rupees...");
	}
	
	
	@Test(priority=2, groups= {"sanity", "regression"})
	void paymentinDoller()
	{
		System.out.println("payment in rupees...");
	}
	
	
	
	
}
