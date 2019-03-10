package stream;

import java.io.FileInputStream;
import java.io.IOException;

public class intputstream1 {
	public static void main(String[] args) {
		FileInputStream rf=null;
		try {
			rf=new FileInputStream("F:\\Java1\\eclipse-workspace\\Thread\\src\\stream\\intputstream1.java");
			int count,n=512;
			byte buffer[]=new byte[n];
			while(rf.read(buffer,0,n)!=-1&&(n>0))
			{
				System.out.println(new String(buffer));
			}
			
			
		}
		catch(IOException ioe)
		{
		System.out.println(ioe.toString());
		}
		finally {
			try {
				rf.close();
			}
			catch(IOException ioe)
			{
				
			}
		}
	}
}