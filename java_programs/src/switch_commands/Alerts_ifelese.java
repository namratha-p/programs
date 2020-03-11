package switch_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Alerts_ifelese {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement search= driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();
		
		if (ExpectedConditions. alertIsPresent().apply(driver)!=null) 
		{
			Alert alert=driver.switchTo().alert();
			alert.accept();
			
		}
		else
		{
			System.out.println("alert is not present");
		}
		System.out.println("run continued");
	
		//ExpectedConditions.alertIsPresent().apply(driver).accept();
	}

}
