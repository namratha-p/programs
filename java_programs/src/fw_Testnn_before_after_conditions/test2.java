package fw_Testnn_before_after_conditions;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class test2 {
  
	
	@Test
  public void tc_003()
	{
		Reporter.log("tc_003 is executed",true);
  }
	
	
	@AfterMethod
	public void tc_004()
	{
		System.out.println("aftermethod"+"\n");
	}
	
	@Test
	public void tc_005()
	{
		Reporter.log("tc_005 is executed",true);
	}
}
