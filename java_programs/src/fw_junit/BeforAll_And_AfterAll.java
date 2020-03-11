package fw_junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BeforAll_And_AfterAll {

	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
		System.out.println("pre condition of the class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		System.out.println("post condition of the class");
	}

	@Test
	void test() 
	{
		System.out.println("tc_001 is executed");
	}
	
	@Test
	void test1()
	{
		System.out.println("tc_002 is executed");
	}

	@Test
	void test2()
	{
		System.out.println("tc_003 is executed");
	}
}
