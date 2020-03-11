package loops;

public class for_inc_dec {

	public static void main(String[] args)
	{
		for (int i = 0; i <=10; i++) 
		{
			System.out.println(i +" hi ");
		}
		 
		for (int i = 10; i >=1; i--) 
		{
			System.out.println(i+"  hello ");
		}
		
		String c="webdriver";
		char[] ch = c.toCharArray();
		for (int i = ch.length-1; i >=0; i--) 
		{
			char chr = c.charAt(i);
			System.out.println(chr);		
		}
		
		
		String ary[]= {"webdriver","appium","cucumber"};
		
		for (int i = 0; i < ary.length; i++)
		{
			System.out.println(ary[i]);
		}
	}

}
