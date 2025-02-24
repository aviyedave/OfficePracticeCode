package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo 
{

	@Test
	void validation()
	{
		String exp_title="Opencart";
		String actual_title="Open";
		
		//Assert.assertEquals(exp_title, actual_title);
		
		
		//condditional statement
		
		if(exp_title.equals(actual_title))
		{
			System.out.println("Test Passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
		
		
		//hard and soft assert
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
}
