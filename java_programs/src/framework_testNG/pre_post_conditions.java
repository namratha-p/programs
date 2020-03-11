package framework_testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class pre_post_conditions {
 
  @BeforeMethod
  public void beforeMethod()
  {
	 System.out.println("beforemethod");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("aftermethod"+"\n");
  }

  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("beforeclass"+"\n");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("afterclass"+"\n");
  }
  
  @Test
  public void tc_001()
  {
	  Reporter.log("test is executed",true);
  }
  
  @Test
  public void  tc_002()
  {
	  Reporter.log("test is executed",true);
  }
  
  @Test
  public void tc_003()
  {
	  Reporter.log("test is executed",true);
  }

}
