package day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池 解决的两个问题：
 * 1.控制线程池的容量
 * 2.
 * 
 * 
 * 
 * 
 * @author tarena
 *
 */
public class ThreadPoolDemo {

	public static void main(String[] args) {
		//固定大小线程
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		//指派5个任务
		for(int i = 1 ; i <= 5 ; i++){
			Runnable run = new Runnable(){
				public void run(){
					Thread t = Thread.currentThread();
					System.out.println(t+"正在执行任务...");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(t+"完成任务.");
					
				}
				
			};
			System.out.println("指派第"+i+"个任务");
			threadPool.execute(run);
	
		}
		/*
		 * 
		 *停止线程池的方法：
		 *shutdown();当线程池的所有任务运行完毕后停止
		 * 
		 */
		threadPool.shutdownNow();
		System.out.println("停止线程池");
		
	}
}
