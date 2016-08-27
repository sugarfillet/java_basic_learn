package day02Homework;

public class homework23 {

	public static void main(String[] args) {
		

		String str = "123afdsf,45sfsf6,7dsfsf89fds,01sdff2fsfsf";
		String reg = ",";
		
		String []  splits = str.split(reg);
		
		for(String x : splits){
			
			System.out.println(x);
		}
		
		String regex = "[a-zA-Z]+";
		String replaceStr = "#char#";
		
		
		String sttt = str.replaceAll(regex, replaceStr);
		System.out.println(sttt);
		
		
		
	
	}
}
