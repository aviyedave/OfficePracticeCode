package testNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAnnotations2 
{

	
	@BeforeClass
	public void login()
	{
		System.out.println("This is login method");
	}
	
	@Test(priority=1)
	public void search()
	{
		System.out.println("This is search method");
	}
	
	@Test(priority=2)
	public void advsearch()
	{
		System.out.println("This is advsearch method");
	}
	
	@AfterClass
	public void logout()
	{
		System.out.println("This is logout method");
	}
	
	
	
	
	
	
	
	
	
	
	

}
