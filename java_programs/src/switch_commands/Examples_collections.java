package switch_commands;

import java.util.HashSet;
import java.util.Iterator;

public class Examples_collections {

	public static void main(String[] args)
	{
		HashSet<String> set=new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		for(String eachset:set)
		{
			System.out.println(eachset);
		}
			
		
		HashSet<String> coll = new HashSet<String>();
		coll.add("keyboard");
		coll.add("mouse");
		coll.add("monitor");
		coll.add("cpu");
		Iterator<String> itr = coll.iterator();
		
		String o1=itr.next();
		System.out.println(o1);
		
		String o2=itr.next();
		System.out.println(o2);
		
		String o3=itr.next();
		System.out.println(o3);
		
		String o4=itr.next();
		System.out.println(o4);
		
		
		HashSet<String> grp=new HashSet<String>();
		
		grp.add("keyboard");
		grp.add("mouse");
		grp.add("monitor");
		grp.add("cpu");
		
		Iterator<String> iter = grp.iterator();
		
		while( iter.hasNext())
		{
			String obj = iter.next();
			System.out.println("the itr is-->"+obj);
		}
		
		
		
		
		
		
		
		}
	
	
	
	
			
		
		
		
		
		
		
		
	}


