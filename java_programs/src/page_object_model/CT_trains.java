package page_object_model;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CT_trains 
{
	WebDriver driver;

	public CT_trains(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="from_station")
	public WebElement from_station;
	
	@FindBy(id="to_station")
	public WebElement to_station;
	
	@FindBy(xpath="//select[contains(@id,'trainClass')]")
	public WebElement class_type;
	
	@FindBy(id="dpt_date")
	public WebElement date;
	
	@FindBy(id="train_adults")
	public WebElement adults_no;
	
	@FindBy(id="trainFormButton")
	public WebElement search_trains;
	
	
	public void cleartrip_train() throws Exception
	{
		from_station.clear();
		from_station.sendKeys("hyd"+Keys.ARROW_DOWN+Keys.ENTER);
		Thread.sleep(2000);
		
	
		
		to_station.clear();
		to_station.sendKeys("dli"+Keys.ENTER);
		
		new Select(class_type).selectByVisibleText("AC 2 Tier (2A)");
		
		date.clear();
		date.sendKeys("24/2/2020");
		
		new Select(adults_no).selectByIndex(2);
		
		search_trains.click();	
	}

}
