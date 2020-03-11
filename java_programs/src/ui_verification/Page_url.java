package ui_verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_url {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/");
		driver.manage().window().maximize();
		
		String current_url=driver.getCurrentUrl();
		System.out.println("current window url");
		
		if (current_url.contains("https://selenium.dev/"))
		{
			System.out.println("page url is verified");
			
			
					WebElement download=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
					download.click();
					if(driver.getCurrentUrl().contains("download"))
						System.out.println("page url is verified");
					else
						System.out.println("page url is nor verified");
						
			
		} 
		else
		{
			System.out.println("page url is not veriffied");
		}
		driver.close();
	}
}
