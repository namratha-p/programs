package fw_junit4;

import org.junit.Rule;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestName;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

class Junit_with_Extent_Reports 
{
	ExtentTest test;
	static ExtentReports logger;
	@Rule TestName name= new TestName();

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		logger=new ExtentReports("reoprts//report4.html", true);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		logger.flush();
	}

	@BeforeEach
	void setUp() throws Exception 
	{
		test = logger.startTest(name.getMethodName());
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		logger.endTest(test);
	}

	@Test
	void tc_001_signup_link() 
	{
		test.log(LogStatus.INFO, "signup link is verified");
	}
	
	@Test
	void tc_002_login_link()
	{
		test.log(LogStatus.INFO, "login link is verified");
	}
	
	@Test
	void tc_003_messenger_link()
	{
		test.log(LogStatus.INFO, "messenger link is verified");
	}

}
