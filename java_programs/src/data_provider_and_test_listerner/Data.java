package data_provider_and_test_listerner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data 
{
	
@Test(dataProvider="user_login_details")
public void enter_details(String name, String add, String id)
{
	System.out.println(name+"/t"+add+"/t"+id );
}

	
	@DataProvider
	public String[][] user_login_details()
	{
	
		String details[][]=
		{
			{"name1", "address1", "12"},
			{"name2", "address2","23"},
			{"name3", "address3" ,"25"},
			{"name4", "address4" ,"56"}	
		};
		return details;
	}
}