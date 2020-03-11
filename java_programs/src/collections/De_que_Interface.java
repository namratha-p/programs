package collections;

import java.util.ArrayDeque;

public class De_que_Interface {

	public static void main(String[] args)
	{
		ArrayDeque<String> de_que = new ArrayDeque<String>();
		
		de_que.add("Welcome"); 
        de_que.add("To"); 
        de_que.add("Geeks"); 
        de_que.add("4"); 
        de_que.add("Geeks"); 
        
        Object[] Array = de_que.toArray();
        
        for (Object each : Array)
        {
        	System.out.println(each);
		}
        System.out.println("deque"+de_que);
		
	}

}
