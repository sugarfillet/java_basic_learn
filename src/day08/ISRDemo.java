package day08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * java.io.InputStreamReader;
 * 
 * 字符输入流
 * 
 * 除了 ISR OSW 以外的高级字符流  是不能直接处理字节流fisfos
 * 必须通过ISR OSW进行 字节流 到 字符流的转换   就是一个转换器 
 * @author tarena
 *
 */
public class ISRDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis,"gbk");
		
		/**
		 * int read();
		 * 一次读取一个字符，若返回值为-1 则表示读到末尾
		 * 
		 */
		
		int d = -1;
		while((d = isr.read()) != -1){
			System.out.print((char)d);
		}
		isr.close();
		fis.close();

		
		
	}

}
