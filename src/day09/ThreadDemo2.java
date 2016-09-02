package day09;
/**
 * 第二种 线程的创建
 * 
 * @author tarena
 *
 */
public class ThreadDemo2 {

	public static void main(String[] args) {
	Runnable r1 = 	new myRunable1();
	r1.run();
	
	Runnable r2 = 	new myRunable2();
	r2.run();
	
	Thread t1 = new Thread(r1);
	t1.start();
	Thread t2 = new Thread(r2);
	t2.start();
		
	}
}
class myRunable1 implements Runnable{

	@Override
	public void run() {
		
		for(int i = 0 ; i < 5 ; i++){
			System.out.println("你是谁呀？");
		}
	}

}
class myRunable2 implements Runnable{

	@Override
	public void run() {
		
		for(int i = 0 ; i < 5 ; i++){
			System.out.println("我是送快递的");
		}
	}

}
