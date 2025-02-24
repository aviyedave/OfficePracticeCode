package keyBoardActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandle {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement register=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act=new Actions(driver);
		//click
		act.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
		
		//switch to window
		
		List<String> id=new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(id.get(1));
		
		
		
		
		
		
		
	}

}
