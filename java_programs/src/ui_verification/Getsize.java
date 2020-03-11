package ui_verification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement nifty=driver.findElement(By.id("TradeRec"));
		Dimension size=nifty.getSize();
		System.out.println("the element size is"+size);
		
		int height=size.getHeight();
		int width=size.getWidth();
		System.out.println("the highht of th element is-->"+height);
		System.out.println("the width of the elemnent is-->"+width);
		
		if (width>0) 
		{
			System.out.println("the element is present");
			
		} else 
		{
			System.out.println("the element is absent");

		}
		
	}

}
