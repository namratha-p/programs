

package css_selector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='u_0_m']")).clear();
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("abcdefghijklmnopqrstuvwxyz");
		
		WebElement login_pws=driver.findElement(By.xpath("//input[@id='u_0_o']"));
		login_pws.clear();
		login_pws.sendKeys("123456789");
		
		//using by locator
		By login_but=By.xpath("//input[@id='u_0_r']");
		WebElement button=driver.findElement(login_but);
		button.clear();
		button.sendKeys("kdhsk");
		 
		
		
	}

}
