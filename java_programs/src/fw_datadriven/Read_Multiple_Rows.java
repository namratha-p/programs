package fw_datadriven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Multiple_Rows {

	public static void main(String[] args) throws Exception
	{
		String fpath = "C:\\Users\\mithr\\OneDrive\\Desktop\\FW_DD_InputData_excel_sheet.xlsx";
		FileInputStream fis=new FileInputStream(fpath);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		System.out.println(book);
		XSSFSheet sht=book.getSheet("Sheet3");
		
		int rowlast = sht.getLastRowNum();
		System.out.println("last row number is--->"+rowlast);
		
		for (int i = 0; i <= rowlast; i++)
		{
				String rows = sht.getRow(i).getCell(0).getStringCellValue();
				String cells = sht.getRow(i).getCell(1).getStringCellValue();
				
				System.out.println(rows+"    "+cells);
		}
		
		int last_row = sht.getLastRowNum();
		int first_row=sht.getFirstRowNum();
		System.out.println("last number in row--->"+last_row);
		System.out.println("first number in row---->"+first_row);
		
		int first_cell=sht.getRow(5).getFirstCellNum();
		int last_cell=sht.getRow(5).getLastCellNum();
		System.out.println("last nummber in cell---->"+first_cell);
		System.out.println("first number in cell--->"+last_cell);
		
		for (int i = 0; i < rowlast; i++)
		{
			for (int j = 0; j < last_cell; j++)
			{
				String data = sht.getRow(i).getCell(j).getStringCellValue();
				System.out.println("the data is-->"+data);
			}
		}
		
		
	}

}
