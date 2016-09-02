package day09;
/**
 * 进程的结束   前台线程结束
 * 
 * 后台线程需要独立设置  默认创建前台线程
 * 
 * @author tarena
 *
 */
public class ThreadDemo8 {

	public static void main(String[] args) {
		
		/*
		 * rose:前台线程
		 */
		Thread rose = new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println(
						"rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("rose:啊啊啊啊啊AAAAAAaaaa.....");
				System.out.println("音效:噗通!");
			}
		};
		
		Thread jack = new Thread(){
			public void run(){
				while(true){
					System.out.println(
						"jack:you jump!i jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		//在线程启动前设置
		jack.setDaemon(true);
		
		rose.start();
		jack.start();
		
		
	}
}
