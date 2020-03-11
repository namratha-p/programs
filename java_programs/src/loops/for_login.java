package loops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class for_login {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String arg[][]=
			{
				{"username1","password1"},
				{"username2","password2"},
				{"username3","password3"}
			};		
		
		for (int i = 0; i < arg.length; i++) 
		{
			String uid=arg[i][0];
			WebElement id = driver.findElement(By.xpath("//input[contains(@id,'email')]"));
			id.clear();
			id.sendKeys(uid);
			
			String pass=arg[i][1];
			WebElement pas=driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
			pas.clear();
			pas.sendKeys(pass);
			
		}
			
		}
	}


