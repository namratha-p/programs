package fw_datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Positive_And_Negative_Testcases
{

	public static void main(String[] args) throws Exception 
	{
		String fpath = "C:\\Users\\mithr\\OneDrive\\Desktop\\FW_DD_InputData_excel_sheet.xlsx";
		FileInputStream fis=new FileInputStream(fpath);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		System.out.println(book);
		XSSFSheet sht=book.getSheetAt(4);
		
		String url=sht.getRow(4).getCell(1).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String sign_in=sht.getRow(6).getCell(1).getStringCellValue();
		String email_eb=sht.getRow(6).getCell(2).getStringCellValue();
		String nxt_button=sht.getRow(6).getCell(4).getStringCellValue();
		
		for (int i = 6; i <= sht.getLastRowNum(); i++) 
		{
			//String testname=sht.getRow(i).getCell(0).getStringCellValue();
			String email=sht.getRow(i).getCell(3).getStringCellValue();
			String result=sht.getRow(i).getCell(5).getStringCellValue();
			
			String status=sht.getRow(i).getCell(6).getStringCellValue();
			if(status.equalsIgnoreCase("y"))
			{
				driver.get(url);
				driver.findElement(By.xpath(sign_in)).click();
				driver.findElement(By.xpath(email_eb)).clear();
				driver.findElement(By.xpath(email_eb)).sendKeys(email);
				driver.findElement(By.xpath(nxt_button)).click();
				
				String stype = sht.getRow(i).getCell(7).getStringCellValue();
				if(stype.equalsIgnoreCase("text"))
				{
					String pagetext = driver.findElement(By.tagName("body")).getText();
					if(pagetext.contains(result))
							sht.getRow(i).createCell(8).setCellValue("testpass");	
					else
							sht.getRow(i).createCell(8).setCellValue("testfail");
				}
				else if (stype.equalsIgnoreCase("object"))
					
				{
					if(driver.findElement(By.id(result)).isDisplayed())
						sht.getRow(i).getCell(8).setCellValue("testpass");
					else
						sht.getRow(i).getCell(8).setCellValue("testfail");
				}
					
			}	
				
				
			}
		book.write(new FileOutputStream("C:\\Users\\mithr\\OneDrive\\Desktop\\FW_DD_InputData_excel_sheet1.xlsx"));	
		book.close();	
	}
}
		
		
			

		

	