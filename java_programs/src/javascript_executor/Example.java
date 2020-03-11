package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		String title = js.executeScript("return document.title").toString();
		System.out.println("the title is" +title);
		
		String url=js.executeScript("return window.location.href").toString();
		System.out.println("the url of the window is" +url);
		
		js.executeScript("document.getElementById('month').scrollIntoView()");
		
		js.executeScript("return alert('execution completed')");
		
		
		

	}

}
