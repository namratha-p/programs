package ui_validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selected {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement round_trip=driver.findElement(By.id("RoundTrip"));
		round_trip.click();
		
		if (round_trip.isSelected()) 
		{
			WebElement round=driver.findElement(By.xpath("//input[contains(@id,'ReturnDate')]"));
			boolean flag=round.isDisplayed();
			System.out.println("the round trip is selected-->"+flag);
		}
		else
		{
			System.out.println("the round trip is not selected");
		}
	}

}
