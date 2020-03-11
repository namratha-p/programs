package ui_verification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_attribute {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement sensex=driver.findElement(By.id("InvestRec"));
		String click=sensex.getAttribute("onclick");
		System.out.println("the attribute click is-->"+click);
		String href=sensex.getAttribute("href");
		System.out.println("the attribute value of href is-->"+href);
		String id=sensex.getAttribute("id");
		System.out.println("the sensex id value is-->"+id);

	}

}
