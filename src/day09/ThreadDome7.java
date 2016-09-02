package day09;

public class ThreadDome7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("start");
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
		
	}

}
