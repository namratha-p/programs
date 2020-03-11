package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_All_Dropdown_Option_At_Webpage {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.tagName("select"));
		
		for (int i = 0; i < list.size(); i++)
		{
			WebElement each_list = list.get(i);
			new Select(each_list).selectByIndex(1);
			
			
		}
		
	}

}
