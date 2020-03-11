package fw_keyword_driven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelsheet_record 
{
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook book;
	XSSFSheet sht;
	XSSFRow row;
	XSSFCell cell;
	
	

	/*
	 * Method name:-->  Excel connection with required sheet
	 * Author:-->
	 * Created on:-->
	 * parameters used:-->
	 */
	public void excel_connection(int sheetnum) throws Exception
	{
		fis=new FileInputStream("C:\\Users\\mithr\\OneDrive\\Desktop\\FW_KD_ExcelSheet (1).xlsx");
		book=new XSSFWorkbook(fis);
		sht=book.getSheetAt(sheetnum);
	}
	

	/*
	 * Method name:-->  Read Data from specific row and column
	 * Author:-->
	 * Created on:-->
	 * parameters used:-->
	 */
	
	public void getcelldata(int rownum, int cellnum)
	{
		sht.getRow(rownum).getCell(cellnum).getStringCellValue();
	}
	
	/*
	 * Methodname:-->  Write cell data
	 * Author:-->
	 * Created on:-->
	 * parameters used:-->
	 */
	
	public void writecellvalue(int rownum, int columnIndex, String result)
	{
		sht.getRow(rownum).createCell(columnIndex).setCellValue(result);
	}
	
	/*
	 * Methodname:-->  Create output file
	 * Author:-->
	 * Created on:-->
	 * parameters used:-->
	 */
	
	public void createoutputfile() throws Exception
	{
		book.write(new FileOutputStream(""));
		book.close();
		
	}
	

	
	
	

}
