package css_selector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[contains(@id,'fromCity')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@autocomplete,'off')]")).sendKeys("DEL");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[contains(.,'Delhi, India')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'To')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'To')]")).sendKeys("HYD");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[@class='font12 greyText appendBottom3'][contains(.,'Rajiv Gandhi Intl Airport')]")).click();
		
		//driver.findElement(By.xpath("//div[@class='dayPickerHeader dayToFromCont blackText'][contains(.,'4 Jan 20 - Book round trip for great savings')]")).click();
		//driver.findElement(By.xpath("(//p[contains(.,'4')])[4]")).click();
		
		
	}

}
