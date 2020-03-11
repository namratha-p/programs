package robot_framework;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screencapture {

	

	public static void main(String[] args) throws AWTException, Exception 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		Robot robot=new Robot();
		robot.setAutoDelay(200);
		
		//Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		//BufferedImage image = robot.createScreenCapture(new Rectangle(screen));
		
		//ImageIO.write(image, "PNG" ,new File("screens//robot.png"));
		
		
		Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
		BufferedImage i=robot.createScreenCapture(new Rectangle(size));
		ImageIO.write(i, "png", new File("screens//kdcnd.png"));
		

	
	}

}
