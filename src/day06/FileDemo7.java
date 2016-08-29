package day06;
/**
 * 1:	编写一段代码，要求1+2+3+4....+100
 * 	每次计算后输入一次结果
 * 	用递归
 * 
 * 2：一个人买汽水 
 * 	1块钱买一瓶汽水
 * 	3个瓶盖可以换一瓶汽水
 * 	2个空瓶可以换一瓶汽水
 * 	20块钱 可以喝多少？
 * 
 * 
 */
import java.io.File;

public class FileDemo7 {

	public static void main(String[] args) {
		
		
		File fd = new File("./a");
		if(fd.exists()){
			
			delete(fd);
		}else{
			System.out.println("不存在");
		}
		
	}
	
/*	public static void delete(File f){
		
		if(f.isDirectory()){
			File[] subs = f.listFiles();
			for(File sub : subs){
				delete(sub);
			}
		}
		f.delete();
		System.out.println(f.getName()+" 已经被删除");
	}
	*/
	public static void delete(File fd){
		
		if(fd.isDirectory()){
			
			File [] files = 	fd.listFiles();
			
			if(files.length == 0){
				fd.delete();
				System.out.println();
			}else{
				for(File f : files){
					delete(f);
				}
				
			}
		}else if(fd.isFile()){
			fd.delete();
		}
			
			
	}
}
