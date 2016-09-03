package test;
/**
 * 辗转相除法：
 * 
 * int m ,int  n ;
 * 
 * 15 9 
 * 15%9 = 6;
 * 9%6 = 3;
 * 6%3 = 0;
 * 
 * 3就是 MAX COMMON DIVISOR()
 * 15*9 / 3   max  common multiple（）；
 * 
 * @author tarena
 *
 */
public class MaxDivisor {

	public static void main(String[] args) {

		int m = 15,n = 9;
		int r  ;
		//1..while
		
		while(n != 0 ){
			r = m%n;
			m = n;
			n = r;
		}
		System.out.println(m);
		
		//2..do{} while(); 跟while 没什么太大的区别  只不过是在while前先执行了一次 判断条件都是一样的   
/*		do{
			r = m%n;
			m = n;
			n = r;
		}while(n != 0);
		
		System.out.println(m);*/
		
		//3..recurrence
	/*	System.out.println(gmcd(m,n));*/
		
	}

	private static int gmcd(int m, int n) {
		if( n != 0){
			return gmcd(n,m%n);
		}else{
			return m;
		}
		
	}

}
