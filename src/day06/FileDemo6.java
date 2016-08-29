package day06;

import java.io.File;

/**
 * 删除目录
 * @author root
 *
 */
public class FileDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dir = new File("a");
		
		if(!dir.exists()){
		
			dir.delete();
			System.out.println("删除完毕");
		}
	}

}
