package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 * java.io.RandomAccessFile;
 * 用户读写文件数据，
 * 其给予指针对文件进行读写
 * 创建RandomAccessFile有两种常用模式
 * 1：“r”，即只读模式  仅仅对文件数据进行读取操作
 * 2：“rw”， 即读写模式，对文件数据可以编辑
 * 
 * @author root
 *
 */
public class RandomAccessFlieDemo1 {

	public static void main(String[] args) throws IOException {

		/*
		 * RandomAccessFile(File f , String mode);
		 * RandomAccessFile(String path , String mode );
		 * 
		 * mode -->"r" "rw"
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
		/**
		 * void write(int d);
		 * 写入一个字节，
		 * 写入的是该整数对应的2进制中的“低八位”
		 *  
		 * 
		 */
	
		
		raf.write(97);
		raf.write(98);
		raf.write(99);
		
		raf.close();
	}

}
