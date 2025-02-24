package testNGPractice;

import org.testng.annotations.Test;

public class LoginGrouping 
{
	@Test(priority=1, groups= {"sanity"})
	void loginByEmail()
	{
		System.out.println("This is an login by email method");
	}
	
	@Test(priority=2, groups= {"sanity"})
	void loginByFb()
	{
		System.out.println("This is an login by Fb method");
	}
	
	
	@Test(priority=3, groups= {"sanity"})
	void loginBytwitter()
	{
		System.out.println("This is an login by twitter method");
	}
	
	
	
	
	
	
	
	
	
	
	
}
