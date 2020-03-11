package robot_framework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload_resume {

	public static void main(String[] args) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://naukri.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("uploadBtnCont")).click();
		
		String path = "C:\\Users\\mithr\\OneDrive\\Desktop\\programs\\arrays_double_dimensional_array.txt";
		
		StringSelection spath=new StringSelection(path);
		Clipboard cb=Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(spath,spath);
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		

	}

}
