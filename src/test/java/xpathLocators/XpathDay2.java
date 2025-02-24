package xpathLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDay2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		//Xpath by Attribute
		
		//driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Avinash");
		
		//Xpath by text
		
		//driver.findElement(By.xpath("//button[text()='Register']")).click();
		
		//Xpath by contains
		//contains by text
		//driver.findElement(By.xpath("//button[contains(text(),'Regis')]")).click();
		
		//contains by text
		//driver.findElement(By.xpath("//input[contains(@id,'FirstName')]")).sendKeys("Avinash");		
		
		//absolute xpath
		//driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[2]/input")).sendKeys("Avinash");
		
		//Relative Xpath
		//driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Avinash");		

	}

}
