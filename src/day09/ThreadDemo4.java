package day09;

public class ThreadDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
 
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().isInterrupted());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(Thread.currentThread().isDaemon());
		dosome();
		
		new Thread(){
			public void run(){
				System.out.println(Thread.currentThread().getName());
				System.out.println(this.getId());
				System.out.println(this.getPriority());
				System.out.println(this.isInterrupted());
				System.out.println(this.isAlive());
				System.out.println(this.isDaemon());
			}
		}.start();
	}

	public static void dosome(){
		System.out.println(Thread.currentThread().getName());
	
		
	}
}
