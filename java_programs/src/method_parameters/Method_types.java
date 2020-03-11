package method_parameters;

public class Method_types
{
	public void method1()
	{
		String tool_name = "webdriver";
		System.out.println(tool_name);
	}

	public String method2()
	{
		String tool_name="grid";
		return tool_name;
	}
	public static void main(String[] args) 
	{
		Method_types obj=new Method_types();
		
		obj.method1();
		
		String name=obj.method2();//calling return type method
		System.out.println(name);
		
	}

}
