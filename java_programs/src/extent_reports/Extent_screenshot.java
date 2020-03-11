
package extent_reports;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_screenshot{

public static void main(String[] args) throws Exception 
	{
		ExtentReports logger;
		ExtentTest valid;
		
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		logger=new ExtentReports("reports//report1.html", true);
		valid=logger.startTest("valid_cases");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens//extent.png"));
		valid.log(LogStatus.PASS, "homescreen_screenshot"+valid.addScreenCapture("screens//extent.png"));
		
		logger.endTest(valid);
		
		logger.flush();
		
		
		
		
		

	}

}
