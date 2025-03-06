package loggerDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestLogger {
	public static WebDriver driver;
	public static Logger log;

	public static void main(String[] args) {

		log = LogManager.getLogger(TestLogger.class);

		driver = new ChromeDriver();
		log.info("Browser is opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.info("Implicity wait of 10 sec");
		driver.get("https://www.myntra.com/");
		log.info("Logged into Myntra");

		try {
			boolean text = driver.findElement(By.xpath("//a[contains(text(),'Women')]")).isDisplayed();
		} catch (Exception e) {
			System.out.print(e.getMessage());
			log.error("Exception occurred", new Exception("Element Not Found"));
		} finally {
			driver.quit();
			log.info("Quitting the driver");
		}
		
	}

}
