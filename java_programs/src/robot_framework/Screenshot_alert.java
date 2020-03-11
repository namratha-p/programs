package robot_framework;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_alert {

	public static void main(String[] args) throws AWTException, Exception 
	
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		Thread.sleep(5000);
		
		Robot robot=new Robot();
		
		//Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		//BufferedImage image = robot.createScreenCapture(new Rectangle(size));
		//ImageIO.write(image, "PNG", new File("screens//alert.png"));
		
		
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		BufferedImage image = robot.createScreenCapture(new Rectangle(size));
		ImageIO.write(image, "png", new File("screens//alerts.png"));
		
		
		//Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		//BufferedImage i = robot.createScreenCapture(new Rectangle(size));
		//ImageIO.write(i, "PNG", new File("screens//alret.png"));
	}

}
