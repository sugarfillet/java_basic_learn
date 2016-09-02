package day07;

import java.io.FileInputStream;
import java.io.IOException;

public class FISDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("fos.txt");
		
		byte [] data = new byte[50];
		
		int len = fis.read(data);
		String str = new String(data ,0 , len, "utf-8");
		System.out.println(str);
		
		fis.close();
		
		

	}

}
