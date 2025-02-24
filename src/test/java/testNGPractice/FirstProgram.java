package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstProgram {

	WebDriver driver;
	@Test(priority=-1)
	void openURLMethod()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();
	}

	
	@Test(priority=2)
	void loginMethod()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		WebElement password=driver.findElement(By.xpath("(//input[@id='input-password'])[1]"));
		password.clear();
		password.sendKeys("demo");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	
	@Test(priority=3)
	void logoutMethod()
	{
		driver.quit();
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

}
