package test;

public class PerfectInt {


	public static void main(String[] args) {


	for(int i = 1 ; i < Integer.MAX_VALUE ; i ++){
		if(isPerfect(i)){
			System.out.println(i);
		}
	}
	}
	static boolean isPerfect(int n ){
		int sum = 0;
		for(int i = 1; i < n ; i ++ ){
			if(n%i == 0){
				sum += i;
			}
		}
	return n == sum;	
	}
/*
	private static void  FactorSum(int n) {
		
		
		if(n == prime ){
			sum += prime;
		}else if (n > prime && n % prime == 0){
			n /= prime;
			sum += prime;
			FactorSum(n);
	
		}else if ( n > prime && n % prime != 0){
			prime ++;
			FactorSum(n);
		}
		
		
	}*/

}
