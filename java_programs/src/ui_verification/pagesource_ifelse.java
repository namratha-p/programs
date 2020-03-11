package ui_verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagesource_ifelse {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String page_source=driver.getPageSource();
		
			if (page_source.contains("u_0_r")) 
			{
				WebElement num=driver.findElement(By.id("u_0_r"));
				num.clear();
				num.sendKeys("123456789");
			}	
			else
		{
			System.out.println("pagesource doesnot contain that element");
		}
		
		
	}

}
