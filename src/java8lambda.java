import java.util.function.*;
public class java8lambda {
	
public static void main(String []arr)
{
	Function<Integer,Integer> f=i->i*i;
	System.out.println("Squr of 4 Is :-" + f.apply(4));
	System.out.println("Squr of 5 Is :-" + f.apply(5)); 
	 
	Predicate<Integer> obj1 = j->j % 2 ==0;
	System.out.println(obj1.test(4));

	Function<Integer,Integer> g=k->k+k;
	System.out.println(g.apply(4));
}
}
