package stream;

import java.io.FileWriter;
import java.io.IOException;

public class writer1 {
	public static void main(String[] args) {
		FileWriter fw=null;
		try {
			fw=new FileWriter("F:\\Java1\\eclipse-workspace\\Thread\\src\\stream\\writer1.java",true);
			fw.write("hello world!");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	    finally {
			if(fw!=null)
			{
				try {
					fw.close();
				}
				catch(IOException e)
				{
					System.out.println("πÿ±’ ß∞‹£°");
				}
			}
		}
	}

}
