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

public class TestClass {

	public Properties p;
	WebDriver driver;
	@BeforeClass
	public void setup() throws InterruptedException, IOException
	{
		
		FileReader file=new FileReader("/seleniumWebdriver/src/test/resources/config.properties");
		p=new Properties();
		p.load(file);
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test
	public void testLogin()
	{
		LoginPOMClass lp=new LoginPOMClass(driver);
		lp.sendUsername();
		lp.sendPassword();
		lp.clickAction();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
