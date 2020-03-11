package ui_verification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_css {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement nifty=driver.findElement(By.id("TradeRec"));
		String bg_colour = nifty.getCssValue("background");
		System.out.println("the background colour is"+bg_colour);
		String borders=nifty.getCssValue("border");
		System.out.println("the borders of the nifty is"+borders);
		
		
	}

}
