package Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Read_Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("test.txt");
		String str="this is a new file1 %n this is a new file2";
	
		fw.write(str.format(str, "%n"));
		fw.close();
		
		FileReader fr=new FileReader("test.txt");
		BufferedReader br=new BufferedReader(fr);
		String string;
		while((string=br.readLine())!=null) {
			
			System.out.println(string);
		}
	
	}

}
