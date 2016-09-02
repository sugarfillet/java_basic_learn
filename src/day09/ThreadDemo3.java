package day09;
/**
 * 
 * 线程的两种创建方式： 1》继承 Thread类 两个缺点：不可extends其他类  && 与同任务其他线程的耦合（依赖）性 
 * 2》实现runnable接口  覆写run（） 
 */
public class ThreadDemo3 {

	public static void main(String[] args) {

		Thread t2 = new Thread(){
			public void run(){
				System.out.println("extends thread");
			}
		};
		
		t2.start();
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("implements runnable");
			}});
		
		t1.start();
	}
}
