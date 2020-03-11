package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hdfc_multiple_selection
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		((JavascriptExecutor)driver).executeScript("document.getElementById('customState')" +
		".setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		boolean stateselect=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("state dropdown is multiple  " +stateselect);
		Thread.sleep(6000);
		
		if (stateselect==true) 
		{
			Select state=new Select(driver.findElement(By.id("customState")));
			state.selectByIndex(2);
			state.selectByIndex(5);
			state.selectByIndex(3);
			state.deselectByIndex(3);
		} 
		else
		{
			throw new Exception("state dropdown selected is single");
		}
		
		
		
		System.out.println("test completed");
	}
}