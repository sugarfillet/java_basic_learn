package day08;

public class TestPerson {

	public static void main(String[] args) throws IllegalAgeException {
		// TODO Auto-generated method stub

		Person p = new Person();
		/**
		 * 当调用一个含有异常抛出声明的方法时：
		 * 编译器要求必须处理该方法声明可能抛出的异常：
		 * 处理手段有两种：
		 * 1：try-catch
		 * 2：在当前方法上继续使用throws 声明可能抛出的异常
		 * 
		 * 永远不在main方法上 丑话说前头
		 */
		p.setAge(101);
		System.out.println("aget : "+p.getAge());
		
	}

}
