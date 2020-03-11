package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Specific_CellData_From_DynamicRows {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(.,'markets')]")).click();
		
		WebElement table = driver.findElement(By.id("dvBseTopGain"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for (int i = 1; i <  rows.size(); i++)
		{
			WebElement selectedrow = rows.get(i);
			List<WebElement> cells = selectedrow.findElements(By.tagName("td"));
			String cname = cells.get(0).getText();
			String high = cells.get(3).getText();
			
			System.out.println(cname+"   "+high);
			
		}
		
	}
	

}
