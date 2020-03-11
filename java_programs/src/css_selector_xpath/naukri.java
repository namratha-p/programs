package css_selector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='Create a Job Alert']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Roles, Companies']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Roles, Companies']")).sendKeys("software testing");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Software Test Engineer']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Functional Testing']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[.='GUI Testing']")).click();
		 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[.='Adhoc Testing']")).click();
		
		
				
	}

}
