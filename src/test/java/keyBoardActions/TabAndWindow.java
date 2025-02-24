package keyBoardActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TabAndWindow {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	    driver.get("https://text-compare.com/");
		
	    //Selennium 4x
	    //driver.switchTo().newWindow(WindowType.TAB);//new tab
		driver.switchTo().newWindow(WindowType.WINDOW);//new browser
		driver.get("https://demo.nopcommerce.com/");


	}

}
