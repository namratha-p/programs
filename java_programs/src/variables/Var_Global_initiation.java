package variables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Var_Global_initiation 
{
	
	WebDriver driver=null;
	static double price =1233439.566452;
	
	
	
	public void load_webpage()
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	public void load_url()
	{
		driver.get("https://www.facebook.com/");
		System.out.println("the price is-->" +price);
	}
	
	public static void main(String args[])

	{
		Var_Global_initiation obj=new Var_Global_initiation();
		obj.load_webpage();
		obj.load_url();
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	