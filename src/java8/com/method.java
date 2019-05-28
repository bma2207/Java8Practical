package java8.com;

interface I
{
	void msg();
}
class a
{
	void msg()
	{
		System.out.println("Hello Msg");
	}
}

class method
{
	public static void main(String[] arr)
	{
		a obj =new a();
		I o =(obj::msg);
		o.msg();
		
	}
}