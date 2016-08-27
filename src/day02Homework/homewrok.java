package day02Homework;

public class homewrok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = {"24334","1.2","adf"};
		String[] type = {"整数","小数","不是数字"};
	
		
//	String regex = "\\d+";
	String regex = "\\d+\\.\\d+";
//	String regex = "\\d+";
		
		
	for(int i = 0 ; i < str.length ; i++){
		if(str[i].matches(regex)){
			System.out.println("the "+(i+1)+"th string is "+type[i]);
			System.out.println(Double.parseDouble(str[i])*10);
		}	
	}
		
		
	}

}
