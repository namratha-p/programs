package fw_junit_suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

class Junit_suite 
{
	
	@RunWith(Suite.class)
	@Suite.SuiteClasses({Junit_one.class,Junit_two.class})
	public class running_junit_suite
	{
		
	}
	
}
