package fw.dd.NotepadFile;

import java.io.BufferedReader;
import java.io.FileReader;

public class Read_Data_From_Notepad_File {

	public static void main(String[] args) throws Exception 
	{
		FileReader fr=new FileReader("C:\\Users\\mithr\\OneDrive\\Desktop\\Notepad_InputData.txt");
		 BufferedReader reader=new BufferedReader(fr);
		 
		 String header = reader.readLine();
		 
		 System.out.println(header);
		 
		 String h[]=header.split(",");
		 
		 System.out.println(h[0]+"   "+h[1]);
		 
		 String line;
		 while ((line=reader.readLine())!=null) 
		{
			String data[]=line.split(",");
			System.out.println(data[0]+"   "+data[1]);
			
		}
	}

}
