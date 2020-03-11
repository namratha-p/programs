package wait_command;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_visisbility {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		
		WebElement id=driver.findElement(By.id("email"));
		id.clear();
		id.sendKeys("fihwpirf");
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.clear();
		pass.sendKeys("sjfih");
		
	}

}
