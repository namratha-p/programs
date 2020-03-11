package sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy
{

	public static void main(String[] args)
	{		
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@maxlength,'2048')]")).clear();
		driver.findElement(By.xpath("//input[contains(@maxlength,'2048')]")).sendKeys("sreekar prasad"+Keys.ENTER);
		
	}

}
