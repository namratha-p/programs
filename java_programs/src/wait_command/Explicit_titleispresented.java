package wait_command;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_titleispresented {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/");
		driver.manage().window().maximize();
		
		new WebDriverWait(driver,20).until(ExpectedConditions.titleIs("SeleniumHQ Browser Automation"));
		
		driver.findElement(By.xpath("(//a[@href='/downloads'])[1]")).click();
		
		new WebDriverWait(driver,20).until(ExpectedConditions.titleContains("Downloads"));
		
	}

}
