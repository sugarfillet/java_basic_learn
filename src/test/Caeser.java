package test;

import java.util.Scanner;

public class Caeser {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入明文：");
		String input = scan.nextLine();
		input = deal(input);;
		System.out.println("输入编码偏移量dx：");
		int dx = scan.nextInt();
		
		StringBuffer sb = new StringBuffer();
		
		
		char[] inputs = input.toCharArray();
		for(char c : inputs){
			sb.append(replace(c,dx));
		}
		System.out.println("密文如下：");
		System.out.println(sb);
		
	}
	public static char replace(char c , int dx){
		char[] letters = {'a','b','c','d','e','f','g','h',
				'i','j','k','l','m','n','o','p','q','r','s','t','u'
				,'v','w','x','y','z'};
		for(int i = 0 ; i < letters.length ; i++){
			if(letters[i] ==  c){
				
				c = letters[(i+dx+letters.length*1000)%letters.length];
				break;
			}
		}
		return  c;
		
	}
	public static String deal(String s){
		String regex = "[^a-zA-Z]+";
		s = s.replaceAll(regex, "");
//		System.out.println(s);
		return s;
	}

}
