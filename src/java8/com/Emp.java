package java8.com;

public class Emp {

	int salary;
	String name;

	Emp(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}
	public  String  toString() {
		return salary + "" + name ;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
