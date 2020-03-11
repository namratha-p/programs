package ui_verification;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_value_date {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement dep_date=driver.findElement(By.xpath("//input[contains(@id,'date1')]"));
		String act_dep_date=dep_date.getAttribute("value");
		System.out.println("the actual date is-->"+act_dep_date);
		
		Date d= new Date();
		SimpleDateFormat date=new SimpleDateFormat("dd/MM");
		String expected_date=date.format(d);

		if (expected_date.equals(act_dep_date))
		{
			System.out.println("the date is matched with current date");
		} else 
		{
			System.out.println("the date is not matched");
		}
		
		
	}

}
