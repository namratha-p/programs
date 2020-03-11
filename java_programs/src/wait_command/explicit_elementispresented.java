package wait_command;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_elementispresented {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		//driver.switchTo().alert().accept();
		
		WebElement round=driver.findElement(By.xpath("//input[@id='RoundTrip']"));
		round.click();
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementSelectionStateToBe(round, true));

		WebElement return_loc=driver.findElement(By.xpath("//input[contains(@id,'ReturnDate')]"));
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(return_loc));
		
		WebElement one=driver.findElement(By.xpath("//input[@id='OneWay']"));
		one.click();
		
		new WebDriverWait(driver,20).until(ExpectedConditions.elementSelectionStateToBe(one, true));
		
		
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOf(return_loc));
	}

}
