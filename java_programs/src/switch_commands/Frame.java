package switch_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.switchTo().frame("modal_window");
		
		WebElement id=driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		id.clear();
		id.sendKeys("namrahthadbkejf@gmail.com");
		
		WebElement trip=driver.findElement(By.xpath("//input[contains(@id,'tripidSecond')]"));
		trip.clear();
		trip.sendKeys("123564313");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[@class='productIcon flights'][contains(.,'Flights')]")).click();
		
		

	}

}
