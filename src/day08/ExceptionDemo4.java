package day08;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionDemo4 {

	public void dosome () throws IOException,AWTException{
		
	}
}

class Son extends ExceptionDemo4{

	
	 //不可以抛出父类异常的父类异常
//	public void dosome() throws Exception, AWTException {}
		
	
   //不可以抛出额外异常
//	public void dosome() throws SQLException, AWTException {}
	
	
	//抛出父类异常的子类异常
/*	public void dosome() throws FileNotFoundException, AWTException {
	}*/

	
	


	//抛出父类的部分异常
/*	public void dosome() throws IOException {
		// TODO Auto-generated method stub
	}
*/
	//可以跟父类一样
	/*public void dosome() throws IOException, AWTException {
		
	}*/
	//可以不抛出任何异常
/*	public void dosome(){
		
	}*/
	
	
	
	
	
	
}
