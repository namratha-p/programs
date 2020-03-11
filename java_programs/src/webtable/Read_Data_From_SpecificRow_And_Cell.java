package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Data_From_SpecificRow_And_Cell {

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
		
		WebElement selectedrow = rows.get(2);
		
		List<WebElement> cells = selectedrow.findElements(By.tagName("td"));
		
		String fifth = cells.get(5).getText();
		String sixth = cells.get(6).getText();	
		
		System.out.println("fifth row is  "+fifth+"   "+"sixth row is  "+sixth);

	}

}
