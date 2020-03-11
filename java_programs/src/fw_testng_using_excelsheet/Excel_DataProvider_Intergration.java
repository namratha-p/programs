package fw_testng_using_excelsheet;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;

public class Excel_DataProvider_Intergration 
{
	
	XSSFWorkbook book;
	XSSFSheet sht;
	XSSFRow row;
	XSSFCell cell;
	

  @DataProvider(name="login_details")
  public String[][] login_details()
  {
	  int rcount=sht.getLastRowNum();
	  String[][] data;
	  data=new String[rcount+1][2];
	  for (int i = 0; i <= rcount; i++) 
	  {
		for (int j = 0; j < 2; j++) 
		{
			data[i][j]=sht.getRow(i).getCell(j).getStringCellValue();
		}
	  }
	  return data;
  }
	
  @Test(dataProvider = "login_details")
  public void f(String name, String pwd) 
  {
	  System.out.println(name+"    "+pwd);
  }

  
  
  
  @BeforeClass
  public void beforeClass() throws Exception 
  {
	  FileInputStream fis=new FileInputStream("C:\\Users\\mithr\\OneDrive\\Desktop\\FW_DD_InputData_excel_sheet.xlsx");
	  book=new XSSFWorkbook(fis);
	  sht=book.getSheet("Sheet7");
  }

}
