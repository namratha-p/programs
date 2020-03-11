package launching;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_launch {

	public static void main(String[] args)
	{
      System.setProperty("webdriver.ie.driver","browsers//IEDriverserver.exe");
  		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("https://www.google.com/");

	}

}
