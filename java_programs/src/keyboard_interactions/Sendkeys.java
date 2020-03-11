package keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@name,'course')]")).click();
		
		new Actions(driver).sendKeys("BE / B.Tech").sendKeys(Keys.TAB).sendKeys("hyderabad").sendKeys(Keys.TAB).
		sendKeys("test engineer").perform();
	
	}

}
