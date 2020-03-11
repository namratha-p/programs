package keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Arrowup_down {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "browsers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@id,'cValue')]")).click();
		
		new Actions(driver).sendKeys("MBA").sendKeys(Keys.ARROW_DOWN).pause(1000).sendKeys(Keys.ARROW_DOWN).pause(1000).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("hyd").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
	}

}
