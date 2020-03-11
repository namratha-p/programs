package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class array_list {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("IDE");
		list.add("RC");
		list.add("WD");
		list.add("GRID");
		list.add("Appium");
		list.add("Cucumber");
		list.add("Robot");
		list.add("GRID");
		
		int count = list.size();
		System.out.println("count is"+count);
		
		list.remove("A---ppium");
		
		boolean not = list.contains("RC");
		System.out.println(not);
		
		String itr = list.iterator().next();
		System.out.println(itr);
		
		String inde = list.get(2);
		System.out.println(inde);
		
		boolean empty = list.isEmpty();
		System.out.println(empty);
		
		for (String each : list)
		{
			System.out.println(each);
		}
		
		Iterator<String> whileitr = list.iterator();
		while(whileitr.hasNext())
		{
			String itrr = whileitr.next();
			System.out.println(itrr);
		}
		
		for (int i = 0; i < list.size(); i++) 
		{
			String each = list.get(i);
			System.out.println(each);
		}
		

	}

}
