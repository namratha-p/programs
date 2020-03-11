package loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class do_while {

	public static void main(String[] args) 
	{
		int i=0;
		do {
			i=i+1;
			System.out.println("i="+i);
		} while (i<10);

		
		int j=0;
		do {
			System.out.println("j="+j);
			j=j+1;
		} while (j<=10);
		
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		boolean flag=false;
		int k = 1;
		do {
			driver.get("https://www.facebook.com/");
			flag=(ExpectedConditions.titleIs("Facebook – log in or sign up").apply(driver));
			
			k=k+1;
			if (k==10)
				System.out.println("title is matched");
				
		} while (!flag==true);
		
		System.out.println("title is not matched");
		
		
		
		
	}
	
	
	

}
