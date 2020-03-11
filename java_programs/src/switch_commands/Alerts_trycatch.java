package switch_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_trycatch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		search.click();
		
		try 
		{
			Alert alert = driver.switchTo().alert();
			String text=alert.getText();
			System.out.println("the alert present is---->" +text);
			alert.accept();
		} 
		catch (Exception e)
		{
			System.out.println("alert not present");
		}
		System.out.println("run continued");

	}

}
