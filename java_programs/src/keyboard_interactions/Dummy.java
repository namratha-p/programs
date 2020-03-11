package keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Dummy {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
				System.setProperty("webdriver.chrome.driver", "browsers\\chromedriver.exe");    
				//browser initiation command
				WebDriver driver=new ChromeDriver();
				driver.get("https://jqueryui.com/selectable/");
				driver.manage().window().maximize();
				
				//navigate to Frame 
				driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
				
				//To Hole contrl+Down option at webpage
				new Actions(driver).keyDown(Keys.CONTROL).perform();
				
				driver.findElement(By.xpath("//li[contains(.,'Item 1')]")).click();
				driver.findElement(By.xpath("//li[contains(.,'Item 3')]")).click();
				driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
				driver.findElement(By.xpath("//li[contains(.,'Item 7')]")).click();
				Thread.sleep(5000);
				
				//To Release Control option at webpage
				new Actions(driver).keyUp(Keys.CONTROL).perform();
				
				driver.switchTo().parentFrame();
				driver.findElement(By.xpath("//a[@href='https://jqueryui.com/draggable/'][contains(.,'Draggable')]")).click();
				
				}
	

		

}
