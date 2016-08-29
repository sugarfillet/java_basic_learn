package day06;

import java.io.File;

public class FileDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dir = new File("demos");
		if(!dir.exists()){
			dir.mkdir();
			System.out.println("create "+dir.getName()+" successfully");
		}else{
			System.out.println("the directory exists");
		}
	}

}
