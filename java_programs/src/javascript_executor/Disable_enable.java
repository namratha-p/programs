package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disable_enable {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		WebElement mail=driver.findElement(By.xpath("//input[@id='email']"));
		
		js.executeScript("arguments[0].disabled=true;", mail);
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].disabled=false;", mail);
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].style.visibility='hidden';", mail);
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].style.visibility='visible';", mail);
		Thread.sleep(5000);
		
		js.executeScript("document.getElementById('month')" + ".setAttribute('multiple','multiple')");
		
		

	}

}
