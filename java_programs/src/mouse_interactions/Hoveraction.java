package mouse_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoveraction {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		WebElement jobs=driver.findElement(By.xpath("//div[@class='mTxt'][contains(.,'Jobs')]"));
		new Actions(driver).moveToElement(jobs).perform();
		
	}

}
