package ui_verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagesource_try_catch 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		try 
		{
			WebElement name=driver.findElement(By.id("u_0_m"));
			name.clear();
			name.sendKeys("namratha");
			
		} 
		catch (Exception e)
		{
			System.out.println("element not found");
		}
		System.out.println("run ececuted");
	}

}
