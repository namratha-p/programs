package sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("u_0_m")).sendKeys("namratha"+Keys.TAB+"ghjds"+Keys.TAB+"abcdshr.91@gmail.com"+Keys.TAB+"abcdshr.91@gmail.com");
		
		driver.findElement(By.id("day")).sendKeys("25");
		driver.findElement(By.id("month")).sendKeys("sept");
		driver.findElement(By.id("year")).sendKeys("1994");
		
		
	}
}
