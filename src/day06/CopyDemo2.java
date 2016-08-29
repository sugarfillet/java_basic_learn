package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 * 若希望提高读写效率，需要提高每次读写的数据量来减少读写次数
 * 从而达到提高读写效率的目的
 * 
 * @author root
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile src = new RandomAccessFile("hello.mp3","r");
		RandomAccessFile des = new RandomAccessFile("hello_backup.mp3","rw");
		
		/*
		 * int read(byte[] d)
		 * 一次性读取到给定的数组总长度的字节量
		 * 并存入到该数组中，返回值为实际读到的字节量
		 * 若返回值为-1,则表示读取到了文件末尾{{eof}}
		 */
		int len = 01;//记录每次读到的实际字节量	
		byte[] buf = new byte[1024*10];//10k
	
		long start = System.currentTimeMillis();
		
		int count = 0; 
		while((len = src.read(buf))!= -1){
			/**
			 * void write(byte[] d);
			 * 将给定的自己数组中的所有自节一次性改写入到文件中
			 * 
			 * void write(byte[] d , int index , int length);
			 * 将给定的自己数组中从下表为index 的字节开始
			 * 连续len个字节一次性写入到文件中
			 * 
			 */
			des.write(buf,0,len);			
			count ++;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("复制完毕!耗时："+((end - start) )+ "ms，读取次数 ： "+count+"次"
				+ "");
	}

}
