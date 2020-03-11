package fw.dd.NotepadFile;

import java.util.Scanner;

public class Scanner_Read_Data_From_System 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name-->");
		String name = sc.next();
		System.out.println("username name is" +name);
		
		System.out.println("enter id number-->");
		int id = sc.nextInt();
		System.out.println("userid is"+id);
		
		System.out.println("start iteration number");
		int start = sc.nextInt();
		System.out.println("end iteration number");
		int end = sc.nextInt();
		
		for (int i = start; i < end; i++) 
		{
			System.out.println(i);	
		}
		

	}

}
