package day06Homework;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class homework4 {

	public static void main(String[] args) throws IOException {

		File file = new File("./raf.txt");
		RandomAccessFile src = new RandomAccessFile(file, "rw");
		/*
		 * src 总是在指针当前位置进行读写字节，并且无论进行了读还是写一个字节，
		 * 指针都会自动向后移动到下一个字节的位置
		 * 默认创建出来new RandomAccessFile();时，指针的位置为0，即：文件的第一个字节的位置。
		 * 
		 * 
		 */
		//获取当前指针的位置
		long pos = src.getFilePointer();
		System.out.println("pointer -> "+pos);
		
		src.write(Integer.MAX_VALUE >>> 24);
	    pos = src.getFilePointer();
		System.out.println("pointer -> "+pos);
		
		src.write(Integer.MAX_VALUE >>> 16);
		pos = src.getFilePointer();
		System.out.println("pointer -> "+pos);
		src.write(Integer.MAX_VALUE >>> 8);
		pos = src.getFilePointer();
		System.out.println("pointer -> "+pos);
		src.write(Integer.MAX_VALUE );
		pos = src.getFilePointer();
		System.out.println("pointer -> "+pos);
		src.writeInt(Integer.MAX_VALUE);
		pos = src.getFilePointer();
		System.out.println("pointer -> "+pos);
		src.writeLong(Long.MAX_VALUE);
		pos = src.getFilePointer();
		System.out.println("pointer -> "+pos);
		src.writeDouble(Double.MAX_VALUE);
		pos = src.getFilePointer();
		System.out.println("pointer -> "+pos);
		System.out.println("写入完毕");
		/*
		 * void seek(long pos)
		 * 将指针移动到指定位置
		 */
		src.seek(0);
		pos = src.getFilePointer();
		System.out.println("pointer -> "+pos);
		
		int i1 = src.readInt();
		System.out.println(i1);
		pos = src.getFilePointer();
		System.out.println("pointer -> "+pos);
		
		int i2 = src.readInt();
		System.out.println(i2);
		pos = src.getFilePointer();
		System.out.println("pointer -> "+pos);
		int i3 = src.readInt();
		System.out.println(i3);
		pos = src.getFilePointer();
		System.out.println("pointer -> "+pos);
		
		int i4 = src.readInt();
		System.out.println(i4);
		pos = src.getFilePointer();
		System.out.println("pointer -> "+pos);
		
		double d = src.readDouble();
		System.out.println(d);
		pos = src.getFilePointer();
		System.out.println("pointer -> "+pos);
		
		src.read();
		pos = src.getFilePointer();
		System.out.println("pointer -> "+pos);
		
		
		
		
		
//		file.createNewFile();
	
		
		//.write() 只写入int d 的低八位
		
		
		
		
	/*	src.writeInt(Integer.MAX_VALUE);
		src.write(10);
		src.writeLong(Long.MAX_VALUE);
			*/
//		int d = 0;
//		int count =0;
//		while((d = src.read()) != -1){
//		
//			System.out.printf("%#x",d);
//			count++;
//			if(count == 4 || count ==5){
//				System.out.println();
//			}
//		}
//		
		
		src.close();
		
	}

}
