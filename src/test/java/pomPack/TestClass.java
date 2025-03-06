package pomPack;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import loggerDemo.TestLogger;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class TestClass {

	public static Logger log;
	WebDriver driver;
	@BeforeClass
	public void setup() throws InterruptedException, IOException
	{
		log = LogManager.getLogger(TestClass.class);
		
		driver=new ChromeDriver();
		log.info("browser is opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		log.info("URL is opened");
	}
	
	@Test
	public void testLogin()
	{
		LoginPOMClass lp=new LoginPOMClass(driver);
		lp.sendUsername();
		log.info("Username is entered");
		lp.sendPassword();
		log.info("Password is entered");
		lp.clickAction();
		log.info("Clicked on login button");
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
