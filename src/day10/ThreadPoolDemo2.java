package day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		for(int i = 0 ; i < 5 ; i++){
			Handler handler = new Handler();
			threadPool.execute(handler);
			
		}
	}

}

class Handler implements Runnable{

	public void run() {
		Thread t = Thread.currentThread();
		for(int i = 0 ; i < 10 ; i++){
			System.out.println("the "+(i+1)+"th task starts");
			System.out.println("currentThread"+t.getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("the "+(i+1)+"th task ends");
			
			
		}
	}
	
	
}
