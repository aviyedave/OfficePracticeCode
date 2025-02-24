package dropdownHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
		Select s=new Select(dropdown);
		
		//select option from dropdown
		
		//s.selectByVisibleText("France");
		//s.selectByValue("japan");
		
		//all option size and option display in dropdown
/*		List<WebElement> option=s.getOptions();
		System.out.println(option.size());
		
//		for(int i=0;i<option.size();i++)
//		{
//			System.out.println(option.get(i).getText());
//		}
		
		for(WebElement list:option)
		{
			System.out.println(list.getText());
		}
*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
	}

}
