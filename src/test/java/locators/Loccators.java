package locators;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loccators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("mac");
		
		//id
//		boolean display=driver.findElement(By.id("logo")).isDisplayed();
//		System.out.println(display);
		
		//linktext and partial linktext
		
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Tabl")).click();
		
		//classname
		
//		List<WebElement> header=driver.findElements(By.className("list-inline"));
//		System.out.println(header.size());
		
		//tagnames
//		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
//		System.out.println(allLinks.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
