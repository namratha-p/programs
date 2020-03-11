package framework_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest
{
  @Test
  public void tc001() 
  {
	  Reporter.log("tc001 test is executed");
  }
  
  
  @Test
  public void tc002()
  {
	  Reporter.log("tc002 test is executed");
	  
  }
  
  
  @Test
  public void tc003()
  {
	  Reporter.log("tc003 test is executed", true);
  }
  
  
  @Test
  public void tc004()
  {
	  Reporter.log("the test is executed",true);
  }
}
