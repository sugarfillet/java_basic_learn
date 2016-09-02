package day10;
/**
 * 多线程并发  就是 各自干及自己的
 * 但是不可避免要   同时访问临界资源
 * 又由于	线程切换的时机是不可控制的
 * 就会造成  整个线程（程序）的逻辑混乱
 * 
 * 
 * resolution： 临界资源互斥访问（lock）   “排队”
 * 
 *
 * @author tarena
 *
 */



public class SyncDemo {

	public static void main(String[] args) {


		final Table table = new Table();
		
		Thread t1  = new Thread(){
		
			public void run(){
			
				while(true){
					
					System.out.println(this.getName()+"   beans "+table.getBean());
				
			}
			
		}};
		Thread t2  = new Thread(){
			
			public void run(){
				
				while(true){
					System.out.println(this.getName()+"   beans "+table.getBean());
				}
				
			}
			
		};
		t1.start();
		t2.start();
		
	}

}


class Table{
	private int beans = 20;
	/**
	 * synchronized 修饰符  同步方法 （互斥方法）
	 * 多个线程互斥访问临界资源
	 * 排队访问
	 * @return 
	 * 
	 * @return
	 */
	public   synchronized int getBean(){
		if(beans  == 0){
			throw new RuntimeException("NO BEAN");
			
		}
		//模拟到这里线程发生切换
		Thread.yield();
	
		return beans --;
	};
}
