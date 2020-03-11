package links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Editbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("RoundTrip")).click();
		
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("hyd");
		Thread.sleep(6000);
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("del");
		Thread.sleep(5000);
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		driver.findElement(By.id("DepartDate")).clear();
		driver.findElement(By.id("DepartDate")).sendKeys("Thu, 2 Jan, 2020");
		//new Select(driver.findElement(By.id("DepartDate"))).selectByIndex(2);
		
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Tue, 4 Feb, 2020");
		
		new Select(driver.findElement(By.id("Adults"))).selectByIndex(3);
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		
		new Select(driver.findElement(By.id("Class"))).selectByIndex(2);
		
		driver.findElement(By.id("AirlineAutocomplete")).clear();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("vistara");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Vistara (UK)")).click();
		
		driver.findElement(By.id("SearchBtn")).click();
		
		
		
		
		
		
		
	}

}
