package stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class bufferreader {
	public static void main(String[] args) {
		BufferedReader br=null;
		BufferedWriter bw=null;
		String b=null;
		File file=new File("F:\\Java1\\eclipse-workspace\\Thread\\src\\stream\\bufferreader.java");
		if(!file.exists()!=false)
		{
		try {
			file.createNewFile();	
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		}
		try {
			bw=new BufferedWriter(new FileWriter(file));
			FileReader fr=new FileReader("F:\\Java1\\eclipse-workspace\\Thread\\src\\stream\\bufferreader1.java");
			br=new BufferedReader(fr);
			while((b=br.readLine())!=null)
			{
				System.out.println(b);
				bw.close();
				bw.newLine();
			}
			bw.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		finally {
			try {
				br.close();
				bw.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}










