package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hdfc_ismultiple {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		boolean state=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("state dropdown selected is" +state);
	    Thread.sleep(2000);
		
	    ((JavascriptExecutor)driver).executeScript("document.getElementById('customState')"
				+ ".setAttribute('multiple','multiple')");
	    
	    
	   boolean state1=new Select(driver.findElement(By.id("customState"))).isMultiple();
	   System.out.println("state dropdown slelected is" +state1);
		

	}

}
