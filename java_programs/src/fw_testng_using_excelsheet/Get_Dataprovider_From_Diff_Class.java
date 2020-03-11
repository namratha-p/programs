package fw_testng_using_excelsheet;

import org.testng.annotations.Test;

public class Get_Dataprovider_From_Diff_Class
{
	
			@Test(dataProvider="login_details",dataProviderClass=Excel_DataProvider_Intergration.class)
			public void testname(String name,String pwd)	
				{
		
				}
}
