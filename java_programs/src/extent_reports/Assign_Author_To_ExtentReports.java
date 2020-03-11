package extent_reports;

import java.util.HashMap;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Assign_Author_To_ExtentReports {

	public static void main(String[] args) 
	{
		ExtentReports logger=new ExtentReports("reports//report2.html", true);
		
		ExtentTest test=logger.startTest("valid").assignAuthor("namratha").assignCategory("reg1");
		
		test.log(LogStatus.INFO, "tc_001_excuted");
		
		HashMap<String, String> sysomap = new HashMap<String, String>();
		sysomap.put("selenium_version", "3.14");
		sysomap.put("environment", "windows");
		
		logger.addSystemInfo(sysomap);
		
		logger.flush();
		

	}

}
