package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_indentifications {

	public static void main(String[] args) 
	{
			System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			
			js.executeScript("document.getElementById('email').value='jdoeijhe'");
			
			js.executeScript("document.getElementById('pass').value='huuuigw'");
			
			WebElement first=driver.findElement(By.xpath("//input[@id='u_0_m']"));
			js.executeScript("arguments[0].value='dwhd'", first);
			
			WebElement last=driver.findElement(By.xpath("//input[@id='u_0_o']"));
			js.executeScript("arguments[0].value='huify'", last);
			
			js.executeScript("document.getElementById('day').value='22'");
			js.executeScript("document.getElementById('month').value='3'");
			js.executeScript("document.getElementById('year').selectedIndex='5'");
			
			WebElement female=driver.findElement(By.xpath("//input[@id='u_0_6']"));
			js.executeScript("arguments[0].click()", female);
			
			WebElement male=driver.findElement(By.xpath("//input[@id='u_0_7']"));
			js.executeScript("arguments[0].checked='true'", male);
			
				
			
			
			
			
	}

}
