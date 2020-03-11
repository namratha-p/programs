package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links_cleartrip {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		WebElement footer = driver.findElement(By.xpath("//ul[@class='inline clearFix']"));
		List<WebElement> footer_links = footer.findElements(By.tagName("a"));
		
		boolean isvalid = false;
		for (int i = 0; i < footer_links.size(); i++)
		{
			WebElement index = footer_links.get(i);
			String href = index.getAttribute("href");
			isvalid=getresponsecode();
			
			
			
			
		}
	}

	private static boolean getresponsecode() {
		// TODO Auto-generated method stub
		return false;
	}

}
