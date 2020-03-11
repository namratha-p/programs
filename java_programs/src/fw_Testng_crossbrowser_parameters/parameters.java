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

public class parameters
{
	WebDriver driver;
	String path="browsers//";
	
	@Test(priority=0)
	@Parameters("browser")
  public void browername(String browser)
  {
	
		switch (browser)
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
			System.setProperty("webdriver.internetexplorer.driver", path+"IEdriverServer.exe");
			driver=new InternetExplorerDriver();
			
		default:
			System.out.println("mismatched browser");
			break;
		}
  }
	
	
	
	@Test(priority=1)
	@Parameters("url")
	public void url_load(String url)
	{
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=2)
	@Parameters({"uid","pwd"})
	public void login(String uid, String pwd)
	{
		WebElement id=driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		id.clear();
		id.sendKeys(uid);
		
		WebElement pass=driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		pass.clear();
		pass.sendKeys(pwd);
	}
	
	
	@Test(priority=3)
	@Parameters("fname")
	public void name(String fname)
	{
		WebElement name=driver.findElement(By.xpath("//input[contains(@id,'u_0_m')]"));
		name.clear();
		name.sendKeys(fname);
	}
}
