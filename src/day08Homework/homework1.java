package day08Homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class homework1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("fis.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String line ;
		String all = "";
		while((line = br.readLine()) != null){
			all += line;
			System.out.println(line);
		}
		
		OutputStream fos = new FileOutputStream("fis.txt",true);
		PrintWriter pw = new PrintWriter(fos,true);
		pw.println(all);
		pw.close();
		double d1 = 3.0 - 2.6;
		System.out.println(d1);
	}

}
