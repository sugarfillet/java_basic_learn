package day05Homework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> que = new LinkedList<Integer>();
		
		que.offer(1);
		que.offer(5);
		que.offer(4);
		que.offer(2);
		que.offer(3);
		
		/*
		Iterator it = que.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		for(Integer x : que){
			System.out.println(x);
		}
		*/
		
		while(que.size()>0){
			System.out.println(que.poll());
		}
		System.out.println(que.peek());
		System.out.println(que.poll());
	
		
		


		
		
	}

}
