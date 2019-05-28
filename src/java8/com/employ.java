package java8.com;

public class employ {
	
	String name;
	int eno,salary;
	employ(String name,int eno,int salary)
	{
		this.name=name;
		this.eno=eno;
		this.salary=salary;
		
	}
	public String toString()
	{
		return name + ':' + eno + ':' + salary;
		
	}
}
