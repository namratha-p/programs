package data_provider_and_test_listerner;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class login
{
  @Test(dataProvider = "login")
  public void f(String uid, String pwd)
  {
	  System.out.println(uid + "\t" + pwd);
  }

  @DataProvider
  public Object[][] login() 
  {
	    return new Object[][]
	    {
	      new Object[] { "name1" ,"sdfghjk" },
	      new Object[] { "name2" , "dfghgh" },
	      new Object[] { "name3" , "ertyui" },
	      new Object[] { "name4" , "xcvbnm" }
	      
	    };
	   
  }
  
}

