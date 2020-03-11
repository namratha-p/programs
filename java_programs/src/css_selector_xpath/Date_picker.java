package css_selector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_picker {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@id,'DepartDate')]")).click();
		driver.findElement(By.xpath("(//a[@class='ui-state-default '][contains(.,'16')])[1]")).click();
		
	}

}
