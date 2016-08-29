package day06Homework;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class homework2 {

	public static void main(String[] args) throws IOException {
		
//		File file = new File("./file.txt");
//		file.createNewFile();
//		file = new File("./dir");
//		file.mkdir();
//		file.delete();
//		file.delete();
		
		File file = new File(".");
		File[] files = file.listFiles();
		for(File x : files){
			System.out.print("  "+x.getName());
			System.out.println();
		}
		System.out.println("----------------------------");
		FileFilter filter = new FileFilter(){

			public boolean accept(File pathname) {
				return pathname.isFile();
			}};
		
			files = file.listFiles(filter);
			for(File x : files){
				System.out.print("  "+x.getName());
				System.out.println();
			}
	}
}
