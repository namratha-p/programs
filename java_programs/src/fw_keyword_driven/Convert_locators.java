package fw_keyword_driven;

import org.openqa.selenium.By;

public class Convert_locators 
{
	public By locators(String pname)
	{
		
		By by=null;
		switch (pname)
		{
		case "id":
			by=By.id("pvalue");
			break;
			
		case "name":
			by=By.name("pvalue");
			break;
		
		case "classname":
			by=By.className("pvalue");
			break;
		
		case "linktext":
			by=By.linkText("pvalue");
			break;
			
		case "partiallinktext":
			by=By.partialLinkText("pvalue");
			break;
		
		case "xpath":
			by=By.xpath("pvalue");
			break;
			
		case "tagname":
			by=By.tagName("pvalue");
			break;
			
	

		default:System.out.println("locatorname mismatch");
			break;
		}
		return by;
	}
}
