package fw_Testnn_before_after_conditions;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class test1 
{
	
  @Test
  public void tc_001()
  {
	  Reporter.log("tc_001 is executed",true);
  }
  
  @Test
  public void tc_002()
  {
	  Reporter.log("tc_002 is executed",true);
  }
  
  
  @AfterTest
  public void tc_003()
  {
	 System.out.println("aftertest"+"\n");
  }
  
  
}



