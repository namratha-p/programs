package fw_datadriven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_data_from_excel {

	public static void main(String[] args) throws Exception
	{
		String expath = "C:\\Users\\mithr\\OneDrive\\Desktop\\Book1.xlsx";
		FileInputStream fis=new FileInputStream(expath);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sht=book.getSheet("sheet1");
		XSSFRow row = sht.getRow(1);
		XSSFCell cell = row.getCell(0);
		
		String name=cell.getStringCellValue();
		System.out.println(name);
		System.out.println(book);
		
		String add = sht.getRow(1).getCell(1).getStringCellValue();
		System.out.println(add);
	}

}
