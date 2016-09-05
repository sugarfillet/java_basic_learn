/*package day11;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XMLPath {

	public static void main(String[] args) throws DocumentException {
		// TODO Auto-generated method stub

		Document doc  = new SAXReader().read(new File("myEmp.xml"));
		
		String path = "/list/emp";
		List<Element> list = doc.selectNodes(path);

		System.out.println(list.size());
//		for(Element ele : list){
//			System.out.println(ele.toString());
//		}
	}

}
*/package day11;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * xpath检索
 * @author adminitartor
 *
 */
public class XMLPath {
	public static void main(String[] args) {
		try {
			SAXReader reader
				= new SAXReader();
			Document doc
				= reader.read(
					new File("myEmp.xml")
			);
			
			/*
			 * Document支持XPath的方法
			 */
			String path = "/list/emp[salary>6000 and gender='女']/name";
			List<Element> list = doc.selectNodes(path);
			for(Element ele : list){
				System.out.println(ele.getText());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

