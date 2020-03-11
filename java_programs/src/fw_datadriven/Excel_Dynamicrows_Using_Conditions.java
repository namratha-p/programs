package fw_datadriven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Dynamicrows_Using_Conditions
{

	public static void main(String[] args) throws Exception 
	{
		String fpath = "C:\\Users\\mithr\\OneDrive\\Desktop\\FW_DD_InputData_excel_sheet.xlsx";
		FileInputStream fis=new FileInputStream(fpath);
		System.out.println("file is located");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		System.out.println(book);
		XSSFSheet sht=book.getSheet("Sheet4");
		
		int rcount=sht.getLastRowNum();
		System.out.println(rcount);
		
		for (int i = 5; i <= rcount; i++) 
		{
			String estatus=sht.getRow(i).getCell(2).getStringCellValue();
			
			
			if(estatus.equalsIgnoreCase("y"))
			{
				String name=sht.getRow(i).getCell(0).getStringCellValue();
				String pwd=sht.getRow(i).getCell(1).getStringCellValue();
				String stype=sht.getRow(i).getCell(3).getStringCellValue();
			
				 if (stype.equalsIgnoreCase("alert"))
					System.out.println(name+"    "+pwd+"  ==>   "+"alert is caputured");
				else if(stype.equalsIgnoreCase("text"))
					System.out.println(name+"     "+pwd+"  ==>   "+"text is captured");
				else if (stype.equalsIgnoreCase("p"))
					System.out.println(name+"    "+pwd+"  ==>   "+"testpassed");
				else
					System.out.println("scenario is mismatched");
			}
		
		}
		
		}
	}


	