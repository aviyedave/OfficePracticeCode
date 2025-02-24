package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependencyMethods {

	
	@BeforeMethod
	void login()
	{
		System.out.println("This is login");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("This is search");
		Assert.assertTrue(false);
	}
	
	@Test(priority=2,dependsOnMethods= {"search"})
	void advSearch()
	{
		System.out.println("This is advSearch");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout");
	}
	
	
}
