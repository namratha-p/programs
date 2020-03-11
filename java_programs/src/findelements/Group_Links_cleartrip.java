package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links_cleartrip {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement footer=driver.findElement(By.xpath("//ul[@class='inline clearFix']"));
		
		List<WebElement> footer_links = footer.findElements(By.tagName("a"));
		
		for (int i = 0; i < footer_links.size(); i++)
		{
			WebElement index = footer_links.get(i);
			String linkname = index.getText();
			String linkhref = index.getAttribute("href");
			System.out.println(linkname+"   "+linkhref);
			
			index.click();
			Thread.sleep(2000);
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			footer=driver.findElement(By.xpath("//ul[@class='inline clearFix']"));
			footer_links = footer.findElements(By.tagName("a"));
			
		}
		

	}

}
