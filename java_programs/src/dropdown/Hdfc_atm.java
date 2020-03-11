package dropdown;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hdfc_atm {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		new Select(driver.findElement(By.id("customState"))).selectByVisibleText("Telangana");
		
		Thread.sleep(6000);
		 
		new Select(driver.findElement(By.name("cityName"))).selectByValue("hyderabad");
		Thread.sleep(5000);
		
		  driver.findElement(By.id("customLocality")).clear();
		  driver.findElement(By.id("customLocality")).sendKeys("dilsukhnagar");
		  Thread.sleep(5000);
		  
		new Select(driver.findElement(By.id("customRadius"))).selectByIndex(2);
		Thread.sleep(5000);		
		
		driver.findElement(By.id("amenity_category_order_types50")).click();
		Thread.sleep(5000);	
		
		driver.findElement(By.id("amenity_service_types53")).click();
		
	}
	

}
