package day05Homework;

public class Person 
//implements Comparable<Person>
{

	
	private String name;
	private int age;
	private int salary;
	public Person(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public String toString(){
		
		return "name "+name+": age :"+this.age+" salary :"+this.salary+"";
		
	}
//	@Override
//	public int compareTo(Person o) {
//
//		
//		return this.age- o.age;
//	}
//	
	
	public boolean equals(Person obj){
		if(obj == null){
			return false;
		}
		
		if(!(obj instanceof Person)){
			return false;
		}
		
		if(this.name == obj.name ){
		return true;
		}else{
			return false;
		}
}
	

}
