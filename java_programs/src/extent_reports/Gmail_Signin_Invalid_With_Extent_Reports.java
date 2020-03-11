package extent_reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Gmail_Signin_Invalid_With_Extent_Reports {

	public static void main(String[] args) 
	{
		ExtentReports logger=new ExtentReports("reports//report3.html", true);
		
		ExtentTest test=logger.startTest("valid");
		
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "browser is launched successfully");
		
		driver.findElement(By.id("u_0_m")).clear();
		driver.findElement(By.id("u_0_m")).sendKeys("hjsfd");
		test.log(LogStatus.INFO, "first name is entered");
		
		driver.findElement(By.id("u_0_o")).clear();
		driver.findElement(By.id("u_0_o")).sendKeys("njcbhsjdg");
		test.log(LogStatus.INFO, "sencond name is entered");
		
		logger.endTest(test);
		
		logger.flush();
		
		
	}

}
