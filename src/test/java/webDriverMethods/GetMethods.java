package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://tutorialsninja.com/demo/");//get();
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());//getCurrentUrl()
		System.out.println(driver.getTitle());//getTitle()
		
	//	System.out.println(driver.getPageSource());//getPageSource()
		
		String winID=driver.getWindowHandle();
		System.out.println(winID);
		
		
		
		
		
		

	}

}
