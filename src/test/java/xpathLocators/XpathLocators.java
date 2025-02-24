package xpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("mac");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
