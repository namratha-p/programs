package variables;

public class Variable_Types 
{
	int age=20;
	static double price=21738.3776387;
	 
	
	public void method1()
	
	{
		String name="dhdeosf";
		System.out.println("name displayed-->" +name);
		System.out.println("method1 is executed");
	}
	
	public static void method2()
	{
		System.out.println("method2 is executed");
	}
	
	
	public static void main(String args[])
	{
		
		Variable_Types obj=new Variable_Types();
	    obj.method1();
	    int age1=obj.age;
	    System.out.println("the age is-->" +age1);
	    
	    method2();
	    double tool=price;
	    System.out.println("the price od product is--->"  +tool);
	    
	    
	}
	
	}

