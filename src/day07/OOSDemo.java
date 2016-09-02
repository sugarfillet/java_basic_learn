package day07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * java.io.ObjectOutputStream;
 * 
 * 对象输入流，是一个高级流，作用是可以直接将java中的一个对象转换为一组字节后写出。
 * 这组字节的格式由OOS维护
 * 
 * @author tarena
 *
 */

public class OOSDemo {

	public static void main(String[] args) throws IOException {
		Person p = new Person();
		p.setName("canglaoshi");
		p.setWage(1000);
		p.setGendar("nv");
		List<String> otherInfo  = new ArrayList<String>();
		otherInfo.add("shiyimingyanyuan");
		otherInfo.add("aihaoshixiedazi");
		otherInfo.add("cunjinzhongriwenhuajiaoliu");
		otherInfo.add("guandarenminqunzhongdeqimenlaoshi");
		p.setOtherInfo(otherInfo);
		
		FileOutputStream fos = new FileOutputStream("person.obj");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		/*
		 * OOS 的writeObject方法的作用
		 * 将给定的java对象转换为一组字节后写出
		 * 这里由于oos是装在fos上的
		 * 所以转换的这组字节最终通过fos写入文件
		 * 
		 * 
		 * 如果希望该对象可以被写出；
		 * 那么前提是该对象所属的类必须实现Serializable接口
		 * 
		 * 
		 * 该方法涉及到了两个操作
		 * 1：将对象转换为一组字节
		 * 			即：对象序列化
		 * 2：将该组字节写人到文件中（硬盘中）
		 * 			即：数据持久化
		 * 
		 * 
		 */
		oos.writeObject(p);
		System.out.println("写出对象成功");
		oos.close();
		
		
	}
}
