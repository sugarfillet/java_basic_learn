package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 自动行刷新
 * 
 * 重载的一个构造方法 new PrintWriter(output op ，boolean flush);
 * 
 * 
 * 自动行刷新 就是使用println方法时写出一行字符串后会自动flush
 * 
 * @author tarena
 *
 */
public class PWDemo3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(System.in);
		
		PrintWriter pw = new PrintWriter(
				new OutputStreamWriter(
						new FileOutputStream("note.txt")));
				
		System.out.println("清输入内容：");
		while(true){
			String line = scanner.nextLine();
			if("exit".equals(line)){
				
				System.out.println("债见");
				break;
			}
			pw.println(line);
			pw.flush();
			
		}
		
		pw.close();
		
	}
}
