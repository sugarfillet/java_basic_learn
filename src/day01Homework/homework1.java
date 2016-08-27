package day01Homework;

public class homework1 {

	public static void main(String[] args) {
		String str = "helloworld";

	System.out.println(str.length());
	System.out.println(str.indexOf("o"));
	System.out.println(str.substring(0, 5));
	System.out.println(str.substring(5));
	System.out.println();
	char cc = str.charAt(6);
	
	
	StringBuffer sb = new StringBuffer();
	sb.append("大家好，我是程序员");
	sb.insert(6, "youxiude");
	System.out.println(sb);
	
	
		
	}
	

	
	
}
