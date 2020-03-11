package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_scrolling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		((JavascriptExecutor)driver).executeScript("window.scroll(100,900)");
		
		((JavascriptExecutor)driver).executeScript("window.scroll(300,100)");

	}

}
