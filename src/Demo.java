
@FunctionalInterface
public interface Demo {

	int add(int a,int b);
	
	default void sum()
	{
		System.out.println("Hello Default Method.");
	}
	static void demo()
	{
		System.out.println("Hello Static Method.");
	}
	
}
