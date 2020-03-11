package switch_commands;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_for_if {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String home=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[@title='Take a look at Instagram']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String eachwindow: windows)
		{
			if(!eachwindow.equals(home))
			{
				driver.switchTo().window(eachwindow);
				break;
			}
		}
		
		
		System.out.println("the title of current page is-->" +driver.getTitle());
		
		driver.findElement(By.xpath("//input[contains(@name,'emailOrPhone')]")).clear();
		driver.findElement(By.xpath("//input[contains(@name,'emailOrPhone')]")).sendKeys("jkhsdad");
		
			
		
		driver.switchTo().window(home);
		
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("flahrfk");
		
		
		
				

	}

}
