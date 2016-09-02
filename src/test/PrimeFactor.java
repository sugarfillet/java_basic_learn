package test;
/**
 * 
 * 求一个数的素数因子
 * 			|----------------------------|-------	|
 * 1.如果 n == 2 ；输出2				|			|
 * 2.如果 n%2 == 0  ; n = n/2; 求f(n)		|	
 * 3.如果 n%2 != 0 ; 2+1 =3 ;求f(n)------ |
 * 
 */
import java.util.Scanner;

public class PrimeFactor {
	static int prime ;
	public static void main(String[] args) {

		while(true){
			Scanner scan = new Scanner(System.in);
			System.out.println("please input a number...");
			int n = scan.nextInt();
			System.out.print(n+" = ");
			prime = 2;
			getFactor(n);
			System.out.println();
		}
		
	}
	public static void getFactor(int n){
		
		
		if(n == prime){
			System.out.println(prime);
		}else if(n>prime && n%prime == 0 ){
			System.out.print(prime+"*");
			n = n/prime;
			getFactor(n);
		}else if (n > prime && n%prime != 0){
			prime++;
			getFactor(n);
		}
		
	}

}
