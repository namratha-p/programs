package framework_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_method {
  
  @Test(priority=0)  
  public void f()
  {
	  Reporter.log("the method is f is executed",true);
  }
  
  @Test(priority=2)
  public void a()
  {
	  Reporter.log("the a method is executed");
  }  
  
  
  @Test(priority=1)
  public void z()
  {
	  Reporter.log("the z method is executed");
  }
   
}
