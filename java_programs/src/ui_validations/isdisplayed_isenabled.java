package ui_validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed_isenabled {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement email=driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		WebElement pass=driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		
		if (email.isDisplayed() && email.isEnabled())
		{
			email.clear();
			email.sendKeys("namratha.p@yahoo.com");
			System.out.println("entered the details as given");
		
		}
		else 
		{
			System.out.println("the email field is not diplayed or enabled");
		}
	
		if (pass.isDisplayed() && pass.isEnabled()) 
		{
			pass.clear();
			pass.sendKeys("password");
			System.out.println("entered the details as given");
			
		} 
		else
		{
			System.out.println("the password field is not dipalyed or enabled");
		}
	
	
	
	
	}
	
	
	
	

}
