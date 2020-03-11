package fw.dd.Property_Files;

import java.io.FileInputStream;
import java.util.Properties;

public class Read_Data_From_PropertyFiles 
{

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\mithr\\OneDrive\\Desktop\\inputpropfile.properties");
		
		Properties repo=new Properties();
		repo.load(fis);
		
		String url = repo.getProperty("url");
		System.out.println(url);
		
		String username = repo.getProperty("usename");
		System.out.println(username);
		
		
		

	}

}
