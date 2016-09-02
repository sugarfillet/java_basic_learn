package day08;
/**
 * finally的使用
 * 是否抛出异常都一定被执行。
 * finally块中通常会用来诸如做释放资源等操作。
 * 
 * @author tarena
 *
 */
public class ExcepitonDemo2 {

	public static void main(String[] args) {
		System.out.println("start");
		try {
			String str = null;
			System.out.println(str.length());
		}
		catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("  我都会被输出");
		}
		
	}
}
