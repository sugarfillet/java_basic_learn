package day06;

import java.io.File;
import java.io.IOException;

/**
 * 
 * 
 * 
 * 
 * @author root
 *
 */
public class FileDemo2 {

	public static void main(String[] args) throws IOException {
	
		/*
		 * 在当前目录下创建文件
		 * 
		 */
		File file = new File("."+File.separator+"createAFile");
		
		if(!file.exists()){
			
			file.createNewFile();
			System.out.println("创建文件\""+file.getName()+"\"完毕");
		}else{
			System.out.println("同名文件已存在");
		}
		
		
		
	}
}
