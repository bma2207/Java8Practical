import java.util.*;
import java.util.stream.Collectors;

public class LambdaExp {
	public static void main(String [] arrg)
	{
		Demo i= (a,b)->{return (a+b);};
		System.out.println(i.add(4,5));
		
		
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(11);
		al.add(13);
		al.add(14);
		al.add(16);
		al.add(17);
		al.add(17);
		System.out.println(al);
		List<Integer> l1 = al.stream().filter(j -> j % 2 ==0).collect(Collectors.toList());
		System.out.println(l1);
		al.parallelStream().forEach(System.out :: print);
		
		//i.sum();
		//Demo.demo();
	}

}
