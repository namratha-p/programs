package ui_verification;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_verification_commands {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/");
		driver.manage().window().maximize();
		
		String current_url=driver.getCurrentUrl();
		System.out.println("current paGE URL--->" +current_url);
		
		String current_title=driver.getTitle();
		System.out.println("cuurent page title--->" +current_title);
		
		String current_window=driver.getWindowHandle();
		System.out.println("current page window-->" +current_window);
		
		Set<String> current_windows=driver.getWindowHandles();
		System.out.println("current window handle-->" +current_windows);		
		
		String current_source=driver.getPageSource();
		System.out.println("current page pagesource----> "+current_source);
	}

}
