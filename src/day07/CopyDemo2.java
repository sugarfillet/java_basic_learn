package day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("kali.png");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("kali_bc.png");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		long start = System.currentTimeMillis();
		
		/*
		 * 缓冲流内部维护一个缓冲区
		 * 当我们调用下面read（）方法读取一个字节时，
		 * 实际上缓冲流会让fis读取一组字节并存入缓冲流自身内部的字节数组中，
		 * 然后将第一个字节返回
		 * 当我们再次调用read（）方法读取一个字节时，缓冲流会将字节数组中的第二个字节返回，以此类推
		 *	直到该数组中所有字节都被读取过后才会再次读取一组字节。
		 * 实际上还是通过提高每次读取数据的数量来减少读取的词数提高的读取效率
		 * 
		 * 
		 */
		
		int len = -1;
		while((len = bis.read()) != -1){
			bos.write(len);
		}
		long end = System.currentTimeMillis();
		System.out.println("copy ok,the time consumed is " + (end -start )+ "ms");
		bis.close();
		fis.close();
		bos.close();
		fos.close();
		
		
	}

}
