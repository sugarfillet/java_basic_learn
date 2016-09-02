package day07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo1 {

	public static void main(String[] args) throws IOException {

		/**
		 *  使用 fis 读取文件流
		 *  使用fos向目标文件中写数据
		 *  
		 *  依次从源文件中读取字节然后写人目标文件完成复制操作
		 */
	
		FileInputStream fis = new FileInputStream("fos.txt");
		FileOutputStream  fos  = new FileOutputStream("fos_copy.txt",true);
		
		int len = -1;
		byte[] data = new byte[1024*10];
		while((len = fis.read(data))!=-1){
			fos.write(data,0,len);
		}
		
		System.out.println("copy ok");
		
		fis.close();
		fos.close();
	}

}
