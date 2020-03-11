package data_provider_and_test_listerner;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Test_listener {
 
	
	@Test
  public void tc_001()
  {
		Assert.assertEquals("dsnr", "dsnr");
  }
	
	@Test
	public void tc_002()
	{
		Assert.assertEquals("names", "name");	
	}
	
	@Test
	public void tc_007()
	{
		throw new SkipException("tc_007 is skipped");
	}
	
	@Test
	public void tc_003()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void tc_004()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	public void tc_005()
	{
		throw new SkipException("tc_005 is skipped");
	}
	
	int i=0;
	@Test(invocationCount=5, successPercentage=60)
	public void tc_008()
	{
		i=i+1;
				if(i==2||i==4)
				{
					Assert.assertEquals("asdf", "asss");
				}
	}
	
}
