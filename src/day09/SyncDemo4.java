package day09;
/**
 * 
 * 互斥锁
 * 
 * synchronized  修饰不同的代码块儿  
 * 只要具有相同的同步监视器（this）
 * 不同的代码块儿  就不会同时执行  互斥
 * 
 * 同步   ： 不同线程同步访问临界资源
 * 互斥    :   不同的代码块儿互斥的被访问
 * 
 *不同线程可以同时访问临界资源 并发 
 *对对象加了锁以后   只能有一个线程可以访问  造成了 多个线程同步访问资源的假象
 *
 * @author tarena
 *
 */
public class SyncDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boo boo = new Boo();
		new Thread(){public void run(){
			
			boo.a();
			
		}}.start();
		new Thread(){public void run(){
			
			boo.b();
			
		}}.start();
	}

}

class Boo{
	public synchronized void  a(){
		System.out.println(Thread.currentThread()+"starta");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread()+"enda");
	}
	public synchronized void b(){
		System.out.println(Thread.currentThread()+"startb");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread()+"endb");
	}
}