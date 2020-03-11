package launching;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_launch {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","browsers//geckodriver.exe");
         WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}

}
