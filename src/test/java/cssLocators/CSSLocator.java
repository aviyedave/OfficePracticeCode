package cssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator {

	//CSS- cascading style sheets
	/* tag id                tag#id
	 * tag class             tag.classname
	 * tag attribute         tag[attribute="value"]
	 * tag class attribute   tag.classname[attribute="value"]
	 */
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		//tag id                tag#id
	    //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("tshirts");
		
		
		//tag class             tag.classname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");
		
		
		//tag attribute         tag[attribute="value"]
		//driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("T-shirts");
		
		//tag class attribute   tag.classname[attribute="value"]
		//driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("T-shirts");
		
		
		
	}

}
