package java8.com;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Test
{
	 Test()
	{
		System.out.println("Hello word");
	}
	public Test get()
	{
		return null;
	}
}
public class AllActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Emp> al=new ArrayList<>();
		al.add(new Emp (1000,"Vicky"));
		al.add(new Emp (2000,"ricky"));
		al.add(new Emp (4000,"micky"));
		al.add(new Emp (6000,"ticky"));
		al.add(new Emp (500,"kicky"));
		al.add(new Emp (8000,"dicky"));
		
		Supplier<Test> t=()-> new Test();
		System.out.println (t.get());
		
		Function<Emp,String> f =e -> {
		    
			return e.name;
		};
		
		Predicate<Emp> p= sal -> sal.salary < 2000;
		Consumer<Emp> c= e -> {
			System.out.println(e.salary);
			System.out.println(e.name);
		};
			
		
		for (Emp e1 : al )
		{
			if(e1.salary > 2000)
			{
			  System.out.println(f.apply(e1));
			}
			if (p.test(e1))
			{
		     c.accept(e1);
			// System.out.println(e1.name + ":" + e1.salary);
		     
			}
		}
	}

}
