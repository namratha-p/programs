package fw_Testng_Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testsuite2 
{
  @Test(groups="G2")
  public void tc_004()
  {
	  Reporter.log("the test is executed",true);
  }
  
  @Test(groups="G2")
  public void tc_005()
  {
	  Reporter.log("the test is excuted",true);
  }
  
  @Test(groups="G3")
  public void tc_006()
  {
	  Reporter.log("the test is executed",true);
  }
}
