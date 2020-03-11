package ui_verification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_location {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement nifty = driver.findElement(By.id("TradeRec"));
		Point loc = nifty.getLocation();
		System.out.println("the corordinates are"+loc);
		
		int  x_cod = loc.getX();
		int y_cod=loc.getY();
		System.out.println("the element x-cor"+x_cod);
		System.out.println("the element y_cor"+y_cod);
	
	
		if (x_cod>0)
		{
			System.out.println("the element is present");
		}
		else
		{
			System.out.println("the element is not present");
		}
			
		
	}

}
