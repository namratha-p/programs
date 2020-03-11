package sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop 
{
 public static void main(String[] arg)
 {
	 System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
	 driver.manage().window().maximize();
	 
	 WebElement des= driver.findElement(By.xpath("//div[contains(@id,'droptarget')]"));
	 WebElement src= driver.findElement(By.xpath("//div[contains(@id,'draggable')]"));
	 
	 new Actions(driver).dragAndDrop(src, des).perform();
	 
}
}
