package method_parameters;

import org.openqa.selenium.By;

public class Run_repository_fb
{
	public static void main(String[] args) throws Exception 
	{
		repository obj=new repository();
		obj.launch_browser("chrome");
		obj.load_app("https://www.facebook.com/");
		obj.wait(20);
		
		obj.expl_by_text(By.id("u_0_m"), "abcdefgh");
		obj.expl_by_text(By.id("u_0_o"), "hgdchc");
		obj.expl_by_text(By.id("u_0_r"), "232545641");
		obj.select_dropdown(By.id("day"), "23");
		obj.clickable_wait(By.id("u_0_9"));
		
		obj.screenshot("fb_login");
		
		obj.clickable_wait(By.linkText("Instagram"));
		
		obj.switch_to_windows("Instagram");
		 
		obj.screenshot("instagram");
		
		
	}

}
