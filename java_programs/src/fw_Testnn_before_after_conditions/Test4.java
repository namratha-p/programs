package fw_Testnn_before_after_conditions;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test4 {

	
	@Test
  public void tc_005()
  {
		Reporter.log("tc_005 is executed", true);
  }
	
	@BeforeClass
	public void tc_006()
	{
		System.out.println("beforeclass"+"\n");
	}
	
	@Test
	public void tc_009()
	{
		Reporter.log("tc_009 is executed",true);
	}
}
