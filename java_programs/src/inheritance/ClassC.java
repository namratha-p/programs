package inheritance;

public class ClassC extends ClassB
{
	int price1=10;
	void method3()
	{
		System.out.println("method3 is executed");
		
		method1();
		method2();
		
		System.out.println(toolname);
		System.out.println(price);
	}
	
	
	public static void main(String[] args)
	{
		ClassC obj=new ClassC();
		obj.method1();
		obj.method2();
		obj.method3();
		
		ClassB ref=new ClassC();
		ref.method1();
		ref.method2();
		System.out.println(ref.toolname);
		System.out.println(ref.price);

		ClassA var=new ClassC();
		var.method1();
		System.out.println(var.toolname);
	}

}
