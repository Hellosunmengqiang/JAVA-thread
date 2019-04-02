package stream;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFile {
public static void main(String[] args) {
	try {
		Scanner cin=new Scanner(new File("A.txt"));
		while(cin.hasNextLine()){
			System.out.println(cin.nextLine());
		}
		cin.close();	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
