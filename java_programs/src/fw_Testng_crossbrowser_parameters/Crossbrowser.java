package fw_Testng_crossbrowser_parameters;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser 
{
	
	WebDriver driver;
	String path="browsers//";
	
	@Test(priority=0)
	@Parameters("browsername")
  public void browser_launch(String bname)
	{
		switch (bname) 
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", path+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", path+"IEdriverServer.exe");
			driver=new InternetExplorerDriver();
			break;

		default:
			System.out.println("browser mismatch");
			break;
		}
	}
		
		@Test(priority=1)
		@Parameters("url")
		public void url_load(String url) throws InterruptedException
		{
			Thread.sleep(5000);
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		
		@Test(priority=2)
		public void details() throws Exception
		{
			WebElement oneway=driver.findElement(By.xpath("//input[contains(@id,'FromTag')]"));
			oneway.clear();
			oneway.sendKeys("hyd");
			driver.findElement(By.linkText("//a[contains(.,'Hyderabad, IN - Rajiv Gandhi International (HYD)')]")).click();
			Thread.sleep(5000);
			
			WebElement twoway=driver.findElement(By.xpath("//input[contains(@id,'ToTag')]"));
			twoway.clear();
			twoway.sendKeys("del");
			driver.findElement(By.linkText("//a[contains(.,'New Delhi, IN - Indira Gandhi Airport (DEL)')]")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.linkText("12")).click();;
			
		}
		
		
		@Test(priority=3)
		public void close()
		{
			driver.close();
		}
  }

