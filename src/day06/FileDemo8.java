package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * 
 * 获取一个目录中的部分子项目
 * File支持一个重载的listFiles方法
 * 要求传入一个文件过滤器，这样只会返回该目录中满足该过滤器要求的子项
 * @author root
 *
 */
public class FileDemo8 {

	public static void main(String[] args) {

		/*
		 * 仅仅获取当前目录子中的所有文件
		 */
		
		File dir = new File(".");
		
		FileFilter filter = new FileFilter(){

			public boolean accept(File pathname) {
				System.out.println("正在过滤:"+pathname.getName());
				return pathname.getName().matches("\\.\\w+");
			}};
			
		File[] subs = dir.listFiles(filter);
		for(File sub : subs){
			System.out.println(sub);
		}
		
		
	}

}
