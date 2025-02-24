package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 
{
	WebDriver driver; //driver declared 
	
	// WebElement find
	//Username
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement userName;
	
	public void sendUsername()
	{
		userName.sendKeys("Admin");
	}
	
	//Password
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement passWord;
	
	public void sendPassword()
	{
		passWord.sendKeys("admin123");
	}
	
	//loginButton
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginButton;
	
	public void clickAction()
	{
		loginButton.click();
	}
	
	//Constructor
	
	LoginPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
