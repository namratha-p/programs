package fw.dd.CsvFiles;

import java.io.FileReader;

import com.opencsv.CSVReader;

public class Read_Data_From_CsvFile {

	public static void main(String[] args) throws Exception
	{
		FileReader fr=new FileReader("C:\\Users\\mithr\\OneDrive\\Desktop\\csv_input.csv");
		CSVReader reader=new CSVReader(fr);
		
		String header[] = reader.readNext();
		System.out.println(header[0]+"    "+header[1]);
		
		//String[] line1=reader.readNext();
		
		
		
		String line[];
		while ((line=reader.readNext())!= null)
		{
			System.out.println(line[0]+"    "+line[1]);
			
		}
		
		
		
	}

}
