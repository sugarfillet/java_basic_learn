package day08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * java根据读写数据单位不同，将流分为：
 * 字节流，字符流
 * 字节流的最小读写单位为1个字节
 * 字符流的最小读写单位为1个字符：2个字节
 * 
 * 字符流虽然是以字符为单位，但是底层实际上还是要以字节形式读写
 * 所以字符流 可以把字符转为字节  字节转为字符
 * 所有的字符流都是高级流 方便我们读写字符数据
 * 无需再关心字符与字节的相互转换
 * 
 * @author tarena
 *
 */
public class OSWDemo {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("osw.txt");
		/**
		 * OutputStreamWriter(OutputStream out,String code);
		 * 重载的构造方法：
		 * 将给定的字节输出流  转换为  字符输入流 的同时
		 * 指定转换的编码方式
		 * 
		 * 
		 */
		OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");
		
		osw.write("没关系,你又不用给我机会");
		osw.write("反正我还有一生可以浪费");
		
		System.out.println("写出完毕");
		osw.close();
		
				
		File file = new File("osw.txt");
		System.out.println(file.length());
		
	}

}
