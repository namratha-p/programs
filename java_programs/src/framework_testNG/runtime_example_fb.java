package framework_testNG;

import java.io.File;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class runtime_example_fb {
 
	WebDriver driver;
	String url="https://www.facebook.com/";
	
	@Test
  public void sign_up ()
  {
		driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).click();
		String exp_title = "Sign up for Facebook | Facebook";
		Assert.assertEquals(exp_title, driver.getTitle());
		Reporter.log("signup page title verified",true);
  }
	
	@Test
	public void messenger()
	{
		driver.findElement(By.xpath("//a[contains(@title,'Take a look at Messenger.')]")).click();
		String exp_title="Messenger";
		Assert.assertEquals(exp_title, driver.getTitle());
		Reporter.log("messenger page title verified",true);	
	}
	
	
	@Test
	public void facebook_lite()
	{
		driver.findElement(By.xpath("//a[contains(@title,'Facebook Lite for Android.')]")).click();
		String exc_title="Facebook Lite APK for Android";
		Assert.assertEquals(exc_title, driver.getTitle());
		Reporter.log("facebook lite page is verified",true);	
	}
	
	@Test
	public void insta()
	{
		driver.findElement(By.xpath("//a[contains(@title,'Take a look at Instagram')]")).click();
		String exc_title="Instagram";
		Assert.assertEquals(exc_title, driver.getTitle());
		Reporter.log("instagram page is verified",true);
	}
	
	
	@BeforeClass
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get(url);
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}
	
	
	@AfterMethod
	public void screen(Method method) throws Exception
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens//"+method.getName()+".png"));
		
	}
	
	}
	

