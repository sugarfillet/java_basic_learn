package day04Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class homework4 {

	public static void main(String[] args) {
		List<Integer>  list = new LinkedList<Integer>();
		
		for(int i  = 0 ; i< 10 ; i++){
			list.add(i);
		}
		
		List<Integer> sub = list.subList(3, 7);
		
		for(int i = 0 ; i< sub.size() ; i++){
			
			sub.set(i, sub.get(i)*10);
			
		}
		System.out.println(sub);
		System.out.println(list);
		
		Integer[] i = list.toArray(new Integer[list.size()]);
		
		for(Integer x : i){
			System.out.println(x);
		}
		
		String[]  strs = new String[]{"one","two","three"};
		
		List<String>  lll = Arrays.asList(strs);
		
		System.out.println(lll);
		
//lll.clear();
		
		List<Integer>  xxx = new ArrayList<Integer>();
		for(int  j = 0 ; j< 10 ;j ++){
			
			xxx.add(new Random().nextInt(10000000));
			
		}
		
		System.out.println(xxx);
		
		Comparator<Integer> com= new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.toString().length() - o1.toString().length();
				
			}};
		
		
		Collections.sort(xxx,com);

		System.out.println(xxx);
		
		
		
		
		
		
	}
}
