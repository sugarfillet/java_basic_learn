package day04;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point<Integer>  p1 = new Point<Integer>(1,1);
		
		System.out.println(p1.toString());
		
		p1.setX(1);
		
		int x1 =  p1.getX();
		
		System.out.println(x1);
		
		Point p2 =  p1;
		p2.setX("2222");
		System.out.println(p2.getX());
		System.out.println(p2);
		
		
		System.out.println(p1);
		System.out.println(p1.getX() instanceof Integer);
		
	}

}
