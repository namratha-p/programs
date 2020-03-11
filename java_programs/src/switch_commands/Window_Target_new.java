package switch_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Window_Target_new {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://epass.apcfss.in/");
		driver.manage().window().maximize();
		
		String home=driver.getWindowHandle();
		
		driver.switchTo().frame("messageFrame");
		
		driver.findElement(By.xpath("//a[@href='CollegeReports.html'][contains(.,'College Reports')]")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("bodyFrame");
		
		driver.findElement(By.xpath("//a[@href='CollegeReport.do'][contains(.,'DistrictWise Colleges Report')]")).click();
		
		driver.switchTo().window("_new");
		
		new Select(driver.findElement(By.xpath("//select[contains(@id,'distname')]"))).selectByIndex(3);
		
		driver.switchTo().window(home);
		System.out.println("the title of the window is_-->"+driver.getTitle());
	}

}
