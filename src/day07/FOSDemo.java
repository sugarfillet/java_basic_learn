package day07;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/**
		 * 默认的构造方法是覆盖写操作，
		 * 
		 * 构造时候：加入 true 为追加写
		 * 
		 */
		FileOutputStream fos = new FileOutputStream("fos.txt");
		
		fos.write("简单点，说话的方式简单点".getBytes());
	
		
		

		
		
	}

}
