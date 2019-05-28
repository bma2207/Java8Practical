package java8.com;

import java.util.ArrayList;
import java.util.function.Predicate;

public class predicat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employ> al=new ArrayList<>();
		al.add(new Employ(1000));
		al.add(new Employ(2000));
		al.add(new Employ(3000));
		al.add(new Employ(4000));
		al.add(new Employ(5000));
		
		Predicate<Employ> p=e->e.salary>2000 ;
		Predicate<Employ> p1=e1->e1.salary==2000;
		
		for(Employ e1 : al)
		{
			if(p.or(p1).test(e1))
			{
				System.out.println(e1.salary);
			}
		}
	}
}
