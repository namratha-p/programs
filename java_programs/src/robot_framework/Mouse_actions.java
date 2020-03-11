package robot_framework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse_actions {

	public static void main(String[] args) throws AWTException, Exception 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		robot.mouseMove(852,423);
	//driver.findElement(By.xpath("//input[@id='RoundTrip']")).click();
		
		
		
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		robot.mouseWheel(50);
		
		robot.mouseWheel(-50);
	}

}
