package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");//get();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://tutorialsninja.com/demo/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.quit();
		
		
		
		
		
		

	}

}
