package day06;

import java.io.File;

public class FileDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 
		 * 当前目录下创建a/b/c/d/e/f目录
		 */
		File dir = new File("a/b/c/d/e/f");
		if(!dir.exists()){
			dir.mkdirs();
			System.out.println("目录 "+dir.getAbsolutePath()+"创建成功");
			
		}else{
			System.out.println("目标目录已存在");
		}
	}

}
