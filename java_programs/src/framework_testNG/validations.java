package framework_testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class validations 
{
  @Test
  public void tc_001() 
  {
	  Assert.assertEquals("hi", "hii");
	  Reporter.log("is the string comparision true");
  }
  
  @Test
  public void tc_002()
  {
	  Assert.assertTrue(true);
	  Reporter.log("the value is true or not");
  }
  
  @Test 
  public void tc_003()
  {
	  Assert.assertEquals("hello", "hello");
	  Reporter.log("the string comparision");
  }
  
  @Test
  public void tc_004()
  {
	  Assert.assertTrue(false);
	  Reporter.log("boolean comparision");
  }

}
