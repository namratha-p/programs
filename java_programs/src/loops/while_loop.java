package loops;

import java.util.HashSet;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class while_loop {

	public static void main(String[] args) throws Exception 
	{
		int i=0;
		while(i<=10)
		{
			System.out.println(i);
			i=i+1;
		}

		
		HashSet<String> col=new HashSet<String>();
		col.add("WD");
		col.add("RC");
		col.add("AP");
		col.add("cc");
		
		Iterator<String> itr = col.iterator();
		while(itr.hasNext())
		{
			String obj = itr.next();
			System.out.println(obj);
		}
		
		
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement name= driver.findElement(By.xpath("//input[contains(@id,'u_0_m')]"));
		
		int j=1;
		while(name.isDisplayed())
		{
			
			Thread.sleep(5000);
			j=j+1;
			
			if(j==10)
				System.out.println("element is  displayed");
			
					
		}
		
		
	
			System.out.println("element is not displayed");
		
		
		
	}

}
