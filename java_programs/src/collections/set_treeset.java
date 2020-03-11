package collections;

import org.apache.commons.collections4.list.TreeList;

public class set_treeset {

	public static void main(String[] args) 
	{
		TreeList<String> set = new TreeList<String>();
		set.add("appium");
		set.add("cucumber");
		set.add("webdriver");
		set.add("ide");
		
		for (String each : set) 
		{
			System.out.println(each);
		}
	}

}
