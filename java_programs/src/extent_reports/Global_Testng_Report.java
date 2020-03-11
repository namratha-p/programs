package extent_reports;

import java.lang.reflect.Method;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Global_Testng_Report
{
	
	ExtentReports logger;
	ExtentTest test;
	
	@Test
	public void valid()
	{
		test.log(LogStatus.PASS, "valid_cases");
	}
	
	@Test
	public void invalid()
	{
		test.log(LogStatus.FAIL, "invalid test cases");
	}
	
	@BeforeMethod
	public void before_method(Method method)
	{
		test=logger.startTest(method.getName());
	}
	
	@AfterMethod
	public void after_method()
	{
		logger.endTest(test);
	}
	
	@BeforeClass
	public void before_class()
	{
		logger=new ExtentReports("reports//report2.html", true);
	}
	
	@AfterClass
	public void after_class()
	{
		logger.flush();
	}
}
