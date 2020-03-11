package fw_datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteCell_Data 
{

	public static void main(String[] args) throws Exception 
	{
		String fpath = "C:\\Users\\mithr\\OneDrive\\Desktop\\FW_DD_InputData_excel_sheet.xlsx";
		FileInputStream fis=new FileInputStream(fpath);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sht=book.getSheet("sheet1");
		
		sht.getRow(1).getCell(1).setCellValue("dfghxc");
		
		sht.createRow(2).createCell(2).setCellValue("newvalue");
		
		sht.createRow(3).createCell(0).setCellValue("jhgdhjskc");
		
		sht.createRow(4).createCell(5).setCellValue("asedrfguh");
		
		book.write(new FileOutputStream("C:\\Users\\mithr\\OneDrive\\Desktop\\FW_DD_InputData_excel_sheetop.xlsx"));
		book.close();
		
	}

}
