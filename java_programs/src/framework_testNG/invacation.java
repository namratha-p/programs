package framework_testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class invacation {
	
	WebDriver driver;
 
	int count=0;
	@Test(invocationCount=10)
  public void invoke()
  {
	  WebElement state=driver.findElement(By.xpath("//select[contains(@id,'customState')]"));
	  new Select(state).selectByIndex(count);
	  
	  String statename = new Select(state).getOptions().get(count).getText();
	  Reporter.log(statename+ "    state selected",true);
	  
	  count=count+1;  
  }
	
	@BeforeTest
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
	}
}
