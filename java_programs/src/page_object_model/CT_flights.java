package page_object_model;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CT_flights 
{
	WebDriver driver;
	public String excp_err_msg="Sorry, but we can't continue until you fix everything that's marked in RED";
	public String exc_page_header="Search flight";
	
	public CT_flights(WebDriver driver) 	
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="OneWay")
	public WebElement oneway_btn;
	
	@FindBy(xpath = "//input[contains(@id,'RoundTrip')]")
	public WebElement roundway_btn;
	
	@FindBy(id="FromTag")
	public WebElement from_eb;
	
	@FindBy(id="ToTag")
	public WebElement to_eb;
	
	@FindBy(id="DepartDate")
	public WebElement departdate;
	
	@FindBy(id="ReturnDate")
	public WebElement returndate;
	
	@FindBy(id="Adults")
	public WebElement adult_dd;
	
	@FindBy(id="SearchBtn")
	public WebElement search_btn;
	
	@FindBy(xpath = "//div[contains(@class,'lineMessage ugly icon')]")
	public WebElement error_msg;
	
	@FindBy(xpath = "//h1[contains(.,'Search flights')]")
	public WebElement page_header;
	
	
	public void flight_search_one_way()
	{
		if (!oneway_btn.isSelected())
		{
			oneway_btn.click();
		}
		
		from_eb.clear();
		from_eb.sendKeys("h"+Keys.ARROW_RIGHT+"yd");
		
		to_eb.clear();
		to_eb.sendKeys("d"+Keys.ARROW_RIGHT+"el");
		
		departdate.clear();
		departdate.sendKeys("Sun, 23 Feb, 2020");
		
		new Select(adult_dd).selectByVisibleText("2");
		
		search_btn.click();
		}
	
	
	public void flight_search_round_way()
	{
		if(!roundway_btn.isSelected())
		{
			roundway_btn.click();
		}
		
		from_eb.clear();
		from_eb.sendKeys("h"+Keys.ARROW_RIGHT+"yd");
		
		to_eb.clear();
		to_eb.sendKeys("d"+Keys.ARROW_RIGHT+"il");
		
		new Select(adult_dd).selectByVisibleText("2");
		
		departdate.clear();
		departdate.sendKeys("Sun, 23 Feb, 2020");
		
		returndate.clear();
		returndate.sendKeys("Sat, 29 Feb, 2020");
		
		search_btn.click();	
	}
	
	public void page_header()
	{
		if(page_header.isDisplayed())
			System.out.println("the page header is displayed");
			else
				System.out.println("the page header is not presented");
	}
	
	public void excepted_page_header()
	{
		String act_page_header = page_header.getText();
		if(act_page_header.contains(exc_page_header))
			System.out.println("the excepted header is present");
		else
			System.out.println("the excepted header is not presented");
	
	}
	
	public void excepted_err_presented()
	{
		String act_err_presented = error_msg.getText();
		if(act_err_presented.contains(excp_err_msg))
			System.out.println("the expected is presented");
		else 
			System.out.println("the excepted text is not presented");
			
		}
	
	public void search_empty()
	{
		search_btn.click();
	}
	
}
