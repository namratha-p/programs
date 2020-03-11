package switch_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_url {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		
		
		String url="https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true";
		driver.navigate().to(url);
		
		WebElement id=driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		id.clear();
		id.sendKeys("lfkoprejgoierhgegk");
		
		WebElement trip=driver.findElement(By.xpath("//input[contains(@id,'tripidSecond')]"));
		trip.clear();
		trip.sendKeys("248638531");
		
		driver.navigate().back();
		
		
	}

}
