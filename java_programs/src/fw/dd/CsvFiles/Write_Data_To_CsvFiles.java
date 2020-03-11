package fw.dd.CsvFiles;

import java.io.FileWriter;

import com.opencsv.CSVWriter;



public class Write_Data_To_CsvFiles {

	public static void main(String[] args) throws Exception 
	{
		FileWriter fw=new FileWriter("C:\\Users\\mithr\\OneDrive\\Desktop\\csv_output.csv");
		CSVWriter writer=new CSVWriter(fw);
		
		
		String line1[]= {"result1","testpass"};
		writer.writeNext(line1);
		
		String line2[]= {"result2","testpass"};
		writer.writeNext(line2);
	
		
		writer.close();
		
		}
		

	}


