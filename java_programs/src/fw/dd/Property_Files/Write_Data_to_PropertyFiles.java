package fw.dd.Property_Files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write_Data_to_PropertyFiles
{

	public static void main(String[] args) throws IOException 
	{
		Properties pf=new Properties();
		
		pf.setProperty("result1", "testpass");
		pf.setProperty("result2", "testpass");
		pf.setProperty("result3", "tedtfail");
		pf.setProperty("result4", "testpass");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\mithr\\OneDrive\\Desktop\\prorpertyfile.properties");
		pf.store(fos, "login test result");
		
	}

}
