package checkboxesAndAlertPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//select specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();

		//select the all the checkboxes
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//		for(int i=0;i<checkbox.size();i++)
//		{
//			checkbox.get(i).click();
//		}
		
//		for(WebElement checkboxes:checkbox)
//		{
//			checkboxes.click();
//		}
		
		//select 3 checkbox
//		for(int i=4;i<checkbox.size();i++)
//			{
//				checkbox.get(i).click();
//			}
		
		//select 1st 3 checkbox
//		for(int i=0;i<checkbox.size()-4;i++)
//		{
//			checkbox.get(i).click();
//		}
		
		
		
		
		
		
		
		
		
	}

}
