package day06Homework;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class homework4 {

	public static void main(String[] args) throws IOException {

		File file = new File("./raf.txt");
		RandomAccessFile src = new RandomAccessFile(file, "rw");
//		file.createNewFile();
		
	/*	src.writeInt(Integer.MAX_VALUE);
		src.write(10);
		src.writeLong(Long.MAX_VALUE);
			*/
		int d = 0;
		int count =0;
		while((d = src.read()) != -1){
		
			System.out.printf("%#x",d);
			count++;
			if(count == 4 || count ==5){
				System.out.println();
			}
		}
		
		
		src.close();
		
	}

}
