package day08;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * 缓冲字符流
 * 
 * 内部维护缓冲区（字符数组）
 * 读写效率高
 * 并且可以按行读写字符串
 * 
 * BufferedWriter ,BufferedReader
 * 
 * java.io.PrintWriter;
 * 
 * 常用的缓冲字符输出流，内部自动处理BufferedWriter
 *  来完成缓冲操作，并且PrintWriter具有自动行刷新功能
 *  
 * 
 * 
 * 
 * @author tarena
 *
 */

public class PWDemo1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		/**
		 *  PrintWriter提供了丰富的构造方法
		 *  
		 *  PrintWriter(String path);
		 *  PrintWriter(File file);
		 * 
		 * 
		 */
		PrintWriter pw = new PrintWriter("pw.txt");
		pw.println("abcedfg");
		pw.println("higklmn");
		pw.println("opqrstuvwxyz");
		
		System.out.println("写出完毕");
		pw.close();
		
		
		
		
	}

}
