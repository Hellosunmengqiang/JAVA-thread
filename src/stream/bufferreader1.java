package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class bufferreader1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		File f1=new File("F:\\Java1\\eclipse-workspace\\Thread\\src\\stream\\intputstream.java");
		File f2=new File("F:\\Java1\\eclipse-workspace\\Thread\\src\\stream\\bufferreader2.java");
		Writer out=null;
		Reader in=null;
		out=new OutputStreamWriter(new FileOutputStream(f2));
		in=new  InputStreamReader(new FileInputStream(f1));
		
		char c[]=new char[1024];
		in.read(c);
		System.out.println(c);
		out.write(c);
		out.close();
		in.close();
		
		
	}

}
