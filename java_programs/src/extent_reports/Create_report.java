package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;

public class Create_report {

	public static void main(String[] args) 
	{
		ExtentReports extent=new ExtentReports("reports//report1.html", true); 
		System.out.println("report file is created");
		extent.flush();
	}

}
