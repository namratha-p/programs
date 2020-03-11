package ui_verification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_attri_mmtrip {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement return_date=driver.findElement(By.xpath("//p[contains(@data-cy,'returnDefaultText')]"));
		return_date.click();
		WebElement round_trip=driver.findElement(By.xpath("//li[contains(@data-cy,'roundTrip')]"));
		String class_sel=round_trip.getAttribute("class");
		System.out.println("the selected class is"+class_sel);
		String expected_class="selected";
		
		if (class_sel.contains(expected_class))
		{
			System.out.println("the element is selected");
		} else
		{
			System.out.println("the element is not selected");
		}
		
		
		
		

	}

}
