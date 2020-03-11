package ui_validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_displayed
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement options=driver.findElement(By.xpath("//strong[contains(.,'More options:')]"));
		options.click();
		
		WebElement travel=driver.findElement(By.xpath("//label[@for='Class'][contains(.,'Class of travel')]"));
		WebElement airline=driver.findElement(By.xpath("//label[contains(.,'Preferred Airline')]"));
		
		
		if (travel.isDisplayed() && airline.isDisplayed())
		{
			System.out.println("travel and airline are displayed");
		}
		else
		{
			System.out.println("travel and airline are displayed");
		}

		options.click();
		
		if (!travel.isDisplayed() && !airline.isDisplayed()) 
		{
			System.out.println("travel and airlines are hidden");
		} 
		else
		{
			System.out.println("travel and airlines are not hidden");
		}
		
	}

}
