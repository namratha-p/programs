package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Set_hashset {

	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<String>();
		set.add("appium");
		set.add("cucumber");
		set.add("rc");
		set.add("grid");
		set.add("ide");
		set.add("webdriver");
		set.add("rc");
		
		
		int setsize = set.size();
		System.out.println("the no of set are"+setsize);
		
		
		set.remove("rc");
		
		boolean flag = set.contains("webdriver");
		System.out.println("does the data contains wd"+flag);
		
		String list = set.iterator().next();
		System.out.println(list);
		
		boolean empty = set.isEmpty();
		System.out.println("is list empty" +empty);
		
		for (String eachobj : set) 
		{
			System.out.println(eachobj);
		}
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			String next = itr.next();
			System.out.println(next);
		}
		
		
		
	}

}
