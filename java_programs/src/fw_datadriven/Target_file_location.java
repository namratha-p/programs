package fw_datadriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Target_file_location {

	public static void main(String[] args) throws Exception
	{
		File file=new File("C:\\Users\\mithr\\OneDrive\\Desktop\\Book1.xlsx");
		System.out.println("file located");
		
		FileInputStream fis=new FileInputStream(file);
		System.out.println("fi is located");
		
		XSSFWorkbook book=new XSSFWorkbook(fis);
		System.out.println("book is located");
		System.out.println(book);
		
		
	}

}
