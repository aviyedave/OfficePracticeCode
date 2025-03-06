package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//addding comment 
//new comment
public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();

		
		//Open URL
		driver.get("https://tutorialsninja.com/demo/");
		
		//validate title
		String expected_title="Your Store";
		System.out.println(driver.getTitle());
	    String actual_title=driver.getTitle();
		if(expected_title.equals(actual_title))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		Thread.sleep(5000);
		//close browser
		driver.quit();
		
	}

}
