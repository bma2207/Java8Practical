package java8.com;

import java.awt.Point;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, String> f = s -> s.toUpperCase();
		System.out.println(f.apply("bhushan"));
		ArrayList<Employ> l = new ArrayList<Employ>();
		l.add(new Employ(2000));
		l.add(new Employ(3000));
		l.add(new Employ(4000));
		l.add(new Employ(8000));
		l.add(new Employ(7000));

		Function<Employ, String> f1 = sal -> {
			int salary = sal.salary;
			l.add(new Employ(1000));
			String point = "";
			if (sal.salary > 4000)
				point = "good";
			else if (sal.salary > 2000)
				point = "nice;";
			else
				point = "bad";
			return point;
		};
		System.out.println();
		for (Employ e1 : l) {
			System.out.println(e1);
		}
	}

}
