package mouse_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_dropby {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
		driver.manage().window().maximize();
		
		WebElement drag=driver.findElement(By.xpath("//div[@class='rangeslider__handle']"));
		new Actions(driver).dragAndDropBy(drag, 100, 0).perform();;
	}		

}
