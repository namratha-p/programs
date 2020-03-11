package fw_junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeEach_And_AfterEach {

	@BeforeEach
	void setUp() throws Exception 
	{
		System.out.println("condition before each method");
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		System.out.println("condition after each method" +"\n");
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
	void test3()
	{
		System.out.println("tc_003 is executed");
	}

}
