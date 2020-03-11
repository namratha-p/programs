package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports_log {

	public static void main(String[] args) 
	{
		ExtentReports logger=new ExtentReports("reports//report1.html", true);
		ExtentTest test1=logger.startTest("tc_001 valid_cases");
			test1.log(LogStatus.INFO, "browser intitiated completed");
			test1.log(LogStatus.INFO, "url launched completed");
			test1.log(LogStatus.INFO, "username is entered successfully");
			test1.log(LogStatus.INFO, "password is entered successfully");
			test1.log(LogStatus.PASS, "user login in succesfully");
		logger.endTest(test1);
		
		ExtentTest test2=logger.startTest("tc_002 invalid_cases");
			test2.log(LogStatus.INFO, "browser initiated completed");
			test2.log(LogStatus.INFO, "url is launch completed");
			test2.log(LogStatus.INFO, "username is wrongly entered");
			test2.log(LogStatus.INFO, "password entered correctly");
			test2.log(LogStatus.FAIL, "userlogin failed");
		logger.endTest(test2);
		
		ExtentTest login=logger.startTest("login_test");
		login.appendChild(test1).appendChild(test2);
		
		
		logger.endTest(login);
		
		logger.flush();
			
			
		

	}

}
