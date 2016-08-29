package day06;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("hello.mp3");
		RandomAccessFile src = new RandomAccessFile(f,"r");
		RandomAccessFile des = new RandomAccessFile("hello_backup.mp3","rw");
		long start = System.currentTimeMillis();
		int d ;
		System.out.println("loading");
		int count = 0;
		while((d = src.read())!= -1){
			des.write(d);
			count ++;
			
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕！耗时："+(end - start)+"ms"+" 读取次数："+count +"次 ");
		
		src.close();
		des.close();
		
		
	}

}
