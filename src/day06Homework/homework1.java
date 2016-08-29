package day06Homework;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class homework1 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("."+File.separator+"myfile.txt");
		if(!file.exists()){
			
			file.createNewFile();
			System.out.println("create "+file.getAbsolutePath()+"successfully");
		}else{
			System.out.println(file.getAbsolutePath()+"exists");
		}
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.lastModified());
		System.out.println(new Date(file.lastModified()));
		
	}
	
	
}
