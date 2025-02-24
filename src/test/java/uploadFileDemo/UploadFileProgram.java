package uploadFileDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFileProgram {

	public static void main(String[] args) {
		//WebDriver driver=new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\800709644\\OneDrive - Interactive Manpower Solutions Pvt. Ltd\\Documents\\Java-.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Java-.txt"))
		{
			System.out.println("File successfully uploaded");
		}
		else
		{
			System.out.println("upload failed");
		}
		
		
		
		
		
		
		
	}

}
