package robot_framework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://selenium.dev/downloads/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='https://bit.ly/2TlkRyu']")).click();
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.delay(5000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		//robot.delay(5000);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		
	
	}

}
