package inheritance;

public class ClassB extends ClassA 
{
	 double price=2000.12;
	 void method2()
	 {
		 System.out.println("method2 is executed");
		 
		 method1();
		 System.out.println(toolname);
	 }
	public static void main(String[] args)
	{
		ClassB obj=new ClassB();
		obj.method1();
		obj.method2();
		
		ClassA ref=new ClassB();
		ref.method1();
		
		//System.out.println(price);		
		

	}

}
