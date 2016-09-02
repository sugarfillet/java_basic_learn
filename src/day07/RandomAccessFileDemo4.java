package day07;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");
		String str = ""
				+ "地上霜。";
		
		byte[] data = str.getBytes("gbk");
		System.out.println(data.length);
		raf.write(data);
		
		System.out.println("pointer: "+raf.getFilePointer());;
		
		raf.seek(0);
		System.out.println("pointer: "+raf.getFilePointer());;
		
		int len;
		byte [] buf = new byte[30];
		
		 len = raf.read(buf);
		String s = new String(buf ,0 , len,"gbk");
		System.out.println(s);
		
		raf.close();
	}

}
