package fw_testng_testsuite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testclass1 {
 
	@Test
  public void tc_001()
  {
		Reporter.log("test is executed");
  }
	
	@Test
	public void tc_002()
	{
		Reporter.log("test is executed");
	}
	
	@Test
	public void tc_003()
	{
		Reporter.log("test is executed");
	}
}
