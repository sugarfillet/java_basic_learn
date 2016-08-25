package day04;
/**
 * 
 *泛型  jdk1.5 新特性
 *
 *
 *泛型又称为参数化类型  是将属性，方法 参数，方法返回值类型
 *的定义权 交给了 调用者  使得调用者在实际应用 当前类时可以将实际类型 指定 以更满足其需求
 * 
 * 泛型让编译器做了两件事
 * 
 * 1：当给泛型赋值时，编译器会检查实际数据与泛型类型是否一致，不一致则编译不通过
 * 
 * 2：当获取泛型的值时，那么编译器会补充造型代码做类型转换
 * 而泛型的实际类型会被编译器改为 ObJect
 * @author root
 *
 * @param <T>
 */
public class Point <T>{

	private T x;
	private T y ;
	
	
	
	public Point(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}
	

	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
		
	public String  toString (){
		
		return "("+this.x+","+this.y+")";
	}
	
	
	
}
