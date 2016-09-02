package day08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * java.io.BufferedReader;
 * 缓冲字符输入流，，，特点：按行读取字符串
 * 
 * 
 * @author tarena
 *
 */
public class BRDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path = "./src/day08/BRDemo.java";
		String regex = "/";
		path = path.replace(regex, File.separator);
		
		FileInputStream fis = new FileInputStream(path);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		
		
		/*
		 *String readLine();
		 * 连续读取若干字符，知道读取到\n
		 * 将换行符之前的所有字符 以一个字符串返回
		 * 返回null，表示读取到文件末尾
		 * 返回的字符串中不含有\n
		 */

		String line;
		while((line = br.readLine())!= null){
			System.out.println(line);
		}
		br.close();
	}

}
