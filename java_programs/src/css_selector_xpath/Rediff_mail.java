package css_selector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_mail {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.rediff.com/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click();
		 
		 driver.findElement(By.linkText("Create a new account")).click();
		 
		 driver.findElement(By.cssSelector("input[name*='name']")).clear();
		 driver.findElement(By.cssSelector("input[name*='name']")).sendKeys("abcdefghijklmnopqrstuvwxyz");
		 
	}	
}
