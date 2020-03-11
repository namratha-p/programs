package switch_commands;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/trains/pnr']")).click();
		driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/trains/calendar']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'cancellation.shtml#cancel')]")).click();
		driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/offers/india/irctc-packages']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		for(String eachwindow:windows)
		{
			driver.switchTo().window(eachwindow);
			String window=driver.getTitle();
			System.out.println("the title is--->" +window);
		
		
				if (window.contains("Cancel Train Bookings"))
				{
					break;
				}
				
		}
		System.out.println("focused window title is-->" +driver.getTitle());
		
		
	}

}
