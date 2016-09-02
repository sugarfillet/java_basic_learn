package day08;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * pw处理其他流
 * 
 * @author tarena
 *
 */
public class PWDemo2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		/*
		 * 向文件pw1.txt中写出内容
		 * 
		 */
		//获取文件字节流
		FileOutputStream fos = new FileOutputStream("pw1.txt");
		//字节流转换为字符流
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		// 缓冲效果
		BufferedWriter bw = new BufferedWriter(osw);
		//换行
		PrintWriter pw = new PrintWriter("pw1.txt");
		
		pw.write("my");;
		pw.write("precious");;
		pw.write("ha");;
		pw.write("ha");;
		
		System.out.println("写出完毕");
		pw.close();
		
		
		
	}

}
