package method_parameters;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class repository 
{
	public WebDriver driver;
	public WebDriverWait wait;

	
		/*
		 * Keyword:--> Launch browser [Chrome, Firefox, IE]
		 * Author:-->Namratha
		 * Created Date:-->19/02/2020
		 * ReviewedBy:-->
		 * Parameters Used:-->
		 * Last Update date:-->
		 */
		
		public void launch_browser(String browsername)
		{
			switch (browsername)
			{
				case "chrome":
					System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
					driver=new ChromeDriver();
				break;
				
				case "firefox":
					System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
					driver=new FirefoxDriver();
				break;
				
				case "ie":
					System.setProperty("webdriver.ie.driver", "browsers//IEserverdriver.exe");
					driver=new InternetExplorerDriver();
				break;

			default:
				break;
			}
		}
		
		
		/*
		 * Keyword:--> load_app 
		 * Author:-->Namratha
		 * Created Date:-->21/02/2020
		 * ReviewedBy:-->
		 * Parameters Used:-->
		 * Last Update date:-->
		 */
		public void load_app(String url)
		{
			driver.get(url);
			driver.manage().window().maximize();
		}
		
		/*
		 * Keyword:--> wait timeouts-->implicit explicit 
		 * Author:-->Namratha
		 * Created Date:-->21/02/2020
		 * ReviewedBy:-->
		 * Parameters Used:-->
		 * Last Update date:-->
		 */
		
		public void wait(int time_in_sec)
		{
			driver.manage().timeouts().implicitlyWait(time_in_sec, TimeUnit.SECONDS);
			wait=new WebDriverWait(driver, time_in_sec);
			
		}
		
		/*
		 * Keyword:--> input text in the edit box 
		 * Author:-->Namratha
		 * Created Date:-->21/02/2020
		 * ReviewedBy:-->
		 * Parameters Used:-->
		 * Last Update date:-->
		 */
		
		public void enter_text(String xpath, String inputdata)
		{
			driver.findElement(By.xpath(xpath)).clear();
			driver.findElement(By.xpath(xpath)).sendKeys(inputdata);		
		}
		
		/*
		 * Keyword:--> text enter edit box using by locator for explicit wait
		 * Author:-->Namratha
		 * Created Date:-->21/02/2020
		 * ReviewedBy:-->
		 * Parameters Used:-->
		 * Last Update date:-->
		 */
		
		public void expl_by_text(By locator,String inputdata)
		{
			WebElement edit=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			edit.clear();
			edit.sendKeys(inputdata);	
		}
		
		/*
		 * Keyword:--> text enter edit box using by locator for explicit wait availability of element
		 * Author:-->Namratha
		 * Created Date:-->21/02/2020
		 * ReviewedBy:-->
		 * Parameters Used:-->
		 * Last Update date:-->
		 */
		
		public void enter_text(WebElement element, String inputdata)
		{
			WebElement editbox=wait.until(ExpectedConditions.visibilityOf(element));
			editbox.clear();
			editbox.sendKeys(inputdata);	
		}
		
		/*
		 * Keyword:--> select dropdown using xpath locator
		 * Author:-->Namratha
		 * Created Date:-->21/02/2020
		 * ReviewedBy:-->
		 * Parameters Used:-->
		 * Last Update date:-->
		 */
		public void select_dropdown(By element, String text)
		{
			WebElement dropdown=driver.findElement(element);
			new Select(dropdown).selectByVisibleText(text);
		}
		
		/*
		 * Keyword:--> select dropdown using WebElement Interface reference
		 * 					[this keyword usefull for POM Framework]
		 * Author:-->Namratha
		 * Created Date:-->21/02/2020
		 * ReviewedBy:-->
		 * Parameters Used:-->
		 * Last Update date:-->
		 */
		
		public void dd_using_explicit(WebElement element,String text)
		{
			WebElement drop_explicit_wait = wait.until(ExpectedConditions.visibilityOf(element));
			new Select(drop_explicit_wait).selectByVisibleText(text);
		}
		
		/*
		 * KeywordName:--> Click Any clickable element [link,button,radiobutton,checkbox]
		 * 					[Using xpath]  
		 * Author:-->Namratha
		 * CreatedOn:-->21/02/2020
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */
		 public void clikable(String xpath_click)
		 {
			 WebElement clikable = driver.findElement(By.xpath(xpath_click));
			 clikable.click();		 
		 }
		 
	 	/*
		 * KeywordName:--> Click Any clickable element [link,button,radiobutton,checkbox]
		 * 					[Using By class refernce]  
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */
		public void clickable_wait(By locator)
		{
			WebElement click_wait=wait.until(ExpectedConditions.elementToBeClickable(locator));
			click_wait.click();	
		}
		
		/*
		 * KeywordName:--> Click Any clickable element [link,button,radiobutton,checkbox]
		 * 					[Using WebElemnet refernce]    [POM keyword] 
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */
		 public void click_element(WebElement element)
		 {
			 WebElement Element=wait.until(ExpectedConditions.elementToBeClickable(element));
			 Element.click();
		 }
		 
		 
		/*
		 * KeywordName:--> Mousehover on element.[Using By parameter]
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	
		 public void mousehover(By locator)
		 {
			 WebElement target= driver.findElement(locator);
			 new Actions(driver).moveToElement(target).pause(2000).perform();
		 }
		 
		/*
		 * KeywordName:--> Mousehover on element.[Using WebElement parameter]
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */
		 public void mousehover_wait(WebElement element)
		 {
			 WebElement hover = wait.until(ExpectedConditions.visibilityOf(element));
			 new Actions(driver).moveToElement(hover).perform();
		 }
		 
		 /*
		 * KeywordName:--> CaptureScreen using [Filename]
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public void screenshot(String imagename) throws Exception
		 {
			try 
			{
				Date d=new Date();
				 SimpleDateFormat sdf=new SimpleDateFormat();
				 String date = sdf.format(d);
				 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 FileUtils.copyFile(src, new File("screens\\"+date+imagename+".png"));
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			} 	 			 
		 }
	
		 /*
		 * KeywordName:--> SwitchTo window
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	  
		 public void switch_to_windows(String selectedwindow)
		 {
			 Set<String> windows = driver.getWindowHandles();
			 for (String eachwindow : windows) 
			 {
				driver.switchTo().window(eachwindow);
				String title = driver.getTitle();
				if(title.contains(selectedwindow))
				{
					break;
				}
			 }
		 }
		 
		 /*
		 * KeywordName:--> SwitchTo window
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public boolean is_titlepresent(String excepted_title)
		 {
			String runtime_title = driver.getTitle();
			boolean flag = runtime_title.contains(excepted_title);
			return flag;	 
		 }
		 
		 
		 /*
		 * KeywordName:--> Verify title presented using explicit wait.
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public Boolean wait_titleispresented(String exceptedtitle) 
		 {
			 try
			 {
				 Boolean flag = wait.until(ExpectedConditions.titleContains(exceptedtitle));
				 return flag;
			 }
			 catch(TimeoutException e)
			 {
				 return false;
			 }
			
		 }
		 
		 /*
		 * KeywordName:--> Verify url presented using explicit wait.
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public boolean wait_isurlpresented(String exceptedurl)
		 {
			 try
			 {
				 boolean flag = wait.until(ExpectedConditions.urlContains(exceptedurl));
				 return flag;
			 }catch (TimeoutException e) {
				 return false;	
			}
		 }
		 
		 /*
		 * KeywordName:--> Verify Element presented at source
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public boolean is_element_presented(String exp_element)
		 {
			 String element_presented = driver.getPageSource();
			 boolean flag=element_presented.contains(exp_element);
			 return flag;
		 }
		 
		 /*
		 * KeywordName:--> Verify text visible at WebPage.
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public boolean istext_presented(String exptext)
		 {
			 String get_text = driver.findElement(By.tagName("body")).getText();
			boolean flag = get_text.contains(exptext);
			return flag;
		}
		 
		 /*
		 * KeywordName:--> Verify text presented at element.
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public Boolean is_text_preseted_at_element(By locator, String exp_text)
		 {
			try { Boolean text_presented_at_element = wait.until(ExpectedConditions.textToBePresentInElementValue(locator, exp_text));
			 return text_presented_at_element;
			}catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			 
		 }
		 
		 
		 
		 

}

