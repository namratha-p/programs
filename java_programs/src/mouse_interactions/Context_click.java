package mouse_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Context_click {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement click=driver.findElement(By.xpath("//span[text()='right click me']"));
		new Actions(driver).contextClick(click).perform();
		
		WebElement delete=driver.findElement(By.xpath("//span[text()='Delete']"));
		new Actions(driver).contextClick(delete).perform();
		
		driver.switchTo().alert().accept();
		
		
	}

}
