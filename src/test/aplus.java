package test;
/*
 * 
 * 
 * 
 */
public class aplus {

	public static void main(String[] args) {
		
		int n = 5;
		int sum = 0;
		int t = 0 ; 
		for(int i = 0 ; i < n ; i++){
			t = t*10 + n;
			sum = sum + t;
			if(i < n-1){
				
				System.out.print(t + "+");
			}else{
				System.out.print(t);
			}
		}
		System.out.println( " = "+sum);
	}
	
}
