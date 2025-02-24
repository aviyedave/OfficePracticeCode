package webTableHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// 1.Find total number of row in table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);

		// 2.Find total number of column in table
		int column = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
		System.out.println(column);

		// 3.to capture specific data from table
		String getText = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(getText);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")));
		js.executeScript("arguments[0].style.border='5px solid red'", driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")));
		
		//4.Read all data from the table
		
/*		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=column;c++)
			{
				String getData=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(getData+" | ");
			}
			System.out.println();
		}
*/		
		
		//5.print books name whoes author is mukesh
		
/*		for(int r=2;r<=rows;r++)
		{
			String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		if(authorName.equals("Mukesh"))
		{
			String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			System.out.println(bookName);
		}
		}
*/		
		
		
		
		
		
		
	}

}
