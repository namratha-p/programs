package ui_verification;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class element_gettext {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.id("identifierId"));
		email.clear();
		email.sendKeys("qadarshan@outlook.com" +Keys.RETURN);
		
		WebElement err=driver.findElement(By.xpath("//div[@class='o6cuMc']"));
		String expect_err=err.getText();
		String actual_text= "Couldn't find your Google Account";
		
		if(expect_err.contains(actual_text))
			System.out.println("actual text and expexted text are same");
		else
			System.out.println("not matching");
				
			
				
		
	}

}
