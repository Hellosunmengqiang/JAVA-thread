package stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class outputstream1 {
	public static void main(String[] args) {
		FileOutputStream fs=null;
		try {
			int count,n=512;
			byte buffer[]=new byte[n];
			count=System.in.read(buffer);
			fs=new FileOutputStream("F:\\Java1\\eclipse-workspace\\Thread\\src\\stream\\intputstream1.java");
			fs.write(buffer,0,n);
			fs.close();
		}
		catch(IOException ioe)
		{
			System.out.println("File write error!");
		}
	}

}
