package day07;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.SynchronousQueue;

/**
 * 缓冲输入流写出数据
 * 
 * @author tarena
 *
 */
public class BOSDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fos = new FileOutputStream("bos.txt");
		 BufferedOutputStream bos = new BufferedOutputStream(fos);
		 
		 bos.write("woaitianamen".getBytes());
		 
		 System.out.println("写出完毕");
		 /**
		  * flush();
		  * 方法可以强制将缓冲区已有的数据一次性写出，
		  * 这样可以提高及时性，但是频繁操作会导致写出次数提高降低写出效率
		  * 
		  * 
		  */
		 bos.flush();
		 
		 
	}

}
