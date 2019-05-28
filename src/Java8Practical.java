import java.util.*;

public class Java8Practical {
	
	public static void main(String[] args)
	{
		List<Integer> val = new ArrayList<>();
		for(int i=0;i<=5;i++)
		{
			val.add(i);
		}
		
		val.forEach(i->System.out.println(i));

	}

}
