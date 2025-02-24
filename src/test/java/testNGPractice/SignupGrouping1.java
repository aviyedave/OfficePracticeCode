package testNGPractice;

import org.testng.annotations.Test;

public class SignupGrouping1 {

	
	@Test(priority=1, groups= {"regression"})
	void signupByEmail()
	{
		System.out.println("This is an signup by email method");
	}
	
	@Test(priority=2, groups= {"regression"})
	void signupByFb()
	{
		System.out.println("This is an signup by Fb method");
	}
	
	
	@Test(priority=3, groups= {"regression"})
	void signupBytwitter()
	{
		System.out.println("This is an signup by twitter method");
	}
	
	
	
	
	
	
	
	
	
}
