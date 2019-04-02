package stream;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
	public static void main(String[] args) {
		try {
			File f = new File("A.txt");
		
			if (f.exists()) {
				System.out.println("File already existed!");
			} else {
				FileWriter fw = new FileWriter(new File("A.txt"));
				fw.write("nuijoo");
				fw.close();
				System.out.println("File create successfully!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
/*
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFileDemo2 {
	public static void main(String[] args) {
		try {

			FileWriter fw = new FileWriter(new File("A.txt"), true);
			fw.write("hello\n");
			fw.close();
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}*/
