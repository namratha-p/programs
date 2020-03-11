package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Next_page_records {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement Markets=driver.findElement(By.xpath("//a[contains(.,'markets')]"));
		Markets.click();
		
		driver.findElement(By.linkText("Nifty Weightage")).click();

		WebElement table=driver.findElement(By.id("gridSource"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		int count=0;
		for (int i = 1; i < rows.size(); i++)
		{
			String text = rows.get(i).getText();
			System.out.println("the text of the row is" +text);
			
			if (count==20)
			{
				driver.findElement(By.xpath("//th[@colspan='1'][contains(.,'Next > >')]")).click();
				count=0;	
			}
			count=count+1;
		}
		
		
		
		
	}

}
