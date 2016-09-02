package test;

import java.util.Scanner;

public class FabFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] fab = new int[1000];
		fab[0] = 1 ;
		fab[1] = 1 ;
		for(int i = 2 ;i< fab.length ; i++){
			fab[i] = fab[i-1]+fab[i-2];
		}
		Scanner scan = new Scanner(System.in);
	
		while(true){
			System.out.println("请输入一个数...");
			int n = scan.nextInt();
			System.out.println(fab[n-1]);
			
		}
	}

}
// 1,1,2,3,5,8