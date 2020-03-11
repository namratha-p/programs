package arrays;

public class Double_dimensional 
{
	public static void main (String args[])
	{
		String arr[][]=new String[3][2];
				{
					arr[0][0]="data1";
					arr[0][1]="user1";
					
					arr[1][0]="data2";
					arr[1][1]="user2";
				
					arr[2][0]="data3";
					arr[2][1]="user3";
				}
				
			System.out.println(arr[2][1]);
				
		String list[][]=
			{
					{"user1","data1"},
					{"user2","data2"},
					{"user3","data3"}
			};		
			System.out.println(list[2][1]);
		
		Object array[][]=
				{
						{"fghjh",852},
						{"erty",752},
						{"erfy",204}
				};
		
			
			System.out.println(array[2][1]);
			
			
	}
}
