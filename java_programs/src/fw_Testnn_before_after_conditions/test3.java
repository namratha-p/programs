package fw_Testnn_before_after_conditions;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test3 
{
  @Test
  public void tc_006()
  {
	  Reporter.log("tc_006 is executed",true);
  }
  
  @AfterClass
  public void tc_005()
  {
	 System.out.println("aftertest"+"\n");
  }
  
  @BeforeClass
  public void tc_007()
  {
	 System.out.println("beforetest"+"\n");
  }
}

