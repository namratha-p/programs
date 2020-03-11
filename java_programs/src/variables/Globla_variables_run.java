package variables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Globla_variables_run {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(Global_variables.email_login).clear();
		driver.findElement(Global_variables.email_login).sendKeys("ckdhc");
		
		
		driver.findElement(Global_variables.pass_login).clear();
		driver.findElement(Global_variables.pass_login).sendKeys("cajdof");
		
		driver.findElement(Global_variables.login_btn).click();
		
	}

}
