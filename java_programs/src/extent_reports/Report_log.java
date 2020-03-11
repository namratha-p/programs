package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class Report_log {

	public static void main(String[] args) 
	{
		ExtentReports logger=new ExtentReports("reports//report1.html", true);
		ExtentTest test1=logger.startTest("valid_cases");
			logger.endTest(test1);
			
		ExtentTest test2=logger.startTest("invalid_cases");
			logger.endTest(test2);
			
		ExtentTest login_details=logger.startTest("login_test");
		login_details.appendChild(test1).appendChild(test2);
		
		logger.endTest(login_details);
		
		logger.flush();
		
	}

}
