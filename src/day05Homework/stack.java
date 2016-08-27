package day05Homework;

import java.util.Deque;
import java.util.LinkedList;

public class stack {

	public static void main(String[] args) {

		Deque<String> stack = new LinkedList<String>();
		
		stack.push("22");
		stack.push("33");
		stack.push("44");
		stack.push("11");
		stack.push("55");
		
		System.out.println(stack.toString());
		System.out.println(stack.getFirst());
		System.out.println(stack.peek());
		
		System.out.println(stack);
		
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		
		System.out.println(stack.poll());
		
	}

}
