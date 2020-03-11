package page_object_model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_signin_run 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Facebook_SignIn obj=new Facebook_SignIn();
		//driver.findElement(Facebook_SignIn.create_acc).click();
		driver.findElement(Facebook_SignIn.first_name).clear();
		driver.findElement(Facebook_SignIn.first_name).sendKeys("jhgyfu");
		driver.findElement(Facebook_SignIn.email).clear();
		driver.findElement(Facebook_SignIn.email).sendKeys("ndjendjjd@gmail.com");
		driver.findElement(Facebook_SignIn.sign_up).click();
		
		

	}

}
