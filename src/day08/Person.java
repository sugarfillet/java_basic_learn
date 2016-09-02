package day08;

import javax.management.RuntimeErrorException;

/**
 * 用当前类测试异常的抛出
 * 
 * 
 * @author tarena
 *
 */
public class Person {

	private int age;

	public int getAge() {
		return age;
	}
/**
 * 当一个方法中使用throw抛出某个异常时
 * 要在该方法上声明 throws 可能抛出的异常
 * 
 * 只有一类异常抛出时，编译器不强制要求在方法上使用throws声明该异常的抛出
 * 就是：RuntimeException 及其子类的异常
 * 
 * 
 * 
 * @param age
 * @throws Exception
 */
	public void setAge(int age) throws IllegalAgeException{
		if(age<0 || age >100){
			/*
			 * 主动抛出异常的情况之一：
			 * 满足语法要求，但是不满足业务逻辑要求
			 */
			throw new IllegalAgeException("年龄不合法");
		}
		this.age = age;
	}
	
	
}
