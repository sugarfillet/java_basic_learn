package day06Homework;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class homework3 {

	public static void main(String[] args) throws IOException {

		RandomAccessFile src = new RandomAccessFile("./myfile.txt", "r");
		RandomAccessFile des = new RandomAccessFile("./myfile_copy.txt", "rw");
		
		//单字节
		/*
		int d;
		while((d = src.read())!= -1){
			des.write(d);
		}
		System.out.println("copy successfully");*/
		
		int len ;
		 byte[] b = new byte[1024*10];
		 while((len = src.read(b))!=-1){
			 des.write(b,0,len);
		 }
		System.out.println("copy successfully");
		src.close();
		des.close();
	}

}
