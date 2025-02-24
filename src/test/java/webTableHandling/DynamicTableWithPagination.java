package webTableHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableWithPagination {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();

		WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		WebElement password=driver.findElement(By.xpath("(//input[@id='input-password'])[1]"));
		password.clear();
		password.sendKeys("demo");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.findElement(By.xpath("//a[@href='#collapse-5']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		//Showing 1 to 10 of 17363 (1737 Pages)
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		int total_Page=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		Thread.sleep(3000);
		
		//repeating page
		
		for(int p=1;p<=5;p++) 
		{
			if(p>1)
			{
				WebElement active_Page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_Page.click();
				Thread.sleep(3000);
			}
			//reading data	
			
			int noOfRows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();			
			
			for(int r=1;r<=noOfRows;r++)
			{
				String custname=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String email=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				String custGrooup=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
			
				System.out.println(custname +" "+email+" "+custGrooup);
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
