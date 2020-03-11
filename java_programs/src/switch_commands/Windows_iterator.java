package switch_commands;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_iterator {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/trains/pnr']")).click();
		
		driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/trains/calendar']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> ids = windows.iterator();
		
		String home=ids.next();
		driver.switchTo().window(home);
		System.out.println("the title is-->" +driver.getTitle());
		
		String pnr=ids.next();
		driver.switchTo().window(pnr);
		System.out.println("the title of the window is-->" +driver.getTitle());
		
		String calender=ids.next();
		driver.switchTo().window(calender);
		System.out.println("the title of the window is-->" +driver.getTitle());
		
	}

}
