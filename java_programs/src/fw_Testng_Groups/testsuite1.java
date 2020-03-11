package fw_Testng_Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testsuite1
{
  @Test(groups="G1")
  public void tc_001()
  {
	  Reporter.log("the test is executed ",true);
  }
  
  
  @Test(groups="G2")
  public void tc_002()
  {
	  Reporter.log("the test is succesfully executed",true);
  }
  
  @Test(groups="G3")
  public void tc_003()
  {
	  Reporter.log("the test is succesfully executed",true);
  }
}
