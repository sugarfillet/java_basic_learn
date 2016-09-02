package day09;

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  启动线程要调用start方法
		 *  而不要直接调用run方法
		 *  
		 *  start （）；快速执行 将线程列入就绪队列 ( runable 状态)
		 *  当线程第一次获取cpu时间就自动调用run方法
		 * 
		 * 
		 */
		new MyThread1().start();;;
		new MyThread2().start();;;
	
	}

}
/**
 * 第一种创建线程的方式存在两个不足：
 * 1：由于java是单一继承  这就导致当前类如果继承了Thread就不能再继承其他类
 *      这在实际开发中会出现继承冲突,因为当前类往往会继承其他的类来复用其方法 
 * 2：线程内部重写了run方法 定义了线程任务 
 * 		 导致当前线程与执行的任务有一个耦合关系 
 *		 这就导致线程的可以重用性变得很差
 * 
 * 
 * 
 * 
 * @author tarena
 *
 */
class MyThread1 extends Thread{

	@Override
	public void run() {
		
		for(int i = 0 ; i < 1000 ; i++){
			System.out.println("你是谁呀？");
		}
	}
	
}
class MyThread2 extends Thread{

	@Override
	public void run() {
		
		for(int i = 0 ; i < 100 ; i++){
			System.out.println("我是查水表的");
		}
	}
	
}