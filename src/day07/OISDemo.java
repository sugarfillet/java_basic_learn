package day07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * java.io.ObjectInputStream;
 *	对象输入流，是一个高级流，作用是可以读取一组*字节*---然后将其还原为其描述的---*对象*
 *	需要注意的是，转换的这些字节必须是ObjectOutputStream将一个对象转换的字节序列
 *	否则会出错
 *
 * @author tarena
 *
 */
public class OISDemo {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person p = (Person) ois.readObject();
		
		System.out.println(p.toString());
		
		ois.close();
		fis.close();
		
		
	}

}
