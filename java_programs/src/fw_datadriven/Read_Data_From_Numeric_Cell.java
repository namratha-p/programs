package fw_datadriven;

import java.io.FileInputStream;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Numeric_Cell {

	public static void main(String[] args) throws Exception 
	{
		String expath = "C:\\Users\\mithr\\OneDrive\\Desktop\\Book1.xlsx";
		FileInputStream fis=new FileInputStream(expath);
		XSSFWorkbook book= new XSSFWorkbook(fis);
		System.out.println(book);
		XSSFSheet sht=book.getSheet("sheet1");
		XSSFRow row = sht.getRow(1);
		XSSFCell cell = row.getCell(2);
		
		Double Double_value = cell.getNumericCellValue();
		System.out.println(Double_value);
		
	
		long phn = Double_value.longValue();
		System.out.println(phn);
		
	
		String alt_phn = sht.getRow(1).getCell(4).getStringCellValue();
		System.out.println(alt_phn);
		
		Double amt = sht.getRow(1).getCell(3).getNumericCellValue();
		System.out.println(amt);
		
		String phnn = NumberToTextConverter.toText(phn);
		System.out.println(phnn);
		
	}

}
