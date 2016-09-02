package day08;
/**
 * java 异常捕获机制中
 * try{}catch(){}
 * try{可能异常的代码}
 * catch(捕获异常){结局异常}
 * 
 * 
 * @author tarena
 *
 */
public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("START");
		/**
		 * 当JVM运行到某句出错的代码
		 * 发现异常  创建异常对象   将程序的执行情况放入对象  并返回异常对象
		 * 
		 * if(has try) {把异常赋值给catch的异常引用，继续程序的执行}：正常结束
		 * else { 终止程序的执行}：异常结束
		 * 
		 * catch(){}+可以catch多个异常，并处理  
		 * Exception 是所有异常的父类  
		 * 最末尾catch(Exception e) 什么异常都可以捕获到  防止程序的终止
		 * 
		 *  捕获异常(try)并处理(catch)完了之后  即 跳出 catch 块儿  往下执行
		 * 
		 */
		
		try{
			String str = "" ;
			System.out.println(str.length());
//			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			System.out.println("the last sentance in bolck\"try\"");
		}catch( NullPointerException e ){
			System.out.println("NullPointerException");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException");
		}catch(Exception e){
			System.out.println("反正就是出了个错");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("END");
		
	}

}
