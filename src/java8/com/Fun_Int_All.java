package java8.com;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Date;

public class Fun_Int_All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Emp> l = new ArrayList<Emp>();
		l.add(new Emp(1000, "Vicky"));
		l.add(new Emp(2000, "Ricky"));
		l.add(new Emp(3000, "Micky"));
		l.add(new Emp(4000, "Ticky"));

		Consumer<Emp> c = s -> {
			System.out.println(s.salary);
			System.out.println(s.name);
		};

		Predicate<Emp> p = sal -> sal.salary > 2000;

		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());

		for (Emp i : l) {
			if (p.test(i)) {
				c.accept(i);
			}
		}
	}
}
