package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");//get();
		driver.manage().window().maximize();
		
		//isDisplayed()
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.isDisplayed());
		
		//isEnabled
		
		boolean firstName=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println(firstName);
	
		
		
		//isSelected
		boolean firstName1=driver.findElement(By.xpath("//input[@id='FirstName']")).isSelected();
		System.out.println(firstName1);
	
		
		

	}

}
