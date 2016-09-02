package day07;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable{

	/**
	 * 
	 * 序列化版本号
	 * 当一个类实现了Serializable接口后，
	 * 这个类会默认生成一个序列化版本号常量，该值会影响反序列化的结果
	 * 
	 * 建议自行维护版本号（自己定义该常量并给定值）
	 * 若不指定，编译期会根据当前类的结构生成一个版本号
	 * 结构不变版本号不变，但是结构变了（属性 ）都会导致版本号改变
	 * 
	 * 发序列化对象时，会检查该对象的版本号，与当前类现在的 版本号是否一致，一致则可以还原
	 * 不一致则反序列化失败
	 * 版本号一致是，就算反序列化的对象与当前累的结构有出入，也会采用兼容模式
	 * 即，仍然有的属性就进行还原，没有的属性被忽略
	 * 
	 */
	private static final long serialVersionUID= 2L;
	private String name ;
	private int wage ;
	private String gendar;
	private transient List<String>otherInfo;
	/*
	 * transient关键字的作用
	 * 当所属类的对象在序列化的时候
	 * 不将自己放入序列化序列
	 * 对象（瘦身）
	 * 
	 * 
	 */
	public Person(){
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}


	public String getGendar() {
		return gendar;
	}

	public void setGendar(String gendar) {
		this.gendar = gendar;
	}

	public List<String> getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(List<String> otherInfo) {
		this.otherInfo = otherInfo;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", wage=" + wage + ", gendar=" + gendar + "]";
	}

	

	
}
