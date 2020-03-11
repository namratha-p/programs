package links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_trip {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Careers")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Job Openings")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Manager – Process Improvement and Automation")).click();
		Thread.sleep(2000);
		
		
		
		
		
		

	}

}
