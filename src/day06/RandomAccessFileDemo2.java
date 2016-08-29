package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo2 {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
		
		/**
		 * int read();
		 * 
		 * 从文件指针当前位置读取该自己，并以10进制的数字形式返回
		 * 若返回值为 -1 ，则表示读取到了文件末尾 
		 * 
		 */
		int d = raf.read();
		System.out.println(d);
		d = raf.read();
		System.out.println(d);
		d = raf.read();
		System.out.println(d);
		d = raf.read();
		System.out.println(d);
		d = raf.read();
		System.out.println(d);
		raf.close();
		
	}

}
