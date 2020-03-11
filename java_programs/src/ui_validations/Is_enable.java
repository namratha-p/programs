package ui_validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_enable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement location= driver.findElement(By.xpath("//input[contains(@id,'customLocality')]"));
		if (!location.isEnabled())
		{
			System.out.println("testpass because editbox is diasabled");
		} 
		else 
		{
			System.out.println("testfail because the ditbox is enabled");
		}

		WebElement state= driver.findElement(By.xpath("//select[contains(@id,'customState')]"));
		new Select(state).selectByVisibleText("Telangana");
		
		WebElement city=driver.findElement(By.xpath("//select[contains(@id,'customCity')]"));
		new Select(city).selectByVisibleText("Hyderabad");
		
		if (location.isEnabled())
		{
			System.out.println("the location is now enable");
			driver.findElement(By.xpath("//input[contains(@id,'customLocality')]")).sendKeys("dilsuknagar");

		}
		else 
		{
			System.out.println("the location is still diable");
		}
		
		

	}

}
