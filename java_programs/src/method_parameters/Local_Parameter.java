package method_parameters;

public class Local_Parameter
{
	public void tool_name()
	{
		String name="webdriver";
		System.out.println(name);
	}
	
	public void tool_name(String tool_name)
	{
		String name=tool_name;
		System.out.println(name);
	}
	
	public void tool_name(String tool_name, double price)
	{
		String name=tool_name;
		System.out.println(name+"   "+price);
	}
	
	public static void main(String[] args) 
	{
		Local_Parameter obj=new Local_Parameter();
		obj.tool_name();
		obj.tool_name("appium");
		obj.tool_name("cucumber");
		obj.tool_name("ide", 4000);
	}

}
