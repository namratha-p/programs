package variables;

public class Initiation {

	public static void main(String[] args)
	{
	if (true)
	{
		int a=100;
		System.out.println("local dec--->"+a);
		
	}
	int b;
	{
		b=200;
		System.out.println("inside the loop--->" +b);
		b=300;
	
	}
	System.out.println("outside the loop---->" +b);
	}

}
