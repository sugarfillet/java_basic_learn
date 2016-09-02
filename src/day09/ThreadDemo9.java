package day09;

import java.time.temporal.IsoFields;

public class ThreadDemo9 {
	public static  boolean isFinished = false;
	public static void main(String[] args) {
		
		
		Thread download = new Thread(){
			
			public void run(){
				
			System.out.println("start");
			for(int i = 0 ; i < 100 ; i++){
				System.out.println("downloading..."+i+"%");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("download finished");
			isFinished = true;
			}
		};
		
		Thread show = new Thread(){public void run(){
			
			try {
				download.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("start show");
			if(!isFinished){
				
				throw new RuntimeException("!isFinished");
			}
			System.out.println("show over");
		}};
		
		download.start();
		show.start();
		
	}
}
