package framework_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Description {
 
	
	@Test(description="the validation with the valid data",priority=2)
  public void f() 
  {
		Reporter.log("the test is executed");
  }
	
	@Test(description="the validation with the invalid data")
	public void a()
	{
		Reporter.log("the test us executed");
	}
	
	
	@Test
	public void blank_validation()
	{
		Reporter.log("the test is executed");
	}
}
