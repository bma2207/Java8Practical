package java8.com;

public class defaultClass implements default_Intra
{
	public void add()
	{
		System.out.println("Hello Overried method in class....");
	}
	public static void main(String []arr)
	{
		defaultClass c=new defaultClass();
		c.add();
	}

}
