package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Target_SpecificCell_From_DynamicRow {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[contains(.,'markets')])")).click();
		
		WebElement table = driver.findElement(By.id("dvBseTopGain"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for (int i = 1; i < rows.size(); i++) 
		{
			WebElement selected_row = rows.get(i);
			String rowtext = selected_row.getText();
			
			if (rowtext.contains("TITIND"))
			{
				List<WebElement> cells = selected_row.findElements(By.tagName("td"));
				WebElement selcell = cells.get(7);
				
				selcell.findElement(By.tagName("a")).click();
				break;		
			}
			
		}
	}

}
