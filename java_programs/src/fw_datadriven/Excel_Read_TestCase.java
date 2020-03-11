package fw_datadriven;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Read_TestCase
{

	public static void main(String[] args) throws Exception 
	{
		String fpath="C:\\Users\\mithr\\OneDrive\\Desktop\\FW_DD_InputData_excel_sheet.xlsx";
		FileInputStream fis=new FileInputStream(fpath);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		System.out.println(book);
		XSSFSheet sht=book.getSheetAt(1);
		XSSFRow row=sht.getRow(1);
		
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String url=row.getCell(1).getStringCellValue();
		driver.get(url);
		
		String sign_in=row.getCell(2).getStringCellValue();
		driver.findElement(By.xpath(sign_in)).click();
		
		String xpath = row.getCell(3).getStringCellValue();
		String input = row.getCell(4).getStringCellValue();
		driver.findElement(By.xpath(xpath)).clear();
		driver.findElement(By.xpath(xpath)).sendKeys(input);
		
		String next=row.getCell(5).getStringCellValue();
		driver.findElement(By.xpath(next)).click();
		
		String pass=row.getCell(6).getStringCellValue();
		String pinput=row.getCell(7).getStringCellValue();
		driver.findElement(By.xpath(pass)).clear();
		driver.findElement(By.xpath(pass)).sendKeys(pinput);
		
		String sign=row.getCell(8).getStringCellValue();
		driver.findElement(By.id(sign)).click();
		//new Actions(driver).click(driver.findElement(By.xpath(sign))).perform();
		
		
		
		
	}

}
