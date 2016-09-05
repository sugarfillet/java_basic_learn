package day11;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlParse {

	public static void main(String[] args) throws DocumentException {
		// TODO Auto-generated method stub

		//高级流 用于 解析xml文档
		SAXReader reader = new SAXReader();
		//得到xml文件对象  doc
		Document doc = reader.read(new File("EmpList.xml"));
		//获取xml文档对象的跟节点
		Element root = doc.getRootElement();
		//通过跟节点 逐级解析
		
		String name = root.getName();
		System.out.println("root name : "+name);//list
		
		/**
		 * 解析所有员工信息
		 * 
		 * SAXReader 流获取xml文档对象doc
		 * 获取跟元素
		 * 获取根元素（有且只有一个）下的子元素list
		 * 遍历子元素list 获取每一元素的值 attribute elementText
		 * 存入对象列表
		 */
		List<Element> list = root.elements();
//		System.out.println(list);
		List<Emp> empList = new ArrayList<Emp>();
		
		for(Element empElmt : list){
			int id = Integer.parseInt(empElmt.attribute("id").getValue());
			String empName = empElmt.element("name").getTextTrim();
			int age = Integer.parseInt(empElmt.elementText("age"));
			String gender = empElmt.elementText("gender");
			int salary = Integer.parseInt(empElmt.elementText("salary"));
			
			empList.add(new Emp(id,name,age,gender,salary));
		}
		System.out.println(empList);
	}

}
