package mouse_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_hoveraction {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://marcojakob.github.io/dart-dnd/basic/");
		driver.manage().window().maximize();
		
		WebElement doc1= driver.findElement(By.xpath("(//img[contains(@class,'document')])[1]"));
		WebElement doc2= driver.findElement(By.xpath("(//img[contains(@class,'document')])[2]"));
		WebElement doc3= driver.findElement(By.xpath("(//img[contains(@class,'document')])[3]"));
		WebElement doc4= driver.findElement(By.xpath("(//img[contains(@class,'document')])[4]"));
		
		WebElement trash_bin=driver.findElement(By.xpath("//div[contains(@class,'trash')]"));
		
		new Actions(driver).clickAndHold(doc1).moveToElement(trash_bin).release().perform();
		new Actions(driver).clickAndHold(doc2).moveToElement(trash_bin).release().perform();
		new Actions(driver).dragAndDrop(doc3, trash_bin).perform();
		new Actions(driver).dragAndDrop(doc4, trash_bin).perform();
		
		
		
	}

}
