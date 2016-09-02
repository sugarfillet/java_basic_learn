package day10;

/**
 * 
 * 有效的缩小同步范围能够在保证并发安全的前提下提高并发效率
 * 
 * 
 * @author tarena
 *
 */
public class SynchronizedDemo2 {

	public static void main(String[] args) {
		
		Shop   shop = new Shop();
		Thread t1 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}
}
class Shop{
	
	public  void buy(){
		try{
			Thread t = Thread.currentThread();
			System.out.println(t+"picking...");
			Thread.sleep(5000);
			/*
			 * 同步块儿（）
			 * synchronized(同步监视器。。。多个线程的共享资源（对象shop）){
			 * 		需要同步的代码片段。。。
			 * }
			 * 同步块儿  可以更加精确的控制同步范围
			 * 但是若希望保证多个线程不能同时执行需要同步的代码片段
			 * 就要求多个线程看到的同步监视器（即  一个上锁的对象）必须是同一个
			 * 
			 * 
			 * 
			 * 对于成员方法（包括 其方法片段）而言 通常使用this作为同步监视器对象即可
			 * 
			 */
			synchronized (this){
				System.out.println(t+"trying...");
				Thread.sleep(5000);
				
			}
			System.out.println(t+"done.");
			Thread.sleep(5000);
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}
	
}
