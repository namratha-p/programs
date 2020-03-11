package framework_testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dependencies 
{
 

	@BeforeTest
	public void launch_browser()
	{
		Assert.assertTrue(true);
		Reporter.log("the browser is launched ");
	}
	
	@Test(priority=0)
	public void launch()
	{
		Assert.assertTrue(true);
		Reporter.log("the gmail browsers is launched");
	}
	
	@Test(priority=1,dependsOnMethods="launch")
	public void app_load()
	{
		Assert.assertEquals("gmail", "gmail");
		Reporter.log("the app is loaded");
	}
	
	@Test(priority=2,dependsOnMethods="app_load")
	public void compose_gmail() 
	{
		Assert.assertEquals("compose", "compose");
		Reporter.log("mail composed successfully");
	}
	
	@Test(priority=3,dependsOnMethods= {"app_load","compose_gmail"})
	public void send_mail()
	{
		Assert.assertEquals("sent", "sent");
		Reporter.log("the mail is sent ");
	}
	
	@AfterTest
	public void close()
	{
		Reporter.log("close the window ");
	}
}
