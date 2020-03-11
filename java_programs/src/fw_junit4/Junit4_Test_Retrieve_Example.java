package fw_junit4;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class Junit4_Test_Retrieve_Example 
{

	public@Rule TestName test=new TestName();
	
	@After
	public void tearDown() throws Exception 
	{
		//System.out.println(test.getMethodName());
		System.out.println("after method");
	}
	

	@Test
	public void tc_001_valid_cases() 
	{
		System.out.println("valid cases");
	}
	
	@Test
	public void tc_002_invalid_cases()
	{
		System.out.println("invalid cases");
	}

}
