package day06;

import java.io.File;
import java.util.Scanner;

public class FileDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("./createAFile");
		if(file.exists()){
			while(true){
				
				System.out.println("确定删除"+file.getAbsolutePath()+"么（yes/no）");
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine();
				input = input.trim();
				
				if("yes".equals(input)){
					
					file.delete();
					System.out.println("文件"+file.getAbsolutePath()+"已删除");
					break;
					
				}else if("no".equals(input)){
					break ;
				}else{
					continue;
				}
				
				
			}
			
		}else{
			System.out.println("该文件不存在");
		}
		
	}

}
