package fw.dd.NotepadFile;

import java.io.FileReader;
import java.util.Scanner;

public class Read_Data_From_NotePad_File_Using_Scanner 
{

	public static void main(String[] args) throws Exception 
	{
		FileReader fr=new FileReader("C:\\Users\\mithr\\OneDrive\\Desktop\\Notepad_InputData.txt");
		System.out.println("file located");
		
		Scanner sc=new Scanner(fr);
		
		while (sc.hasNextLine())
		{
			String line = (String) sc.nextLine();
			String data[]=line.split(",");
			System.out.println(data[0]+"   "+data[1]);		
			
		}
	}

}
