package fw_Testng_Groups;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testsuite3
{
  @Test(groups="G1")
  public void tc_007()
  {
	  Reporter.log("test executed",true);
  }
  
  @Test(groups="G1")
  public void tc_008()
  {
	  Assert.assertTrue(false);
	  Reporter.log("test executed",true);
  }
  
  @Test(groups="G3", dependsOnGroups="G2")
  public void tc_009()
  {
	Reporter.log("test executed",true);
}
  
}
