package framework_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_ignore {
 
	
	@Test(enabled=false)
  public void first() 
  {
	  Reporter.log("the first test is executed");
  }
	
	
	@Test(priority=0)
	public void second()
	{
		Reporter.log("the second test is executed",true);
	}
	
	@Test
	public void third()
	{
		Reporter.log("the third test is executed");
	}
	
}
