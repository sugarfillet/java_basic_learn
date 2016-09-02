package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Comparator;

/**
 *final 常量的修饰符
 *finally 实在异常捕获或者处理结束后的执行块儿
 *finalize Object类的方法 析构函数
 * @author tarena
 *
 */
public class ExceptionDemo3 {
	public static void main(String[] args) {
	
		
	
		FileOutputStream fos = null;
	try {
		fos = new FileOutputStream("fos.txt");	
		fos.write("hello".getBytes());
		
	} catch (Exception e) {
		System.out.println("写出失败");
	}finally{
		if(fos!=null){
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
}
