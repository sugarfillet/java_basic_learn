package day09;
/**
 * 
 * 静态同步方法  属于类  互斥访问 
 * 
 *即使是不同的对象 也会同步（互斥访问）
 * 
 * 
 * @author tarena
 *
 */
public class SyncDemo3 {
	
	
	public static void main(String[] args) {
		
		Foo f1 = new Foo();
		Foo f2 = f1;
	 new Thread(){public void run(){
			Foo.dosome();
		}}.start();;
		
		 new Thread(){public void run(){
			Foo.dosome();
		}}.start();;
	}
	
	
	
}
class Foo{
	
	public synchronized static void dosome(){
		
		System.out.println(Thread.currentThread()+"start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread()+"end");
		
	}
	
}