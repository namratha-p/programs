package fw_junit;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
class Junit_With_Webdriver
{
	static WebDriver driver;
	String url="https://www.facebook.com/";
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		driver.close();
	}

	@BeforeEach
	void setUp() throws Exception 
	{
		driver.get(url);
	}

	@AfterEach
	void tearDown(TestInfo testinfo) throws Exception
	{
		String methodname = testinfo.getTestMethod().get().getName();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+methodname+".png"));
	}

	
	@Test
	public void tc_001_signup_link() 
	{
		driver.findElement(By.xpath("//a[contains(@title,'Sign up for Facebook')]")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		System.out.println("signup page tilte is verified");
	}
	
	@Test
	public void tc_002_login_link()
	{
		driver.findElement(By.xpath("//a[contains(@title,'Log in to Facebook')]")).click();
		Assert.assertEquals("Log in to Facebook | Facebook", driver.getTitle());
		System.out.println("login page title is verified");
	}
	
	@Test
	public void tc_003_messenger_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		System.out.println("meesenger link is verified");
	}

}
