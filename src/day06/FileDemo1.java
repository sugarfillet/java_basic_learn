package day06;

import java.io.File;
import java.util.Date;

/**
 * cpu : 纯电路 
 * 
 * memory:  电路  断电   
 * 
 * tape:磁性介质 
 * hardware: 磁性介质
 * 
 * 厨师--配菜桌-仓库
 * 
 * java.io.File;
 * 该类用于描述文件系统中的一个文件或者目录
 * File可以
 * 1.访问文件或者目录的属性信息 
 * 2.访问一个目录中的所有子项
 * 3.操作文件或者目录（创建、删除）
 * 
 * File不可以：
 * File不可以访问文件数据（contents）
 * 
 * @author root
 *
 */
public class FileDemo1 {

	public static void main(String[] args) {
		
		/**
		 * 路径尽量不屑绝对路径
		 * 常用的是  使用  相对路径
		 * 
		 * 1：相对与项目目录（当前目录）
		 * 2： 相对于类加载目录（实际开发更常用）
		 * 
		 * 
		 */
//	File file = new File("./readme");
//		System.out.println(File.separator);
		
		
		
	   File file = new File("."+File.separator+"readme");
	   /**
	    * 获取当前文件的属性信息：
	    */
	   //是否存在
		System.out.println(file.exists());
		//get文件名
		System.out.println(file.getName());
		//get文件大小（B）
		System.out.println(file.length());
		System.out.println(file.getAbsolutePath());
		//获取上级目录  并列出同目录下的所有文件
//		file = file.getParentFile();
//		System.out.println(Arrays.asList(file.list()));
		//最后修改时间
		long time = file.lastModified();
		System.out.println(new Date(time));
		//tests files if  可读 可写 可执行
		
		System.out.println(file.canRead());
		
		
		

		
		
	}
}
