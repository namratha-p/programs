package loops;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class for_loop {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String[] links= {"Messenger","Sign Up","Log In","Careers","About"};
		
		for (int i = 0; i < links.length; i++) 
		{
			driver.findElement(By.linkText(links[i])).click();
			
			Thread.sleep(5000);
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("screens//"+links[i]+".png"));
			
			driver.navigate().back();		
		}
		
		for (String eachlink : links) 
		{
			driver.findElement(By.linkText(eachlink)).click();
			System.out.println(eachlink+"  each title is---->  "+driver.getTitle());
			driver.navigate().back();
		}
		
		
	}
	

}
