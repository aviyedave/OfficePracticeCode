package checkboxesAndAlertPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		//normal alert ok button
		
/*		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(4000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
*/		
		
		//alert with confirm message
		
/*		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(4000);
		Alert alert1=driver.switchTo().alert();
		//alert1.accept();
		//alert1.dismiss();
*/		
		//alert with prompt alert
		
	/*	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(4000);
		Alert alert2=driver.switchTo().alert();
		
		alert2.sendKeys("Avinash");
		Thread.sleep(4000);
		alert2.accept();
	*/	
		
		
		
		
		
		
		

	}

}
