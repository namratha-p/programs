package loops;

import java.util.HashSet;
import java.util.Set;

public class foreach_loop {

	public static void main(String[] args) 
	{
		String[] data= {"web","driver","rc","grid"};
		for (String eachdata : data) 
		{
			System.out.println(eachdata);
		}
		
	
		int[] num= {1,6,65,532};
		for (int eachnum : num)
		{
			System.out.println(eachnum);
		}
		
	 Set<String> col = new HashSet<String>();
			 col.add("web");
	 		col.add("driver");
	 		col.add("appium");
	 		col.add("cucumber");
	 		
	 		for (String eachcol: col)
	 		{
	 			System.out.println(eachcol);
			}
	 		System.out.println();
	}

}
