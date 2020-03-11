package ui_verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_title {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/");
		driver.manage().window().maximize();
		
		String current_title=driver.getTitle();
		String expect_title="SeleniumHQ Browser Automation";
		
		boolean flag= current_title.equals(expect_title);
		
		if (flag==true) 
		{
			System.out.println("page title is verified");
			
						WebElement down_load=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
					    down_load.click();
						if(driver.getTitle().contains("downloads"))
							System.out.println("page verified");
						else
							System.out.println("page not verified");
		} 
		else 
		{
			System.out.println("page title is not verified");
		
		}
		driver.close();
		
	}

}
