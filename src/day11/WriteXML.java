package day11;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.RowSetInternal;
import javax.sql.rowset.WebRowSet;
import javax.sql.rowset.spi.XmlWriter;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import day11.Emp;

public class WriteXML {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		List<Emp> empList = new ArrayList<Emp>();
		
		empList.add(new Emp(1,"张三",22,"男",1000));
		empList.add(new Emp(2,"李四",23,"女",2000));
		empList.add(new Emp(3,"张小三",24,"男",3000));
		empList.add(new Emp(4,"李小四",25,"女",4000));
		
		//create an empty xml doc
		Document doc = DocumentHelper.createDocument();
		//create root(list)
		Element root = doc.addElement("list");
		
		for(Emp emp : empList){
			//create list->emp
			Element empEle = root.addElement("emp");
			//create list->emp->name,age,gender,salary
			Element nameEle = empEle.addElement("name");
			nameEle.addText(emp.getName());
			empEle.addElement("age").addText(String.valueOf(emp.getAge()));
			empEle.addElement("gender").addText(emp.getGender());
			empEle.addElement("salary").addText(String.valueOf(emp.getSalary()));
			//set list->emp(id)
			empEle.addAttribute("id", emp.getId()+"");
			
		}
		//高级专用流 xmlwriter 
		XMLWriter writer = new XMLWriter(OutputFormat.createPrettyPrint()) ;
		writer.setOutputStream(new FileOutputStream("myEmp.xml"));
		writer.write(doc);
		System.out.println("write finished");
		writer.close();
	}

}
